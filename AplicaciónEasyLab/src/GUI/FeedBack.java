/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Datos.DATFuncionalidades;
import Entidades.PDF;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author LENOVO
 */
public class FeedBack extends javax.swing.JFrame {
    boolean clave = true;
    
    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form Principal
     */
    public FeedBack() {
        this.setContentPane(fondo);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/IMG/help.png")).getImage());
       this.setSize(new Dimension(1200, 800));
        //this.setMinimumSize(new Dimension(200, 200));
        setLocationRelativeTo(null);
        btnCalificar.setBackground(Color.CYAN);
        
        this.setResizable(false);
        setTitle("EasyLab - Asesoramiento ");
    }
     public void imagenDesktop(){
         
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        res1 = new javax.swing.ButtonGroup();
        res2 = new javax.swing.ButtonGroup();
        res3 = new javax.swing.ButtonGroup();
        res4 = new javax.swing.ButtonGroup();
        res5 = new javax.swing.ButtonGroup();
        btnCalificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ac1 = new javax.swing.JRadioButton();
        ep1 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dc1 = new javax.swing.JRadioButton();
        ac2 = new javax.swing.JRadioButton();
        ac3 = new javax.swing.JRadioButton();
        ac4 = new javax.swing.JRadioButton();
        ac5 = new javax.swing.JRadioButton();
        ep2 = new javax.swing.JRadioButton();
        ep3 = new javax.swing.JRadioButton();
        ep4 = new javax.swing.JRadioButton();
        ep5 = new javax.swing.JRadioButton();
        dc2 = new javax.swing.JRadioButton();
        dc3 = new javax.swing.JRadioButton();
        dc4 = new javax.swing.JRadioButton();
        dc5 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalificar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCalificar.setText("CALIFICAR");
        btnCalificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalificarMouseExited(evt);
            }
        });
        getContentPane().add(btnCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 630, 237, 51));

        jLabel5.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 233, 233));
        jLabel5.setText("Seleccione la respuesta de acuerdo a su opinión:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 204));
        jLabel8.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Formulario de Calificación");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 25, 559, -1));

        jPanel1.setBackground(new java.awt.Color(247, 243, 223));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel6.setText("¿Le pareció de facil manejo el aplicativo?");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel7.setText("¿Está satisfecho con los contenidos encontrados ");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel9.setText("dentro del aplicativo?");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel10.setText("¿Recomendaría implementar esta aplicación con");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel11.setText("las demás herramientas del laboratorio?");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel12.setText("¿Las prácticas propuestas completan su conoci");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel13.setText("nalidades presentadas?");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel14.setText("¿Le parece adecuada la explicación de las funcio");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 24)); // NOI18N
        jLabel15.setText("miento previo?");

        res1.add(ac1);

        res1.add(ep1);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 20)); // NOI18N
        jLabel16.setText("En Parte");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 20)); // NOI18N
        jLabel17.setText("De acuerdo");

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Kozuka Mincho Pro R", 1, 20)); // NOI18N
        jLabel18.setText("Desacuerdo");

        res1.add(dc1);

        res2.add(ac2);

        res3.add(ac3);

        res4.add(ac4);

        res5.add(ac5);

        res2.add(ep2);

        res3.add(ep3);

        res4.add(ep4);

        res5.add(ep5);

        res2.add(dc2);

        res3.add(dc3);

        res4.add(dc4);

        res5.add(dc5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(739, 739, 739)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(334, 334, 334)
                .addComponent(ac1)
                .addGap(85, 85, 85)
                .addComponent(ep1)
                .addGap(85, 85, 85)
                .addComponent(dc1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(251, 251, 251)
                .addComponent(ac2)
                .addGap(85, 85, 85)
                .addComponent(ep2)
                .addGap(85, 85, 85)
                .addComponent(dc2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addGap(256, 256, 256)
                .addComponent(ac3)
                .addGap(85, 85, 85)
                .addComponent(ep3)
                .addGap(85, 85, 85)
                .addComponent(dc3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addGap(269, 269, 269)
                .addComponent(ac4)
                .addGap(85, 85, 85)
                .addComponent(ep4)
                .addGap(85, 85, 85)
                .addComponent(dc4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(256, 256, 256)
                .addComponent(ac5)
                .addGap(85, 85, 85)
                .addComponent(ep5)
                .addGap(85, 85, 85)
                .addComponent(dc5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ac1)
                            .addComponent(ep1)
                            .addComponent(dc1))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ac2)
                            .addComponent(ep2)
                            .addComponent(dc2))))
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ac3)
                            .addComponent(ep3)
                            .addComponent(dc3))))
                .addGap(11, 11, 11)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(ac4)
                    .addComponent(ep4)
                    .addComponent(dc4))
                .addGap(7, 7, 7)
                .addComponent(jLabel15)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10))
                    .addComponent(ac5)
                    .addComponent(ep5)
                    .addComponent(dc5))
                .addGap(13, 13, 13)
                .addComponent(jLabel11))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 1080, 420));

        jMenu1.setText("Opciones");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        jMenuItem.setText("Salir");
        jMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemMouseClicked(evt);
            }
        });
        jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemMouseClicked
        // TODO add your handling code here:
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_jMenuItemMouseClicked

    private void jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActionPerformed
        // TODO add your handling code here:
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_jMenuItemActionPerformed

    private void btnCalificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalificarMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCalificarMouseClicked

    private void btnCalificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalificarMouseEntered
        // TODO add your handling code here:
        btnCalificar.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnCalificarMouseEntered

    private void btnCalificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalificarMouseExited
        // TODO add your handling code here:
        btnCalificar.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnCalificarMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedBack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ac1;
    private javax.swing.JRadioButton ac2;
    private javax.swing.JRadioButton ac3;
    private javax.swing.JRadioButton ac4;
    private javax.swing.JRadioButton ac5;
    private javax.swing.JButton btnCalificar;
    private javax.swing.JRadioButton dc1;
    private javax.swing.JRadioButton dc2;
    private javax.swing.JRadioButton dc3;
    private javax.swing.JRadioButton dc4;
    private javax.swing.JRadioButton dc5;
    private javax.swing.JRadioButton ep1;
    private javax.swing.JRadioButton ep2;
    private javax.swing.JRadioButton ep3;
    private javax.swing.JRadioButton ep4;
    private javax.swing.JRadioButton ep5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup res1;
    private javax.swing.ButtonGroup res2;
    private javax.swing.ButtonGroup res3;
    private javax.swing.ButtonGroup res4;
    private javax.swing.ButtonGroup res5;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
        private Image imagen;
        @Override
        public void paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("/IMG/utpl2.jpg")).getImage();
            
            g.drawImage(imagen , 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
            
        }
    }

}

