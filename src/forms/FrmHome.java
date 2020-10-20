package forms;

import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
Realiza un proyecto en NetBeans utilizando los siguientes componentes: 
JFrame*, JDesktopPane*, JToolBar*, JDialog*, JButton*, JFormattedTextField*, JTable*, 
JComboBox. 

Debes usar al menos 1 de cada uno de la lista. Lo que realice el proyecto será decisión tuya, PERO DEBE FUNCIONAR.
*/
public class FrmHome extends javax.swing.JFrame {
    int xx=0, yy=0;
    
    public FrmHome() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        
        setIcon("/gfx/icon/elite_3.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnSalir = new javax.swing.JToggleButton();
        js1 = new javax.swing.JToolBar.Separator();
        btnSpace = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSpace2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        Desktop = new javax.swing.JDesktopPane();
        lblFailsafe = new javax.swing.JLabel();
        lblGrid = new javax.swing.JLabel();
        lblGrid1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Home"); // NOI18N
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

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/icon/icons8_exit_32px.png"))); // NOI18N
        btnSalir.setToolTipText("Salir de la app");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);
        jToolBar1.add(js1);

        btnSpace.setEnabled(false);
        btnSpace.setFocusable(false);
        btnSpace.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSpace.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSpace);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/icon/icons8_search_property_32px.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar numero");
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        btnSpace2.setFocusable(false);
        btnSpace2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSpace2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSpace2);

        jButton1.setText("                                                                                                                                                                                                                                                                                                                                                          ");
        jButton1.setEnabled(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/icon/icons8_info_32px.png"))); // NOI18N
        btnInfo.setToolTipText("Información acerca de la app");
        btnInfo.setFocusable(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInfo);

        Desktop.setBackground(new java.awt.Color(51, 51, 51));
        Desktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFailsafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/icon/icons8_laptop_error_64px.png"))); // NOI18N
        lblFailsafe.setToolTipText("Failsafe: En caso que haya eliminado el toolbar");
        lblFailsafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFailsafeMouseClicked(evt);
            }
        });
        Desktop.add(lblFailsafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        lblGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/GRID LINE.png"))); // NOI18N
        Desktop.add(lblGrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1240, 400));

        lblGrid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/GRID LINE.png"))); // NOI18N
        Desktop.add(lblGrid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "¿Deseas salir?");
        if(res == JOptionPane.OK_OPTION) System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        FrmInfo inFrm = new FrmInfo(this, true);
        inFrm.setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void lblFailsafeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFailsafeMouseClicked
        FrmHome ds = new FrmHome();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFailsafeMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            FrmExaminar inFrm = new FrmExaminar(this, true);
            inFrm.setVisible(true);
            Desktop.add(inFrm);
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x=evt.getXOnScreen(); int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx=evt.getX(); yy=evt.getY();
    }//GEN-LAST:event_formMousePressed
    
    private void setIcon(String Icon){
        try {
            setIconImage(ImageIO.read(getClass().getResource(Icon)));
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JButton btnSpace;
    private javax.swing.JButton btnSpace2;
    private javax.swing.JButton jButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar.Separator js1;
    private javax.swing.JLabel lblFailsafe;
    private javax.swing.JLabel lblGrid;
    private javax.swing.JLabel lblGrid1;
    // End of variables declaration//GEN-END:variables
}
