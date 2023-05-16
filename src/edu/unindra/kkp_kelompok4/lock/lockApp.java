package edu.unindra.kkp_kelompok4.lock;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument;

public class lockApp extends javax.swing.JDialog {

    /**
     * Creates new form lockApp
     */
    public lockApp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
	((AbstractDocument) pinLock.getDocument()).setDocumentFilter(new NumberOnlyFilter());
	btEnter.requestFocus();
    }
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                lockPanel = new javax.swing.JPanel();
                inputPasswordLabel = new javax.swing.JLabel();
                labelMinimarket = new javax.swing.JLabel();
                labelIcon = new javax.swing.JLabel();
                btEnter = new javax.swing.JButton();
                alert = new javax.swing.JLabel();
                pinLock = new javax.swing.JPasswordField();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setUndecorated(true);
                setPreferredSize(new java.awt.Dimension(1000, 534));

                lockPanel.setBackground(new java.awt.Color(0, 0, 255));
                lockPanel.setPreferredSize(new java.awt.Dimension(1000, 534));
                lockPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                inputPasswordLabel.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
                inputPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
                inputPasswordLabel.setText("Masukan PIN");
                lockPanel.add(inputPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

                labelMinimarket.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
                labelMinimarket.setForeground(new java.awt.Color(255, 255, 255));
                labelMinimarket.setText("MINIMARKET XYZ");
                lockPanel.add(labelMinimarket, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 406, -1));

                labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unindra/kkp_kelompok4/resource/image/HomeApp/Shopping.png"))); // NOI18N
                lockPanel.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 92, -1));

                btEnter.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
                btEnter.setForeground(new java.awt.Color(0, 0, 255));
                btEnter.setText("Masuk");
                btEnter.setActionCommand("");
                btEnter.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btEnterActionPerformed(evt);
                        }
                });
                lockPanel.add(btEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, 43));

                alert.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
                alert.setForeground(new java.awt.Color(255, 102, 0));
                alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                alert.setText("Please enter numbers only.");
                lockPanel.add(alert, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 300, 50));

                pinLock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                pinLock.setToolTipText("");
                pinLock.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                pinLockMouseClicked(evt);
                        }
                });
                lockPanel.add(pinLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 300, 50));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lockPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lockPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        dispose();
    }//GEN-LAST:event_btEnterActionPerformed

        private void pinLockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinLockMouseClicked
               alert.setVisible(false);
        }//GEN-LAST:event_pinLockMouseClicked

 

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel alert;
        private javax.swing.JButton btEnter;
        private javax.swing.JLabel inputPasswordLabel;
        private javax.swing.JLabel labelIcon;
        private javax.swing.JLabel labelMinimarket;
        private javax.swing.JPanel lockPanel;
        private javax.swing.JPasswordField pinLock;
        // End of variables declaration//GEN-END:variables
}
