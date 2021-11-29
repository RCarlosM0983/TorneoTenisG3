package Vistas;

import Controles.TorneoData;
import Controles.Conexion;
import Modelos.Torneo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VTorneo extends javax.swing.JInternalFrame {

    public VTorneo() {
        initComponents();
        cargarCbo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BtnCargar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbActivo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        cboorneo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jdInicio = new com.toedter.calendar.JDateChooser();
        jdFin = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Modificar Torneo");

        jLabel2.setText("Fecha de Inicio");

        BtnCargar.setText("Modificar");
        BtnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCargarMouseClicked(evt);
            }
        });

        jLabel6.setText("Fecha Final");

        jLabel10.setText("Activo");

        jLabel1.setText("Nombre");

        jLabel11.setText("Torneo");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        jdInicio.setDateFormatString("yyyy-MM-dd");

        jdFin.setDateFormatString("yyyy-MM-dd");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Torneos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnCargar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(44, 44, 44)
                                                .addComponent(cbActivo))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jdFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jdInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jdFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbActivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCargar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
       
        tfNombre.setText("");
        cbActivo.setSelected(false);
        cboorneo.setSelectedIndex(0);
        jdInicio.setDate(null);
        jdFin.setDate(null);

    }//GEN-LAST:event_btnLimpiarMouseClicked
public void cargarCbo(){
        try {
            Conexion con = new Conexion();
            TorneoData orneo=new TorneoData(con);
            
            List<Torneo> tor= orneo.devolverTodosTorneos();
            for (int i = 0; i < tor.size(); i++) {
                cboorneo.addItem(tor.get(i)); 
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiModificarSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    private void BtnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCargarMouseClicked
        try {
           Conexion con = new Conexion();
            Torneo j=new Torneo();
            TorneoData jd=new TorneoData(con);
            j=(Torneo)cboorneo.getSelectedItem();
            j.setNombre(tfNombre.getText());
            Date fecini=(Date) jdInicio.getDate();
            LocalDate ld=fecini.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            j.setFechaNacInicio(ld);
            Date fecFin=(Date) jdFin.getDate();
            LocalDate ld1=fecFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            j.setFehcaNacFinal(ld1);
            j.setActivo(cbActivo.isSelected());
            jd.modificadarTorneo(j);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmiAgregarSponsor.class.getName()).log(Level.SEVERE, null, ex);
        }
        cboorneo.removeAllItems();
        cargarCbo();
    }//GEN-LAST:event_BtnCargarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        Torneo j= new Torneo();
        j= (Torneo) cboorneo.getSelectedItem();
        tfNombre.setText(j.getNombre());
        Date fecFin=java.sql.Date.valueOf(j.getFechaNacInicio());
        jdInicio.setDate(fecFin);
        Date fecFin1=java.sql.Date.valueOf(j.getFehcaNacFinal());
        jdFin.setDate(fecFin1);
       cbActivo.setSelected(j.isActivo());
    }//GEN-LAST:event_btnBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JComboBox<Torneo> cboorneo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser jdFin;
    private com.toedter.calendar.JDateChooser jdInicio;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
