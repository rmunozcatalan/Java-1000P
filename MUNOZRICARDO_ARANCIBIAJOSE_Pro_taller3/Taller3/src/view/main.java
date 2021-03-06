package view;

import view.Pelicula.*;

public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuPeliculaAgregar = new javax.swing.JMenuItem();
        jMenuPeliculaListar = new javax.swing.JMenuItem();
        jMenuPeliculaEditar = new javax.swing.JMenuItem();
        jMenuItemPeliculaEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Pelicula");

        jMenuPeliculaAgregar.setText("Agregar");
        jMenuPeliculaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPeliculaAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPeliculaAgregar);

        jMenuPeliculaListar.setText("Listar");
        jMenuPeliculaListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPeliculaListarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPeliculaListar);

        jMenuPeliculaEditar.setText("Editar");
        jMenuPeliculaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPeliculaEditarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPeliculaEditar);

        jMenuItemPeliculaEliminar.setText("Eliminar");
        jMenuItemPeliculaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPeliculaEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPeliculaEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPeliculaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPeliculaAgregarActionPerformed
        // TODO add your handling code here:
        Agregar agregar = new Agregar();
        agregar.setVisible(true);

    }//GEN-LAST:event_jMenuPeliculaAgregarActionPerformed

    private void jMenuPeliculaListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPeliculaListarActionPerformed
        Listar listar = new Listar();
        listar.setVisible(true);
    }//GEN-LAST:event_jMenuPeliculaListarActionPerformed

    private void jMenuPeliculaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPeliculaEditarActionPerformed
        Editar editar = new Editar();
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuPeliculaEditarActionPerformed

    private void jMenuItemPeliculaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPeliculaEliminarActionPerformed
        Eliminar eliminar = new Eliminar();
        eliminar.setVisible(true);
    }//GEN-LAST:event_jMenuItemPeliculaEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemPeliculaEliminar;
    private javax.swing.JMenuItem jMenuPeliculaAgregar;
    private javax.swing.JMenuItem jMenuPeliculaEditar;
    private javax.swing.JMenuItem jMenuPeliculaListar;
    // End of variables declaration//GEN-END:variables
}
