/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wizards;

import DataObjects.Airfield;
import DataObjects.Position;
import DataObjects.Runway;
import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class Wizard_Airfield extends Wizard {

    /**
     * Creates new form Wizard_Airfield
     */
    public Wizard_Airfield() {
        initComponents();
        populatePanels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        windowLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        airfieldPanel = new AirfieldWizardPanel();
        runwayPanel = new RunwayWizardPanel();
        positionPanel = new PositionWizardPanel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        windowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        windowLabel.setText("Airfield Data Entry Wizard");

        submitButton.setText("Submit");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setToolTipText("Fill out all three tabs before clicking \"Submit\"");
        jTabbedPane1.addTab("Airfield", airfieldPanel);
        jTabbedPane1.addTab("Runway", runwayPanel);
        jTabbedPane1.addTab("Position", positionPanel);

        jTabbedPane1.setSelectedComponent(airfieldPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(submitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(windowLabel)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowLabel)
                .addGap(11, 11, 11)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populatePanels()
    {
        // method not yet implemented: getPositions
        positionPanel.positions = (ArrayList) DatabaseUtilities.DatabaseDataObjectUtilities.getPositions();
        
        for(Position p: positionPanel.positions){
            runwayPanel.runways.add(p.getParent());
        }
        for(Runway r: runwayPanel.runways){
            airfieldPanel.airfields.add(r.getParent());
        }
        
        airfieldPanel.populate();
        runwayPanel.populate();
        positionPanel.populate();
    }
    
    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        
        Airfield a = new Airfield();
        Runway r = new Runway();
        Position p = new Position();
        
        if(airfieldPanel.isComplete(a))
        {
            System.out.println("Airfield panel complete");
            if(runwayPanel.isComplete(r))
            {
                System.out.println("Runway panel complete");
                r.setParent(a);
                if(positionPanel.isComplete(p))
                {
                    System.out.println("Position panel complete");
                    p.setParent(r);
                    this.dispose();
                }else{
                    ew = new ErrWindow("Please fill out all fields under \"Position\"");
                }
            }else{
                ew = new ErrWindow("Please fill out all fields under \"Runway\"");
            }
        }else{
            ew = new ErrWindow("Please fill out all fields under \"Airfield\"");
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
            java.util.logging.Logger.getLogger(Wizard_Airfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wizard_Airfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wizard_Airfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wizard_Airfield.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wizard_Airfield().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private AirfieldWizardPanel airfieldPanel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private PositionWizardPanel positionPanel;
    private RunwayWizardPanel runwayPanel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel windowLabel;
    // End of variables declaration//GEN-END:variables
}
