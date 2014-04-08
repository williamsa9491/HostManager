/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wizards;

import DataObjects.Sailplane;
import DatabaseUtilities.DatabaseDataObjectUtilities;
import java.awt.Color;
import Configuration.UnitLabelUtilities;
import DatabaseUtilities.DatabaseUnitSelectionUtilities;
import javax.swing.JOptionPane;

/**
 *
 * @author Matt
 */
public class Wizard_Sailplane extends Wizard {
    
    /**
     * Creates new form Wizard_Sailplane
     */
    public Wizard_Sailplane() {
        super();
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
        
        windowLabel = new javax.swing.JLabel();
        nNumberLabel = new javax.swing.JLabel();
        nNumberField = new javax.swing.JTextField();
        maxGrossWeightLabel = new javax.swing.JLabel();
        maxGrossWeightField = new javax.swing.JTextField();
        stallSpeedLabel = new javax.swing.JLabel();
        stallSpeedField = new javax.swing.JTextField();
        maxWinchingSpeedLabel = new javax.swing.JLabel();
        maxWinchingSpeedField = new javax.swing.JTextField();
        singleCheckBox = new javax.swing.JCheckBox();
        ballastCheckBox = new javax.swing.JCheckBox();
        submitButton = new javax.swing.JButton();
        emptyWeightLabel = new javax.swing.JLabel();
        emptyWeightField = new javax.swing.JTextField();
        emptyWeightUnits = new javax.swing.JLabel();
        maxGrossWeightUnits = new javax.swing.JLabel();
        indicatedStallSpeedUnits = new javax.swing.JLabel();
        maxWinchingSpeedUnits = new javax.swing.JLabel();
        DatabaseUnitSelectionUtilities units = new DatabaseUnitSelectionUtilities();
        UnitLabelUtilities unitsLabel = new UnitLabelUtilities();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        windowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        windowLabel.setText("Glider Data Entry Wizard");
        indicatedStallSpeedUnits.setText(unitsLabel.velocityUnitIndexToString(units.getSailplaneVelocityUnit()));
        maxWinchingSpeedUnits.setText(unitsLabel.velocityUnitIndexToString(units.getSailplaneVelocityUnit()));
        nNumberLabel.setText("N-Number:");
        emptyWeightUnits.setText(unitsLabel.weightUnitIndexToString(units.getSailplaneWeightUnit()));
        maxGrossWeightLabel.setText("Max Gross Weight:");
        maxGrossWeightUnits.setText(unitsLabel.weightUnitIndexToString(units.getSailplaneWeightUnit()));        maxGrossWeightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxGrossWeightFieldActionPerformed(evt);
            }
        });
        
        stallSpeedLabel.setText("Indicated Stall Speed:");
        
        maxWinchingSpeedLabel.setText("Max Winching Speed:");
        
        singleCheckBox.setText("Single seated?");
        singleCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singleCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        singleCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleCheckBoxActionPerformed(evt);
            }
        });
        
        ballastCheckBox.setText("Can carry ballast?");
        ballastCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ballastCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        
        submitButton.setText("Submit");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });
        
        emptyWeightLabel.setText("Empty Weight:");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(windowLabel)
                                            .addGap(121, 121, 121))
                                  .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(maxGrossWeightLabel)
                                                                                                        .addComponent(emptyWeightLabel)
                                                                                                        .addComponent(nNumberLabel))
                                                                                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                              
                                                                                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                  .addComponent(maxGrossWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                  .addComponent(maxGrossWeightUnits))
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                  .addComponent(emptyWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)                                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                  .addComponent(emptyWeightUnits))
                                                                                                        
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                  
                                                                                                                  .addComponent(nNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        ))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                          
                                                                          .addComponent(stallSpeedLabel)
                                                                          .addComponent(maxWinchingSpeedLabel)
                                                                          .addComponent(ballastCheckBox)
                                                                          .addComponent(singleCheckBox))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                          .addGroup(layout.createSequentialGroup()
                                                                                    .addComponent(stallSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(indicatedStallSpeedUnits))
                                                                          .addGroup(layout.createSequentialGroup()
                                                                                    .addComponent(maxWinchingSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(maxWinchingSpeedUnits))
                                                                          ))
                                                      .addGroup(layout.createSequentialGroup()
                                                                .addGap(160, 160, 160)
                                                                .addComponent(submitButton)))
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                  .addGap(28, 28, 28)
                                  );
        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addComponent(windowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(nNumberLabel)
                                                    .addComponent(nNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(stallSpeedLabel)
                                                    .addComponent(indicatedStallSpeedUnits)
                                                    .addComponent(stallSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(emptyWeightLabel)
                                                    .addComponent(emptyWeightUnits)
                                                    .addComponent(maxWinchingSpeedUnits)
                                                    .addComponent(emptyWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(maxWinchingSpeedLabel)
                                                    
                                                    .addComponent(maxWinchingSpeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(maxGrossWeightLabel)
                                                    .addComponent(maxGrossWeightUnits)
                                                    .addComponent(maxGrossWeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(singleCheckBox))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(ballastCheckBox)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(submitButton)
                                          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
        
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void maxGrossWeightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxGrossWeightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxGrossWeightFieldActionPerformed
    
    private void singleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singleCheckBoxActionPerformed
    
    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        String curField = "";
        try
        {
            String nNumberStr, emptyWeightStr, maxGrossWeightStr, stallSpeedStr, maxWinchingSpeedStr;
            int nNumberInt, emptyWeightInt, maxGrossWeightInt, stallSpeedInt, maxWinchingSpeedInt;
            
            nNumberStr = nNumberField.getText();
            emptyWeightStr = emptyWeightField.getText();
            maxGrossWeightStr = maxGrossWeightField.getText();
            stallSpeedStr = stallSpeedField.getText();
            maxWinchingSpeedStr = maxWinchingSpeedField.getText();
            
            if(nNumberStr.isEmpty() || emptyWeightStr.isEmpty() ||
               maxGrossWeightStr.isEmpty() || stallSpeedStr.isEmpty() ||
               maxWinchingSpeedStr.isEmpty())
            {
                throw new Exception();
            }
            
            //curField = "N-Number";
            //nNumberInt = Integer.parseInt(nNumberStr);
            
            curField = "Empty Weight";
            emptyWeightInt = Integer.parseInt(emptyWeightStr);
            
            curField = "Max Gross Weight";
            maxGrossWeightInt = Integer.parseInt(maxGrossWeightStr);
            
            curField = "Indicated Stall Speed";
            stallSpeedInt = Integer.parseInt(stallSpeedStr);
            
            curField = "Max Winching Speed";
            maxWinchingSpeedInt = Integer.parseInt(maxWinchingSpeedStr);
            
            if (ballastCheckBox.isSelected() ){
                carryBallastBool = true;
            }
            else{
                carryBallastBool = false;
            }
            
            Sailplane s = new Sailplane(nNumberStr, "Single Place", maxGrossWeightInt, emptyWeightInt, stallSpeedInt, maxWinchingSpeedInt, 1000, 500, carryBallastBool);
            DatabaseDataObjectUtilities.addSailplaneToDB(s);
            submitData();
            this.dispose();
            
        }catch(NumberFormatException e){
            ew = new ErrWindow("Please input a numerical value for " + curField);
        }catch(Exception e){
            ew = new ErrWindow("Please complete all require fields.");
            if(nNumberField.getText().isEmpty())
                nNumberField.setBackground(new Color(255, 105, 105));
            else
                nNumberField.setBackground(new Color(255, 255, 255));
            if(emptyWeightField.getText().isEmpty())
                emptyWeightField.setBackground(new Color(255, 105, 105));
            else
                emptyWeightField.setBackground(new Color(255, 255, 255));
            if(maxGrossWeightField.getText().isEmpty())
                maxGrossWeightField.setBackground(new Color(255, 105, 105));
            else
                maxGrossWeightField.setBackground(new Color(255, 255, 255));
            if(stallSpeedField.getText().isEmpty())
                stallSpeedField.setBackground(new Color(255, 105, 105));
            else
                stallSpeedField.setBackground(new Color(255, 255, 255));
            if(maxWinchingSpeedField.getText().isEmpty())
                maxWinchingSpeedField.setBackground(new Color(255, 105, 105));
            else
                maxWinchingSpeedField.setBackground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_submitButtonMouseClicked
    
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
            java.util.logging.Logger.getLogger(Wizard_Sailplane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wizard_Sailplane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wizard_Sailplane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wizard_Sailplane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wizard_Sailplane().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ballastCheckBox;
    private javax.swing.JTextField emptyWeightField;
    private javax.swing.JLabel emptyWeightLabel;
    private javax.swing.JTextField maxGrossWeightField;
    private javax.swing.JLabel maxGrossWeightLabel;
    private javax.swing.JTextField maxWinchingSpeedField;
    private javax.swing.JLabel maxWinchingSpeedLabel;
    private javax.swing.JTextField nNumberField;
    private javax.swing.JLabel nNumberLabel;
    private javax.swing.JCheckBox singleCheckBox;
    private javax.swing.JTextField stallSpeedField;
    private javax.swing.JLabel stallSpeedLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel windowLabel;
    private javax.swing.JLabel emptyWeightUnits;
    private javax.swing.JLabel maxGrossWeightUnits;
    private javax.swing.JLabel indicatedStallSpeedUnits;
    private javax.swing.JLabel maxWinchingSpeedUnits;
    // End of variables declaration//GEN-END:variables
}
