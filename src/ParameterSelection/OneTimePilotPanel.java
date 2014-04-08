/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ParameterSelection;

import Configuration.UnitConversionRate;
import DataObjects.Pilot;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import Configuration.UnitLabelUtilities;
import DatabaseUtilities.DatabaseUnitSelectionUtilities;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class PilotSelectionPanel extends javax.swing.JPanel {
    //private List<String> names = Arrays.asList("Alan Quartemain","Alex Williams", "Alexander Costanzo", "Alfred Hitchcock", "George Moore", "George Patten", "George Washington", "Gisela Areola-Gutierrez", "Matt Dargen", "Matt Lower", "Matt Smith");
    private List<Pilot> names = new ArrayList<Pilot>();
    
    private void initPilotList() {
        try{
            names = DatabaseUtilities.DatabaseDataObjectUtilities.getPilots();
            if (names == null)
                names = new ArrayList<>();
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(pilotNameInput, e.getMessage());
            names.add(new Pilot("Quartemain", "Alan", 160, Capability.ADVANCED, "Aggressive", null, null));
            //names.add(new Pilot("Williams", "Alex", 175, Capability.STUDENT, "Mild", null, null));
            //names.add(new Pilot("Costanzo", "Alexander", 165, Capability.PROFICIENT, "Nominal", null, null));
            //names.add(new Pilot("Hitchcock", "Alfred", 190, Capability.STUDENT, "Aggressive", null, null));
            //names.add(new Pilot("Takei", "George", 150, Capability.ADVANCED, "Aggressive", null, null));
            //names.add(new Pilot("Patten", "George", 185, Capability.STUDENT, "Nominal", null, null));
            //names.add(new Pilot("Washington", "George", 175, Capability.ADVANCED, "Nominal", null, null));
            // names.add(new Pilot("Areola-Gutierrez", "Gisela", 125, Capability.STUDENT, "Mild", null, null));
            //names.add(new Pilot("Dargen", "Matt", 175, Capability.STUDENT, "Mild", null, null));
            //names.add(new Pilot("Lower", "Matt", 160, Capability.PROFICIENT, "Nominal", null, null));
            //names.add(new Pilot("Smith", "Matt", 145, Capability.ADVANCED, "Aggressive", null, null));
        } catch (ClassNotFoundException ex) {
            // TODO change exception case
            Logger.getLogger(PilotSelectionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Creates new form PilotSelectionPanel
     */
    public PilotSelectionPanel() {
        initPilotList();
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        DatabaseUnitSelectionUtilities units = new DatabaseUnitSelectionUtilities();
        UnitLabelUtilities unitsLabel = new UnitLabelUtilities();
        pilotNameInput = new javax.swing.JTextField();
        pilotNameLabel = new javax.swing.JLabel();
        pilotWeightLabel = new javax.swing.JLabel();
        pilotWeightDisplay = new javax.swing.JTextField();
        pilotCapabilityLabel = new javax.swing.JLabel();
        pilotCapabilityDisplay = new javax.swing.JTextField();
        pilotPreferenceLabel = new javax.swing.JLabel();
        pilotPreferenceDisplay = new javax.swing.JTextField();
        pilotScrollPane = new javax.swing.JScrollPane();
        pilotJList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        
        pilotNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotNameInputActionPerformed(evt);
            }
        });
        pilotNameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pilotNameInputKeyReleased(evt);
            }
        });
        
        pilotNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pilotNameLabel.setText("Pilot Name:");
        
        pilotWeightLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pilotWeightLabel.setText("Weight:");
        
        pilotWeightDisplay.setEditable(false);
        pilotWeightDisplay.setBackground(new java.awt.Color(255, 105, 105));
        pilotWeightDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotWeightDisplayActionPerformed(evt);
            }
        });
        
        pilotCapabilityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pilotCapabilityLabel.setText("Capability:");
        
        pilotCapabilityDisplay.setEditable(false);
        pilotCapabilityDisplay.setBackground(new java.awt.Color(255, 105, 105));
        pilotCapabilityDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotCapabilityDisplayActionPerformed(evt);
            }
        });
        
        pilotPreferenceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pilotPreferenceLabel.setText("Launch Preference:");
        
        pilotPreferenceDisplay.setEditable(false);
        pilotPreferenceDisplay.setBackground(new java.awt.Color(255, 105, 105));
        pilotPreferenceDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotPreferenceDisplayActionPerformed(evt);
            }
        });
        
        DefaultListModel pilotModel = new DefaultListModel();
        for(Object str: names){
            pilotModel.addElement(str);
        }
        pilotJList.setModel(pilotModel);
        pilotJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pilotJListMouseClicked(evt);
            }
        });
        pilotScrollPane.setViewportView(pilotJList);
        
        jLabel1.setText(unitsLabel.weightUnitIndexToString(units.getPilotWeightUnit()));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                  .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                      .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pilotWeightLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel1))
                                                      .addComponent(pilotCapabilityLabel)
                                                      .addComponent(pilotPreferenceLabel)
                                                      .addComponent(pilotWeightDisplay)
                                                      .addComponent(pilotScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                      .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pilotNameLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(pilotNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                                      .addComponent(pilotCapabilityDisplay)
                                                      .addComponent(pilotPreferenceDisplay))
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                  );
        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                          .addContainerGap()
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(pilotNameLabel)
                                                    .addComponent(pilotNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(pilotScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(pilotWeightLabel)
                                                    .addComponent(jLabel1))
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(pilotWeightDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(pilotCapabilityLabel)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(pilotCapabilityDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                          .addComponent(pilotPreferenceLabel)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(pilotPreferenceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addContainerGap(40, Short.MAX_VALUE))
                                );
    }// </editor-fold>
    
    private void pilotWeightDisplayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void pilotNameInputActionPerformed(java.awt.event.ActionEvent evt) {
        //PilotMatchDisplay.add(PilotNameInput.getText(), this);
        pilotWeightDisplay.setText(pilotNameInput.getText());
    }
    
    private void pilotCapabilityDisplayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void pilotNameInputKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        String matchstring = pilotNameInput.getText();
        DefaultListModel pilotModel = new DefaultListModel();
        
        // TODO Change from String specific to type Pilot
        for(Pilot plt : names){
            if((plt.getFirstName() + plt.getLastName()).toUpperCase().startsWith(matchstring.toUpperCase()))
                pilotModel.addElement(plt);
        }
        
        pilotJList.setModel(pilotModel);
    }
    
    private void pilotJListMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if(pilotJList.getSelectedIndex() >= 0){
            try{
                pilotWeightDisplay.setText(String.valueOf(((Pilot)pilotJList.getSelectedValue()).getWeight() * UnitConversionRate.convertWeightUnitIndexToFactor(DatabaseUnitSelectionUtilities.getPilotWeightUnit())));
                pilotWeightDisplay.setBackground(new Color(142, 250, 127));
                
                pilotCapabilityDisplay.setText(((Pilot)pilotJList.getSelectedValue()).getCapability());
                pilotCapabilityDisplay.setBackground(new Color(142, 250, 127));
                
                pilotPreferenceDisplay.setText(((Pilot)pilotJList.getSelectedValue()).getPreference());
                pilotPreferenceDisplay.setBackground(new Color(142, 250, 127));
            } catch(ClassNotFoundException e1) {
                //TODO respond to error
            }
        }
    }
    
    private void pilotPreferenceDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pilotCapabilityDisplay;
    private javax.swing.JLabel pilotCapabilityLabel;
    private javax.swing.JList pilotJList;
    private javax.swing.JTextField pilotNameInput;
    private javax.swing.JLabel pilotNameLabel;
    private javax.swing.JTextField pilotPreferenceDisplay;
    private javax.swing.JLabel pilotPreferenceLabel;
    private javax.swing.JScrollPane pilotScrollPane;
    private javax.swing.JTextField pilotWeightDisplay;
    private javax.swing.JLabel pilotWeightLabel;
    // End of variables declaration                   
    
    
    public Pilot getSelectedPilot() {
        if(pilotJList.getSelectedIndex() < 0){
            return null;
        }
        return (Pilot)pilotJList.getSelectedValue();
    }
    
    /**
     * Get the value of names
     *
     * @return the value of names
     */
    public List<Pilot> getNames() {
        return names;
    }
    
    /**
     * Set the value of names
     *
     * @param names new value of names
     */
    public void setNames(List<Pilot> names) {
        this.names = names;
    }
}
