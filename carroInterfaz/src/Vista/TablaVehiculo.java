
package Vista;

import Modelo.Coche;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TablaVehiculo extends javax.swing.JFrame {

    
    public TablaVehiculo() {
        initComponents();
        cargarVehiculos();
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "serial del vehiculo", "numero de puertas", "modelo", "marca del auto", "tipo de conbustible", "caracteristicas adicionales"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
  private void cargarVehiculos() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Serial del Vehiculo");
    modelo.addColumn("Numero de Puertas");
    modelo.addColumn("Modelo");
    modelo.addColumn("Marca del Auto");
    modelo.addColumn("Tipo de Combustible");
    modelo.addColumn("Caracteristicas Adicionales");

    javax.swing.JTable tabla = jTable1; 

   
    java.util.ArrayList<String[]> lista = Modelo.RegistroVehiculos.obtenerVehiculos();
    for (String[] vehiculo : lista) {
        modelo.addRow(vehiculo);
    }

    tabla.setModel(modelo);
    
}


public static ArrayList<String[]> vehiculosLocal = new ArrayList<>(); 

public static void agregarVehiculoLocal(Coche coche) {
    String[] vehiculo = new String[6];
    vehiculo[0] = coche.getSerial_vehiculo();
    vehiculo[1] = String.valueOf(coche.getNumeroPuertas());
    vehiculo[2] = coche.getModelo_vehiculo();
    vehiculo[3] = coche.getMarca();
    vehiculo[4] = coche.getTipoCombustible();
    vehiculo[5] = coche.getCaracteristicasAdicionales();
    vehiculosLocal.add(vehiculo);
}

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaVehiculo().setVisible(true);
            }
        });
    }
    
    

   
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    
}
