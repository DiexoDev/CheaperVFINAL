package controller;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Administrador;
import model.Usuarios;

public class BDUsuarios {

    private boolean cambioVentana = false;
    private ArrayList<Usuarios> registro;

    public BDUsuarios() {
        this.registro = new ArrayList<>();
    }

    public void agregarUsuario(Usuarios usuario) {
        registro.add(usuario);
    }

    public boolean getCambioVentana() {
        return cambioVentana;
    }

    public void agregarUsuario(String nombre, String correoElectronico, String contrasena, int edad, String genero, long numeroTel) {
        Usuarios usuario = new Usuarios(nombre, correoElectronico, contrasena, edad, genero, numeroTel);
        registro.add(usuario);
    }

    public void cargarAdmin(String user, String pin, int intentos) {
        Administrador admin = new Administrador();
        if (user.equals(admin.getUser()) && pin.equals(admin.getPin())) {
            JOptionPane.showMessageDialog(null, "Bienvenido a Cheaper como administrador",
                    "Inicio exitoso", JOptionPane.INFORMATION_MESSAGE);
            cambioVentana = true;
        }
        if (intentos > 2) {
            JOptionPane.showMessageDialog(null, "El programa se cerrara debido a 3 intentos de inicio fallidos.",
                    "Error de inicio", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public void cargarUsuarios(String email, String contrasena, int intentos) {

        try {
            File file = new File("src/persistence/usuarios.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bfReader = new BufferedReader(fileReader);

            String linea;
            String[] usuarios;
            while ((linea = bfReader.readLine()) != null) {
                usuarios = linea.split("\\|");
                agregarUsuario(new Usuarios(usuarios[0], usuarios[1], usuarios[2], Integer.parseInt(usuarios[3]), String.valueOf(usuarios[4]), Integer.parseInt(usuarios[5])));
            }
            bfReader.close();
            fileReader.close();

            validarUsuario(email, contrasena, intentos);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No fue posible cargar los usuarios.", "Error BD", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void validarUsuario(String email, String contrasena, int intentos) {
        boolean encontrado = false;
        for (Usuarios usuario : registro) {
            if (usuario.getCorreoElectronico().equalsIgnoreCase(email) && usuario.getContrasena().equals(contrasena)) {
                encontrado = true;
                break;
            }

        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Bienvenido a Cheaper", "Inicio exitoso", JOptionPane.INFORMATION_MESSAGE);
            intentos = 0;
            cambioVentana = true; // Validamos que se pueda pasar a la siguiente ventana.
        }
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "Correo y/o contraseña invalidos." + "\nIntento N°" + intentos,
                    "Error de inicio", JOptionPane.ERROR_MESSAGE);
        }
        if (intentos > 2) {
            JOptionPane.showMessageDialog(null, "El programa se cerrara debido a 3 intentos de inicio fallidos.",
                    "Error de inicio", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }

    }

    public void exportarUsuarios() {

        try {
            File file = new File("src/persistence/usuarios.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bfWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < registro.size(); i++) {
                registro.get(i);
                Usuarios usuarios = registro.get(i);
                String linea = usuarios.getNombre() + "|" + usuarios.getCorreoElectronico() + "|" + usuarios.getContrasena() + "|" + usuarios.getEdad() + "|"
                        + usuarios.getGenero() + "|" + usuarios.getNumeroTel();

                bfWriter.write(linea);
                bfWriter.newLine();

            }
            bfWriter.close();
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Usuario guardado con exito!", "Guardado", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al exportar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
