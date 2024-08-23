package view;

import controller.BDUsuarios;

import controller.ImageLabel;
import java.awt.Color;

public class LoginGUI extends javax.swing.JFrame {

    private BDUsuarios baseDatos;
    private ImageLabel imageLabel = new ImageLabel();
    private RegistroGUI registro;
    private AdminGUI admin;
    private MenuCompras menu;
    private int intentosUser;
    private int intentosAdmin;
    private int xMouse, yMouse;

    public LoginGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        imageLabel.SetImageLabel(logo, "src/view/images/logo sin fondo.png");
        imageLabel.SetImageLabel(logo2, "src/view/images/c sin fondo.png");
        imageLabel.SetImageLabel(logoEmail, "src/view/images/usuario logo.png");
        imageLabel.SetImageLabel(logoPassword, "src/view/images/candado.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lateral = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
        contrasenaLabel = new javax.swing.JLabel();
        logoEmail = new javax.swing.JLabel();
        logoPassword = new javax.swing.JLabel();
        txtEmailLogin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPasswordLogin = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        selectorRolCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 580));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lateral.setBackground(new java.awt.Color(176, 0, 47));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Copyright © Cheaper 2024");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("\"El  precio más bajo al alcance de todos\"");

        btnExit.setBackground(new java.awt.Color(176, 0, 47));

        labelExit.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        labelExit.setForeground(new java.awt.Color(0, 0, 0));
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

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout lateralLayout = new javax.swing.GroupLayout(lateral);
        lateral.setLayout(lateralLayout);
        lateralLayout.setHorizontalGroup(
            lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lateralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        lateralLayout.setVerticalGroup(
            lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lateralLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(85, 85, 85)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel1.add(lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 580));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicio de sesión");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));

        correoLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        correoLabel.setForeground(new java.awt.Color(204, 0, 0));
        correoLabel.setText("Correo");
        jPanel1.add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        contrasenaLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        contrasenaLabel.setForeground(new java.awt.Color(204, 0, 0));
        contrasenaLabel.setText("Contraseña");
        jPanel1.add(contrasenaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        logoEmail.setText("usuario");
        logoEmail.setMaximumSize(new java.awt.Dimension(41, 16));
        logoEmail.setMinimumSize(new java.awt.Dimension(41, 16));
        logoEmail.setPreferredSize(new java.awt.Dimension(41, 16));
        jPanel1.add(logoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, 70));

        logoPassword.setText("contrasena");
        jPanel1.add(logoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 70, 70));

        txtEmailLogin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEmailLogin.setForeground(new java.awt.Color(153, 153, 153));
        txtEmailLogin.setText("Ingrese su correo");
        txtEmailLogin.setBorder(null);
        txtEmailLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmailLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailLoginMousePressed(evt);
            }
        });
        jPanel1.add(txtEmailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 320, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 320, 20));

        txtPasswordLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPasswordLogin.setForeground(new java.awt.Color(153, 153, 153));
        txtPasswordLogin.setText("123456789");
        txtPasswordLogin.setBorder(null);
        txtPasswordLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordLoginMousePressed(evt);
            }
        });
        jPanel1.add(txtPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 320, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 320, 10));

        btnLogin.setBackground(new java.awt.Color(176, 0, 47));

        labelLogin.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("INGRESAR");
        labelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 220, 60));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("¿No tienes una cuenta?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        lblRegistro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(176, 0, 47));
        lblRegistro.setText("Ingrese aquí");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistroMouseExited(evt);
            }
        });
        jPanel1.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, -1, -1));

        selectorRolCmb.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        selectorRolCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Admin" }));
        selectorRolCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorRolCmbActionPerformed(evt);
            }
        });
        jPanel1.add(selectorRolCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setMenu(MenuCompras menu)    {
        this.menu = menu;
    }
    
    public void setRegistro(RegistroGUI registro) {
        this.registro = registro;
    }

    public void setAdmin(AdminGUI admin) {
        this.admin = admin;
    }


    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        labelExit.setForeground(Color.white);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void txtEmailLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailLoginMousePressed
        txtEmailLogin.setText("");
        txtEmailLogin.setForeground(Color.black);
    }//GEN-LAST:event_txtEmailLoginMousePressed

    private void txtPasswordLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordLoginMousePressed
        txtPasswordLogin.setText("");
        txtPasswordLogin.setForeground(Color.black);
    }//GEN-LAST:event_txtPasswordLoginMousePressed

    private void labelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLoginMouseClicked
        baseDatos = new BDUsuarios();
        String email = txtEmailLogin.getText();
        String contrasena = String.valueOf(txtPasswordLogin.getPassword());
        if (selectorRolCmb.getSelectedIndex() == 0) {
            intentosUser++;
            baseDatos.cargarUsuarios(email, contrasena, intentosUser);
            boolean cambioVentana = baseDatos.getCambioVentana();
            //Validamos que pueda pasar la ventana si el usuario es correcto.
            if (cambioVentana) {
                this.setVisible(false);
                MenuCompras menu = new MenuCompras();
                menu.setLogin(this);
                menu.setVisible(true);
            }
        }
        if (selectorRolCmb.getSelectedIndex() == 1) {
            intentosAdmin++;
            baseDatos.cargarAdmin(email, contrasena, intentosAdmin);
            //Obtener la variable cambioVentana para confirmar si es posible seguir.
            boolean cambiarVentana = baseDatos.getCambioVentana();
            if (cambiarVentana) {
                this.setVisible(false);
                AdminGUI admin = new AdminGUI();
                admin.setLogin(this);
                admin.setVisible(true);
            }
        }
    }//GEN-LAST:event_labelLoginMouseClicked

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        this.setVisible(false);
        RegistroGUI registro = new RegistroGUI(new javax.swing.JFrame(), true);
        registro.setLogin(this);
        registro.setVisible(true);
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void lblRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseEntered
        lblRegistro.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblRegistroMouseEntered

    private void lblRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseExited
        lblRegistro.setForeground(new Color(176, 0, 47)); //Volver a color original al salir el cursor
    }//GEN-LAST:event_lblRegistroMouseExited

    private void selectorRolCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorRolCmbActionPerformed
        if (selectorRolCmb.getSelectedIndex() == 0) {
            //Si la opcion 0 (Cliente) esta seleccionada, ocurre esto:
            txtEmailLogin.setForeground(Color.GRAY);
            txtPasswordLogin.setForeground(Color.GRAY);
            correoLabel.setText("Correo");
            contrasenaLabel.setText("Contraseña");
            txtEmailLogin.setText("Ingrese su correo");
            txtPasswordLogin.setText("*********");
        }
        if (selectorRolCmb.getSelectedIndex() == 1) {
            //Si la opcion 1 (Admin) esta seleccionada, ocurre esto:
            txtEmailLogin.setForeground(Color.GRAY);
            txtPasswordLogin.setForeground(Color.GRAY);
            correoLabel.setText("Usuario");
            contrasenaLabel.setText("Pin");
            txtEmailLogin.setText("Ingrese su usuario");
            txtPasswordLogin.setText("*********");
        }
    }//GEN-LAST:event_selectorRolCmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JLabel contrasenaLabel;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JPanel lateral;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logoEmail;
    private javax.swing.JLabel logoPassword;
    private javax.swing.JComboBox<String> selectorRolCmb;
    private javax.swing.JTextField txtEmailLogin;
    private javax.swing.JPasswordField txtPasswordLogin;
    // End of variables declaration//GEN-END:variables
}
