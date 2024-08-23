package view;

import controller.CarritoCompras;
import controller.ImageLabel;
import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIClientPropertyKey;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.TipoRopa;

public class GestionGUI extends javax.swing.JFrame {

    private ImageLabel imageLabel = new ImageLabel();
    private CarritoCompras carrito;
    private AdminGUI admin = new AdminGUI();
    private int xMouse, yMouse;
    
    

    public GestionGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        imageLabel.SetImageLabel(logo, "src/view/images/c sin fondo.png");
        imageLabel.SetImageLabel(guardarLogo, "src/view/images/salvar.png");
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreProduc = new javax.swing.JTextField();
        txtPrecioProduc = new javax.swing.JTextField();
        tipoRopaCmb = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        guardarLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        guardarLbl = new javax.swing.JLabel();
        pnlAbrir = new javax.swing.JPanel();
        abrirlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });

        labelExit.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        labelExit.setForeground(new java.awt.Color(204, 204, 204));
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");
        labelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelExitMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestión de productos");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addGap(80, 80, 80)
                .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 80));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Tipo de ropa:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Nombre del producto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Ruta de imagen:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, 30));

        txtNombreProduc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreProduc.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreProduc.setText("Ingrese el nombre del producto");
        txtNombreProduc.setBorder(null);
        txtNombreProduc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreProducMouseClicked(evt);
            }
        });
        jPanel1.add(txtNombreProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 310, -1));

        txtPrecioProduc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPrecioProduc.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioProduc.setText("Ingrese el precio del producto");
        txtPrecioProduc.setBorder(null);
        txtPrecioProduc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioProducMouseClicked(evt);
            }
        });
        jPanel1.add(txtPrecioProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 310, -1));

        jPanel1.add(tipoRopaCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 310, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 310, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 310, 10));

        guardarLogo.setText("logo");
        guardarLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarLogoMouseClicked(evt);
            }
        });
        jPanel1.add(guardarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 90, 80));

        jPanel3.setBackground(new java.awt.Color(176, 0, 47));

        guardarLbl.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        guardarLbl.setForeground(new java.awt.Color(255, 255, 255));
        guardarLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardarLbl.setText("GUARDAR");
        guardarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 160, 60));

        pnlAbrir.setBackground(new java.awt.Color(176, 0, 47));

        abrirlbl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        abrirlbl.setForeground(new java.awt.Color(255, 255, 255));
        abrirlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abrirlbl.setText("ABRIR");
        abrirlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAbrirLayout = new javax.swing.GroupLayout(pnlAbrir);
        pnlAbrir.setLayout(pnlAbrirLayout);
        pnlAbrirLayout.setHorizontalGroup(
            pnlAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abrirlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlAbrirLayout.setVerticalGroup(
            pnlAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abrirlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(pnlAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarCombo() {
        for (TipoRopa tipo : TipoRopa.values()) {
            tipoRopaCmb.addItem(tipo.name());
        }
    }

    public void setAdmin(AdminGUI admin) {
        this.admin = admin;
    }

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        //Para eliminar ventana y no cerrar el programa.
        this.dispose();
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        labelExit.setForeground(Color.red);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        labelExit.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_labelExitMouseExited

    private void txtNombreProducMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreProducMouseClicked
        txtNombreProduc.setText("");
        txtNombreProduc.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNombreProducMouseClicked

    private void txtPrecioProducMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioProducMouseClicked
        txtPrecioProduc.setText("");
        txtPrecioProduc.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtPrecioProducMouseClicked
    
    private String ruta = null;
    
    private void guardarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLblMouseClicked
        carrito = new CarritoCompras();
        String nombre = txtNombreProduc.getText();
        String precioString = txtPrecioProduc.getText();
        //Se realiza una conversión del comboBox de enums a string, luego lo convertimos en el enum nuevamente.
        String tipoString = (String) tipoRopaCmb.getSelectedItem();
        TipoRopa tipo = TipoRopa.valueOf(tipoString.toUpperCase());
        //Validamos que los campos no esten vacíos.
        try {
            if (nombre.equals("Ingrese el nombre del producto")) {
                JOptionPane.showMessageDialog(null, "El campo nombre no puede estar vacío",
                        "Registrar Productos", JOptionPane.WARNING_MESSAGE);

            } else if (txtPrecioProduc.getText().equals("Ingrese el precio del producto")) {
                JOptionPane.showMessageDialog(null, "El campo precio no puede estar vacío",
                        "Registrar Productos", JOptionPane.WARNING_MESSAGE);
            } else {
                double precio = Double.parseDouble(precioString);
                //Verificamos de que boton fue llamada la ventana.
                carrito.agregarProducto(nombre, precio, tipo, ruta);
                carrito.exportarProductos("guardar");
                admin.cargarDatos();
                txtNombreProduc.setText(null);
                txtPrecioProduc.setText(null);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un precio válido.", "Precio erroneo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarLblMouseClicked

    private void guardarLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLogoMouseClicked
        guardarLblMouseClicked(evt);
    }//GEN-LAST:event_guardarLogoMouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void abrirlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirlblMouseClicked
        carrito = new CarritoCompras();
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtrar = new FileNameExtensionFilter("PNG, JPG, JPEG", "png", "jpg", "jpeg");
        chooser.setFileFilter(filtrar);
        int respuesta = chooser.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            //Inicializamos la string ruta para utilizarla en el boton agregar.
            ruta = chooser.getSelectedFile().getPath();
        }
    }//GEN-LAST:event_abrirlblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abrirlbl;
    private javax.swing.JLabel guardarLbl;
    private javax.swing.JLabel guardarLogo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnlAbrir;
    private javax.swing.JComboBox<String> tipoRopaCmb;
    private javax.swing.JTextField txtNombreProduc;
    private javax.swing.JTextField txtPrecioProduc;
    // End of variables declaration//GEN-END:variables
}
