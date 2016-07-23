package latorre;

import latorre.Modelo.Categoria;
import latorre.Modelo.Cliente;
import latorre.Modelo.Producto;

/**
 *
 * @author programadorac
 */
public class Main extends javax.swing.JFrame {

    Categoria c = new Categoria();
    Producto p = new Producto();
    Cliente cl = new Cliente();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnFacturaNuevo = new javax.swing.JButton();
        btnFacturaBorrar = new javax.swing.JButton();
        btnFacturaModificar = new javax.swing.JButton();
        btnFacturaConsultar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnClienteNuevo = new javax.swing.JButton();
        btnClienteBorrar = new javax.swing.JButton();
        btnClienteModificar = new javax.swing.JButton();
        btnClienteConsultar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnProductoNuevo = new javax.swing.JButton();
        btnProductoBorrar = new javax.swing.JButton();
        btnProductoModificar = new javax.swing.JButton();
        btnProductoConsultar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCategoriasNuevo = new javax.swing.JButton();
        btnCategoriasBorrar = new javax.swing.JButton();
        btnCategoriasModificar = new javax.swing.JButton();
        btnCategoriasConsultar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Administracion de Factura"));
        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        btnFacturaNuevo.setText("Nuevo");
        jPanel2.add(btnFacturaNuevo);

        btnFacturaBorrar.setText("Borrar");
        jPanel2.add(btnFacturaBorrar);

        btnFacturaModificar.setText("Modificar");
        jPanel2.add(btnFacturaModificar);

        btnFacturaConsultar.setText("Consular");
        jPanel2.add(btnFacturaConsultar);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 200, 330));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Administracion del Cliente"));
        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        btnClienteNuevo.setText("Nuevo");
        btnClienteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteNuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnClienteNuevo);

        btnClienteBorrar.setText("Borrar");
        jPanel4.add(btnClienteBorrar);

        btnClienteModificar.setText("Modificar");
        btnClienteModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnClienteModificar);

        btnClienteConsultar.setText("Consular");
        jPanel4.add(btnClienteConsultar);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 330));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Administracion de Producto"));
        jPanel5.setLayout(new java.awt.GridLayout(4, 1));

        btnProductoNuevo.setText("Nuevo");
        btnProductoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoNuevoActionPerformed(evt);
            }
        });
        jPanel5.add(btnProductoNuevo);

        btnProductoBorrar.setText("Borrar");
        btnProductoBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoBorrarActionPerformed(evt);
            }
        });
        jPanel5.add(btnProductoBorrar);

        btnProductoModificar.setText("Modificar");
        btnProductoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoModificarActionPerformed(evt);
            }
        });
        jPanel5.add(btnProductoModificar);

        btnProductoConsultar.setText("Consular");
        btnProductoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoConsultarActionPerformed(evt);
            }
        });
        jPanel5.add(btnProductoConsultar);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 190, 330));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Administracion de Categorias"));
        jPanel3.setLayout(new java.awt.GridLayout(4, 1));

        btnCategoriasNuevo.setText("Nuevo");
        btnCategoriasNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(btnCategoriasNuevo);

        btnCategoriasBorrar.setText("Borrar");
        btnCategoriasBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCategoriasBorrar);

        btnCategoriasModificar.setText("Modificar");
        btnCategoriasModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCategoriasModificar);

        btnCategoriasConsultar.setText("Consular");
        btnCategoriasConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCategoriasConsultar);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 210, 330));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoriasNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasNuevoActionPerformed
        c.insertar(3, "hola");
    }//GEN-LAST:event_btnCategoriasNuevoActionPerformed

    private void btnCategoriasBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasBorrarActionPerformed
        c.eliminar(3);
    }//GEN-LAST:event_btnCategoriasBorrarActionPerformed

    private void btnCategoriasConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasConsultarActionPerformed
        String[][] datos = c.consultar_todas();
        int a = 1;
    }//GEN-LAST:event_btnCategoriasConsultarActionPerformed

    private void btnCategoriasModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasModificarActionPerformed
        c.actualizar(3, "Licores");
    }//GEN-LAST:event_btnCategoriasModificarActionPerformed

    private void btnClienteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteNuevoActionPerformed
        // TODO add your handling code here:
        //cl.insertar("A-50", "Josue", "Alfredo", "Molina", "Suarez", "4av c-4", "esJosue@email.com", "5023-6987");
    }//GEN-LAST:event_btnClienteNuevoActionPerformed

    private void btnProductoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoNuevoActionPerformed

        int idProducto = p.insertar(1000, "pantalon", 12.50, 15.50);
    }//GEN-LAST:event_btnProductoNuevoActionPerformed

    private void btnProductoBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoBorrarActionPerformed
        p.eliminar(104);
    }//GEN-LAST:event_btnProductoBorrarActionPerformed

    private void btnProductoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoModificarActionPerformed
        // TODO add your handling code here:
        p.actualizar(104, "ZANAHORIA", 60.50f, 70.50f);
    }//GEN-LAST:event_btnProductoModificarActionPerformed

    private void btnProductoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoConsultarActionPerformed
        // TODO add your handling code here:
        String[][] datos = p.consultar_todas();
        int a = 1;
    }//GEN-LAST:event_btnProductoConsultarActionPerformed

    private void btnClienteModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoriasBorrar;
    private javax.swing.JButton btnCategoriasConsultar;
    private javax.swing.JButton btnCategoriasModificar;
    private javax.swing.JButton btnCategoriasNuevo;
    private javax.swing.JButton btnClienteBorrar;
    private javax.swing.JButton btnClienteConsultar;
    private javax.swing.JButton btnClienteModificar;
    private javax.swing.JButton btnClienteNuevo;
    private javax.swing.JButton btnFacturaBorrar;
    private javax.swing.JButton btnFacturaConsultar;
    private javax.swing.JButton btnFacturaModificar;
    private javax.swing.JButton btnFacturaNuevo;
    private javax.swing.JButton btnProductoBorrar;
    private javax.swing.JButton btnProductoConsultar;
    private javax.swing.JButton btnProductoModificar;
    private javax.swing.JButton btnProductoNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
