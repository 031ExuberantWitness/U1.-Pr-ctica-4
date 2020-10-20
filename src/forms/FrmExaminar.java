package forms;
//0-1-2-3
//52-311-247-8503
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class FrmExaminar extends javax.swing.JDialog {
    int xx=0, yy=0, indice = 0;
    private DefaultTableModel m;
    Object O[]=new Object[4];
    
    public FrmExaminar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        m =(DefaultTableModel)tblRegistro.getModel();
    }
    
    private String examinarNumero(String num){
        String A[] = num.split("-");
        if(A[0].equals("52")){
            O[3] = "Mexico";
            
            //Disculpe el pedazo de codigo que es este switch, como no es una base de datos como tal busque la manera de que registrara los datos que quiero.
            switch(A[1]){
                case "499": return "Aguascalientes";
                case "646": return "Baja California";
                case "613": return "Baja California Sur";
                case "982": return "Campeche";
                case "918": return "Chiapas";
                case "656": return "Chihuahua";
                case "55": return "Ciudad De Mexico";
                case "866": return "Coahuila";
                case "313": return "Colima";
                case "677": return "Durango";
                case "718": return "Estado De Mexico";
                case "429": return "Guanajuato";
                case "744": return "Guerrero";
                case "775": return "Hidalgo";
                case "378": return "Jalisco";
                case "434": return "Michoacan";
                case "751": return "Morelos";
                case "311": return "Nayarit";
                case "829": return "Nuevo Leon";
                case "951": return "Oaxaca";
                case "223": return "Puebla";
                case "448": return "Queretaro";
                case "983": return "Quintana Roo";
                case "444": return "San Luis Potosi";
                case "668": return "Sinaloa";
                case "623": return "Sonora";
                case "934": return "Tabasco";
                case "834": return "Tamaulipas";
                case "246":return "Tlaxcala";
                case "228": return "Veracruz";
                case "997": return "Yucatan";
                case "467": return "Zacatecas";
                default: return "Error: LADA desconocida o fuera de rango...";
            }
        }else{
            O[2] = "Desconocido"; O[3] = "Desconocido"; return "Error: Este numero no es de México...";
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbed = new javax.swing.JTabbedPane();
        pExaminar = new javax.swing.JPanel();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JFormattedTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Examinar"); // NOI18N
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pExaminar.setBackground(new java.awt.Color(255, 255, 255));

        lblTel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTel.setText("Numero telefonico");

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/icon/icons8_back_arrow_32px.png"))); // NOI18N
        btnSalir.setText("Regresar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/icon/icons8_search_in_list_32px.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NO ESTAN GUARDADAS TODAS LA LADAS\n");

        jButton1.setText("Ver ladas guardadas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout pExaminarLayout = new javax.swing.GroupLayout(pExaminar);
        pExaminar.setLayout(pExaminarLayout);
        pExaminarLayout.setHorizontalGroup(
            pExaminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExaminarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pExaminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pExaminarLayout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(67, 67, 67)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pExaminarLayout.setVerticalGroup(
            pExaminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExaminarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTel)
                .addGap(8, 8, 8)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pExaminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbed.addTab("Examinar", pExaminar);

        pRegistro.setBackground(new java.awt.Color(255, 255, 255));

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Numero", "Estado", "Pais"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistro);
        if (tblRegistro.getColumnModel().getColumnCount() > 0) {
            tblRegistro.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pRegistroLayout = new javax.swing.GroupLayout(pRegistro);
        pRegistro.setLayout(pRegistroLayout);
        pRegistroLayout.setHorizontalGroup(
            pRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pRegistroLayout.setVerticalGroup(
            pRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbed.addTab("Registro", pRegistro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbed)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbed)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Cerrar la ventana?");
        if(res == JOptionPane.OK_OPTION) dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        showMessageDialog(null, examinarNumero(txtTel.getText()));
        O[2] = examinarNumero(txtTel.getText());
        añadirRegistro(); 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x=evt.getXOnScreen(); int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx=evt.getX(); yy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmLadas inFrm = new FrmLadas(null, true);
        inFrm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void añadirRegistro(){
        O[0] = indice++;
        O[1] = txtTel.getText();
        m.addRow(O);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbed;
    private javax.swing.JLabel lblTel;
    private javax.swing.JPanel pExaminar;
    private javax.swing.JPanel pRegistro;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
