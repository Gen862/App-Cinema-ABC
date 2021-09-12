
package com.nic.visual;

import static com.nic.visual.Preview.jLabelSala;
import static com.nic.visual.Preview.jLabelTotalPago;
import static com.nic.visual.Preview.jTextFieldPelicula;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Ticket extends javax.swing.JFrame {

    
    public Ticket() {
        super.setUndecorated(true);
        initComponents();
        super.setLocationRelativeTo(this);
        fecha();
    }
    
    public void recibeD(){
        Preview.jTextFieldPelicula.setText(jLabelPelicula.getText());
        Preview.jLabelSala.setText(jLabelSala.getText());
        Preview.jLabelTotalPago.setText(jLabelTotal.getText());
    }

    void fecha() {
        Date dia = new Date();
        jLabelFecha.setText("Fecha: " + (dia.getDay() + 6) + "/" + (dia.getMonth() + 1) + "/" + (dia.getYear() + 1900));
        jLabelHora.setText("Hora: " + (dia.getHours()) + ":" + (dia.getMinutes()) + ":" + (dia.getSeconds()));
    }
    
    void limpiar() {
        ImageIcon i = new ImageIcon("");
        Menu.jLabelPelicula.setIcon(i);
        Menu.buttonGroup1.clearSelection();
        Menu.jComboBoxHora.setSelectedIndex(0);
        Menu.jComboBoxPeliculas.setSelectedIndex(0);
    }
    
    void pasaDatos() {
        if(jLabelSala.getText() == "1"){
            Totales.jLabelTotalSala1.setText("COP "+jLabelTotalPago.getText());
            Totales.jLabelTotalCine.setText("COP "+jLabelTotalPago.getText());
            
        }else{
            Totales.jLabelTotalSala2.setText("COP "+jLabelTotalPago.getText());
            Totales.jLabelTotalCine.setText("COP "+jLabelTotalPago.getText());
        }
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelPelicula = new javax.swing.JLabel();
        jLabelSala = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_auditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel4.setText("CINEMA ABC");

        jLabel5.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel5.setText("Creador ...............");

        jLabel6.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel6.setText("Gen Contreras");

        jLabelHora.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N

        jLabelFecha.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel7.setText("Pelicula................");

        jLabel8.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel8.setText("Sala ......................");

        jLabelPelicula.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabelPelicula.setText("...");

        jLabelSala.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabelSala.setText("...");

        jLabelTotal.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabelTotal.setText("...");

        jLabel12.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL ...................");

        jLabel15.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel15.setText("¡Gracias por preferirnos!");

        jButton1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nic/imgs/rgb.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_auditar.setFont(new java.awt.Font("Ubuntu Condensed", 0, 11)); // NOI18N
        btn_auditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nic/imgs/approve.png"))); // NOI18N
        btn_auditar.setText("Auditoría");
        btn_auditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_auditarMouseClicked(evt);
            }
        });
        btn_auditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_auditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabelSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_auditar)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelSala))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabelTotal))
                .addGap(66, 66, 66)
                .addComponent(jLabel15)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_auditar))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
        JOptionPane.showMessageDialog(this, "Que disfrutes tu función", "Listo!!!", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_auditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_auditarMouseClicked
        
    }//GEN-LAST:event_btn_auditarMouseClicked

    private void btn_auditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_auditarActionPerformed
        Totales next = new Totales();
        pasaDatos();
        next.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_auditarActionPerformed

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_auditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    public static javax.swing.JLabel jLabelPelicula;
    public static javax.swing.JLabel jLabelSala;
    public static javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
