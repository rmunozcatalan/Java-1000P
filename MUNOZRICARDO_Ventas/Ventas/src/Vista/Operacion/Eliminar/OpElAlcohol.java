/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Operacion.Eliminar; 
import Modelo.Alcohol;  
import static ventas.Ventas.arrayAlcohol;
/**
 *
 * @author Duoc
 */
public class OpElAlcohol extends javax.swing.JPanel {

    /**
     * Creates new form OpElAlcohol
     */
    public OpElAlcohol() {
        initComponents();
        lstAlcohol.setModel(Modelo.Alcohol.getListado(arrayAlcohol));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminarAlcohol = new javax.swing.JButton();
        txtCodigoEliminar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAlcohol = new javax.swing.JList<>();

        btnEliminarAlcohol.setText("Eliminar Cigarro");
        btnEliminarAlcohol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlcoholActionPerformed(evt);
            }
        });

        lstAlcohol.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstAlcohol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtCodigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnEliminarAlcohol)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarAlcohol)
                    .addComponent(txtCodigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarAlcoholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlcoholActionPerformed
        arrayAlcohol.remove(Integer.parseInt(txtCodigoEliminar.getText()));
        lstAlcohol.setModel(Modelo.Alcohol.getListado(arrayAlcohol));
    }//GEN-LAST:event_btnEliminarAlcoholActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarAlcohol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstAlcohol;
    private javax.swing.JTextField txtCodigoEliminar;
    // End of variables declaration//GEN-END:variables
}
