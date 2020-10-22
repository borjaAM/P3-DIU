/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3.diu;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 6
 */
public class InterfazGUI extends javax.swing.JFrame {

    private int min = 0;
    private int max = 1;
    private Matriz matriz = new Matriz(min, max);;
    
    public InterfazGUI() {
        initComponents();
        minValue.setText(min+"");
        maxValue.setText(max+"");
        crearMatriz();
        textUmbral.setText("Umbral: "+ umbral.getValue());
        this.getContentPane().setBackground(Color.getHSBColor(224, 126, 126));
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
        panelSuperior = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textMatriz = new javax.swing.JTextArea();
        panelInferior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        umbral = new javax.swing.JSlider();
        minValue = new javax.swing.JTextField();
        maxValue = new javax.swing.JTextField();
        textUmbral = new javax.swing.JLabel();
        authors = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FiltradorMatrices");
        setBackground(new java.awt.Color(242, 175, 61));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Stencil", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("FILTRADO DE UNA MATRIZ CUADRADA");

        panelSuperior.setBackground(new java.awt.Color(224, 126, 126));
        panelSuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matriz 10x10", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Stencil", 1, 14), new java.awt.Color(153, 0, 153))); // NOI18N

        jScrollPane2.setMaximumSize(new java.awt.Dimension(200, 200));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(200, 200));
        jScrollPane2.setName(""); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPane2.setRequestFocusEnabled(false);

        textMatriz.setBackground(new java.awt.Color(240, 255, 248));
        textMatriz.setColumns(20);
        textMatriz.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        textMatriz.setRows(5);
        textMatriz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(textMatriz);
        textMatriz.setEditable(false);

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelInferior.setBackground(new java.awt.Color(248, 228, 167));
        panelInferior.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Stencil", 1, 14), new java.awt.Color(153, 0, 153))); // NOI18N
        panelInferior.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("valor Mínimo:");

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Valor Máximo:");

        umbral.setMajorTickSpacing(50);
        umbral.setMaximum(0);
        umbral.setMinorTickSpacing(1);
        umbral.setPaintTicks(true);
        umbral.setToolTipText("Umbral de filtrado de la matriz");
        umbral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        umbral.setValueIsAdjusting(true);
        umbral.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                umbralStateChanged(evt);
            }
        });

        minValue.setToolTipText("Valor (no decimal) mínimo de la matriz");
        minValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minValueMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minValueMouseExited(evt);
            }
        });

        maxValue.setToolTipText("Valor (no decimal) máximo de la matriz.");
        maxValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxValueMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxValueMouseExited(evt);
            }
        });

        textUmbral.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        textUmbral.setForeground(new java.awt.Color(255, 51, 51));
        textUmbral.setText("Umbral:");

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(minValue, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(maxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(umbral, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(textUmbral)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(umbral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textUmbral)
                .addGap(17, 17, 17))
        );

        authors.setFont(new java.awt.Font("Stencil", 1, 12)); // NOI18N
        authors.setText("Hecho POr: Borja Álvarez y Esther Zurita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelInferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelSuperior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(authors)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authors)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void umbralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_umbralStateChanged
        textUmbral.setText("Umbral: "+ umbral.getValue());
        actualizarTextArea(matriz.umbral(umbral.getValue()));
    }//GEN-LAST:event_umbralStateChanged

    private void minValueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minValueMouseExited
        if(!minValue.getText().isEmpty()){
            if(isNumeric(minValue.getText()) && minValue.getText().length()<6 ){ 
                String minS = min+"";
                if(!minValue.getText().equals(minS)){
                    min = Integer.parseInt(minValue.getText());
                    crearMatriz();
                }
            }else{
                msgError("Valor mínimo incorrecto (Solo números enteros de 4 dígitos)");
            }
        }
        minValue.setText(min+"");
        minValue.transferFocusBackward();
    }//GEN-LAST:event_minValueMouseExited

    private void maxValueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxValueMouseExited
        if(!maxValue.getText().isEmpty()){
            if(isNumeric(maxValue.getText()) && maxValue.getText().length()<5 ){
                String maxS = max+"";
                if(!maxValue.getText().equals(maxS)){
                    max = Integer.parseInt(maxValue.getText());
                    crearMatriz();
                }
            } else{
                msgError("Valor máximo incorrecto (Solo números enteros de 4 dígitos)");
            }
        }
        maxValue.setText(max+"");
        maxValue.transferFocus();
    }//GEN-LAST:event_maxValueMouseExited

    private void maxValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxValueMouseClicked
        maxValue.setText("");
    }//GEN-LAST:event_maxValueMouseClicked

    private void minValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minValueMouseClicked
        minValue.setText("");
    }//GEN-LAST:event_minValueMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGUI().setVisible(true);
            }
        });
    }
    
    private boolean isNumeric(String number){
        try{
            Integer.parseInt(number);
            return true;
        }catch(NumberFormatException e){
            return false;
        } 
    }
    private void crearMatriz(){
        if(min <= max){
            matriz.setMin(min);
            matriz.setMax(max);
            matriz.actualizarMatriz();
            umbral.setMinimum(min-1);
            umbral.setMaximum(max);
            umbral.setValue(min-1);
            actualizarTextArea(matriz.toString());
        } else {
            msgError("El valor mínimo debe ser menor o igual al valor máximo.");
        }
    }
    
    private void msgError(String error){
        JOptionPane.showMessageDialog(this,error);
    }
    
    private void actualizarTextArea(String texto){
        textMatriz.setText(texto);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField maxValue;
    private javax.swing.JTextField minValue;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextArea textMatriz;
    private javax.swing.JLabel textUmbral;
    private javax.swing.JSlider umbral;
    // End of variables declaration//GEN-END:variables
}
