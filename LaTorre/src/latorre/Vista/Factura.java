/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latorre.Vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import latorre.Modelo.Cliente;
import latorre.Modelo.Factura_detalle;
import latorre.Modelo.Factura_encabezado;
import latorre.Modelo.Producto;
import latorre.Vista.ClienteNuevo2;

/**
 *
 * @author programadorac
 */
public class Factura extends javax.swing.JFrame {

    String fechaSQL;

    /**
     * Creates new form Factura
     */
    public Factura() {
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

        mnuProducto = new javax.swing.JPopupMenu();
        Borrar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnBusquedaNIT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        Borrar.setText("Quitar Producto");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        mnuProducto.add(Borrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("LA TORRE");

        jLabel2.setText("Factura:");

        jLabel3.setText("Serie:");

        txtFactura.setEditable(false);

        jLabel4.setText("Fecha");

        txtFecha.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 156, 156)));
        jPanel1.setForeground(new java.awt.Color(156, 156, 156));

        jLabel5.setText("NIT");

        txtNit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNitMouseReleased(evt);
            }
        });
        txtNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitActionPerformed(evt);
            }
        });
        txtNit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNitFocusLost(evt);
            }
        });
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
        });

        jLabel6.setText("Cliente");

        txtCliente.setEditable(false);

        jLabel7.setText("Direccion");

        btnBusquedaNIT.setText("...");
        btnBusquedaNIT.setToolTipText("Para buscar el NIT por nombre de Cliente");
        btnBusquedaNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaNITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusquedaNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusquedaNIT))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblDetalle.setModel(new DefaultTableModel());
        tblDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalle);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setText("Codigo Producto:");

        jLabel9.setText("Cantidad");

        txtCantidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtCantidadPropertyChange(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtTotal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTotalPropertyChange(evt);
            }
        });
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalKeyReleased(evt);
            }
        });

        jLabel10.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(257, 257, 257)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFactura)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha))))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGuardar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel modelo = (DefaultTableModel) this.tblDetalle.getModel();

        Calendar hoy = Calendar.getInstance();
        int d = hoy.get(Calendar.DATE);
        int m = hoy.get(Calendar.MONTH) + 1;
        int a = hoy.get(Calendar.YEAR);

        String fecha = d + "/" + m + "/" + a;
        fechaSQL = a + "/" + m + "/" + d;
        this.txtFecha.setText(fecha);

        modelo.addColumn("Cantidad");
        modelo.addColumn("Codigo");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio U");
        modelo.addColumn("Subtotal");
        
        //cargar el archivo
        //&&archivo de configuracion
        String serie = "";
        try{
            FileReader fr = new FileReader("/Configuracion/Serie.txt");
            BufferedReader br = new BufferedReader(fr);
            serie = br.readLine();
            this.txtSerie.setText(serie);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void txtNitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNitFocusLost

        Cliente c = new Cliente();
        String[] datos = c.cliente_x_nit(this.txtNit.getText());
        int a = 0;
        this.txtDireccion.setText(datos[0]);
        this.txtCliente.setText(datos[1]);

        /*Mostrar datos que nos devuelve
        JOptionPane.showMessageDialog(null, datos[0]);
        JOptionPane.showMessageDialog(null, datos[1]);
         */

    }//GEN-LAST:event_txtNitFocusLost

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed


    }//GEN-LAST:event_txtNitActionPerformed

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased
        String mensaje = "";
        if (evt.getKeyCode() == 10) {
            this.txtCodigoProducto.grabFocus();
            mensaje = "KCODE" + evt.getKeyCode() + "KCHAR"
                    + evt.getKeyChar() + "ALT" + evt.isAltDown()
                    + "CONTROL" + evt.isControlDown() + "SHIFT" + evt.isShiftDown();
        }

        //codigo para ver cual es el codigo devuelto al presionar cierta tecla(enter es 10)
        //JOptionPane.showMessageDialog(null, evt.getKeyCode());
    }//GEN-LAST:event_txtNitKeyReleased

    private void txtNitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNitMouseReleased
        /*Detectar eventos en mouse
        if(evt.getButton() == 1){
            JOptionPane.showMessageDialog(null, "Izquierdo");
        }
        if(evt.getButton() == 2){
            JOptionPane.showMessageDialog(null, "Rueda/Medio");
        }
        if(evt.getButton() == 3){
            JOptionPane.showMessageDialog(null, "Derecho");
        }  */

        //codigo para ver cual es el codigo devuelto para el boton del mouse devuelde
        //JOptionPane.showMessageDialog(null, evt.getButton());
    }//GEN-LAST:event_txtNitMouseReleased

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased

    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        /*String textoAnterior = this.txtCantidad.getText();
        boolean esNumero = false;
        String caracter = String.valueOf(evt.getKeyChar());
        
        if(caracter.equalsIgnoreCase("0")){
            txtCantidad.setText(textoAnterior + caracter);
        }else{
            txtCantidad.setText(textoAnterior);
        }*/
        String texto = this.txtCantidad.getText();
        char caracter = evt.getKeyChar();
        boolean existePunto = texto.contains(".");

        if (!Character.isDigit(caracter) && (caracter != '.' || existePunto)) {
            //getToolkit().beep();
            evt.consume();
        }


    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCantidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCantidadPropertyChange
        String textoAnterior = this.txtCantidad.getText();

    }//GEN-LAST:event_txtCantidadPropertyChange

    private void btnBusquedaNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaNITActionPerformed
        ClienteNuevo2 nc = new ClienteNuevo2();
        nc.setVisible(true);
        nc.set_NIT(this.txtNit.getText());
    }//GEN-LAST:event_btnBusquedaNITActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String[] datos = null;
        String[] lineaFactura = new String[5]; // antes 4 AHORA 5 por la nueva columna
        Producto p = new Producto();
        datos = p.consultar_x_id(Integer.parseInt(this.txtCodigoProducto.getText()));
        //determinamos que datos
        lineaFactura[0] = this.txtCantidad.getText(); //**tomamos este dato para el subtotal
        lineaFactura[1] = datos[0];
        lineaFactura[2] = datos[2];
        lineaFactura[3] = datos[4]; //**tomamos este datos para el subtotal
        int cantidad = Integer.parseInt(lineaFactura[0]);
        Double precio = Double.parseDouble(datos[4]);
        Double total = cantidad * precio;
        lineaFactura[4] = String.valueOf(total);
        
        //cargamos datos al Jtable
        DefaultTableModel modelo = (DefaultTableModel) this.tblDetalle.getModel();
        modelo.addRow(lineaFactura);
        int a = 0;
        this.calcular_total();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked
  
    
    private void tblDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetalleMouseClicked
        if(evt.getButton()==3){
            mnuProducto.show(evt.getComponent(),
            evt.getX(),evt.getY());
            mnuProducto.setVisible(true);
        }
        
        /*
        Para ver en que valor empieza el metodo getSelectedRow, en este caso empieza en 0. 
        JOptionPane.showMessageDialog(null, this.tblDetalle.getSelectedRow());
        
        */
    }//GEN-LAST:event_tblDetalleMouseClicked

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
        modelo.removeRow(tblDetalle.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Primero debe seleccionar un producto");
        }
        
        this.calcular_total();
        
    }//GEN-LAST:event_BorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        int numeroFactura =0;
        Factura_encabezado fe = new Factura_encabezado();
        int respuesta = 0;
        boolean guardar = true;
        Object[] opciones = {"Agregar serie","Cancelar"};
        numeroFactura = fe.next_factura_x_serie(this.txtSerie.getText());
        /***/
        if(numeroFactura == -999){
            
            respuesta = JOptionPane.showOptionDialog(null,"El numero de serie no existe","Numero Factura",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
            
            if(respuesta == 1){
                guardar = false;
            }       
            numeroFactura = 1;
        }
        if(guardar){
            this.txtFactura.setText(String.valueOf(numeroFactura));
            fe.nueva_factura_encabezado(String.valueOf(numeroFactura), this.txtSerie.getText(), this.txtNit.getText(), this.txtDireccion.getText(), fechaSQL);
        }
        /**Guardar detalle de factura en la tabla factura detalle. */
        guardar_detalle();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTotalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTotalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPropertyChange

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyTyped

    private void txtTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyReleased

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Borrar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBusquedaNIT;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu mnuProducto;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    protected void guardar_detalle(){
        int numeroFilas = this.tblDetalle.getRowCount();
        Factura_detalle fd = new Factura_detalle();
        String numeroFactura, serie, idProducto, cantidad, precioCosto, precioVenta;
        numeroFactura = this.txtFactura.getText();
        serie = this.txtSerie.getText();
        Producto p = new Producto();
        String SQL = "";
        for(int i = 0; i<numeroFilas; i++){
            cantidad = this.tblDetalle.getValueAt(i, 0).toString();
            idProducto = this.tblDetalle.getValueAt(i, 1).toString();
            precioVenta = this.tblDetalle.getValueAt(i, 3).toString();
            precioCosto = p.consultar_precio_x_id(Integer.parseInt(idProducto));
            fd.ingresar_fila_detalle(numeroFactura, serie, idProducto, cantidad, precioCosto, precioVenta);
        }
        
    }
    
    protected void calcular_total(){
        int numeroFilas = this.tblDetalle.getRowCount();
        double acumulador = 0.0;
        
        for(int i = 0; i<numeroFilas; i++){
            acumulador += Double.parseDouble(this.tblDetalle.getValueAt(i,4).toString());
        }
        
        this.txtTotal.setText(String.valueOf(acumulador));
    } 
}