package Vistas;

import Controles.EstadioData;
import Modelos.Estadio;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListaEstadios extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    private ArrayList<Estadio> estadios;
    private ArrayList<Estadio> estadiosActivas;
    private EstadioData estadioData;
    private MenuPrincipal1 menu;

    public ListaEstadios(MenuPrincipal1 menu, EstadioData EstadioData) {
        initComponents();
        
        this.menu = menu;
        this.estadioData = EstadioData;
        modelo = new DefaultTableModel();
        
        estadios = (ArrayList<Estadio>) EstadioData.obtenerEstadios();
        estadiosActivas = (ArrayList<Estadio>) EstadioData.obtenerEstadiosEnUso();
        
        vaciarTabla();
        armarCabecera();
        llenarTablaTodos();
    }

    ListaEstadios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstadios = new javax.swing.JTable();
        jCheckBoxActivos = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setTitle("Estadios");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Listado de Estadios");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableEstadios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableEstadios);

        jCheckBoxActivos.setText("Ver canchas disponibles");
        jCheckBoxActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxActivos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxActivos)
                .addGap(11, 11, 11))
        );

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(231, 231, 231)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActivosActionPerformed
        // TODO add your handling code here:
        
        vaciarTabla();
        
        if (jCheckBoxActivos.isSelected()){
            llenarTablaActivos();
        } else {
            llenarTablaTodos();
        }
    }//GEN-LAST:event_jCheckBoxActivosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void armarCabecera() {
        ArrayList<Object> titulos = new ArrayList<>();

        titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Ciudad");
        titulos.add("Direccion");
        titulos.add("Ancho");
        titulos.add("Largo");
        titulos.add("Categoria");
        titulos.add("Capacidad");
        titulos.add("Habilitado");

        for (Object titulo: titulos) {
            modelo.addColumn(titulo);
        }

        jTableEstadios.setModel(modelo);
    }

    private void llenarTablaTodos() {
        for (Estadio e : estadios) {
            modelo.addRow(new Object[]{e.getIdEstadio(), e.getNombre(), e.getCiudad(), e.getDireccionComercial(), e.getAncho(), e.getLargo(), e.getCategoria(), e.getCapacidad(), e.isEnUso()});
        }
    }
    
    private void llenarTablaActivos() {
        for (Estadio e : estadiosActivas) {
            modelo.addRow(new Object[]{e.getIdEstadio(), e.getNombre(), e.getCiudad(), e.getDireccionComercial(), e.getAncho(), e.getLargo(), e.getCategoria(), e.getCapacidad(), e.isEnUso()});
        }
    }
    
    private void vaciarTabla(){
        int filas = modelo.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxActivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEstadios;
    // End of variables declaration//GEN-END:variables
}
