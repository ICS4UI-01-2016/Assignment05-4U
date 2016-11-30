/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;

/**
 *
 * @author halll7908
 */
public class GUI extends javax.swing.JFrame {
    
    private LocationController controller;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    public void setController(LocationController c){
        controller = c;
    }
    
    public void setImage(BufferedImage img){
        // the image panel sets its image
        image1.setImage(img);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SouthButton = new javax.swing.JButton();
        EastButton = new javax.swing.JButton();
        WestButton = new javax.swing.JButton();
        NorthButton = new javax.swing.JButton();
        Image = new javax.swing.JPanel();
        image1 = new hhssadventure.Image();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SouthButton.setText("South");
        SouthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SouthButtonActionPerformed(evt);
            }
        });

        EastButton.setText("East");
        EastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EastButtonActionPerformed(evt);
            }
        });

        WestButton.setText("West");
        WestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WestButtonActionPerformed(evt);
            }
        });

        NorthButton.setText("North");
        NorthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NorthButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ImageLayout = new javax.swing.GroupLayout(Image);
        Image.setLayout(ImageLayout);
        ImageLayout.setHorizontalGroup(
            ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ImageLayout.setVerticalGroup(
            ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageLayout.createSequentialGroup()
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WestButton)
                        .addGap(89, 89, 89)
                        .addComponent(EastButton))
                    .addComponent(SouthButton)
                    .addComponent(NorthButton))
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(NorthButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EastButton)
                    .addComponent(WestButton))
                .addGap(18, 18, 18)
                .addComponent(SouthButton)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EastButtonActionPerformed
        // TODO add your handling code here:
        controller.goEast();
    }//GEN-LAST:event_EastButtonActionPerformed

    private void NorthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NorthButtonActionPerformed
        // TODO add your handling code here:
        controller.goNorth();
    }//GEN-LAST:event_NorthButtonActionPerformed

    private void WestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WestButtonActionPerformed
        // TODO add your handling code here:
        controller.goWest();
    }//GEN-LAST:event_WestButtonActionPerformed

    private void SouthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SouthButtonActionPerformed
        // TODO add your handling code here:
        controller.goSouth();
    }//GEN-LAST:event_SouthButtonActionPerformed

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
    private javax.swing.JButton EastButton;
    private javax.swing.JPanel Image;
    private javax.swing.JButton NorthButton;
    private javax.swing.JButton SouthButton;
    private javax.swing.JButton WestButton;
    private hhssadventure.Image image1;
    // End of variables declaration//GEN-END:variables
}
