/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.musicus.gui;

/**
 *
 * @author twx
 */
public class PanelPregunta extends javax.swing.JPanel {

    /**
     * Creates new form PanelPregunta
     */
    public PanelPregunta() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupRespuestas = new javax.swing.ButtonGroup();
        jLabelTextoPregunta = new javax.swing.JLabel();
        jLabelImagenPregunta = new javax.swing.JLabel();
        jButtonEnviarRespuesta = new javax.swing.JButton();
        jPanelRespuestas = new javax.swing.JPanel();
        jRadioButtonRespuestaA = new javax.swing.JRadioButton();
        jRadioButtonRespuestaB = new javax.swing.JRadioButton();
        jRadioButtonRespuestaC = new javax.swing.JRadioButton();
        jRadioButtonRespuestaD = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridBagLayout());

        jLabelTextoPregunta.setText("¿Texto de la pregunta?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jLabelTextoPregunta, gridBagConstraints);

        jLabelImagenPregunta.setText("imagen pregunta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.weighty = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jLabelImagenPregunta, gridBagConstraints);

        jButtonEnviarRespuesta.setText("Enviar");
        jButtonEnviarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarRespuestaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jButtonEnviarRespuesta, gridBagConstraints);

        jPanelRespuestas.setBorder(javax.swing.BorderFactory.createTitledBorder("Respuestas"));
        jPanelRespuestas.setLayout(new java.awt.GridBagLayout());

        buttonGroupRespuestas.add(jRadioButtonRespuestaA);
        jRadioButtonRespuestaA.setText("A. Texto Respuesta A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanelRespuestas.add(jRadioButtonRespuestaA, gridBagConstraints);

        buttonGroupRespuestas.add(jRadioButtonRespuestaB);
        jRadioButtonRespuestaB.setText("B. Texto Respuesta B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanelRespuestas.add(jRadioButtonRespuestaB, gridBagConstraints);

        buttonGroupRespuestas.add(jRadioButtonRespuestaC);
        jRadioButtonRespuestaC.setText("C. Texto Respuesta C");
        jRadioButtonRespuestaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRespuestaCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanelRespuestas.add(jRadioButtonRespuestaC, gridBagConstraints);

        buttonGroupRespuestas.add(jRadioButtonRespuestaD);
        jRadioButtonRespuestaD.setText("D. Texto Respuesta D");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanelRespuestas.add(jRadioButtonRespuestaD, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 7.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        add(jPanelRespuestas, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarRespuestaActionPerformed
//        JOptionPane.showMessageDialog(this, "Correcta/Incorrecta");
//        jPanelNivel.remove(jPanelPregunta);
//        jPanelNivel.add(jPanelResultadoNivel);
//        pack();
    }//GEN-LAST:event_jButtonEnviarRespuestaActionPerformed

    private void jRadioButtonRespuestaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRespuestaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonRespuestaCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRespuestas;
    private javax.swing.JButton jButtonEnviarRespuesta;
    private javax.swing.JLabel jLabelImagenPregunta;
    private javax.swing.JLabel jLabelTextoPregunta;
    private javax.swing.JPanel jPanelRespuestas;
    private javax.swing.JRadioButton jRadioButtonRespuestaA;
    private javax.swing.JRadioButton jRadioButtonRespuestaB;
    private javax.swing.JRadioButton jRadioButtonRespuestaC;
    private javax.swing.JRadioButton jRadioButtonRespuestaD;
    // End of variables declaration//GEN-END:variables
}