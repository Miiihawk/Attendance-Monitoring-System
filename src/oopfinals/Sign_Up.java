package oopfinals;

import javax.swing.*;
import java.sql.*;

public class Sign_Up extends javax.swing.JFrame {

    public Sign_Up() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleSignUp = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        EmailBar = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordBar = new javax.swing.JPasswordField();
        FN = new javax.swing.JLabel();
        LN = new javax.swing.JLabel();
        FirstNameBar = new javax.swing.JTextField();
        LastNameBar = new javax.swing.JTextField();
        Icon = new javax.swing.JLabel();
        BackToWelcomeButton = new javax.swing.JButton();
        AlreadyAUserButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleSignUp.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        TitleSignUp.setForeground(new java.awt.Color(255, 255, 255));
        TitleSignUp.setText("Sign Up");
        getContentPane().add(TitleSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        Email.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        EmailBar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        EmailBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailBarActionPerformed(evt);
            }
        });
        getContentPane().add(EmailBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 240, 30));

        Password.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        PasswordBar.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        PasswordBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBarActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 240, 30));

        FN.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        FN.setForeground(new java.awt.Color(255, 255, 255));
        FN.setText("First Name");
        getContentPane().add(FN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        LN.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        LN.setForeground(new java.awt.Color(255, 255, 255));
        LN.setText("Last Name");
        getContentPane().add(LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        FirstNameBar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        FirstNameBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FirstNameBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameBarActionPerformed(evt);
            }
        });
        getContentPane().add(FirstNameBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 240, 30));

        LastNameBar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        LastNameBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LastNameBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameBarActionPerformed(evt);
            }
        });
        getContentPane().add(LastNameBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 240, 30));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/icon.png"))); // NOI18N
        getContentPane().add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 230, 190));

        BackToWelcomeButton.setBackground(new java.awt.Color(245, 245, 220));
        BackToWelcomeButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BackToWelcomeButton.setForeground(new java.awt.Color(139, 69, 19));
        BackToWelcomeButton.setText("Back");
        BackToWelcomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToWelcomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackToWelcomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, 100, 50));

        AlreadyAUserButton.setBackground(new java.awt.Color(245, 245, 220));
        AlreadyAUserButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        AlreadyAUserButton.setForeground(new java.awt.Color(139, 69, 19));
        AlreadyAUserButton.setText("Already a User?");
        AlreadyAUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlreadyAUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AlreadyAUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        SignUpButton.setBackground(new java.awt.Color(245, 245, 220));
        SignUpButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(139, 69, 19));
        SignUpButton.setText("Sign Up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, -1, -1));

        ExitButton.setBackground(new java.awt.Color(245, 245, 220));
        ExitButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(139, 69, 19));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, 100, 50));

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

    private void FirstNameBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameBarActionPerformed

    private void LastNameBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameBarActionPerformed

    private void BackToWelcomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToWelcomeButtonActionPerformed
        Welcome welcomeFrame = new Welcome();
        welcomeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackToWelcomeButtonActionPerformed

    private void AlreadyAUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlreadyAUserButtonActionPerformed
        Log_In loginFrame = new Log_In(); 
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlreadyAUserButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
       String fname, lname, email, password;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            if ("".equals(FirstNameBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "First Name is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(LastNameBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(EmailBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(PasswordBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                fname = FirstNameBar.getText();
                lname = LastNameBar.getText();
                email = EmailBar.getText();
                password = PasswordBar.getText();

                // Check if email already exists
                String checkQuery = "SELECT * FROM users WHERE EMAIL = ?";
                try (PreparedStatement checkStmt = con.prepareStatement(checkQuery)) {
                    checkStmt.setString(1, email);
                    ResultSet rs = checkStmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(new JFrame(), "Email already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Insert new user
                        String insertQuery = "INSERT INTO users(USER_FIRST_NAME, USER_LAST_NAME, EMAIL, PASSWORD) VALUES (?, ?, ?, ?)";
                        try (PreparedStatement insertStmt = con.prepareStatement(insertQuery)) {
                            insertStmt.setString(1, fname);
                            insertStmt.setString(2, lname);
                            insertStmt.setString(3, email);
                            insertStmt.setString(4, password);

                            insertStmt.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Successfully registered");

                            // Open login frame and close current frame
                            Log_In loginFrame = new Log_In();
                            loginFrame.setVisible(true);
                            this.dispose();
                        }
                    }
                }
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error: " + e.getMessage());
        }
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(new JFrame(), "Exit Cozy Reads?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlreadyAUserButton;
    private javax.swing.JButton BackToWelcomeButton;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailBar;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel FN;
    private javax.swing.JTextField FirstNameBar;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel LN;
    private javax.swing.JTextField LastNameBar;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordBar;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel TitleSignUp;
    // End of variables declaration//GEN-END:variables
}
