/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wizards;

import javax.swing.GroupLayout;
import Configuration.UnitLabelUtilities;
import DatabaseUtilities.DatabaseUnitSelectionUtilities;

/**
 *
 * @author Matt
 */
public class PilotRequiredPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form PilotRequiredPanel
     */
    public PilotRequiredPanel() throws ClassNotFoundException {
        initComponents();
    }
    
    public int getWeight() {
        try{
            int weight = Integer.parseInt(weightField.getText());
            return weight;
        }catch (NumberFormatException e) {
            return -1;
        }
    }
    
    public String getPilotFirstName() {
        return firstNameField.getText();
    }
    
    public String getPilotLastName() {
        return lastNameField.getText();
    }
    
    public int getCapability() {
        return xpSlider.getValue();
    }
    
    public int getPreference() {
        return launchPrefSlider.getValue();
    }
    
    public boolean isComplete()
    {
        ErrWindow ew;
        try
        {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String weightStr = weightField.getText();
            int weightInt;
            
            if(firstName.isEmpty())
            {
                throw new Exception();
            }
            if(lastName.isEmpty())
            {
                throw new Exception();
            }
            if(weightStr.isEmpty())
            {
                throw new Exception();
            }
            
            Integer.parseInt(weightStr);
            
        }catch(NumberFormatException e){
            ew = new ErrWindow("Please input a numerical weight value");
            return false;
        }catch(Exception e){
            ew = new ErrWindow("Please complete all required fields");
            return false;
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() throws ClassNotFoundException {
        
        hiXpLabel = new javax.swing.JLabel();
        midXpLabel = new javax.swing.JLabel();
        lowXpLabel = new javax.swing.JLabel();
        xpSlider = new javax.swing.JSlider();
        xpSliderLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        weightUnits = new javax.swing.JLabel();
        launchPrefLabel = new javax.swing.JLabel();
        launchPrefSlider = new javax.swing.JSlider();
        DatabaseUnitSelectionUtilities units = new DatabaseUnitSelectionUtilities();
        UnitLabelUtilities unitsLabel = new UnitLabelUtilities();
        hiXpLabel.setText("Advanced");
        
        midXpLabel.setText("Proficient");
        
        lowXpLabel.setText("Student");
        
        xpSlider.setMajorTickSpacing(1);
        xpSlider.setMaximum(2);
        xpSlider.setPaintTicks(true);
        xpSlider.setSnapToTicks(true);
        
        xpSliderLabel.setText("Experience Level:");
        
        weightLabel.setText("Weight:");
        
        jLabel1.setText("Mild");
        
        weightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightFieldActionPerformed(evt);
            }
        });
        
        jLabel2.setText("Nominal");
        
        firstNameLabel.setText("First Name:");
        lastNameLabel.setText("Last Name:");
        
        jLabel3.setText("Performance");
        
        weightUnits.setText(unitsLabel.weightUnitIndexToString(units.getPilotWeightUnit()));
        
        launchPrefLabel.setText("Preferred Launch:");
        
        launchPrefSlider.setMajorTickSpacing(1);
        launchPrefSlider.setMaximum(2);
        launchPrefSlider.setPaintTicks(true);
        launchPrefSlider.setSnapToTicks(true);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                  .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                          .addGroup(layout.createSequentialGroup()
                                                                                    .addComponent(xpSliderLabel)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addComponent(xpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                          .addGroup(layout.createSequentialGroup()
                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                              .addComponent(firstNameLabel)
                                                                                              .addComponent(lastNameLabel)
                                                                                              .addComponent(weightLabel))
                                                                                    .addGap(30, 30, 30)
                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                              .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                              .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                              
                                                                                              .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(weightUnits))))
                                                                          .addGroup(layout.createSequentialGroup()
                                                                                    .addComponent(launchPrefLabel)
                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                              .addComponent(jLabel1)
                                                                                              
                                                                                              .addComponent(launchPrefSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(57, Short.MAX_VALUE))
                                                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                    .addComponent(lowXpLabel)
                                                                                    .addGap(47, 47, 47)
                                                                                    .addComponent(midXpLabel)
                                                                                    .addGap(42, 42, 42)
                                                                                    .addComponent(hiXpLabel)
                                                                                    .addGap(48, 48, 48))
                                                                          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                    .addComponent(jLabel2)
                                                                                    .addGap(37, 37, 37)
                                                                                    .addComponent(jLabel3)
                                                                                    .addGap(40, 40, 40))))))
                                  );
        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(weightLabel)
                                                    .addComponent(weightUnits)
                                                    
                                                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(xpSliderLabel)
                                                    .addComponent(xpSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(hiXpLabel)
                                                    .addComponent(midXpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lowXpLabel))
                                          .addGap(18, 18, 18)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(launchPrefLabel)
                                                    .addComponent(launchPrefSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2)
                                                    
                                                    .addComponent(jLabel1))
                                          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
    }// </editor-fold>//GEN-END:initComponents
    
    private void weightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightFieldActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hiXpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel weightUnits;
    private javax.swing.JLabel launchPrefLabel;
    private javax.swing.JSlider launchPrefSlider;
    private javax.swing.JLabel lowXpLabel;
    private javax.swing.JLabel midXpLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JSlider xpSlider;
    private javax.swing.JLabel xpSliderLabel;
    
    // End of variables declaration//GEN-END:variables
}

