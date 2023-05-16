package edu.unindra.kkp_kelompok4.login;

import edu.unindra.kkp_kelompok4.dao.daoLogin;
import AppPackage.AnimationClass;
import edu.unindra.kkp_kelompok4.model.modelLogin;
import edu.unindra.kkp_kelompok4.Services.serviceLogin;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ripal
 */
public class formLogin extends javax.swing.JFrame {
    AnimationClass ac = new AnimationClass();
    /**
     * Creates new form Form_Login
     */
    private serviceLogin service = new daoLogin();
    public static boolean close = false;
    public formLogin() {
        initComponents();
 	jbLogin.requestFocus();
	sliderShow();
	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                container = new javax.swing.JPanel();
                left = new javax.swing.JPanel();
                jlXYZ = new javax.swing.JLabel();
                jlMinimarket = new javax.swing.JLabel();
                jlLoginIcon = new javax.swing.JLabel();
                jbLogin = new javax.swing.JButton();
                usernamePanel = new javax.swing.JPanel();
                jlIconPassword = new javax.swing.JLabel();
                tfUsername = new javax.swing.JTextField();
                passwordLabel = new javax.swing.JPanel();
                jlIconUsername = new javax.swing.JLabel();
                jpPassword = new javax.swing.JPasswordField();
                jlMinimarket1 = new javax.swing.JLabel();
                right = new javax.swing.JPanel();
                jlClose = new javax.swing.JLabel();
                Picture1 = new javax.swing.JLabel();
                Picture2 = new javax.swing.JLabel();
                Picture3 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);
                addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseDragged(java.awt.event.MouseEvent evt) {
                                formMouseDragged(evt);
                        }
                });
                addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                formMousePressed(evt);
                        }
                });
                getContentPane().setLayout(new java.awt.CardLayout());

                container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                left.setBackground(new java.awt.Color(0, 0, 255));
                left.setToolTipText("");
                left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jlXYZ.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
                jlXYZ.setForeground(new java.awt.Color(255, 255, 255));
                jlXYZ.setText("XYZ");
                left.add(jlXYZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, 60));

                jlMinimarket.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
                jlMinimarket.setForeground(new java.awt.Color(255, 255, 255));
                jlMinimarket.setText("Form Login");
                left.add(jlMinimarket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 300, 60));

                jlLoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unindra/kkp_kelompok4/resource/image/Login/Shopping.png"))); // NOI18N
                left.add(jlLoginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 150, 150));

                jbLogin.setBackground(new java.awt.Color(200, 200, 200));
                jbLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
                jbLogin.setForeground(new java.awt.Color(51, 51, 51));
                jbLogin.setText("Login");
                jbLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jbLoginActionPerformed(evt);
                        }
                });
                left.add(jbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 190, 40));

                usernamePanel.setBackground(new java.awt.Color(200, 200, 200));
                usernamePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
                usernamePanel.setLayout(new javax.swing.BoxLayout(usernamePanel, javax.swing.BoxLayout.LINE_AXIS));

                jlIconPassword.setBackground(new java.awt.Color(204, 102, 255));
                jlIconPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jlIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unindra/kkp_kelompok4/resource/image/Login/Username.png"))); // NOI18N
                jlIconPassword.setToolTipText("");
                jlIconPassword.setPreferredSize(new java.awt.Dimension(40, 60));
                jlIconPassword.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
                usernamePanel.add(jlIconPassword);

                tfUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                tfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                tfUsername.setText("Username");
                tfUsername.setToolTipText("");
                tfUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
                tfUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                tfUsername.setPreferredSize(new java.awt.Dimension(30, 18));
                tfUsername.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                tfUsernameFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                tfUsernameFocusLost(evt);
                        }
                });
                tfUsername.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfUsernameActionPerformed(evt);
                        }
                });
                tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                tfUsernameKeyTyped(evt);
                        }
                });
                usernamePanel.add(tfUsername);

                left.add(usernamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 190, 40));

                passwordLabel.setBackground(new java.awt.Color(200, 200, 200));
                passwordLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(200, 200, 200)));
                passwordLabel.setLayout(new javax.swing.BoxLayout(passwordLabel, javax.swing.BoxLayout.LINE_AXIS));

                jlIconUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jlIconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unindra/kkp_kelompok4/resource/image/Login/Password.png"))); // NOI18N
                jlIconUsername.setPreferredSize(new java.awt.Dimension(40, 20));
                passwordLabel.add(jlIconUsername);

                jpPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                jpPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                jpPassword.setText("Password");
                jpPassword.setToolTipText("");
                jpPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                jpPassword.setPreferredSize(new java.awt.Dimension(30, 18));
                jpPassword.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jpPasswordFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jpPasswordFocusLost(evt);
                        }
                });
                jpPassword.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jpPasswordActionPerformed(evt);
                        }
                });
                jpPassword.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                jpPasswordKeyPressed(evt);
                        }
                });
                passwordLabel.add(jpPassword);

                left.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 190, 40));

                jlMinimarket1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
                jlMinimarket1.setForeground(new java.awt.Color(255, 255, 255));
                jlMinimarket1.setText("MINIMARKET");
                left.add(jlMinimarket1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 60));

                container.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

                right.setBackground(new java.awt.Color(255, 255, 255));
                right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jlClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unindra/kkp_kelompok4/resource/image/Login/Close.png"))); // NOI18N
                jlClose.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jlCloseMouseClicked(evt);
                        }
                });
                right.add(jlClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 40));

                Picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unindra/kkp_kelompok4/resource/image/Login/Pic1.jpg"))); // NOI18N
                right.add(Picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

                Picture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unindra/kkp_kelompok4/resource/image/Login/Pic2.jpg"))); // NOI18N
                right.add(Picture2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 500));

                Picture3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unindra/kkp_kelompok4/resource/image/Login/Pic3.jpg"))); // NOI18N
                right.add(Picture3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 500, 500));

                container.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 500));

                getContentPane().add(container, "card3");

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents
    private int xx,xy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x,y;
        x=evt.getXOnScreen();
        y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void jlCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jlCloseMouseClicked

    private void tfUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusGained
        String username = tfUsername.getText();
        if (username.equals("Username")){
            tfUsername.setText("");
        }
    }//GEN-LAST:event_tfUsernameFocusGained

    private void jpPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordFocusGained
       char[] password = jpPassword.getPassword();
       String passwordString = new String(password);
        if (passwordString.equals("Password")){
            jpPassword.setText("");
        }
    }//GEN-LAST:event_jpPasswordFocusGained

    private void tfUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusLost
       String username =tfUsername.getText();
       if (username.equals("")){
           tfUsername.setText("Username");
       }
    }//GEN-LAST:event_tfUsernameFocusLost

    private void jpPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordFocusLost
        // TODO add your handling code here:
         char[] password = jpPassword.getPassword();
         String passwordString = new String(password);
         if (passwordString.equals(""))
             jpPassword.setText("Password");
    }//GEN-LAST:event_jpPasswordFocusLost

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
//        homeApp homeapp = new homeApp();
//        homeapp.setVisible(true);
//        homeapp.revalidate();
//        
//        aboutApp aboutapp = new aboutApp(homeapp,true);
//        aboutapp.setVisible(true);
        
       loginProcess();
       	    closeApp();
    }//GEN-LAST:event_jbLoginActionPerformed

        private void jpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpPasswordActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jpPasswordActionPerformed

        private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped

        }//GEN-LAST:event_tfUsernameKeyTyped

        private void jpPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpPasswordKeyPressed

        }//GEN-LAST:event_jpPasswordKeyPressed

        private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfUsernameActionPerformed

    private void closeApp(){
	    if(close){
		    dispose();
	    }
    }
    private void loginProcess(){
	    if (inputValidation()==true){
		    String username = tfUsername.getText();
		    String password = jpPassword.getText();
		    
		    modelLogin loginModel = new modelLogin();
		    loginModel.setUsername(username);
		    loginModel.setPassword(password);
		 
		    service.prosesLogin(loginModel);
		    
	    }
    }
    
    private boolean inputValidation() {
	boolean valid=false;
	if (tfUsername.getText().trim().isEmpty()) {
	    JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
	} else if (jpPassword.getText().trim().isEmpty()) {
	    JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
	} else {
		valid=true;
	}
	    return valid;
    }

    
    public void sliderShow(){
        new Thread(new Runnable(){
            @Override
            public void run(){
                int nb = 0;
                try {
                    while (true){
                        switch (nb) {
                            case 0:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -500, 12, 10, Picture1);
                                ac.jLabelXLeft(500, 0, 12, 10, Picture2);
                                ac.jLabelXLeft(1000, 500, 12, 10, Picture3);
                                nb++; 
                            case 1:
                                Thread.sleep(3000);
                                ac.jLabelXLeft(-500,-1000, 12, 10, Picture1);
                                ac.jLabelXLeft(0, -500, 12, 10, Picture2);
                                ac.jLabelXLeft(500, 0, 12, 10, Picture3);
                                nb++;
                            case 2:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-1000, -500, 12, 10, Picture1);
                                ac.jLabelXRight(-500, 0, 12, 10, Picture2);
                                ac.jLabelXRight(0, 500, 12, 10, Picture3);
                                nb++;
                            case 3:
                                Thread.sleep(3000);
                                ac.jLabelXRight(-500, 0, 12, 10, Picture1);
                                ac.jLabelXRight(0, 500, 12, 10, Picture2);
                                ac.jLabelXRight(500, 1000, 12, 10, Picture3);
                                nb=0;
                        }
                    }
                } catch (Exception ex) {
                }
            }
        }).start();
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel Picture1;
        private javax.swing.JLabel Picture2;
        private javax.swing.JLabel Picture3;
        private javax.swing.JPanel container;
        private javax.swing.JButton jbLogin;
        private javax.swing.JLabel jlClose;
        private javax.swing.JLabel jlIconPassword;
        private javax.swing.JLabel jlIconUsername;
        private javax.swing.JLabel jlLoginIcon;
        private javax.swing.JLabel jlMinimarket;
        private javax.swing.JLabel jlMinimarket1;
        private javax.swing.JLabel jlXYZ;
        private javax.swing.JPasswordField jpPassword;
        private javax.swing.JPanel left;
        private javax.swing.JPanel passwordLabel;
        private javax.swing.JPanel right;
        private javax.swing.JTextField tfUsername;
        private javax.swing.JPanel usernamePanel;
        // End of variables declaration//GEN-END:variables
}