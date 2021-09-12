
package com.nic.visual;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public final class Menu extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();
    public Menu() {
        this.setContentPane(fondo);
        initComponents();
        super.setTitle("Peliculas - Salas");
        setSize(829, 587);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        Desactivados();
    }

    void Encender() {
        if (jToggleButtonEncender.isSelected()) {
            jComboBoxPeliculas.setEnabled(true);
            jComboBoxHora.setEnabled(true);
            AgregarAComboboxPelicula();

            jToggleButtonEncender.setText("Apagar");
        } else {
            jComboBoxPeliculas.setEnabled(false);
            jComboBoxHora.setEnabled(false);
            limpiar();
            Desactivados();
            jToggleButtonEncender.setText("Encender");
        }
    }

    void Desactivados() {
        jComboBoxPeliculas.setEnabled(false);
        jComboBoxHora.setEnabled(false);
        jTextFieldCantidadDeBoletosGenerales.setEnabled(false);
        jTextFieldCantidadDeBoletosPreferenciales.setEnabled(false);
        jButtonContinuar.setEnabled(false);
    }

    void Activar() {
        jTextFieldCantidadDeBoletosPreferenciales.setEnabled(true);
        jTextFieldCantidadDeBoletosGenerales.setEnabled(true);
        jButtonContinuar.setEnabled(true);
    }

    void AgregarAComboboxPelicula() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        modelo.addElement("Viernes 13");
        modelo.addElement("La masacre en texas 3");
        modelo.addElement("Cars 3");
        modelo.addElement("Spider-Man");
        modelo.addElement("Batman");
        modelo.addElement("Luca");
        modelo.addElement("La purga");

        jComboBoxPeliculas.setModel(modelo);

    }

    void seleccionPelicula() {
        int combo;
        combo = jComboBoxPeliculas.getSelectedIndex();
        if (combo == 1 || combo == 2 || combo == 3 || combo == 4 || combo == 5 || combo == 6 || combo == 7) {
            Activar();
        }else {
            jTextFieldCantidadDeBoletosPreferenciales.setEnabled(false);
            jTextFieldCantidadDeBoletosGenerales.setEnabled(false);
            jButtonContinuar.setEnabled(false);
        }
    }

    void caratulas() {
        int combo;
        combo = jComboBoxPeliculas.getSelectedIndex();
        Preview prev = new Preview();
        switch (combo) {
            case 0: {
                ImageIcon i = new ImageIcon("");
                jLabelPelicula.setIcon(i);
                break;
            }
            case 1: {
                LimCantidad();
                Preview.jLabelSala.setText("2");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/Viernes13.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("6:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 2: {
                LimCantidad();
                Preview.jLabelSala.setText("2");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/masacre.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("6:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 3: {
                LimCantidad();
                Preview.jLabelSala.setText("1");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/cars.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("3:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 4: {
                LimCantidad();
                Preview.jLabelSala.setText("1");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/spider.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("3:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 5: {
                LimCantidad();
                Preview.jLabelSala.setText("1");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/bat.png");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("3:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 6: {
                LimCantidad();
                Preview.jLabelSala.setText("1");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/lucas.png");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("3:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 7: {
                LimCantidad();
                Preview.jLabelSala.setText("2");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/purga.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("6:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            default:
                break;
        }
    }

    void LimCantidad() {
        jTextFieldCantidadDeBoletosPreferenciales.setText("");
        jTextFieldCantidadDeBoletosGenerales.setText("");
    }

    void limpiar() {
        ImageIcon i = new ImageIcon("");
        jLabelPelicula.setIcon(i);
        jTextFieldCantidadDeBoletosPreferenciales.setText("");
        jTextFieldCantidadDeBoletosGenerales.setText("");
        buttonGroup1.clearSelection();
        jComboBoxPeliculas.removeAllItems();
        jComboBoxHora.removeAllItems();
    }

    void calculo() {

        double cantidadPrefe = 0.0, cantidadGener = 0.0;
        double precioPrefe = 0.0, precioGener = 0.0;
        double TotalN = 0, TotalA = 0, Total;

        if ("".equals(jTextFieldCantidadDeBoletosGenerales.getText())) {
            String ninguno = "0.0";
            Preview.jLabelTotalGeneral.setText(ninguno);
        }else if(jTextFieldCantidadDeBoletosGenerales.getText() == "2"){
            double descuento = 200;            
            cantidadGener = Double.parseDouble(jTextFieldCantidadDeBoletosGenerales.getText());
            precioGener = Double.parseDouble(jLabelPrecio2DGeneral.getText());
            TotalA= (cantidadGener * precioGener)-descuento;
            Preview.jLabelTotalGeneral.setText(TotalA + "");
        }else {
            cantidadGener = Double.parseDouble(jTextFieldCantidadDeBoletosGenerales.getText());
            precioGener = Double.parseDouble(jLabelPrecio2DGeneral.getText());
            TotalA= (cantidadGener * precioGener);
            Preview.jLabelTotalGeneral.setText(TotalA + "");
        }

        if ("".equals(jTextFieldCantidadDeBoletosPreferenciales.getText())) {
            jTextFieldCantidadDeBoletosPreferenciales.setText("");
        }else if(jTextFieldCantidadDeBoletosPreferenciales.getText() == "2"){
            double descuento = 400;            
            cantidadPrefe = Double.parseDouble(jTextFieldCantidadDeBoletosPreferenciales.getText());
            precioPrefe = Double.parseDouble(jLabelPrecio2DPreferencial.getText());
            TotalN = (cantidadPrefe * precioPrefe)-descuento;
            Preview.jLabelTotalPreferencial.setText(TotalN + "");
        } 
        else {
            cantidadPrefe = Double.parseDouble(jTextFieldCantidadDeBoletosPreferenciales.getText());
            precioPrefe = Double.parseDouble(jLabelPrecio2DPreferencial.getText());
            TotalN = (cantidadPrefe * precioPrefe);
            Preview.jLabelTotalPreferencial.setText(TotalN + "");
        }
        Total = TotalA + TotalN;
        Preview.jLabelTotalPago.setText(Total + "");

    }


    void pasaDatos() {
        Preview.jTextFieldCantidadDeBoletosGeneral.setText(jTextFieldCantidadDeBoletosGenerales.getText());
        Preview.jTextFieldCantidadDeBoletosPreferencial.setText(jTextFieldCantidadDeBoletosPreferenciales.getText());
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBoxPeliculas = new javax.swing.JComboBox<>();
        jToggleButtonEncender = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabelPrecio2DGeneral = new javax.swing.JLabel();
        jLabelPrecio2DPreferencial = new javax.swing.JLabel();
        jLabelPelicula = new javax.swing.JLabel();
        jButtonContinuar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCantidadDeBoletosPreferenciales = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCantidadDeBoletosGenerales = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jComboBoxPeliculas.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxPeliculas.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jComboBoxPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeliculasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPeliculas);
        jComboBoxPeliculas.setBounds(540, 270, 180, 27);

        jToggleButtonEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nic/imgs/power.png"))); // NOI18N
        jToggleButtonEncender.setText("Iniciar programa");
        jToggleButtonEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEncenderActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonEncender);
        jToggleButtonEncender.setBounds(0, 0, 170, 33);

        jLabel2.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peliculas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 240, 63, 19);

        jComboBoxHora.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHoraActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxHora);
        jComboBoxHora.setBounds(540, 360, 180, 22);

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(610, 320, 33, 19);

        jLabelPrecio2DGeneral.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelPrecio2DGeneral.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio2DGeneral.setText("8500");
        getContentPane().add(jLabelPrecio2DGeneral);
        jLabelPrecio2DGeneral.setBounds(210, 360, 60, 30);

        jLabelPrecio2DPreferencial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelPrecio2DPreferencial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio2DPreferencial.setText("10000");
        getContentPane().add(jLabelPrecio2DPreferencial);
        jLabelPrecio2DPreferencial.setBounds(210, 390, 50, 30);

        jLabelPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelPelicula);
        jLabelPelicula.setBounds(290, 230, 230, 300);

        jButtonContinuar.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); // NOI18N
        jButtonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nic/imgs/approve.png"))); // NOI18N
        jButtonContinuar.setText("Continuar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContinuar);
        jButtonContinuar.setBounds(570, 510, 123, 33);

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Preferencial");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(100, 390, 120, 30);

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("General");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(100, 360, 120, 30);

        jLabel14.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio de boletas");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 320, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecciona la película que deseas ver");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 180, 270, 50);

        jTextFieldCantidadDeBoletosPreferenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadDeBoletosPreferencialesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCantidadDeBoletosPreferenciales);
        jTextFieldCantidadDeBoletosPreferenciales.setBounds(710, 450, 60, 30);

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Boletas Preferenciales");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 450, 160, 30);

        jLabel5.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Boletas Generales");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 410, 140, 19);

        jTextFieldCantidadDeBoletosGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadDeBoletosGeneralesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCantidadDeBoletosGenerales);
        jTextFieldCantidadDeBoletosGenerales.setBounds(710, 400, 60, 30);

        setSize(new java.awt.Dimension(845, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        if (jComboBoxPeliculas.getSelectedIndex() == 0 && jComboBoxHora.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Todavía hacen falta datos por completar", "Complete datos", JOptionPane.WARNING_MESSAGE);
        } else {
            Preview obj = new Preview();
            pasaDatos();
            Preview.jTextFieldPelicula.setText(jComboBoxPeliculas.getSelectedItem().toString());
            Preview.jTextFieldHora.setText(jComboBoxHora.getSelectedItem().toString());           
            calculo();
            obj.setVisible(true);
        }
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jToggleButtonEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEncenderActionPerformed
        Encender();
    }//GEN-LAST:event_jToggleButtonEncenderActionPerformed

    private void jComboBoxPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeliculasActionPerformed
        seleccionPelicula();
        caratulas();
    }//GEN-LAST:event_jComboBoxPeliculasActionPerformed

    private void jComboBoxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHoraActionPerformed
       
    }//GEN-LAST:event_jComboBoxHoraActionPerformed

    private void jTextFieldCantidadDeBoletosPreferencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadDeBoletosPreferencialesActionPerformed

    }//GEN-LAST:event_jTextFieldCantidadDeBoletosPreferencialesActionPerformed

    private void jTextFieldCantidadDeBoletosGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadDeBoletosGeneralesActionPerformed
        
    }//GEN-LAST:event_jTextFieldCantidadDeBoletosGeneralesActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonContinuar;
    public static javax.swing.JComboBox<String> jComboBoxHora;
    public static javax.swing.JComboBox<String> jComboBoxPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabelPelicula;
    private javax.swing.JLabel jLabelPrecio2DGeneral;
    private javax.swing.JLabel jLabelPrecio2DPreferencial;
    public static javax.swing.JTextField jTextFieldCantidadDeBoletosGenerales;
    public static javax.swing.JTextField jTextFieldCantidadDeBoletosPreferenciales;
    public static javax.swing.JToggleButton jToggleButtonEncender;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/peliculahora.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }    

}
