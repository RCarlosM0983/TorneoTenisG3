/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controles.Conexion;
import Controles.JugadorData;
import Modelos.Jugador;
import java.sql.Date;
import java.time.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo_000
 */
public class VJugador extends javax.swing.JInternalFrame {

    /**
     * Creates new form VJugador
     */
    public VJugador() {
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
        jtfDni = new javax.swing.JTextField();
        jtfNombreApellido = new javax.swing.JTextField();
        jtfAltura = new javax.swing.JTextField();
        jtfPeso = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jcbActivo = new javax.swing.JCheckBox();
        jcbEstilo = new javax.swing.JComboBox<>();
        jcbManoHabil = new javax.swing.JComboBox<>();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Jugador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de Nacimiento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre y Apellido");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Altura");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Peso");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estilo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mano Habil");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Activo");

        jtfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniKeyTyped(evt);
            }
        });

        jtfAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAlturaKeyTyped(evt);
            }
        });

        jtfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesoKeyTyped(evt);
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

        jbGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbActualizar.setMargin(new java.awt.Insets(2, 7, 2, 7));
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
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

        jcbEstilo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbEstilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voleador/a", "Agresivo/a", "Toda la Cancha" }));

        jcbManoHabil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbManoHabil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Derecho/a", "Izquierdo/a" }));

        jdcFechaNac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jdcFechaNac.setMaxSelectableDate(new java.util.Date(1609473663000L));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcbActivo)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jtfPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                    .addComponent(jtfAltura)
                                                    .addComponent(jtfDni))))
                                        .addGap(18, 44, Short.MAX_VALUE)
                                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jdcFechaNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jcbManoHabil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jcbEstilo, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jcbEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbManoHabil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jcbActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean vacio(){
        if(jdcFechaNac.getDate() == null || jtfAltura.getText().isEmpty() || jtfDni.getText().isEmpty() ||    
           jtfNombreApellido.getText().isEmpty() || jtfPeso.getText().isEmpty()){
            
            return true;      
        }else{
            return false;
        }
    }
    private void limpiar(){
            jdcFechaNac.setCalendar(null);
            jcbActivo.setSelected(false);
            jtfAltura.setText("");
            jtfDni.setText("");
            jtfNombreApellido.setText("");
            jtfPeso.setText("");  
    }
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
         if(jtfDni.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Para buscar ingrese el Dni");
       }else{
        Conexion c = new Conexion();
        JugadorData jd = new JugadorData(c);
        int dni = Integer.parseInt(jtfDni.getText());
        Jugador j = jd.buscarJugadorPorDni(dni) ;
        
        if(j.getNombreApellido()!= null){
            jtfNombreApellido.setText(j.getNombreApellido());
            jtfAltura.setText(j.getAltura()+"");
            jcbManoHabil.setSelectedItem(j.getManoHabil());
            jcbEstilo.setSelectedItem(j.getEstilo());
            jtfPeso.setText(j.getPeso()+"");
            jdcFechaNac.setDate(Date.valueOf(j.getFechaNac()));
            jcbActivo.setSelected(j.isActivo());
        }else{
            JOptionPane.showMessageDialog(this, "El Jugador no existe");
        }
        }
                                               
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
          this.limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
         
       Conexion c = new Conexion();
       JugadorData jd = new JugadorData(c);
       Jugador j = jd.buscarJugadorPorDni(Integer.parseInt(jtfDni.getText()));
       
       if(vacio()){
          JOptionPane.showMessageDialog(this, "Debe completar los campos"); 
       }else{
        jd.borrarJugador(j.getIdJugador());
       
       this.limpiar();
       }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
         if(vacio()){
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        }else{
        
       String nombre = jtfNombreApellido.getText();
       float altura = Float.parseFloat(jtfAltura.getText());
       String manoHabil = (jcbManoHabil.getSelectedItem()+"");
       String estilo = (jcbEstilo.getSelectedItem()+"");
       float peso = Float.parseFloat(jtfPeso.getText());
       int dni = Integer.parseInt(jtfDni.getText());
       LocalDate fechaNac = Instant.ofEpochMilli((jdcFechaNac.getDate()).getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
       boolean activo = jcbActivo.isSelected();
       
       Conexion c = new Conexion();
       JugadorData jd = new JugadorData(c);
       Jugador j = new Jugador(nombre, dni, fechaNac, altura, peso, estilo, manoHabil, activo);
       jd.guardarJugador(j);
       
       this.limpiar();
         }                          
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
         if(vacio()){
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        }else{  
             
       int dni = Integer.parseInt(jtfDni.getText());
       String nombre = jtfNombreApellido.getText();
       LocalDate fechaNac = jdcFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       String manoHabil = (jcbManoHabil.getSelectedItem()+"");
       String estilo = (jcbEstilo.getSelectedItem()+"");
       float altura = Float.parseFloat(jtfAltura.getText());
       float peso = Float.parseFloat(jtfPeso.getText());
       boolean activo = jcbActivo.isSelected();
       
       Conexion c = new Conexion();
       JugadorData jd = new JugadorData(c);
       int id = (jd.buscarJugadorPorDni(dni)).getIdJugador();
       Jugador j = new Jugador(id, nombre, dni, fechaNac, altura, peso, estilo, manoHabil, activo);
       jd.actualizarJugador(j);
       
       this.limpiar();
         }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniKeyTyped
        // TODO add your handling code here:
         char caracter = evt.getKeyChar();
        
        if(!Character.isDigit(caracter)){
            evt.consume();
            
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }
                                          
    }//GEN-LAST:event_jtfDniKeyTyped

    private void jdcFechaNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdcFechaNacKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jdcFechaNacKeyTyped

    private void jtfAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAlturaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        
        if(!Character.isDigit(caracter) && caracter != '.'){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros o decimales");
        }
        if(caracter == '.' && jtfAltura.getText().contains(".")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros o decimales");
        }
    }//GEN-LAST:event_jtfAlturaKeyTyped

    private void jtfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        
        if(!Character.isDigit(caracter) && caracter != '.'){
           
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros o decimales");
        }
        if(caracter == '.' && jtfPeso.getText().contains(".")){
           
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros o decimales");
        }
    }//GEN-LAST:event_jtfPesoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JComboBox<String> jcbEstilo;
    private javax.swing.JComboBox<String> jcbManoHabil;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JTextField jtfAltura;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombreApellido;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables
}
