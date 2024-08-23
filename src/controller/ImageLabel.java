package controller;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabel {

    public ImageLabel() {
    }
    //Metodo para poner logo en la pantalla a un tamaño controlado.
    public void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        //Obtiene la imagen de la ruta, luego con getScaledInstance ajustamos el tamaño. getWidth y height para obtener medidas automaticamente del label
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        //this.repaint();
    }
    
}
