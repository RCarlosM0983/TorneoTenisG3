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
public class VActualizarSponsor extends javax.swing.JInternalFrame {
private DefaultTableModel modelo;
    private SponsorData sd;
    private List<Sponsor> sponsors = new ArrayList<>();
    /**
     * Creates new form VEliminarSponsor
     */
    public VActualizarSponsor() {
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
        jLabel4 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfMarca = new javax.swing.JTextField();
        jtfArticulo = new javax.swing.JTextField();
        jcbActivo = new javax.swing.JCheckBox();
        jbActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSponsor = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Actualizar Sponsor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id Sponsor");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Articulo");

        jtfId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfId.setEnabled(false);

        jtfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfMarca.setEnabled(false);

        jtfArticulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcbActivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbActivo.setText("Activo");

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Listado");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbActualizar)
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbActivo)
                    .addComponent(jbActualizar))
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
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
        int id = Integer.parseInt(jtfId.getText());
        boolean activo = sd.buscarSponsor(id).isActivo();
        jcbActivo.setSelected(activo);
    }//GEN-LAST:event_jtSponsorMouseClicked

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        if(jtfId.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Seleccione un sponsor");
       }else{
        Conexion c = new Conexion();
        SponsorData sd = new SponsorData(c);
       
        boolean activo = jcbActivo.isSelected();
        int id = Integer.parseInt(jtfId.getText());
        String marca = jtfMarca.getText();
        String articulo = jtfArticulo.getText();
        Sponsor s= new Sponsor(id, marca, articulo, activo);
        sd.modificadarSponsor(s);
        borrarFilasTabla();
        llenarTablaSponsor();
        limpiar();
        }
    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JTable jtSponsor;
    private javax.swing.JTextField jtfArticulo;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfMarca;
    // End of variables declaration//GEN-END:variables
}
