package Vistas;

import Controles.EncuentroData;
import Controles.EstadioData;
import Controles.JugadorData;
import Controles.TorneoData;
import Controles.Conexion;
import Modelos.Encuentro;
import Modelos.Estadio;
import Modelos.Jugador;
import Modelos.Torneo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VEncuentro extends javax.swing.JInternalFrame {

    public VEncuentro() {
        initComponents();
        cargarCbo();
        tfResultado.setVisible(false);
        cboJugadorGanador.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false); 
    }

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
        btnCargar = new javax.swing.JButton();
        cboJugador1 = new javax.swing.JComboBox<>();
        cboJugador2 = new javax.swing.JComboBox<>();
        tfResultado = new javax.swing.JTextField();
        cboJugadorGanador = new javax.swing.JComboBox<>();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboEstadio = new javax.swing.JComboBox<>();
        cbActivo = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();
        jdFec = new com.toedter.calendar.JDateChooser();
        cboTorneo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Agregar Encuentro");

        jLabel1.setText("Jugador1");

        jLabel2.setText("Jugador 2");

        jLabel3.setText("Fecha de Encuentro");

        jLabel4.setText("Resultado");

        jLabel5.setText("Jugador Ganador");

        jLabel6.setText("Estado");

        jLabel7.setText("Activo");

        btnCargar.setText("Cargar");
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
        });

        cboJugador1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboJugador1ItemStateChanged(evt);
            }
        });
        cboJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJugador1ActionPerformed(evt);
            }
        });

        tfResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfResultadoKeyTyped(evt);
            }
        });

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programado", "En Curso", "Finalizado" }));
        cboEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEstadoItemStateChanged(evt);
            }
        });

        jLabel11.setText("Estadio");

        cbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActivoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        jdFec.setDateFormatString("yyyy/MM/dd");

        jLabel8.setText("Torneo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Encuentros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel9))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cboJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbActivo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnCargar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnLimpiar))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfResultado)
                                            .addComponent(cboJugadorGanador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboEstado, 0, 163, Short.MAX_VALUE)))
                                    .addComponent(cboTorneo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(cboEstadio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(31, 31, 31)
                            .addComponent(jdFec, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jdFec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cboEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboJugadorGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbActivo)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActivoActionPerformed
    public void cargarCbo(){
        try {
            Conexion con = new Conexion();
            JugadorData jugador=new JugadorData(con);
             List<Jugador> juga= jugador.buscarTodosJugadores();
            for (int i = 0; i < juga.size(); i++) {
                cboJugador1.addItem(juga.get(i)); 
            }
            for (int i = 0; i < juga.size(); i++) {
                cboJugador2.addItem(juga.get(i)); 
            }
            EstadioData jd=new EstadioData(con);
            List<Estadio> tor= jd.buscarTodosEstadio();
            for (int i = 0; i < tor.size(); i++) {
                cboEstadio.addItem(tor.get(i)); 
            }
            TorneoData orneo=new TorneoData(con);
            List<Torneo> tor1= orneo.devolverTodosTorneos();
            for (int i = 0; i < tor1.size(); i++) {
                cboTorneo.addItem(tor1.get(i)); 
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar cbo" +ex);
        }}
    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
    
      tfResultado.setText("");
        cbActivo.setSelected(false);
      cboEstadio.setSelectedIndex(0);
      cboEstado.setSelectedIndex(0);
       cboJugador1.setSelectedIndex(0);       
      cboJugador2.setSelectedIndex(0);        
      cboJugadorGanador.setSelectedIndex(0);        
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void tfResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfResultadoKeyTyped
       char c=evt.getKeyChar();
     if(c<'0'||c>'9'||c=='-')evt.consume();
    }//GEN-LAST:event_tfResultadoKeyTyped

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
       try {
            Conexion con = new Conexion();
            Encuentro j=new Encuentro();
            EncuentroData jd=new EncuentroData(con);
            j.setJugador1((Jugador)cboJugador1.getSelectedItem());
            j.setJugador2((Jugador)cboJugador2.getSelectedItem());
            Date fecini=(Date) jdFec.getDate();
            LocalDate ld=fecini.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            j.setFechaEncuentro(ld);
            j.setEstadio((Estadio)cboEstadio.getSelectedItem());
            j.setResultado(tfResultado.getText());
            Jugador j1=new Jugador();
            if (cboEstado.getSelectedItem().toString()=="Programado"||cboEstado.getSelectedItem().toString()=="En Juego")
            j.setJugadorGanador(j1);
            if (cboEstado.getSelectedItem().toString()=="Finalizado")
            j.setJugadorGanador((Jugador)cboJugadorGanador.getSelectedItem());
            j.setActivo(cbActivo.isSelected());
            j.setEstado(cboEstado.getSelectedItem().toString());
            j.setTorneo((Torneo)cboTorneo.getSelectedItem());
            jd.agregarEncuentro(j);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiAgregarSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCargarMouseClicked

    private void cboJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJugador1ActionPerformed
       
    }//GEN-LAST:event_cboJugador1ActionPerformed

    private void cboJugador1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboJugador1ItemStateChanged
       if(evt.getSource()==cboJugador1){
            cboJugador2.removeItem(cboJugador1.getSelectedItem());}
    }//GEN-LAST:event_cboJugador1ItemStateChanged

    private void cboEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEstadoItemStateChanged
        if(evt.getSource()==cboEstado){
            if(cboEstado.getSelectedItem().toString()=="Finalizado")
            {
                tfResultado.setVisible(true);
                cboJugadorGanador.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true); 
                cboJugadorGanador.addItem((Jugador)cboJugador1.getSelectedItem());
                cboJugadorGanador.addItem((Jugador)cboJugador2.getSelectedItem());
            }
            else{
                tfResultado.setVisible(false);
                cboJugadorGanador.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false); 
            }
                }
    }//GEN-LAST:event_cboEstadoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JComboBox<Estadio> cboEstadio;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<Jugador> cboJugador1;
    private javax.swing.JComboBox<Jugador> cboJugador2;
    private javax.swing.JComboBox<Jugador> cboJugadorGanador;
    private javax.swing.JComboBox<Torneo> cboTorneo;
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
    private com.toedter.calendar.JDateChooser jdFec;
    private javax.swing.JTextField tfResultado;
    // End of variables declaration//GEN-END:variables
}
