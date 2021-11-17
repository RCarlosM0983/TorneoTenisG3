package Vistas;

import Controles.SponsorData;
import Modelos.Sponsor;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class VSponsor extends javax.swing.JInternalFrame {
    private SponsorData sd;
    private MenuPrincipal menu;

    
    public VSponsor(MenuPrincipal menu, SponsorData sd) {
        initComponents();
        this.sd = sd;
        this.menu = menu;
    }

    VSponsor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtIdSponsor = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtMarca = new javax.swing.JTextField();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonEditable = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbIndumentaria = new javax.swing.JComboBox<>();

        setTitle("Alta Baja Sponsor");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Sponsores");

        jtIdSponsor.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jtIdSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdSponsorActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel1.setText("ID del Sponsor");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel2.setText("Marca");

        jtMarca.setEditable(false);
        jtMarca.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N

        jCheckBoxEstado.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jCheckBoxEstado.setText("Activa");
        jCheckBoxEstado.setEnabled(false);

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonEditable.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jButtonEditable.setText("Modificar");
        jButtonEditable.setEnabled(false);
        jButtonEditable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditableActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel3.setText("Articulo");

        cbIndumentaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbIndumentaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Raqueta", "Remera", "Zapatilla", "Reloj" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonEditable)
                                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtIdSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtMarca)
                                    .addComponent(cbIndumentaria, 0, 191, Short.MAX_VALUE))))
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxEstado))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtIdSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonEditable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIndumentaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addComponent(jCheckBoxEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       
        int id = 0;
        String nomb = "";
        String indumentaria = "";
        boolean exc = false;
        Sponsor s = new Sponsor();
        try{
            id = parseInt(jtIdSponsor.getText());
            nomb = jtMarca.getText();
            indumentaria = (String) cbIndumentaria.getSelectedItem();
            exc = true; //Verifico si hay elementos en cada uno de los jText
        }catch(Exception ex){
            exc = false;
        }
        if (exc){
            if (sd.sponsorExiste(id)){
                s = sd.buscarSponsor(id);
                s.setMarca(nomb);
                s.setIndumentaria(indumentaria);
                if(jCheckBoxEstado.isSelected()!= s.isActivo())
                sd.altaSponsor(id);
                sd.modificarSponsor(s);
                s = sd.buscarSponsor(id);
            }else{
                s.setMarca(nomb);
                s.setIndumentaria(indumentaria);
                s.setIdSponsor(id);
                if(jCheckBoxEstado.isSelected())
                s.setActivo(true);
                else
                s.setActivo(false);
                sd.guardarSponsor(s);
            }
            JOptionPane.showMessageDialog(null,"Patrocinador guardado con éxito");
        }else
        JOptionPane.showMessageDialog(null,"Alguno de los campos no cumple con el tipo de dato o se encuentra vacio.");
        jButtonLimpiarActionPerformed(evt);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        menu.setVisible(isIcon);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jtIdSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdSponsorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdSponsorActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        int id = 0;
        try{
            id = Integer.valueOf(jtIdSponsor.getText());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"ID admite caracteres numéricos mayores a cero");
        }
        if(id>0){
            Sponsor s = new Sponsor();
            if(sd.sponsorExiste(id)){
                s = sd.buscarSponsor(id);
                
                jtMarca.setText(s.getMarca());
                cbIndumentaria.setSelectedItem(s.getIndumentaria());
                
                jButtonLimpiar.setEnabled(true);
                jButtonEditable.setEnabled(true);
                
                cbIndumentaria.setEditable(false);
                jtMarca.setEditable(false);
                jCheckBoxEstado.setEnabled(false);
                
                if(s.isActivo())
                jCheckBoxEstado.setSelected(true);
                JOptionPane.showMessageDialog(null, id + " , ya pertenece un sponsor, si desea puede editar la información");
            }else{
                JOptionPane.showMessageDialog(null, id + " , se encuentra disponible. Complete los campos");
                jButtonGuardar.setEnabled(true);
                jtIdSponsor.setEditable(false);
                jtMarca.setEditable(true);
                cbIndumentaria.setEditable(true);
                jCheckBoxEstado.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        jtMarca.setText("");
        cbIndumentaria.setSelectedItem("");
        jtIdSponsor.setText("");
        jButtonLimpiar.setEnabled(true);
        jtIdSponsor.setEditable(true);
        jtMarca.setEditable(false);
        jCheckBoxEstado.setEnabled(false);
        jButtonEditable.setEnabled(false);
        jButtonGuardar.setEnabled(false);
        jCheckBoxEstado.setSelected(false);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonEditableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditableActionPerformed
        jtIdSponsor.setEditable(false);
        jButtonLimpiar.setEnabled(false);
        jtMarca.setEditable(true);
        cbIndumentaria.setSelectedItem(true);
        jCheckBoxEstado.setEnabled(true);
        jButtonGuardar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbIndumentaria;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditable;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jtIdSponsor;
    private javax.swing.JTextField jtMarca;
    // End of variables declaration//GEN-END:variables
}
