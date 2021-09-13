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
public class intFrameConcatenar extends javax.swing.JInternalFrame {

    /**
     * Creates new form intFrameConcatenar
     */
    public intFrameConcatenar() {
        initComponents();
        
        intFrameAFNBasico ventana = new intFrameAFNBasico();
        Set<String> keys = ventana.AFNBasicos.keySet();
        for(String key : keys){
            cmbAFN1.addItem(key);
            cmbAFN2.addItem(key);
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

        cmbAFN1 = new javax.swing.JComboBox<>();
        cmbAFN2 = new javax.swing.JComboBox<>();
        btnConcatenarAFN = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Concatenar AFNs");

        btnConcatenarAFN.setBackground(new java.awt.Color(102, 0, 153));
        btnConcatenarAFN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConcatenarAFN.setForeground(new java.awt.Color(255, 255, 255));
        btnConcatenarAFN.setText("Concatenar");
        btnConcatenarAFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcatenarAFNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(cmbAFN1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(cmbAFN2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnConcatenarAFN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAFN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAFN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnConcatenarAFN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcatenarAFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcatenarAFNActionPerformed
        intFrameAFNBasico ventana = new intFrameAFNBasico();
        
        String AFN1key = (String)cmbAFN1.getSelectedItem();
        String AFN2key = (String)cmbAFN2.getSelectedItem();
        ventana.AFNBasicos.get(AFN1key).concaAFN(ventana.AFNBasicos.get(AFN2key));
        JOptionPane.showMessageDialog(this, "Los autómatas se han concatenado", "Concatenación de AFNs",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btnConcatenarAFNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcatenarAFN;
    private javax.swing.JComboBox<String> cmbAFN1;
    private javax.swing.JComboBox<String> cmbAFN2;
    // End of variables declaration//GEN-END:variables
}
