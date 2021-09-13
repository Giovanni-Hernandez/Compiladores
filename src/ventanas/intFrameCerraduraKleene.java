/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author argio
 */
public class intFrameCerraduraKleene extends javax.swing.JInternalFrame {

    /**
     * Creates new form intFrameCerraduraKleene
     */
    public intFrameCerraduraKleene() {
        initComponents();
        intFrameAFNBasico ventana = new intFrameAFNBasico();
        Set<String> keys = ventana.AFNBasicos.keySet();
        for(String key : keys){
            cmbAFN.addItem(key);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbAFN = new javax.swing.JComboBox<>();
        btnObtenerCerraduraKleene = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cerradura de Kleene AFN");

        btnObtenerCerraduraKleene.setBackground(new java.awt.Color(102, 0, 153));
        btnObtenerCerraduraKleene.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnObtenerCerraduraKleene.setForeground(new java.awt.Color(255, 255, 255));
        btnObtenerCerraduraKleene.setText("Obtener");
        btnObtenerCerraduraKleene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerCerraduraKleeneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbAFN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnObtenerCerraduraKleene, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(cmbAFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnObtenerCerraduraKleene, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerCerraduraKleeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerCerraduraKleeneActionPerformed
        intFrameAFNBasico ventana = new intFrameAFNBasico();
        
        String AFN1key = (String)cmbAFN.getSelectedItem();
        ventana.AFNBasicos.get(AFN1key).cerrKleen();
        JOptionPane.showMessageDialog(this, "Se ha obtenenido la Cerradura de Kleene *", "Cerradura de Kleene AFN",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btnObtenerCerraduraKleeneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnObtenerCerraduraKleene;
    private javax.swing.JComboBox<String> cmbAFN;
    // End of variables declaration//GEN-END:variables
}
