/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controles.Conexion;
import Controles.EncuentroData;
import Controles.EstadioData;
import Controles.JugadorData;
import Controles.TorneoData;
import Modelos.Encuentro;
import Modelos.Estadio;
import Modelos.Jugador;
import Modelos.Torneo;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo_000
 */
public class VCrearEncuentro extends javax.swing.JInternalFrame {

    /**
     * Creates new form VCrearEncuentro
     */
    public VCrearEncuentro() {
        initComponents();
        llenarCTorneo();
        llenarCJ2();
        llenarCJ1(); 
        cargarEstadios();
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
        jcbTorneo = new javax.swing.JComboBox<>();
        jdcFechaEnc = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbJ1 = new javax.swing.JComboBox<>();
        jcbJ2 = new javax.swing.JComboBox<>();
        jbCrear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcbEstadio = new javax.swing.JComboBox<>();
        jcbActivo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jtfInicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfFin = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Crear Encuentro");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Torneo");

        jcbTorneo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbTorneo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTorneoItemStateChanged(evt);
            }
        });
        jcbTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTorneoActionPerformed(evt);
            }
        });

        jdcFechaEnc.setDateFormatString("yyyy-MM-dd");
        jdcFechaEnc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jdcFechaEnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jdcFechaEncMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Encuentro");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jugador 1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jugador 2");

        jcbJ1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbJ1ActionPerformed(evt);
            }
        });

        jcbJ2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbJ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbJ2MouseClicked(evt);
            }
        });
        jcbJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbJ2ActionPerformed(evt);
            }
        });

        jbCrear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbCrear.setText("Crear");
        jbCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estadio");

        jcbEstadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcbActivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbActivo.setText("Activo");
        jcbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbActivoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Inicio");

        jtfInicio.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText(" Fin");

        jtfFin.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbActivo)
                            .addComponent(jcbTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jtfInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfFin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jdcFechaEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addComponent(jcbEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jcbActivo)
                .addGap(28, 28, 28)
                .addComponent(jbCrear)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbJ1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jcbJ1ActionPerformed

    private void jcbJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbJ2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbJ2ActionPerformed

    private void jdcFechaEncMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcFechaEncMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jdcFechaEncMouseExited

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        // TODO add your handling code here:
        if(jdcFechaEnc.getDate() == null){
            JOptionPane.showMessageDialog(this, "Debe elegir una fecha");
        }else{ 
        Conexion c = new Conexion();
        LocalDate fecha = Instant.ofEpochMilli((jdcFechaEnc.getDate()).getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        EncuentroData ed = new EncuentroData(c);
        Jugador j1 = (Jugador)jcbJ1.getSelectedItem();
        Jugador j2 = (Jugador)jcbJ2.getSelectedItem();
        Estadio e = (Estadio)jcbEstadio.getSelectedItem();
        Torneo t = (Torneo)jcbTorneo.getSelectedItem();
        LocalDate fechaIniT = t.getFechaInicio();
        LocalDate fechaFinT = t.getFechaFin();
        Boolean activo = jcbActivo.isSelected();
        Encuentro en = new Encuentro(fecha, false, null, j1, j2, e, t, activo);
        if(fecha.compareTo(fechaIniT) < 0){
               JOptionPane.showMessageDialog(this, "La fecha del encuentro debe ser mayor a la fecha inicial del torneo");
           }else if(fecha.compareTo(fechaFinT) > 0) {
               JOptionPane.showMessageDialog(this, "La fecha del encuentro debe ser menor a la fecha final del torneo");
           }else if(j1.getIdJugador()== j2.getIdJugador()){
               JOptionPane.showMessageDialog(this, "Los jugadores deben ser distintos");
           }else{
            ed.guardarEncuentro(en);
           }
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jcbJ2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbJ2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jcbJ2MouseClicked

    private void jcbTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTorneoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcbTorneoActionPerformed

    private void jcbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbActivoActionPerformed

    private void jcbTorneoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTorneoItemStateChanged
        // TODO add your handling code here:
        Conexion c = new Conexion();  
        TorneoData td = new TorneoData(c);
        jtfInicio.setText(((Torneo)jcbTorneo.getSelectedItem()).getFechaInicio()+"");
        jtfFin.setText(((Torneo)jcbTorneo.getSelectedItem()).getFechaFin()+"");
    }//GEN-LAST:event_jcbTorneoItemStateChanged
   
private void llenarCTorneo(){
    Conexion c = new Conexion();
    
    TorneoData td = new TorneoData(c);
    
     List <Torneo> torneos = td.obtenerTorneos();
        for(Torneo t: torneos){
            
            jcbTorneo.addItem(t);   
             
        }
}
private void llenarCJ1(){
   Conexion c = new Conexion();
    JugadorData jd = new JugadorData(c);
    List <Jugador> jugadores = jd.obtenerJugadoresActivos();
        for(Jugador j: jugadores){
            jcbJ1.addItem(j);     
        }
}       
private void llenarCJ2(){
    Conexion c = new Conexion();
    JugadorData jd = new JugadorData(c);
    List <Jugador> jugadores = jd.obtenerJugadoresActivos();
        for(Jugador j: jugadores){
            jcbJ2.addItem(j);     
        }
     
}
private void cargarEstadios(){
    Conexion c = new Conexion();
    EstadioData ed = new EstadioData(c);   
        ArrayList<Estadio> estadios= ed.obtenerEstadiosActivos();        
            for (Estadio e: estadios) {
                jcbEstadio.addItem(e);
            }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbCrear;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JComboBox<Estadio> jcbEstadio;
    private javax.swing.JComboBox<Jugador> jcbJ1;
    private javax.swing.JComboBox<Jugador> jcbJ2;
    private javax.swing.JComboBox<Torneo> jcbTorneo;
    private com.toedter.calendar.JDateChooser jdcFechaEnc;
    private javax.swing.JTextField jtfFin;
    private javax.swing.JTextField jtfInicio;
    // End of variables declaration//GEN-END:variables

}