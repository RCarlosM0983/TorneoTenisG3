
package Vistas;

import Controles.TorneoData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import Modelos.Torneo;


public class ListaTorneos extends javax.swing.JInternalFrame {

    TorneoData torneoData;
    ArrayList<Torneo> listaTorneos = new ArrayList<>();
    Torneo torneo;
   
    public ListaTorneos() {
        initComponents();
    }
    
    public ListaTorneos(TorneoData torneoData) {
        initComponents();
        this.torneoData = torneoData;

        listaTorneos = (ArrayList) torneoData.obtenerTodosLosTorneos();
        limpiarCampos();
        llenarListaTorneos(true);
    }
    
    public void limpiarCampos() {
        rbtnActivos.setEnabled(true);
        rbtnInactivos.setEnabled(true);
        txtBuscarTorneo.setText("");
    }

    public void llenarListaTorneos(Boolean activo) {

        if (!"".equals(txtBuscarTorneo.getText())) {
            listaTorneos = (ArrayList) torneoData.obtenerTorneos(txtBuscarTorneo.getText());
        } else {
            listaTorneos = (ArrayList) torneoData.obtenerTodosLosTorneos();
        }

        lstTorneos.removeAll();

        int largoLista = listaTorneos.size();
        //    String[] nombre = new String[largoLista];
        Torneo[] nombre = new Torneo[largoLista];
        int i = 0;

        for (Torneo t : listaTorneos) {
            if (t.isActivo() == activo) {
                nombre[i] = t;
                i++;
            }
        }

        lstTorneos.setModel(new javax.swing.AbstractListModel<Torneo>() {
            @Override
            public int getSize() {
                return listaTorneos.size();
            }

            @Override
            public Torneo getElementAt(int i) {
                return nombre[i];
            }
        });
    }

    public void activarControles() {
        txtBuscarTorneo.setEnabled(true);
    }

    public LocalDate convertToLocalDate(Date dateToConvert) {
        return new java.sql.Date(dateToConvert.getTime()).toLocalDate();
    }

    public Date convertToDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupActivosInactivos = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarTorneo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTorneos = new javax.swing.JList<>();
        rbtnInactivos = new javax.swing.JRadioButton();
        rbtnActivos = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Lista de Torneos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Lista de Torneos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Buscar Torneo");

        txtBuscarTorneo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarTorneoKeyReleased(evt);
            }
        });

        lstTorneos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTorneosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTorneos);

        btnGroupActivosInactivos.add(rbtnInactivos);
        rbtnInactivos.setText("Inactivos");
        rbtnInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInactivosActionPerformed(evt);
            }
        });

        btnGroupActivosInactivos.add(rbtnActivos);
        rbtnActivos.setSelected(true);
        rbtnActivos.setText("Activos");
        rbtnActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnActivosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSalir)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtBuscarTorneo)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnActivos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnInactivos))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnActivos)
                    .addComponent(rbtnInactivos))
                .addGap(27, 27, 27)
                .addComponent(btnSalir)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarTorneoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTorneoKeyReleased
        if (txtBuscarTorneo.getText().isEmpty()) {
        }
        llenarListaTorneos(rbtnActivos.isSelected());
    }//GEN-LAST:event_txtBuscarTorneoKeyReleased

    private void lstTorneosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTorneosValueChanged

        try {
            if (!lstTorneos.isSelectionEmpty()) {
                txtBuscarTorneo.setText(lstTorneos.getSelectedValue().toString());
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un item de la lista.");
        }
    }//GEN-LAST:event_lstTorneosValueChanged

    private void rbtnInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInactivosActionPerformed
        limpiarCampos();
        listaTorneos = (ArrayList) torneoData.obtenerTodosLosTorneos();
        if (rbtnActivos.isSelected()) {
            llenarListaTorneos(true);
        } else {
            llenarListaTorneos(false);
        }
    }//GEN-LAST:event_rbtnInactivosActionPerformed

    private void rbtnActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActivosActionPerformed
        limpiarCampos();
        listaTorneos = (ArrayList) torneoData.obtenerTodosLosTorneos();
        if (rbtnActivos.isSelected()) {
            llenarListaTorneos(true);
        } else {
            llenarListaTorneos(false);
        }
    }//GEN-LAST:event_rbtnActivosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupActivosInactivos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Torneo> lstTorneos;
    private javax.swing.JRadioButton rbtnActivos;
    private javax.swing.JRadioButton rbtnInactivos;
    private javax.swing.JTextField txtBuscarTorneo;
    // End of variables declaration//GEN-END:variables
}
