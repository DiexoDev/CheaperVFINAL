package view;

import controller.CarritoCompras;
import controller.ImageLabel;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Productos;
import model.TipoRopa;

public class AdminGUI extends javax.swing.JFrame {

    private ImageLabel imageLabel;
    private int xMouse, yMouse;
    private LoginGUI login;
    private DefaultTableModel tablaModel;
    private final String[] cabeceros = {"ID", "Nombre", "Precio", "Tipo"};
    private ArrayList<Productos> listaCarrito;
    private CarritoCompras carritoClase;
    public GestionGUI gestion;

    public AdminGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        carritoClase = new CarritoCompras();
        imageLabel = new ImageLabel();
        setModelo();//Seteo de cabeceros
        cargarDatos();
        llenarCombo();//Seteo de comboBox con enum TipoRopa
        imageLabel.SetImageLabel(logo, "src/view/images/c sin fondo.png");
        imageLabel.SetImageLabel(invLogo, "src/view/images/inventario.png");
        imageLabel.SetImageLabel(regresarLogo, "src/view/images/regresar.png");
        imageLabel.SetImageLabel(eliminarLbl, "src/view/images/eliminar.png");
        imageLabel.SetImageLabel(agregarLbl, "src/view/images/agregar.png");
        imageLabel.SetImageLabel(editarLbl, "src/view/images/editar.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        leaderPanel = new javax.swing.JPanel();
        btnInventario = new javax.swing.JPanel();
        lblInventario = new javax.swing.JLabel();
        invLogo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        regresarLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInv = new javax.swing.JTable();
        agregarLbl = new javax.swing.JLabel();
        editarLbl = new javax.swing.JLabel();
        eliminarLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipoRopaCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 660));
        setUndecorated(true);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        fondo.setPreferredSize(new java.awt.Dimension(960, 660));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(176, 0, 47));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestión de productos");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(206, 206, 206)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 90));

        leaderPanel.setBackground(new java.awt.Color(176, 0, 47));
        leaderPanel.setForeground(new java.awt.Color(153, 153, 153));

        btnInventario.setBackground(new java.awt.Color(153, 0, 0));

        lblInventario.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lblInventario.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario.setText("Inventario");
        lblInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnInventarioLayout = new javax.swing.GroupLayout(btnInventario);
        btnInventario.setLayout(btnInventarioLayout);
        btnInventarioLayout.setHorizontalGroup(
            btnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnInventarioLayout.setVerticalGroup(
            btnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInventarioLayout.createSequentialGroup()
                .addComponent(lblInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRegresar.setBackground(new java.awt.Color(153, 0, 0));

        lblRegresar.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegresarLayout.createSequentialGroup()
                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout leaderPanelLayout = new javax.swing.GroupLayout(leaderPanel);
        leaderPanel.setLayout(leaderPanelLayout);
        leaderPanelLayout.setHorizontalGroup(
            leaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leaderPanelLayout.setVerticalGroup(
            leaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaderPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        fondo.add(leaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TablaInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaInvMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaInv);

        agregarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarLblMouseClicked(evt);
            }
        });

        editarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarLblMouseClicked(evt);
            }
        });

        eliminarLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarLblMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(176, 0, 47));
        jLabel1.setText("Eliminar");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(176, 0, 47));
        jLabel5.setText("Agregar");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(176, 0, 47));
        jLabel6.setText("Editar");

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(176, 0, 47));
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(176, 0, 47));
        jLabel4.setText("PRECIO");

        txtPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(176, 0, 47));
        jLabel7.setText("TIPO");

        tipoRopaCmb.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tipoRopaCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5)))
                        .addGap(212, 212, 212)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)))
                        .addGap(68, 68, 68)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoRopaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)
                        .addComponent(tipoRopaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 84, 860, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método para setear los cabeceros de la tabla.
    private void setModelo() {
        tablaModel = new DefaultTableModel();
        tablaModel.setColumnIdentifiers(cabeceros);
        TablaInv.setModel(tablaModel);
    }
    
    public void cargarDatos() {
        carritoClase.cargarProductos(); // Carga los productos del archivo de texto para continuar
        ArrayList<Productos> listaProductos = carritoClase.obtenerProductos();
        Object[][] productos = new Object[listaProductos.size()][cabeceros.length];
        for (int i = 0; i < listaProductos.size(); i++) {
            productos[i][0] = listaProductos.get(i).getId();
            productos[i][1] = listaProductos.get(i).getNombre();
            productos[i][2] = listaProductos.get(i).getPrecio();
            productos[i][3] = listaProductos.get(i).getTipo();
        }
        //DefaultTablaModel recibe como parametros productos que son las filas y cabeceros sus columnas.
        tablaModel = new DefaultTableModel(productos, cabeceros) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        TablaInv.setModel(tablaModel);
    }

    private void llenarCombo() {
        for (TipoRopa tipo : TipoRopa.values()) {
            tipoRopaCmb.addItem(tipo.name());
        }
    }

    public void setLogin(LoginGUI login) {
        this.login = login;
    }

    public void setGestion(GestionGUI gestion) {
        this.gestion = gestion;
    }
    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        labelExit.setForeground(Color.white);
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        labelExit.setForeground(Color.black);
    }//GEN-LAST:event_labelExitMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        login = new LoginGUI();
        this.setVisible(false);
        login.setAdmin(this);
        login.setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void agregarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLblMouseClicked
        gestion = new GestionGUI();
        gestion.setAdmin(this);
        gestion.setVisible(true);
    }//GEN-LAST:event_agregarLblMouseClicked

    private void editarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarLblMouseClicked
        int fila = TablaInv.getSelectedRow();

        if (fila != -1) {
            //Creamos variables para pasarlas a la otra ventana y editarlas.
            String nombreActual = TablaInv.getValueAt(fila, 1).toString();
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            TipoRopa tipo = TipoRopa.valueOf(tipoRopaCmb.getSelectedItem().toString());

            ArrayList<Productos> lista = carritoClase.carrito;
            for (Productos producto : lista) {
                if (nombreActual.equals(producto.getNombre())) {
                    producto.setNombre(nombre);
                    producto.setPrecio(precio);
                    producto.setTipo(tipo);
                    carritoClase.exportarProductos("editar");
                    //cargarDatos();
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila primero.", "Fila no encontrada", JOptionPane.ERROR_MESSAGE);
        }
        cargarDatos();//Se cargan los datos al salir del bucle for.
    }//GEN-LAST:event_editarLblMouseClicked

    private void eliminarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLblMouseClicked
        int fila = TablaInv.getSelectedRow();
        if (fila != -1) {
            String nombreActual = TablaInv.getValueAt(fila, 1).toString();

            carritoClase.eliminarProducto(nombreActual);
            cargarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila primero.", "Fila no encontrada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarLblMouseClicked

    private void TablaInvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInvMousePressed
        TablaInv = (JTable) evt.getSource();
        Point point = evt.getPoint();
        //Row recibe el objeto point para saber donde esta el click
        int row = TablaInv.rowAtPoint(point);

        //Si el contador de click es igual a 1, setea los parametros en los textField.
        if (evt.getClickCount() == 1) {
            txtNombre.setText(TablaInv.getValueAt(TablaInv.getSelectedRow(), 1).toString());
            txtPrecio.setText(TablaInv.getValueAt(TablaInv.getSelectedRow(), 2).toString());
            tipoRopaCmb.setSelectedItem(TablaInv.getValueAt(TablaInv.getSelectedRow(), 3).toString());
        }

    }//GEN-LAST:event_TablaInvMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaInv;
    private javax.swing.JLabel agregarLbl;
    private javax.swing.JPanel btnInventario;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel editarLbl;
    private javax.swing.JLabel eliminarLbl;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel invLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JPanel leaderPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel regresarLogo;
    private javax.swing.JComboBox<String> tipoRopaCmb;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
