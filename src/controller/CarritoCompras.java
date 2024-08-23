package controller;

import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;
import model.Productos;
import model.TipoRopa;

public class CarritoCompras {

    public ArrayList<Productos> carrito;

    public CarritoCompras() {
        this.carrito = new ArrayList<>();
    }

    public ArrayList<Productos> obtenerProductos() {
        return carrito;
    }

    public Productos buscarProductos(String nombre) {
        Productos buscar = null;
        //Buscamos el producto solicitado por el nombre
        for (Productos producto : carrito) {
            if (buscar.getNombre().equals(nombre)) {
                buscar = producto;
            }
            //Retornamos producto encontrado o null si no existe el nombre    
        }
        return buscar;
    }

    public void agregarProducto(Productos producto) {
        carrito.add(producto);
    }

    public void agregarProducto(int id, String nombre, double precio, TipoRopa tipo, String ruta) {
        Productos producto = new Productos(id, nombre, precio, tipo, ruta);
        carrito.add(producto);
    }

    public void agregarProducto(String nombre, double precio, TipoRopa tipo, String ruta) {
        Productos producto = new Productos(nombre, precio, tipo, ruta);
        carrito.add(producto);
    }

    public Productos obtenerProductos(String nombre) {
        for (Productos producto : carrito) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void cargarProductos() {
        carrito.clear();//Limpiar la lista para que no se dupliquen los elementos en las tablas.
        try {
            File file = new File("src/persistence/productos.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bfReader = new BufferedReader(fileReader);

            String linea;
            String[] partes;
            while ((linea = bfReader.readLine()) != null) {
                partes = linea.split("\\|");
                agregarProducto(Integer.parseInt(partes[0]), partes[1], Double.parseDouble(partes[2]), TipoRopa.valueOf(partes[3]), partes[4]);

            }
            bfReader.close();
            fileReader.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No fue posible cargar los productos.", "Error BD", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void exportarProductos(String funcion) {
        try {
            File file = new File("src/persistence/productos.txt");
            FileWriter fileWriter = null;
            if (funcion.equals("guardar") || funcion.equals("eliminar")) {
                fileWriter = new FileWriter(file, true);
            } else if (funcion.equals("editar")) {
                fileWriter = new FileWriter(file);
            }

            BufferedWriter bfWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < carrito.size(); i++) {
                carrito = obtenerProductos();
                Productos productos = carrito.get(i);
                String linea = productos.getId() + "|" + productos.getNombre() + "|"
                        + productos.getPrecio() + "|" + productos.getTipo() + "|" + productos.getRuta();
                bfWriter.write(linea);
                bfWriter.newLine();

            }
            bfWriter.close();
            fileWriter.close();
            if (funcion.equals("guardar")) {
                JOptionPane.showMessageDialog(null, "Producto guardado con exito!", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            }
            if (funcion.equals("editar")) {
                JOptionPane.showMessageDialog(null, "Producto modificado con exito!", "Modificado", JOptionPane.INFORMATION_MESSAGE);
            }
            if (funcion.equals("eliminar")) {
                JOptionPane.showMessageDialog(null, "Producto eliminado con exito!", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al exportar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void eliminarProducto(String nombre) {
        Productos productoEliminar = null;
        try {
            File file = new File("src/persistence/productos.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bfWriter = new BufferedWriter(fileWriter);

            for (Productos producto : carrito) {
                if (producto.getNombre().equals(nombre)) {
                    productoEliminar = producto;
                    carrito.remove(producto);
                    exportarProductos("eliminar");
                    break;
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No fue posible cargar los productos.", "Error BD", JOptionPane.WARNING_MESSAGE);
        }

    }

}
