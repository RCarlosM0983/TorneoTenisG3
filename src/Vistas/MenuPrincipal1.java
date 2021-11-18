package Vistas;

public class MenuPrincipal1 extends javax.swing.JFrame {

    public MenuPrincipal1() {
        initComponents();
    }
//prueba
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmTorneo = new javax.swing.JMenu();
        jmAltaBajaTorneo = new javax.swing.JMenu();
        jmConsultaTorneo = new javax.swing.JMenu();
        jmRanking = new javax.swing.JMenu();
        jmEstadios = new javax.swing.JMenu();
        jmAltaBajaEstadio = new javax.swing.JMenu();
        jmConsultaEstadio = new javax.swing.JMenu();
        jmJugador = new javax.swing.JMenu();
        jmABJugador = new javax.swing.JMenu();
        jmConsJug = new javax.swing.JMenu();
        jmEncuentros = new javax.swing.JMenu();
        jmABEnc = new javax.swing.JMenu();
        jmConsEnc = new javax.swing.JMenu();
        jmConsResultados = new javax.swing.JMenu();
        jmSponsor = new javax.swing.JMenu();
        jmABSpon = new javax.swing.JMenu();
        jmABArticulos = new javax.swing.JMenu();
        jmPatroc = new javax.swing.JMenu();
        jmConsPatroc = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setToolTipText("Administracion de Torneo de Tenis");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        jmTorneo.setText("Torneo");

