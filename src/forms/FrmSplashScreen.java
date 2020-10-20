package forms;

import Animacion.Fade;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Timer;

public class FrmSplashScreen extends javax.swing.JDialog {
    private Timer t = null;
    private int count =0;
    
    public FrmSplashScreen(java.awt.Frame parent, boolean modal) {
        initComponents();
        setBackground(new Color(0,0,0,0));
        
        Fade.JDialogFadeIn(0f, 1f, 0.1f, 50, this);
        this.getContentPane().setBackground(new Color(255,255,255));
        setLocationRelativeTo(null);
        
        t=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              count += 50;
              progressCargado.setValue(count);
              if(progressCargado.getValue()==100){
                  fadeOut();
              }
            }
        });
    }
    
////////////////////////////////////////////////////////////////////////////////
/// Funciones miscelaneas///////////////////////////////////////////////////////
    private void setIcon(String Icon){
        try {
            setIconImage(ImageIO.read(getClass().getResource(Icon)));
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private void fadeOut(){
        FrmHome ds = new FrmHome();
        ds.setVisible(true);
        Fade.JFrameFadeIn(0f, 1f, 0.1f, 50, ds);
        t.stop();
        Fade.JDialogFadeOut(1f, 0f, 0.1f, 50, this, Fade.DISPOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progressCargado = new javax.swing.JProgressBar();
        lblTitle = new javax.swing.JLabel();
        lblBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressCargado.setBackground(new java.awt.Color(0, 153, 255));
        progressCargado.setForeground(new java.awt.Color(102, 102, 102));
        progressCargado.setPreferredSize(new java.awt.Dimension(144, 10));
        progressCargado.setString("");
        progressCargado.setStringPainted(true);
        getContentPane().add(progressCargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 393, 918, 20));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setText("U1. Práctica 4");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        lblBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/back_ground.png"))); // NOI18N
        getContentPane().add(lblBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        t.start();
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmSplashScreen dialog = new FrmSplashScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JProgressBar progressCargado;
    // End of variables declaration//GEN-END:variables
}
