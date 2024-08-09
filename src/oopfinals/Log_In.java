
package oopfinals;

import java.sql.*;
import javax.swing.*;

public class Log_In extends javax.swing.JFrame {
    
    private int userId;
    
    public Log_In() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLogIn = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        EmailBar = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        PasswordBar = new javax.swing.JPasswordField();
        Icon = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        BackToWelcomeButton = new javax.swing.JButton();
        NewUserButton = new javax.swing.JButton();
        LogInButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLogIn.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        TitleLogIn.setForeground(new java.awt.Color(255, 255, 255));
        TitleLogIn.setText("Log In");
        getContentPane().add(TitleLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        Password.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        EmailBar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        EmailBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailBarActionPerformed(evt);
            }
        });
        getContentPane().add(EmailBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 240, 30));

        Email.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        PasswordBar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        PasswordBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBarActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 240, 30));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/icon.png"))); // NOI18N
        getContentPane().add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 230, 190));

        ExitButton.setBackground(new java.awt.Color(245, 245, 220));
        ExitButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(139, 69, 19));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 100, 50));

        BackToWelcomeButton.setBackground(new java.awt.Color(245, 245, 220));
        BackToWelcomeButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BackToWelcomeButton.setForeground(new java.awt.Color(139, 69, 19));
        BackToWelcomeButton.setText("Back");
        BackToWelcomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToWelcomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackToWelcomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, 100, 50));

        NewUserButton.setBackground(new java.awt.Color(245, 245, 220));
        NewUserButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        NewUserButton.setForeground(new java.awt.Color(139, 69, 19));
        NewUserButton.setText("New User?");
        NewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NewUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, -1));

        LogInButton.setBackground(new java.awt.Color(245, 245, 220));
        LogInButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(139, 69, 19));
        LogInButton.setText("Log In");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/welcome bg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailBarActionPerformed

    private void PasswordBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordBarActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(new JFrame(), "Exit Cozy Reads?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BackToWelcomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToWelcomeButtonActionPerformed
        Welcome welcomeFrame = new Welcome();
        welcomeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackToWelcomeButtonActionPerformed

    private void NewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserButtonActionPerformed
        Sign_Up signUpFrame = new Sign_Up(); 
        signUpFrame.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_NewUserButtonActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            String email = EmailBar.getText();
            String password = PasswordBar.getText();

            String adminQuery = "SELECT EMAIL, PASSWORD FROM ADMIN WHERE EMAIL = ? AND PASSWORD = ?";
            String userQuery = "SELECT USER_ID, EMAIL, PASSWORD FROM USERS WHERE EMAIL = ? AND PASSWORD = ?";

            try (PreparedStatement adminPstmt = con.prepareStatement(adminQuery)) {
                adminPstmt.setString(1, email);
                adminPstmt.setString(2, password);
                try (ResultSet adminRs = adminPstmt.executeQuery()) {
                    if (adminRs.next()) {
                        Admin_Dashboard adminDashFrame = new Admin_Dashboard();
                        adminDashFrame.setVisible(true);
                        this.dispose();
                        return;
                    }
                }
            }

            try (PreparedStatement userPstmt = con.prepareStatement(userQuery)) {
                userPstmt.setString(1, email);
                userPstmt.setString(2, password);
                try (ResultSet userRs = userPstmt.executeQuery()) {
                    if (userRs.next()) {
                        int userId = userRs.getInt("USER_ID");
                        User_Dashboard userDashFrame = new User_Dashboard(userId);
                        userDashFrame.setVisible(true);
                        dispose();
                        return;
                    }
                }
            }

            JOptionPane.showMessageDialog(new JFrame(), "Invalid email or password", "Login Error", JOptionPane.ERROR_MESSAGE);

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToWelcomeButton;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailBar;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Icon;
    private javax.swing.JButton LogInButton;
    private javax.swing.JButton NewUserButton;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordBar;
    private javax.swing.JLabel TitleLogIn;
    // End of variables declaration//GEN-END:variables
}
