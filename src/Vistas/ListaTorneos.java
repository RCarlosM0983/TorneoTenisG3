package Vistas;

import Controles.Conexion;
import Controles.TorneoData;
import Modelos.Torneo;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class ListaTorneos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo  = new DefaultTableModel();
    private ArrayList<Torneo> torneos;
    private ArrayList<Torneo> torneosActivos;    
    private Conexion conexion = new Conexion();
    private TorneoData torneoData = new TorneoData(conexion);

    public ListaTorneos() {
        initComponents();
     
        torneos = (ArrayList<Torneo>) torneoData.obtenerTorneos();
        torneosActivos = (ArrayList<Torneo>) torneoData.obtenerTorneosActivos();
         
        vaciarTabla();
        armarCabecera();
        llenarTablaTodos();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTorneos = new javax.swing.JTable();
        jCheckBoxActivos = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Torneos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Listado de Torneos");

        jtTorneos.setBackground(new java.awt.Color(153, 204, 255));
        jtTorneos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtTorneos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtTorneos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jtTorneos);

        jCheckBoxActivos.setText("Torneos activos");
        jCheckBoxActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxActivos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jCheckBoxActivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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


    private void armarCabecera() {
        ArrayList<Object> titulos = new ArrayList<Object>();

        titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Fecha de Inicio");
        titulos.add("Fecha Fin");
        titulos.add("Activo");

        for (Object titulo: titulos) {
            modelo.addColumn(titulo);
        }

        jtTorneos.setModel(modelo);
    }
    
     private void llenarTablaTodos() {
        
        vaciarTabla();
        
        for (Torneo t: torneos) {
            modelo.addRow(new Object[]{t.getIdTorneo(), t.getNombre(), t.getFechaInicio(), t.getFechaFin() ,t.isActivo()});
        }
    }
    
    public void borrarFilasTabla(){    
        int a=modelo.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);            
        }
    }
    
    private void llenarTablaActivos() {
        for (Torneo t: torneosActivos) {
            modelo.addRow(new Object[]{t.getIdTorneo(), t.getNombre(), t.getFechaInicio(), t.getFechaFin() ,t.isActivo()});
        }
     resizeColumnWidth(jtTorneos);
    //Se desactiva el Auto Resize de la tabla
    //Es importante que vaya despues de el metodo que ajusta el ancho de la columna
    jtTorneos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

        private void vaciarTabla(){
        int filas = modelo.getRowCount() - 1;

        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
           resizeColumnWidth(jtTorneos);
    //Se desactiva el Auto Resize de la tabla
    //Es importante que vaya despues de el metodo que ajusta el ancho de la columna
    jtTorneos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTorneos;
    // End of variables declaration//GEN-END:variables
}
