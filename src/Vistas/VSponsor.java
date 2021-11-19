package Vistas;

import Controles.Conexion;
import Controles.SponsorData;
import Modelos.Sponsor;
import javax.swing.JOptionPane;

public class VSponsor extends javax.swing.JInternalFrame {
    

    VSponsor() {
       //To change body of generated methods, choose Tools | Templates.
       initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtIdSponsor = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        jcbActivo = new javax.swing.JCheckBox();
        jbEliminar = new javax.swing.JButton();
        jtfMarca = new javax.swing.JTextField();
        jtfArticulo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Alta Baja Sponsor");

        jbGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
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
        jtIdSponsor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdSponsorKeyTyped(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(153, 153, 153));
        jbBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel1.setText("ID del Sponsor");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel2.setText("Marca");

        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 16)); // NOI18N
        jLabel3.setText("Articulo");

        jbActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jcbActivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbActivo.setText("Activo");

        jbEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jtfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfArticulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                    .addComponent(jtfMarca)
                                    .addComponent(jtfArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                .addGap(46, 46, 46))
                            .addComponent(jcbActivo))
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(300, 300, 300)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtIdSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbActualizar)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jcbActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
       String marca = (jtfMarca.getText());
       String articulo = jtfArticulo.getText();
       boolean activo = jcbActivo.isSelected();
       
       Conexion c = new Conexion();
       SponsorData sd = new SponsorData(c);
       Sponsor s = new Sponsor(marca, articulo, activo);
       sd.guardarSponsor(s);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtIdSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdSponsorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdSponsorActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
       if(jtIdSponsor.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Para buscar ingrese el id sponsor");
       }else{
        Conexion c = new Conexion();
        SponsorData sd = new SponsorData(c);
        int id = Integer.parseInt(jtIdSponsor.getText());
        Sponsor s = sd.buscarSponsor(id);
        
        if(s.getMarca() != null){
            
            jtfArticulo.setText(s.getIndumentaria());
            jtfMarca.setText(s.getMarca());
            jcbActivo.setSelected(s.isActivo());
        }else{
            JOptionPane.showMessageDialog(this, "El sponsor no existe");
          }
        }    
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
       jcbActivo.setSelected(false);
        jtIdSponsor.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        if(jtIdSponsor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        }else{  
             
       int id = Integer.parseInt(jtIdSponsor.getText());
       String marca = jtfMarca.getText();
       String articulo = jtfArticulo.getText();
       boolean activo = jcbActivo.isSelected();
       
       Conexion c = new Conexion();
       SponsorData sd = new SponsorData(c);
       Sponsor s = new Sponsor(id, marca, articulo, activo);
       sd.modificadarSponsor(s);
       
       
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
         Conexion c = new Conexion();
       SponsorData sd = new SponsorData(c);
       if(jtIdSponsor.getText().isEmpty()){
           
         JOptionPane.showMessageDialog(this, "Debe ingresar id sponsor"); 
       }else{
       sd.borrarSponsor(Integer.parseInt(jtIdSponsor.getText()));
       
       jtIdSponsor.setText("");
      }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtIdSponsorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdSponsorKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        
        if(!Character.isDigit(caracter)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }
    }//GEN-LAST:event_jtIdSponsorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JTextField jtIdSponsor;
    private javax.swing.JTextField jtfArticulo;
    private javax.swing.JTextField jtfMarca;
    // End of variables declaration//GEN-END:variables
}
