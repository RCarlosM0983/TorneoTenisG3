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
import java.time.Instant;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VEncuentro extends javax.swing.JInternalFrame {
    
    private Conexion conn;
    private TorneoData torneoData;    
    private JugadorData jugadorData;
    private EstadioData estadioData;
    private EncuentroData encuentroData;

    public VEncuentro() {
        initComponents();
        cargarCbo();
        jtfResultado.setVisible(false);
        cboGanador.setVisible(false);
        jlResultado.setVisible(false);
        jlGanador.setVisible(false); 
        
        //cargaTorneos();
        //cargaJugadores();
        //cargaEstadios();
    }

        public void cargaJugadores() {
        List <Jugador> jugadores = jugadorData.obtenerJugadores();
            for(Jugador j: jugadores){
                cboJugador1.addItem(j);
                cboJugador2.addItem(j);
            }
        }

     public void cargaTorneos() {
        List <Torneo> torneos = torneoData.obtenerTorneos();
        for(Torneo t: torneos){
            cboTorneo.addItem(t);     
        }
    }
     public void cargaEstadios() {
        List <Estadio> est = estadioData.obtenerEstadios();
        for(Estadio e: est){
            cboEstadio.addItem(e);     
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlResultado = new javax.swing.JLabel();
        jlGanador = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        cboJugador1 = new javax.swing.JComboBox<>();
        cboJugador2 = new javax.swing.JComboBox<>();
        jtfResultado = new javax.swing.JTextField();
        cboGanador = new javax.swing.JComboBox<>();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboEstadio = new javax.swing.JComboBox<>();
        cbActivo = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();
        jdFechaEnc = new com.toedter.calendar.JDateChooser();
        cboTorneo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar Encuentro");

        jLabel1.setText("Jugador1");

        jLabel2.setText("Jugador 2");

        jLabel3.setText("Fecha de Encuentro");

        jlResultado.setText("Resultado");

        jlGanador.setText("Jugador Ganador");

        jLabel6.setText("Estado");

        jLabel7.setText("Activo");

        btnCargar.setText("Cargar");
        btnCargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
        });
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
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

        jtfResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfResultadoKeyTyped(evt);
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
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        jdFechaEnc.setDateFormatString("yyyy/MM/dd");

        jLabel8.setText("Torneo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Encuentros");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdFocusLost(evt);
            }
        });

        jLabel4.setText("Encuentro ID:");

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbActivo)
                            .addComponent(jtfResultado)
                            .addComponent(cboGanador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEstado, 0, 163, Short.MAX_VALUE)
                            .addComponent(cboTorneo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(cboEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jlGanador)
                                    .addComponent(jlResultado)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addComponent(jdFechaEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbBuscar))
                                .addComponent(cboJugador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
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
                    .addComponent(jdFechaEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cboEstadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlResultado)
                    .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbActivo)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbActualizar))
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private boolean vacio(){
        if(jdFechaEnc.getDate() == null || 
                cboJugador1.getSelectedItem().toString().isEmpty() || 
                cboJugador2.getSelectedItem().toString().isEmpty() ||
                cboEstadio.getSelectedItem().toString().isEmpty() ||
                cboTorneo.getSelectedItem().toString().isEmpty()
                ){
            
            return true;      
        }else{
            return false;
        }
    }
    
    private void cbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActivoActionPerformed
   
    public void cargarCbo(){
        Conexion con = new Conexion();
        JugadorData jd=new JugadorData(con);
        
        List<Jugador> jugadores= jd.obtenerJugadores();
            for (int i = 0; i < jugadores.size(); i++) {
                cboJugador1.addItem(jugadores.get(i));
            }
            for (int i = 0; i < jugadores.size(); i++) {
                cboJugador2.addItem(jugadores.get(i));
            }
            
        EstadioData ed=new EstadioData(con);
        List<Estadio> estadios= ed.obtenerEstadiosEnUso();        
            for (int i = 0; i < estadios.size(); i++) {
                cboEstadio.addItem(estadios.get(i));
            }
        
        TorneoData td=new TorneoData(con);
        List<Torneo> torneos= td.obtenerTorneosActivos();
            for (int i = 0; i < torneos.size(); i++) {
                cboTorneo.addItem(torneos.get(i));
            }
}
    
    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
    
      jtfResultado.setText("");
      cbActivo.setSelected(false);
      cboEstadio.setSelectedIndex(0);
      cboEstado.setSelectedIndex(0);
      cboJugador1.setSelectedIndex(0);       
      cboJugador2.setSelectedIndex(0);        
      cboGanador.setSelectedIndex(0);        
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void jtfResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfResultadoKeyTyped
       char c=evt.getKeyChar();
     if(c<'0'||c>'9'||c=='-')evt.consume();
    }//GEN-LAST:event_jtfResultadoKeyTyped

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        Conexion con = new Conexion();
        Encuentro en=new Encuentro();
        EncuentroData ed=new EncuentroData(con);
        en.setJugador1((Jugador)cboJugador1.getSelectedItem());
        en.setJugador2((Jugador)cboJugador2.getSelectedItem());
        Date fecini=(Date) jdFechaEnc.getDate();
        LocalDate ld=fecini.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        en.setFechaEnc(ld);
        en.setEstadio((Estadio)cboEstadio.getSelectedItem());
        en.setResultado(jtfResultado.getText());
        Jugador j1=new Jugador();
        if (cboEstado.getSelectedItem().toString()=="Programado"||cboEstado.getSelectedItem().toString()=="En Juego")
            
            en.setGanador(j1);
        if (cboEstado.getSelectedItem().toString()=="Finalizado")
            
            en.setGanador((Jugador)cboGanador.getSelectedItem());
        en.setActivo(cbActivo.isSelected());
        en.setEstadoEnCurso(cboEstado.getSelectedItem().toString());
        en.setTorneo((Torneo)cboTorneo.getSelectedItem());
        ed.guardarEncuentro(en);
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
                jtfResultado.setVisible(true);
                cboGanador.setVisible(true);
                jlResultado.setVisible(true);
                jlGanador.setVisible(true); 
                cboGanador.addItem((Jugador)cboJugador1.getSelectedItem());
                cboGanador.addItem((Jugador)cboJugador2.getSelectedItem());
            }
            else{
                jtfResultado.setVisible(false);
                cboGanador.setVisible(false);
                jlResultado.setVisible(false);
                jlGanador.setVisible(false); 
            }
                }
    }//GEN-LAST:event_cboEstadoItemStateChanged

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(jtId.getText());
        Encuentro enc = encuentroData.buscarEncuentro(id);

        if(enc != null) {
            jtfResultado.setVisible(true);
            cboGanador.setVisible(true);
            jlResultado.setVisible(true);
            jlGanador.setVisible(true); 
        
            jtId.setText(enc.getId_encuentro()+"");
            cboEstado.setSelectedItem(enc.getEstadoEnCurso()+"");
            jdFechaEnc.setDate(java.sql.Date.valueOf(enc.getFechaEnc()));
            cboJugador1.setSelectedItem(enc.getJugador1());
            cboJugador2.setSelectedItem(enc.getJugador2());
            cboGanador.setSelectedItem(enc.getGanador());
            cboEstadio.setSelectedItem(enc.getEstadio());
            cboTorneo.setSelectedItem(enc.getTorneo());
            cbActivo.setSelected(enc.isActivo());
            btnCargar.setEnabled(false);
            
            if(enc.getFechaEnc().isBefore(now())&&cboGanador!=null){
               // cargarDatosGanador();
                cboGanador.setSelectedItem(enc.getGanador());

            }
            else {
                cboGanador.setSelectedIndex(-1);
            }}
            else{
                JOptionPane.showMessageDialog(this,"No se encontraron datos");
            }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdFocusLost
        // TODO add your handling code here:
        // try {
            //int enc = Integer.parseInt(jtId.getText());
            //} catch (NumberFormatException nf) {
            //   JOptionPane.showMessageDialog(this, "Usted ingresó un digito incorrecto");
            //   jtId.requestFocus();
            //}
    }//GEN-LAST:event_jtIdFocusLost

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        if(jtId.getText()!=null){
            if (jdFechaEnc.getDate()== null ){
                JOptionPane.showMessageDialog(this, "Completar campos");
            }
            else{
                int id_encuentro = Integer.parseInt(jtId.getText());
                String estadoEnCurso= (cboEstado.getSelectedItem()+"");
                /*
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fecha = formato.format(jdcFecha.getDate());
                LocalDate fechaEnc=LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                */
                LocalDate fechaEnc = Instant.ofEpochMilli((jdFechaEnc.getDate()).getTime()).atZone(ZoneId.systemDefault()).toLocalDate();

                Jugador jugador1 = (Jugador) cboJugador1.getSelectedItem();
                Jugador jugador2 = (Jugador) cboJugador2.getSelectedItem();

                Estadio estadio = (Estadio) cboEstadio.getSelectedItem();
                Torneo torneo = (Torneo) cboTorneo.getSelectedItem();
                boolean activo=cbActivo.isEnabled();

                LocalDate fechaEncIni = torneo.getFechaInicio();
                LocalDate fechaEncFi = torneo.getFechaFin();

                try {

                    if (fechaEnc.isBefore(fechaEncIni) || fechaEnc.isAfter(fechaEncFi)){
                        JOptionPane.showMessageDialog(this, "La fecha del encuentro no esta en el rango del torneo, fecha inicio: "+fechaEncIni+" y fecha fin: "+fechaEncFi);
                    }
          
                    else {
                        if(fechaEnc.isBefore(now())){
                            
                            Jugador ganador = (Jugador) cboGanador.getSelectedItem();
                            Encuentro enc = new Encuentro(id_encuentro, fechaEnc, estadoEnCurso, ganador, jugador1, jugador2, estadio, torneo, activo);
                            encuentroData.actualizarEncuentro(enc);
                        }else{
                            Encuentro enc = new Encuentro(id_encuentro, fechaEnc, estadoEnCurso, jugador1, jugador2, estadio, torneo, activo);
                            encuentroData.actualizarEncuentroSinGanador(enc);
                        }
                    }
                } catch (NumberFormatException nf) {
                    JOptionPane.showMessageDialog(this, "Usted ingresó mal la fecha");
                }
            }}
            else {
                JOptionPane.showMessageDialog(this,"No se encontraron datos");
            }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jtId.getText());
        encuentroData.borrarEncuentro(id);
    }//GEN-LAST:event_jbEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JComboBox<Estadio> cboEstadio;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<Jugador> cboGanador;
    private javax.swing.JComboBox<Jugador> cboJugador1;
    private javax.swing.JComboBox<Jugador> cboJugador2;
    private javax.swing.JComboBox<Torneo> cboTorneo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private com.toedter.calendar.JDateChooser jdFechaEnc;
    private javax.swing.JLabel jlGanador;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtfResultado;
    // End of variables declaration//GEN-END:variables
}