        jmAltaBajaTorneo.setText("Alta/Baja");
        jmAltaBajaTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAltaBajaTorneoMouseClicked(evt);
            }
        });
        jmAltaBajaTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAltaBajaTorneoActionPerformed(evt);
            }
        });
        jmTorneo.add(jmAltaBajaTorneo);

        jmConsultaTorneo.setText("Consulta");
        jmConsultaTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmConsultaTorneoMouseClicked(evt);
            }
        });
        jmTorneo.add(jmConsultaTorneo);

        jmRanking.setText("Ranking");
        jmTorneo.add(jmRanking);

        jMenuBar1.add(jmTorneo);

        jmEstadios.setText("Estadio");

        jmAltaBajaEstadio.setText("Alta/Baja");
        jmAltaBajaEstadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAltaBajaEstadioMouseClicked(evt);
            }
        });
        jmAltaBajaEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAltaBajaEstadioActionPerformed(evt);
            }
        });
        jmEstadios.add(jmAltaBajaEstadio);

        jmConsultaEstadio.setText("Consulta");
        jmConsultaEstadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmConsultaEstadioMouseClicked(evt);
            }
        });
        jmEstadios.add(jmConsultaEstadio);

        jMenuBar1.add(jmEstadios);

        jmJugador.setText("Jugador");

        jmABJugador.setText("Alta/Baja");
        jmABJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmABJugadorMouseClicked(evt);
            }
        });
        jmJugador.add(jmABJugador);

        jmConsJug.setText("Consulta");
        jmConsJug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmConsJugMouseClicked(evt);
            }
        });
        jmJugador.add(jmConsJug);

        jMenuBar1.add(jmJugador);

        jmEncuentros.setText("Encuentros");

        jmABEnc.setText("Alta/Baja");
        jmABEnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmABEncMouseClicked(evt);
            }
        });
        jmEncuentros.add(jmABEnc);

        jmConsEnc.setText("Consulta");
        jmConsEnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmConsEncMouseClicked(evt);
            }
        });
        jmEncuentros.add(jmConsEnc);

        jmConsResultados.setText("Resultados");
        jmEncuentros.add(jmConsResultados);

        jMenuBar1.add(jmEncuentros);

        jmSponsor.setText("Sponsor");

        jmABSpon.setText("Alta/Baja Sponsor");
        jmABSpon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmABSponMouseClicked(evt);
            }
        });
        jmSponsor.add(jmABSpon);

        jmABArticulos.setText("Alta/Baja Articulos");
        jmABArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmABArticulosMouseClicked(evt);
            }
        });
        jmSponsor.add(jmABArticulos);

        jmPatroc.setText("Alta/Baja Patrocinios");
        jmPatroc.setToolTipText("");
        jmPatroc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmPatrocMouseClicked(evt);
            }
        });
        jmSponsor.add(jmPatroc);

        jmConsPatroc.setText("Consultas Patrocinios");
        jmSponsor.add(jmConsPatroc);

        jMenuBar1.add(jmSponsor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAltaBajaTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAltaBajaTorneoMouseClicked
        Menu.removeAll();
        Menu.repaint();
        VTorneo aC=new VTorneo();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);
    }//GEN-LAST:event_jmAltaBajaTorneoMouseClicked

    private void jmAltaBajaTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAltaBajaTorneoActionPerformed

    }//GEN-LAST:event_jmAltaBajaTorneoActionPerformed

    private void jmConsultaTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmConsultaTorneoMouseClicked
        Menu.removeAll();
        Menu.repaint();
        ListaTorneos aC=new ListaTorneos();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);
    }//GEN-LAST:event_jmConsultaTorneoMouseClicked

    private void jmAltaBajaEstadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAltaBajaEstadioMouseClicked
         Menu.removeAll();
        Menu.repaint();
        VEstadio aC=new VEstadio();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);
    }//GEN-LAST:event_jmAltaBajaEstadioMouseClicked

    private void jmConsultaEstadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmConsultaEstadioMouseClicked
        Menu.removeAll();
        Menu.repaint();
        ListaEstadios aC=new ListaEstadios();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);
    }//GEN-LAST:event_jmConsultaEstadioMouseClicked

    private void jmABJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmABJugadorMouseClicked
         Menu.removeAll();
        Menu.repaint();
        VJugador aC=new VJugador();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);        // TODO add your handling code here:
    }//GEN-LAST:event_jmABJugadorMouseClicked

    private void jmConsJugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmConsJugMouseClicked
        Menu.removeAll();
        Menu.repaint();
        ListaJugadores aC=new ListaJugadores();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);        // TODO add your handling code here:
    }//GEN-LAST:event_jmConsJugMouseClicked

    private void jmABSponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmABSponMouseClicked
        Menu.removeAll();
        Menu.repaint();
        VSponsor aC=new VSponsor();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);        // TODO add your handling code here:
    }//GEN-LAST:event_jmABSponMouseClicked

    private void jmABArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmABArticulosMouseClicked
        Menu.removeAll();
        Menu.repaint();
        VSponsor aC=new VSponsor();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);         // TODO add your handling code here:
    }//GEN-LAST:event_jmABArticulosMouseClicked

    private void jmPatrocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmPatrocMouseClicked
        Menu.removeAll();
        Menu.repaint();
        Patrocinios aC=new Patrocinios();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);          // TODO add your handling code here:
    }//GEN-LAST:event_jmPatrocMouseClicked

    private void jmABEncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmABEncMouseClicked
        Menu.removeAll();
        Menu.repaint();
        VEncuentro aC=new VEncuentro();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);
    }//GEN-LAST:event_jmABEncMouseClicked

    private void jmConsEncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmConsEncMouseClicked
        Menu.removeAll();
        Menu.repaint();
        ListaEncuentros aC=new ListaEncuentros();
        aC.setVisible(true);
        Menu.add(aC);
        Menu.moveToFront(aC);        // TODO add your handling code here:
    }//GEN-LAST:event_jmConsEncMouseClicked

    private void jmAltaBajaEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAltaBajaEstadioActionPerformed
        // TODO add your handling code here:
        Menu.removeAll();
        Menu.repaint();
        VEstadio ve = new VEstadio();
        ve.setVisible(true);
        Menu.add(ve);
    }//GEN-LAST:event_jmAltaBajaEstadioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Menu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmABArticulos;
    private javax.swing.JMenu jmABEnc;
    private javax.swing.JMenu jmABJugador;
    private javax.swing.JMenu jmABSpon;
    private javax.swing.JMenu jmAltaBajaEstadio;
    private javax.swing.JMenu jmAltaBajaTorneo;
    private javax.swing.JMenu jmConsEnc;
    private javax.swing.JMenu jmConsJug;
    private javax.swing.JMenu jmConsPatroc;
    private javax.swing.JMenu jmConsResultados;
    private javax.swing.JMenu jmConsultaEstadio;
    private javax.swing.JMenu jmConsultaTorneo;
    private javax.swing.JMenu jmEncuentros;
    private javax.swing.JMenu jmEstadios;
    private javax.swing.JMenu jmJugador;
    private javax.swing.JMenu jmPatroc;
    private javax.swing.JMenu jmRanking;
    private javax.swing.JMenu jmSponsor;
    private javax.swing.JMenu jmTorneo;
    // End of variables declaration//GEN-END:variables
}
