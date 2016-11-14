/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;

/**
 *
 * @author richj0985
 */
public class GUI extends javax.swing.JFrame {

    private Controller controller;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    public void setController(Controller c) {
        controller = c;
    }

    public void setImage(BufferedImage img) {
        // the image panel sets its image
        imagePanel.setImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonNorth = new javax.swing.JButton();
        buttonWest = new javax.swing.JButton();
        buttonEast = new javax.swing.JButton();
        buttonSouth = new javax.swing.JButton();
        imagePanel = new hhssadventure.ImageComponent();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonNorth.setText("NORTH");
        buttonNorth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNorthActionPerformed(evt);
            }
        });

        buttonWest.setText("WEST");
        buttonWest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWestActionPerformed(evt);
            }
        });

        buttonEast.setText("EAST");
        buttonEast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEastActionPerformed(evt);
            }
        });

        buttonSouth.setText("SOUTH");
        buttonSouth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSouthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(buttonWest)
                                .addGap(69, 69, 69)
                                .addComponent(buttonEast))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(buttonSouth))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(buttonNorth)))
                        .addGap(0, 198, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonNorth)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonWest)
                    .addComponent(buttonEast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSouth)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNorthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNorthActionPerformed
        // Go North
        controller.goNorth();
    }//GEN-LAST:event_buttonNorthActionPerformed

    private void buttonEastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEastActionPerformed
        // Go East!
        controller.goEast();
    }//GEN-LAST:event_buttonEastActionPerformed

    private void buttonSouthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSouthActionPerformed
        // Go South!
        controller.goSouth();
    }//GEN-LAST:event_buttonSouthActionPerformed

    private void buttonWestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWestActionPerformed
        // Go West!
        controller.goWest();
    }//GEN-LAST:event_buttonWestActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEast;
    private javax.swing.JButton buttonNorth;
    private javax.swing.JButton buttonSouth;
    private javax.swing.JButton buttonWest;
    private hhssadventure.ImageComponent imagePanel;
    // End of variables declaration//GEN-END:variables
}
