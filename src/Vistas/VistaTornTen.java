/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author carlo_000
 */
public class VistaTornTen extends javax.swing.JFrame {

    /**
     * Creates new form VistaTornTen
     */
    public VistaTornTen() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiJugador = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmiEstadio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmTorneo1 = new javax.swing.JMenu();
        jmAltaBajaTorneo1 = new javax.swing.JMenu();
        jmConsultaTorneo1 = new javax.swing.JMenu();
        jmRanking1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jMenu1.setText("Jugador");

        jmiJugador.setText("Formulario Jugador");
        jmiJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJugadorActionPerformed(evt);
            }
        });
        jMenu1.add(jmiJugador);

        jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jmiEstadio.setText("Estadio");

        jMenuItem1.setText("Formulario Estadio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmiEstadio.add(jMenuItem1);

        jMenuBar1.add(jmiEstadio);

        jMenu3.setText("jMenu3");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("jMenu4");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenuItem2.setText("jMenuItem2");
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        jmTorneo1.setText("Torneo");

        jmAltaBajaTorneo1.setText("Alta/Baja");
        jmAltaBajaTorneo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAltaBajaTorneo1MouseClicked(evt);
            }
        });
        jmAltaBajaTorneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAltaBajaTorneo1ActionPerformed(evt);
            }
        });
        jmTorneo1.add(jmAltaBajaTorneo1);

        jmConsultaTorneo1.setText("Consulta");
        jmConsultaTorneo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmConsultaTorneo1MouseClicked(evt);
            }
        });
        jmTorneo1.add(jmConsultaTorneo1);

        jmRanking1.setText("Ranking");
        jmTorneo1.add(jmRanking1);

        jMenuBar1.add(jmTorneo1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpEscritorio)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        VEstadio ve = new VEstadio();
        ve.setVisible(true);
        jdpEscritorio.add(ve);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJugadorActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        VJugador vj = new VJugador();
        vj.setVisible(true);
        jdpEscritorio.add(vj);
    }//GEN-LAST:event_jmiJugadorActionPerformed

    private void jmAltaBajaTorneo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAltaBajaTorneo1MouseClicked
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        VTorneo aC=new VTorneo();
        aC.setVisible(true);
        jdpEscritorio.add(aC);
        jdpEscritorio.moveToFront(aC);
    }//GEN-LAST:event_jmAltaBajaTorneo1MouseClicked

    private void jmAltaBajaTorneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAltaBajaTorneo1ActionPerformed

    }//GEN-LAST:event_jmAltaBajaTorneo1ActionPerformed

    private void jmConsultaTorneo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmConsultaTorneo1MouseClicked
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ListaTorneos aC=new ListaTorneos();
        aC.setVisible(true);
        jdpEscritorio.add(aC);
        jdpEscritorio.moveToFront(aC);
    }//GEN-LAST:event_jmConsultaTorneo1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ListaJugadores aC=new ListaJugadores();
        aC.setVisible(true);
        jdpEscritorio.add(aC);
        jdpEscritorio.moveToFront(aC);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaTornTen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTornTen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTornTen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTornTen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTornTen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenu jmAltaBajaTorneo1;
    private javax.swing.JMenu jmConsultaTorneo1;
    private javax.swing.JMenu jmRanking1;
    private javax.swing.JMenu jmTorneo1;
    private javax.swing.JMenu jmiEstadio;
    private javax.swing.JMenuItem jmiJugador;
    // End of variables declaration//GEN-END:variables
}
