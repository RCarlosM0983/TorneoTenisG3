/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controles.Conexion;
import Controles.EstadioData;
import Modelos.Estadio;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo_000
 */
public class VEstadio extends javax.swing.JInternalFrame {

    /**
     * Creates new form VEstadio
     */
    public VEstadio() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfAncho = new javax.swing.JTextField();
        jtfLargo = new javax.swing.JTextField();
        jtfCiudad = new javax.swing.JTextField();
        jtfCapacidad = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jcbActivo = new javax.swing.JCheckBox();
        jbRegistrar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtfIdEstadio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jcbCategoria = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Estadio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ciudad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ancho");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Categoria");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Largo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Activo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Capacidad");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Dirección");

        jtfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfAncho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAnchoKeyTyped(evt);
            }
        });

        jtfLargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfLargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfLargoKeyTyped(evt);
            }
        });

        jtfCiudad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfCapacidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCapacidadKeyTyped(evt);
            }
        });

        jtfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcbActivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbRegistrar.setText("Registrar");
        jbRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Id Estadio");

        jtfIdEstadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfIdEstadio.setEnabled(false);
        jtfIdEstadio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfIdEstadioFocusLost(evt);
            }
        });
        jtfIdEstadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdEstadioKeyTyped(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jcbCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cemento", "Cesped", "Ladrillo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfIdEstadio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(jtfCiudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jcbActivo))
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtfIdEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jcbActivo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jcbCategoria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean vacio(){
        if(jtfIdEstadio.getText().isEmpty() || jtfNombre.getText().isEmpty()|| jtfCapacidad.getText().isEmpty()|| 
          jtfCiudad.getText().isEmpty() || jtfDireccion.getText().isEmpty() || 
           jtfLargo.getText().isEmpty() || jtfAncho.getText().isEmpty()){
            
            return true;
        } else{
        return false;
      }
    }
    private void limpiar(){
         jtfIdEstadio.setText("");
            jtfNombre.setText("");
            jtfCapacidad.setText("");
            jtfCiudad.setText("");
            jtfDireccion.setText("");
            jtfLargo.setText("");
            jtfAncho.setText("");
            jcbActivo.setSelected(false);
    }
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
           this.limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
       if(jtfNombre.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Para buscar ingrese el nombre");
       }else{
        Conexion c = new Conexion();
        EstadioData ed = new EstadioData(c);
        String nombre = jtfNombre.getText();
        Estadio e = ed.buscarEstadioXNombre(nombre);
        
        if(e.getNombre() != null){
            jtfIdEstadio.setText(e.getIdEstadio()+"");
            jtfCapacidad.setText(e.getCapacidad()+"");
            jcbCategoria.setSelectedItem(e.getCategoria());
            jtfCiudad.setText(e.getCiudad());
            jtfDireccion.setText(e.getDireccionComercial());
            jtfLargo.setText(e.getLargo()+"");
            jtfAncho.setText(e.getAncho()+"");
            jcbActivo.setSelected(e.isActivo());
        }else{
            JOptionPane.showMessageDialog(this, "El estadio no existe");
          }
        }    
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
         if(vacio()){
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        }else{
        
       String nombre = jtfNombre.getText();
       int capacidad = Integer.parseInt(jtfCapacidad.getText());
       String categoria = (jcbCategoria.getSelectedItem()+"");
       String ciudad = jtfCiudad.getText();
       String dir = jtfDireccion.getText();
       float largo = Float.parseFloat(jtfLargo.getText());
       float ancho = Float.parseFloat(jtfAncho.getText());
       boolean activo = jcbActivo.isSelected();
       
       Conexion c = new Conexion();
       EstadioData ed = new EstadioData(c);
       Estadio e = new Estadio(nombre, ciudad, ancho, largo, categoria, dir, capacidad, activo);
       ed.registrarEstadio(e);
       
       this.limpiar();
         }
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
       Conexion c = new Conexion();
       EstadioData ed = new EstadioData(c);
       if(vacio()){
         JOptionPane.showMessageDialog(this, "Debe completar los campos"); 
       }else{
       ed.borrarEstadio(Integer.parseInt(jtfIdEstadio.getText()));
       
       this.limpiar();
      }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
         if(vacio()){
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        }else{
       int id = Integer.parseInt(jtfIdEstadio.getText());
       String nombre = jtfNombre.getText();
       int capacidad = Integer.parseInt(jtfCapacidad.getText());
       String categoria = (jcbCategoria.getSelectedItem()+"");
       String ciudad = jtfCiudad.getText();
       String dir = jtfDireccion.getText();
       float largo = Float.parseFloat(jtfLargo.getText());
       float ancho = Float.parseFloat(jtfAncho.getText());
       boolean activo = jcbActivo.isSelected();
       
       Conexion c = new Conexion();
       EstadioData ed = new EstadioData(c);
       Estadio e = new Estadio(id, nombre, ciudad, ancho, largo, categoria, dir, capacidad, activo);
       ed.actualizarEstadio(e);
       
       this.limpiar();
         }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtfIdEstadioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIdEstadioFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtfIdEstadioFocusLost

    private void jtfIdEstadioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdEstadioKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        
        if(!Character.isDigit(caracter)){
            evt.consume();
            
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }
        
    }//GEN-LAST:event_jtfIdEstadioKeyTyped

    private void jtfCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCapacidadKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        
        if(!Character.isDigit(caracter)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }
    }//GEN-LAST:event_jtfCapacidadKeyTyped

    private void jtfAnchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAnchoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        
        if(!Character.isDigit(caracter) && caracter != '.'){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros o decimales");
        }
        if(caracter == '.' && jtfAncho.getText().contains(".")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros o decimales");
        }
    }//GEN-LAST:event_jtfAnchoKeyTyped

    private void jtfLargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLargoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        
        if(!Character.isDigit(caracter) && caracter != '.'){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros o decimales");
        }
        if(caracter == '.' && jtfLargo.getText().contains(".")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros o decimales");
        }
    }//GEN-LAST:event_jtfLargoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JTextField jtfAncho;
    private javax.swing.JTextField jtfCapacidad;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfIdEstadio;
    private javax.swing.JTextField jtfLargo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
