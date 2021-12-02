/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controles.Conexion;
import Controles.SponsorData;
import Modelos.Sponsor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo_000
 */
public class VEliminarSponsor extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    private SponsorData sd;
    private List<Sponsor> sponsors = new ArrayList<>();
    /**
     * Creates new form VEliminarSponsor
     */
    public VEliminarSponsor() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabecera();
        borrarFilasTabla();
        llenarTablaSponsor();
    }
    private void armarCabecera(){
        ArrayList<Object>columnas = new ArrayList<>();
        columnas.add("Id Sponsor");
        columnas.add("Marca");
        columnas.add("Articulo");
        columnas.add("Activo");
        
        for(Object titulo: columnas){
            modelo.addColumn(titulo);
        }
        jtSponsor.setModel(modelo);
    }
    
     private void borrarFilasTabla(){
    
        int fila = modelo.getRowCount()-1;
        for (int i = fila; i >= 0; i--) {
            modelo.removeRow(i);
            
        }
    }

    private void llenarTablaSponsor() {
        borrarFilasTabla();
        Conexion c = new Conexion();
        SponsorData sd = new SponsorData(c);
        sponsors = sd.buscarTodosSponsor();
        for(Sponsor s: sponsors){
            
           modelo.addRow(new Object[] {s.getIdSponsor(), s.getMarca(), s.getIndumentaria(), s.isActivo()});
        }
    }   
    private void limpiar(){
        jtfId.setText("");
        jtfMarca.setText("");
        jtfArticulo.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jtfArticulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSponsor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Eliminar Sponsor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Artículo");

        jtfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfMarca.setEnabled(false);

        jtfArticulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfArticulo.setEnabled(false);

        jtSponsor.setModel(new javax.swing.table.DefaultTableModel(
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
        jtSponsor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSponsorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtSponsor);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Listado");

        jbEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Id Sponsor");

        jtfId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfArticulo)
                    .addComponent(jtfMarca)
                    .addComponent(jtfId, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEliminar)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtSponsorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSponsorMouseClicked
        // TODO add your handling code here:
         Conexion c = new Conexion();
        SponsorData sd = new SponsorData(c);
        int seleccion = jtSponsor.rowAtPoint(evt.getPoint());
        jtfId.setText(String.valueOf(jtSponsor.getValueAt(seleccion,0)));
        jtfMarca.setText(String.valueOf(jtSponsor.getValueAt(seleccion,1)));
        jtfArticulo.setText(String.valueOf(jtSponsor.getValueAt(seleccion,2)));
        
    }//GEN-LAST:event_jtSponsorMouseClicked

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        if(jtfId.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Seleccione un sponsor");
       }else{
        Conexion c = new Conexion();
        SponsorData sd = new SponsorData(c);
        int id = Integer.parseInt(jtfId.getText());
       
       sd.borrarSponsor(id);
       borrarFilasTabla();
       llenarTablaSponsor();
       limpiar();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JTable jtSponsor;
    private javax.swing.JTextField jtfArticulo;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfMarca;
    // End of variables declaration//GEN-END:variables
}