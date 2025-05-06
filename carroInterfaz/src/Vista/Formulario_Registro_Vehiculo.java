
package Vista;
import Modelo.Coche;
import Modelo.RegistroVehiculos;
import Vista.TablaVehiculo;
import javax.swing.ButtonGroup;


public class Formulario_Registro_Vehiculo extends javax.swing.JFrame {

   
    public Formulario_Registro_Vehiculo() {
        initComponents();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JOptionPane = new javax.swing.JOptionPane();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        titulu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Campo_Serial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Campo_Modelo = new javax.swing.JTextField();
        botonregistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Campo_NumeroPuertas = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        JOptionPane.setBackground(new java.awt.Color(0, 153, 153));
        JOptionPane.setForeground(new java.awt.Color(153, 0, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        titulu.setBackground(new java.awt.Color(255, 255, 255));
        titulu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulu.setForeground(new java.awt.Color(0, 0, 0));
        titulu.setText("Registre el Vehiculo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite el Serial Del Vehiculo");

        Campo_Serial.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Digite El Modelo");

        Campo_Modelo.setBackground(new java.awt.Color(255, 255, 255));

        botonregistro.setBackground(new java.awt.Color(153, 102, 255));
        botonregistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonregistro.setForeground(new java.awt.Color(0, 0, 0));
        botonregistro.setText("Registrarse");
        botonregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonregistroMouseClicked(evt);
            }
        });
        botonregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistroActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Digite El Numero De Puertas");

        Campo_NumeroPuertas.setBackground(new java.awt.Color(255, 255, 255));
        Campo_NumeroPuertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_NumeroPuertasActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Chevrolet", "Fiat", "suzuki", "Mercedes", " " }));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Marca  De Autos");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo De Combustible");

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Gasolina");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Disel");

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Electrico");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Caracteristicas Adicionales");

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setText("Vidrios Atomaticos");

        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton5.setText("Aire Acondicionado");

        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton6.setText("Pantalla De Juegos");

        jButton1.setBackground(new java.awt.Color(153, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ver Registros");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(titulu, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(botonregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Serial, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Campo_NumeroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Campo_NumeroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(botonregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonregistroActionPerformed

    private void botonregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistroMouseClicked
                                                
    System.out.println("Se hizo clic en el botón");

        String auxSerial = Campo_Serial.getText();
        String auxModelo = Campo_Modelo.getText();
        String auxNumeroPuertas = Campo_NumeroPuertas.getText();
        ButtonGroup grupoCombustible = new ButtonGroup();
        grupoCombustible.add(jRadioButton1);
        grupoCombustible.add(jRadioButton2);
        grupoCombustible.add(jRadioButton3);

        // Obtener los valores de los campos adicionales
        String marca = (String) jComboBox1.getSelectedItem();
        
        // Determinar el tipo de combustible
        String tipoCombustible = "";
        if (jRadioButton1.isSelected()) {
            tipoCombustible = "Gasolina";
        } else if (jRadioButton2.isSelected()) {
            tipoCombustible = "Diésel";
        } else if (jRadioButton3.isSelected()) {
            tipoCombustible = "Eléctrico";
        }
        
        // Determinar las características adicionales
        StringBuilder caracteristicas = new StringBuilder();
        if (jRadioButton4.isSelected()) {
            caracteristicas.append("Vidrios automáticos, ");
        }
        if (jRadioButton5.isSelected()) {
            caracteristicas.append("Aire acondicionado, ");
        }
        if (jRadioButton6.isSelected()) {
            caracteristicas.append("Pantalla de juegos");
        }

        Coche coche = new Coche();
        coche.setSerial_vehiculo(auxSerial);
        coche.setModelo_vehiculo(auxModelo);
        coche.setNumeroPuertas(Integer.parseInt(auxNumeroPuertas));
        coche.setMarca(marca);
        coche.setTipoCombustible(tipoCombustible);
        coche.setCaracteristicasAdicionales(caracteristicas.toString());

        // Validar los campos
        if (validarCamposVehiculo(auxSerial, auxModelo, auxNumeroPuertas)) {
            coche.mostrarInfo();
            JOptionPane.showMessageDialog(this, "Registro de vehículo exitoso.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error en el registro. Verifique los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (validarCamposVehiculo(auxSerial, auxModelo, auxNumeroPuertas)) {
        coche.mostrarInfo(); 
        RegistroVehiculos.agregarVehiculo(auxSerial, Integer.parseInt(auxNumeroPuertas), auxModelo, marca, tipoCombustible, caracteristicas.toString());
         JOptionPane.showMessageDialog(this, "Registro de vehículo exitoso.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
}       else {
       JOptionPane.showMessageDialog(this, "Error en el registro. Verifique los campos.", "Error", JOptionPane.ERROR_MESSAGE);
}

    

}


private boolean validarCamposVehiculo(String serial, String modelo, String numeroPuertas) {
    if (!serial.matches("[0-9]+") || !modelo.matches("[0-9]+")) {
        return false;
    }
   if (modelo.isEmpty() || !modelo.matches("[a-zA-Z0-9 ]+")) { // permite letras, números y espacios
        return false;
    }
    
    return true;

    }//GEN-LAST:event_botonregistroMouseClicked

    private void Campo_NumeroPuertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_NumeroPuertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_NumeroPuertasActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jButton1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        TablaVehiculo tabla = new TablaVehiculo();
        tabla.setVisible(true);
    }
});

    }//GEN-LAST:event_jButton1MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_Modelo;
    private javax.swing.JTextField Campo_NumeroPuertas;
    private javax.swing.JTextField Campo_Serial;
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JButton botonregistro;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JLabel titulu;
    // End of variables declaration//GEN-END:variables
}
