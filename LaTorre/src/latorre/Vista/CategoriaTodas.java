
package latorre.Vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import latorre.Modelo.Categoria;

/**
 *
 * @author programadorac
 */
public class CategoriaTodas extends javax.swing.JFrame {

    /**
     * Creates new form CategoriaTodas
     */
    public CategoriaTodas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCategorias = new javax.swing.JMenu();
        mniAgregar = new javax.swing.JMenuItem();
        mniModificar = new javax.swing.JMenuItem();
        mniBorrar = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mniAyuda = new javax.swing.JMenuItem();
        mniAcercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCategorias.setModel(new DefaultTableModel());
        jScrollPane1.setViewportView(tblCategorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 520, 330));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Categorias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 90, 40));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 90, 40));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 90, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 610, 430));

        mnuCategorias.setMnemonic('c');
        mnuCategorias.setText("Categorias");

        mniAgregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mniAgregar.setMnemonic('a');
        mniAgregar.setText("Agregar");
        mniAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarActionPerformed(evt);
            }
        });
        mnuCategorias.add(mniAgregar);

        mniModificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mniModificar.setText("Modificar");
        mniModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniModificarActionPerformed(evt);
            }
        });
        mnuCategorias.add(mniModificar);

        mniBorrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mniBorrar.setText("Borrar");
        mniBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBorrarActionPerformed(evt);
            }
        });
        mnuCategorias.add(mniBorrar);

        mniSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnuCategorias.add(mniSalir);

        jMenuBar1.add(mnuCategorias);

        mnuAyuda.setText("Ayuda");

        mniAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniAyuda.setText("Ayuda");
        mnuAyuda.add(mniAyuda);

        mniAcercade.setText("Acerca de...");
        mnuAyuda.add(mniAcercade);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.limpiar_tabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    //MenuItem
    private void mniModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniModificarActionPerformed
        try{
            this.modificar_categoria();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar algun dato.");
        }
    }//GEN-LAST:event_mniModificarActionPerformed
    //MenuItem
    private void mniBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBorrarActionPerformed
        try{
            this.borrar_categoria();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar algun dato.");
        }
    }//GEN-LAST:event_mniBorrarActionPerformed
    //MenuItem
    private void mniAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarActionPerformed
        
        CategoriaNuevo cn = new CategoriaNuevo();
        cn.setVisible(true);
        
            /**No funciona limpiar tabla ya que esta opcion abre un nuevo evento, cuando se cierra
         la ventana CategoriaNuevo cierra ese evento y regresar al evento anterior. */
        /**En este caso ponemos el metodo limpiar_tabla(); en la accion windowsActivated. */
        //this.limpiar_tabla();
    }//GEN-LAST:event_mniAgregarActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        //EXIT SALIR DE TODO EL PROGRAMA
        //DISPOSE SALIR SOLO DE LA VENTANA ACTIVA
        this.dispose();
    }//GEN-LAST:event_mniSalirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        try{
            this.borrar_categoria();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar algun dato.");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            this.modificar_categoria();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar algun dato.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        CategoriaNuevo cn = new CategoriaNuevo();
        cn.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.limpiar_tabla();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(CategoriaTodas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaTodas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaTodas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaTodas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaTodas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mniAcercade;
    private javax.swing.JMenuItem mniAgregar;
    private javax.swing.JMenuItem mniAyuda;
    private javax.swing.JMenuItem mniBorrar;
    private javax.swing.JMenuItem mniModificar;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuCategorias;
    private javax.swing.JTable tblCategorias;
    // End of variables declaration//GEN-END:variables

    protected void limpiar_tabla(){
        //DefaultTableModel modelo = (DefaultTableModel) tblCategorias.getModel();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Descripcion");
        
        //Se llama a la case categorias para obtener los datos.
        Categoria c = new Categoria();
        String [][] datos = c.consultar_todas();
        //Pasar lso datos al JTABLE
        for(String[] linea: datos){
            modelo.addRow(linea);
        }
        this.tblCategorias.setModel(modelo);
        
        
    }
    
    protected void modificar_categoria(){
        /**Seleccionamos la fila. */
        int fila = this.tblCategorias.getSelectedRow();
        /**Le saca el valor a la fila seleccionada. */
        String ID = this.tblCategorias.getValueAt(fila, 0).toString();
        String descripcion = this.tblCategorias.getValueAt(fila, 1).toString();

        CategoriaActualizar ca = new CategoriaActualizar();
        ca.setVisible(true);
        ca.set_datos(ID, descripcion);
    }
    protected void borrar_categoria(){
        Categoria c = new Categoria();
        int fila = tblCategorias.getSelectedRow();
        //GETVALUEAT(FILA,COLUMNA)
        int ID =Integer.parseInt(tblCategorias.getValueAt(fila, 0).toString());
        c.eliminar(ID);
        this.limpiar_tabla();
    }
}
