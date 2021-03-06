
package ventanas;
import clases.*;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class intFrameAFNBasico extends javax.swing.JInternalFrame {

   
    public intFrameAFNBasico() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCaracterInf = new javax.swing.JTextField();
        txtCaracterSup = new javax.swing.JTextField();
        btnCrearAFNBasico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIdAFN = new javax.swing.JTextField();
        btnGraficarAFN = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        imgAFN = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear AFN Básico");

        jLabel1.setText("Caracter Inferior");

        jLabel2.setText("Caracter Superior");

        txtCaracterInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaracterInfActionPerformed(evt);
            }
        });

        btnCrearAFNBasico.setBackground(new java.awt.Color(102, 0, 153));
        btnCrearAFNBasico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCrearAFNBasico.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearAFNBasico.setText("Crear AFN");
        btnCrearAFNBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAFNBasicoActionPerformed(evt);
            }
        });

        jLabel3.setText("Identificador AFN");

        btnGraficarAFN.setBackground(new java.awt.Color(102, 0, 153));
        btnGraficarAFN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGraficarAFN.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficarAFN.setText("Graficar");
        btnGraficarAFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarAFNActionPerformed(evt);
            }
        });

        btnVisualizar.setBackground(new java.awt.Color(102, 0, 153));
        btnVisualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        imgAFN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCaracterInf)
                            .addComponent(txtCaracterSup)
                            .addComponent(txtIdAFN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgAFN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrearAFNBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(btnGraficarAFN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCaracterInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCaracterSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdAFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearAFNBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraficarAFN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(imgAFN, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCaracterInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaracterInfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaracterInfActionPerformed
    
    public static HashMap<String,AFN> AFNBasicos = new HashMap<String, AFN>(); 
    private void btnCrearAFNBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAFNBasicoActionPerformed
        char simbInf = this.txtCaracterInf.getText().charAt(0);
        char simbSup = this.txtCaracterSup.getText().charAt(0);
        String ID = this.txtIdAFN.getText();
        imgAFN.setIcon(null);
        
        AFN A1 = new AFN();
        A1.creaAFNBasico(simbSup, simbInf);
        AFNBasicos.put(ID,A1);
        JOptionPane.showMessageDialog(this, "El automata ha sido creado", "Creación de AFN",JOptionPane.INFORMATION_MESSAGE);
        //this.dispose();
    }//GEN-LAST:event_btnCrearAFNBasicoActionPerformed

    private void btnGraficarAFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarAFNActionPerformed
        char simbInf = this.txtCaracterInf.getText().charAt(0);
        char simbSup = this.txtCaracterSup.getText().charAt(0);
        imgAFN.setIcon(null);
        
        try {
            String ruta = "src\\graphviz\\AFN.txt";
            String contenido = "digraph Automata{ rankdir =\"LR\" "
                    + "0 [shape=\"circle\"];"
                    + "1 [shape=\"doublecircle\"];"
                    + "0->1[label=\"["+simbInf+", "+simbSup+"]\"];}" ;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        try {
            String dotPath = "src\\graphviz\\dot.exe";
            String fileInputPath = "src\\graphviz\\AFN.txt";
            String fileOutputPath = "src\\graphviz\\AFN.jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec( cmd );
      
        } catch (Exception ex) {
          ex.printStackTrace();
        } finally {
        }
    }//GEN-LAST:event_btnGraficarAFNActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
      imgAFN.setIcon(null);
      ImageIcon imagen = new ImageIcon("src\\graphviz\\AFN.jpg");
      imagen.getImage().flush();
      this.imgAFN.setIcon(imagen);
    }//GEN-LAST:event_btnVisualizarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearAFNBasico;
    private javax.swing.JButton btnGraficarAFN;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel imgAFN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCaracterInf;
    private javax.swing.JTextField txtCaracterSup;
    private javax.swing.JTextField txtIdAFN;
    // End of variables declaration//GEN-END:variables
}
