package Vistas;

import Controles.Conexion;
import Controles.JugadorData;
import Modelos.Jugador;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class ListaJugadores extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    private ArrayList<Jugador> jugadores;
    private ArrayList<Jugador> jugadoresActivos;    
    private MenuPrincipal1 menu; 
    private Conexion conexion = new Conexion();
    private JugadorData jugadorData = new JugadorData(conexion);
    
    public ListaJugadores() {
        initComponents();
        
        conexion = new Conexion();
        jugadorData = new JugadorData(conexion);
        
        jugadores = (ArrayList<Jugador>) jugadorData.obtenerJugadores();
        jugadoresActivos = (ArrayList<Jugador>) jugadorData.obtenerJugadoresActivos();
         
        vaciarTabla();
        armarCabecera();
        llenarTablaTodos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJugadores = new javax.swing.JTable();
        jCheckBoxActivos = new javax.swing.JCheckBox();
        jbVolver = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista Jugadores");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Jugadores");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableJugadores.setAutoCreateRowSorter(true);
        jTableJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableJugadores.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTableJugadores);

        jCheckBoxActivos.setText("Jugadores activos");
        jCheckBoxActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxActivos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxActivos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1)))
                        .addGap(57, 57, 57)
                        .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jbVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActivosActionPerformed
        // TODO add your handling code here:
        
        vaciarTabla();
        
        if (jCheckBoxActivos.isSelected()){
            llenarTablaActivos();
        } else {
            llenarTablaTodos();
        }
        
    }//GEN-LAST:event_jCheckBoxActivosActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
       
    }//GEN-LAST:event_jbVolverActionPerformed

    private void armarCabecera() {
        ArrayList<Object> titulos = new ArrayList<Object>();

        titulos.add("ID");
        titulos.add("Nombre y Apellido");
        titulos.add("DNI");
        titulos.add("Fecha de Nacimiento");
        titulos.add("Altura");
        titulos.add("Peso");
        titulos.add("Estilo");
        titulos.add("Mano Habil");
        titulos.add("Activo");

        for (Object titulo: titulos) {
            modelo.addColumn(titulo);
        }

        jTableJugadores.setModel(modelo);
    }

    private void llenarTablaTodos() {
        
        vaciarTabla();
        
        for (Jugador j: jugadores) {
            modelo.addRow(new Object[]{j.getIdJugador(), j.getNombreApellido(), j.getDni(), j.getFechaNac(), j.getAltura(), j.getPeso(), j.getEstilo(), j.getManoHabil(), j.isActivo()});
        }
    }
    
    private void llenarTablaActivos() {
        for (Jugador j: jugadoresActivos) {
            modelo.addRow(new Object[]{j.getIdJugador(), j.getNombreApellido(), j.getDni(), j.getFechaNac(), j.getAltura(), j.getPeso(), j.getEstilo(), j.getManoHabil(), j.isActivo()});
        }
     resizeColumnWidth(jTableJugadores);
    //Se desactiva el Auto Resize de la tabla
    //Es importante que vaya despues de el metodo que ajusta el ancho de la columna
    jTableJugadores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    
    private void vaciarTabla(){
        int filas = modelo.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
           resizeColumnWidth(jTableJugadores);
    //Se desactiva el Auto Resize de la tabla
    //Es importante que vaya despues de el metodo que ajusta el ancho de la columna
    jTableJugadores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    
    
    
    private void resizeColumnWidth(JTable table) {
        //Se obtiene el modelo de la columna
        TableColumnModel columnModel = table.getColumnModel();
        //Se obtiene el total de las columnas
        for (int column = 0; column < table.getColumnCount(); column++) {
            //Establecemos un valor minimo para el ancho de la columna
            int width = 150; //Min Width
            //Obtenemos el numero de filas de la tabla
            for (int row = 0; row < table.getRowCount(); row++) {
                //Obtenemos el renderizador de la tabla
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                //Creamos un objeto para preparar el renderer
                Component comp = table.prepareRenderer(renderer, row, column);
                //Establecemos el width segun el valor maximo del ancho de la columna
                width = Math.max(comp.getPreferredSize().width + 1, width);

            }
            //Se establece una condicion para no sobrepasar el valor de 300
            //Esto es Opcional
            if (width > 100) {
                width = 100;
            }
            //Se establece el ancho de la columna
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxActivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableJugadores;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables
}
