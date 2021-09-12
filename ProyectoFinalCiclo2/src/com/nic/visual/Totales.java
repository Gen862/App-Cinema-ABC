
package com.nic.visual;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import com.nic.visual.Inicio;
import static com.nic.visual.Preview.jLabelSala;
import static com.nic.visual.Preview.jLabelTotalPago;
import static com.nic.visual.Preview.jTextFieldPelicula;
import javax.swing.JOptionPane;


public class Totales extends javax.swing.JFrame {

    FondoPanel fondo= new FondoPanel();
    public Totales() {
        setResizable(false);
        setSize(829, 587);
        setTitle("Consulta nuestros movimientos");
        this.setContentPane(fondo);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabelTotalCine = new javax.swing.JLabel();
        jLabelTotalSala1 = new javax.swing.JLabel();
        jLabelTotalSala2 = new javax.swing.JLabel();
        bntSalir = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnVolver.setBackground(new java.awt.Color(31, 121, 214));
        btnVolver.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver a la taquilla");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(110, 540, 140, 40);

        jLabelTotalCine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotalCine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelTotalCine);
        jLabelTotalCine.setBounds(320, 360, 200, 30);

        jLabelTotalSala1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotalSala1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelTotalSala1);
        jLabelTotalSala1.setBounds(320, 180, 200, 30);

        jLabelTotalSala2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotalSala2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelTotalSala2);
        jLabelTotalSala2.setBounds(320, 270, 200, 30);

        bntSalir.setBackground(new java.awt.Color(31, 121, 214));
        bntSalir.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        bntSalir.setForeground(new java.awt.Color(255, 255, 255));
        bntSalir.setText("Salir.");
        bntSalir.setBorder(null);
        bntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bntSalir);
        bntSalir.setBounds(10, 540, 90, 40);

        jTextField1.setBackground(new java.awt.Color(0, 0, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Total recaudado en el Cine");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 330, 260, 30);

        jTextField2.setBackground(new java.awt.Color(0, 0, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Total recaudado sala 1");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 148, 250, 30);

        jTextField3.setBackground(new java.awt.Color(0, 0, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Total recaudado sala 2");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 240, 250, 30);

        setSize(new java.awt.Dimension(845, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inicio volver = new Inicio();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void bntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bntSalirActionPerformed


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
            java.util.logging.Logger.getLogger(Totales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Totales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Totales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Totales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Totales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSalir;
    private javax.swing.JButton btnVolver;
    public static javax.swing.JLabel jLabelTotalCine;
    public static javax.swing.JLabel jLabelTotalSala1;
    public static javax.swing.JLabel jLabelTotalSala2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/trasparencia.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
