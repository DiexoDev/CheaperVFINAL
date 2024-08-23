package view;

import controller.CarritoCompras;
import controller.ImageLabel;
import controller.MenuControlador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Productos;
import model.TipoRopa;

/**
 *
 * @author RYZEN
 */
public class MenuCompras extends javax.swing.JFrame {

    private ImageLabel image = new ImageLabel();
    private MenuControlador controlador = new MenuControlador();
    private final String[] cabeceros = {"ID", "Nombre", "Precio", "Tipo"};
    private ArrayList<Productos> listaCarrito;
    private List<Items> listaItems;
    private CarritoCompras carritoClase = new CarritoCompras();
    private DefaultTableModel tablaModelo;
    private LoginGUI login;
    private int indice;

    int xMouse, yMouse;

    public MenuCompras() {
        initComponents();
        this.setLocationRelativeTo(null);
        listaItems = new ArrayList<>();
        indice = 0;
        cargarTabla();
        setModelo();
        cargarSlots();
        image.SetImageLabel(logo, "src/view/images/c sin fondo.png");
        image.SetImageLabel(logoHombres, "src/view/images/polo.png");
        image.SetImageLabel(logoMujeres, "src/view/images/btnmujer.png");
        image.SetImageLabel(logoCarrito, "src/view/images/carrito.png");
        image.SetImageLabel(logoPagar, "src/view/images/pago.png");
        image.SetImageLabel(regresarLogo, "src/view/images/regresar.png");
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        leader = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        regresarLogo = new javax.swing.JLabel();
        btnHombres = new javax.swing.JPanel();
        logoHombres = new javax.swing.JLabel();
        lblHombres = new javax.swing.JLabel();
        btnMujeres = new javax.swing.JPanel();
        logoMujeres = new javax.swing.JLabel();
        lblMujeres = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JPanel();
        logoCarrito = new javax.swing.JLabel();
        lblCarrito = new javax.swing.JLabel();
        pnlProductos = new javax.swing.JTabbedPane();
        pnlProductosHombre = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelHombre = new javax.swing.JPanel();
        pnlProductoMujeres = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelMujer = new javax.swing.JPanel();
        pnlCarrito = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carritoTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalPreciolbl = new javax.swing.JLabel();
        cantidadArticuloslbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pagarlbl = new javax.swing.JLabel();
        logoPagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHEAPER");

        labelExit.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setText("X");
        labelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 90));

        leader.setBackground(new java.awt.Color(176, 0, 47));

        btnRegresar.setBackground(new java.awt.Color(153, 0, 0));

        lblRegresar.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(lblRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnHombres.setBackground(new java.awt.Color(153, 0, 0));

        logoHombres.setText("logoH");
        logoHombres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblHombres.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblHombres.setForeground(new java.awt.Color(255, 255, 255));
        lblHombres.setText("HOMBRES");
        lblHombres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHombresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnHombresLayout = new javax.swing.GroupLayout(btnHombres);
        btnHombres.setLayout(btnHombresLayout);
        btnHombresLayout.setHorizontalGroup(
            btnHombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHombresLayout.createSequentialGroup()
                .addComponent(logoHombres, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnHombresLayout.setVerticalGroup(
            btnHombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHombresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnHombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoHombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHombres, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnMujeres.setBackground(new java.awt.Color(153, 0, 0));

        logoMujeres.setText("logoM");
        logoMujeres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblMujeres.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblMujeres.setForeground(new java.awt.Color(255, 255, 255));
        lblMujeres.setText("MUJERES");
        lblMujeres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMujeres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMujeresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnMujeresLayout = new javax.swing.GroupLayout(btnMujeres);
        btnMujeres.setLayout(btnMujeresLayout);
        btnMujeresLayout.setHorizontalGroup(
            btnMujeresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMujeresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoMujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMujeres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMujeresLayout.setVerticalGroup(
            btnMujeresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMujeresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnMujeresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMujeres, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(logoMujeres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnCarrito.setBackground(new java.awt.Color(153, 0, 0));

        logoCarrito.setText("logoCrr");
        logoCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblCarrito.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCarrito.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito.setText("CARRITO");
        lblCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarritoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCarritoLayout = new javax.swing.GroupLayout(btnCarrito);
        btnCarrito.setLayout(btnCarritoLayout);
        btnCarritoLayout.setHorizontalGroup(
            btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnCarritoLayout.setVerticalGroup(
            btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout leaderLayout = new javax.swing.GroupLayout(leader);
        leader.setLayout(leaderLayout);
        leaderLayout.setHorizontalGroup(
            leaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMujeres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leaderLayout.setVerticalGroup(
            leaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnHombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMujeres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel1.add(leader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 560));

        pnlProductosHombre.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelHombre.setBackground(new java.awt.Color(255, 255, 255));
        panelHombre.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane2.setViewportView(panelHombre);

        javax.swing.GroupLayout pnlProductosHombreLayout = new javax.swing.GroupLayout(pnlProductosHombre);
        pnlProductosHombre.setLayout(pnlProductosHombreLayout);
        pnlProductosHombreLayout.setHorizontalGroup(
            pnlProductosHombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        pnlProductosHombreLayout.setVerticalGroup(
            pnlProductosHombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductosHombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
        );

        pnlProductos.addTab("Hombres", pnlProductosHombre);

        pnlProductoMujeres.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelMujer.setBackground(new java.awt.Color(255, 255, 255));
        panelMujer.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane3.setViewportView(panelMujer);

        javax.swing.GroupLayout pnlProductoMujeresLayout = new javax.swing.GroupLayout(pnlProductoMujeres);
        pnlProductoMujeres.setLayout(pnlProductoMujeresLayout);
        pnlProductoMujeresLayout.setHorizontalGroup(
            pnlProductoMujeresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        pnlProductoMujeresLayout.setVerticalGroup(
            pnlProductoMujeresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductoMujeresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE))
        );

        pnlProductos.addTab("Mujeres", pnlProductoMujeres);

        pnlCarrito.setBackground(new java.awt.Color(255, 255, 255));

        carritoTabla.setBackground(new java.awt.Color(255, 255, 255));
        carritoTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(carritoTabla);

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(176, 0, 47));
        jLabel2.setText("Total a pagar:");

        jLabel3.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(176, 0, 47));
        jLabel3.setText("Cantidad de articulos:");

        totalPreciolbl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        totalPreciolbl.setForeground(new java.awt.Color(0, 0, 0));
        totalPreciolbl.setText("$0");

        cantidadArticuloslbl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cantidadArticuloslbl.setForeground(new java.awt.Color(0, 0, 0));
        cantidadArticuloslbl.setText("0");

        jPanel2.setBackground(new java.awt.Color(176, 0, 47));

        pagarlbl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        pagarlbl.setForeground(new java.awt.Color(255, 255, 255));
        pagarlbl.setText("Proceder a pagar");
        pagarlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagarlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagarlblMouseClicked(evt);
            }
        });

        logoPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagarlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagarlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCarritoLayout = new javax.swing.GroupLayout(pnlCarrito);
        pnlCarrito.setLayout(pnlCarritoLayout);
        pnlCarritoLayout.setHorizontalGroup(
            pnlCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnlCarritoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarritoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cantidadArticuloslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCarritoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(totalPreciolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(489, 489, 489))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarritoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        pnlCarritoLayout.setVerticalGroup(
            pnlCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(pnlCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalPreciolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cantidadArticuloslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pnlProductos.addTab("Carrito", pnlCarrito);

        jPanel1.add(pnlProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 890, 590));

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

    public void setLogin(LoginGUI login) {
        this.login = login;
    }

    private void setModelo() {
        tablaModelo = new DefaultTableModel();
        tablaModelo.setColumnIdentifiers(cabeceros);
        carritoTabla.setModel(tablaModelo);
    }

    private void cargarTabla() {
        listaCarrito = controlador.getListaCarrito();
        Object[][] modelo = new Object[listaCarrito.size()][cabeceros.length];
        for (int i = 0; i < listaCarrito.size(); i++) {
            modelo[i][0] = listaCarrito.get(i).getId();
            modelo[i][1] = listaCarrito.get(i).getNombre();
            modelo[i][2] = listaCarrito.get(i).getPrecio();
            modelo[i][3] = listaCarrito.get(i).getTipo();
        }
        tablaModelo = new DefaultTableModel(modelo, cabeceros) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        carritoTabla.setModel(tablaModelo);
        calcularTotal();
    }

    private void cargarSlots() {
        carritoClase.cargarProductos();
        listaCarrito = carritoClase.obtenerProductos();

        for (Productos producto : listaCarrito) {
            Items item = new Items();
            item.setSize(210, 2);
            listaItems.add(item);

            int id = producto.getId();
            double precio = producto.getPrecio();
            String nombre = producto.getNombre();
            String precioString = String.valueOf(precio);
            TipoRopa tipo = producto.getTipo();
            String ruta = producto.getRuta();

            item.setearDatos(nombre, '$' + precioString, ruta);
            indice++;
            final int indexSeleccionado = indice;

            if (tipo.getGenero().equals("HOMBRE")) {
                panelHombre.add(item);
                panelHombre.updateUI();
            }
            if (tipo.getGenero().equals("MUJER")) {
                panelMujer.add(item);
                panelMujer.updateUI();
            }
            
            item.agregarAccionBtn(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    controlador.agregarItems(indexSeleccionado, nombre);
                    JOptionPane.showMessageDialog(null, tipo + " " + nombre.toUpperCase() + " ha sido agregado al carrito!",
                            "Item agregado!", JOptionPane.INFORMATION_MESSAGE);
                    cargarTabla();
                }
            });
        }
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

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        LoginGUI login = new LoginGUI();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void lblHombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHombresMouseClicked
        pnlProductos.setSelectedIndex(0);
    }//GEN-LAST:event_lblHombresMouseClicked

    private void lblMujeresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMujeresMouseClicked
        pnlProductos.setSelectedIndex(1);
    }//GEN-LAST:event_lblMujeresMouseClicked

    private void lblCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarritoMouseClicked
        pnlProductos.setSelectedIndex(2);
    }//GEN-LAST:event_lblCarritoMouseClicked

    private void pagarlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarlblMouseClicked
        JOptionPane.showMessageDialog(null, "El pago ha sido exitoso!\nDisfrute de sus productos.", "Pago exitoso", JOptionPane.INFORMATION_MESSAGE);
        listaCarrito.clear();
        cargarTabla();
    }//GEN-LAST:event_pagarlblMouseClicked

    public void calcularTotal() {
        int cantidad = listaCarrito.size();
        String cantidadString = String.valueOf(cantidad);
        DecimalFormat df = new DecimalFormat("0.000");
        double total = 0;
        for (Productos producto : listaCarrito) {
            total += producto.getPrecio();
        }
        String totalString = String.valueOf(df.format(total));
        totalPreciolbl.setText('$' + totalString);
        cantidadArticuloslbl.setText(cantidadString);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCarrito;
    private javax.swing.JPanel btnHombres;
    private javax.swing.JPanel btnMujeres;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel cantidadArticuloslbl;
    private javax.swing.JTable carritoTabla;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblHombres;
    private javax.swing.JLabel lblMujeres;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JPanel leader;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoCarrito;
    private javax.swing.JLabel logoHombres;
    private javax.swing.JLabel logoMujeres;
    private javax.swing.JLabel logoPagar;
    private javax.swing.JLabel pagarlbl;
    private javax.swing.JPanel panelHombre;
    private javax.swing.JPanel panelMujer;
    private javax.swing.JPanel pnlCarrito;
    private javax.swing.JPanel pnlProductoMujeres;
    private javax.swing.JTabbedPane pnlProductos;
    private javax.swing.JPanel pnlProductosHombre;
    private javax.swing.JLabel regresarLogo;
    private javax.swing.JLabel totalPreciolbl;
    // End of variables declaration//GEN-END:variables
}
