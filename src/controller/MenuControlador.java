package controller;

import java.util.ArrayList;
import javax.swing.JLabel;
import model.Productos;
import model.TipoRopa;

public class MenuControlador extends CarritoCompras {

    private CarritoCompras carritoClase = new CarritoCompras();
    private ImageLabel image = new ImageLabel();
    public ArrayList<Productos> listaCarrito;

    public MenuControlador() {
        this.listaCarrito = new ArrayList<>();
    }

    public ArrayList<Productos> getListaCarrito() {
        return listaCarrito;
    }

    public void agregarCarrito(int id, String nombre, double precio, TipoRopa tipo, String ruta) {
        Productos producto = new Productos(nombre, precio, tipo, ruta);
        listaCarrito.add(producto);
    }

    public void agregarCarrito(Productos p) {
        listaCarrito.add(p);
    }

    public void agregarItems(int indice, String nombre) {
        int id = 0;
        double precio = 0;
        TipoRopa tipo = null;
        
        carritoClase.cargarProductos();
        ArrayList<Productos> lista = carritoClase.obtenerProductos();
        for (int i = 0; i < indice; i++) {
            id = lista.get(i).getId();
            nombre = lista.get(i).getNombre();
            precio = lista.get(i).getPrecio();
            tipo = lista.get(i).getTipo();
        }
        Productos p = new Productos(id, nombre, precio, tipo);
        agregarCarrito(p);
    }

    public void comprar(JLabel nombrelbl, JLabel preciolbl) {
        String nombre = nombrelbl.getText();
        String precioString = preciolbl.getText().replace("$", "");

        ArrayList<Productos> listaNombres = obtenerProductos();
        TipoRopa tipo = null;
        int id = 0;
        for (Productos producto : listaNombres) {
            if (nombre.equals(producto.getNombre())) {
                id = producto.getId();
                tipo = producto.getTipo();
                break;
            }
        }
        double precio = Double.parseDouble(precioString);
        Productos producto = new Productos(id, nombre, precio, tipo);

        listaCarrito.add(producto);
    }

    public void llenarSlot(int slot, JLabel nombrelbl, JLabel preciolbl, JLabel logo) {
        carritoClase = new CarritoCompras();
        ArrayList<Productos> listaProductos = carritoClase.obtenerProductos();
        //Instancio afuera para poder setear los labels.
        String nombre = null;
        double precio = 0;
        String ruta = null;
        for (int i = 0; i <= slot; i++) {
            nombre = listaProductos.get(i).getNombre();
            precio = listaProductos.get(i).getPrecio();
            ruta = listaProductos.get(i).getRuta();
        }
        String precioString = String.valueOf(precio);
        //Switch con el slot del producto
        nombrelbl.setText(nombre);
        preciolbl.setText('$' + precioString);
        image.SetImageLabel(logo, ruta);

    }

}
