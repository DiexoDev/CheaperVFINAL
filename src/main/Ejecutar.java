package main;

import javax.swing.UIManager;
import view.*;

public class Ejecutar {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoginGUI login = new LoginGUI();
        login.setVisible(true);

    }

}
