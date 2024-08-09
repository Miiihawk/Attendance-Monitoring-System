
package oopfinals;

import javax.swing.*;
import java.sql.*;

public class Admin_Dashboard extends javax.swing.JFrame {

    public Admin_Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleHello = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        UserInfoButton = new javax.swing.JButton();
        BookInfoButton = new javax.swing.JButton();
        BookInfoGuide = new javax.swing.JLabel();
        userinfoguide = new javax.swing.JLabel();
        TitleHello1 = new javax.swing.JLabel();
        TitleHello2 = new javax.swing.JLabel();
        uiguide1 = new javax.swing.JLabel();
        uiguide2 = new javax.swing.JLabel();
        uiguide3 = new javax.swing.JLabel();
        biguide1 = new javax.swing.JLabel();
        biguide3 = new javax.swing.JLabel();
        biguide2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleHello.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        TitleHello.setForeground(new java.awt.Color(255, 255, 255));
        TitleHello.setText("Welcome Admin!");
        getContentPane().add(TitleHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        LogoutButton.setBackground(new java.awt.Color(245, 245, 220));
        LogoutButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(139, 69, 19));
        LogoutButton.setText("Log Out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 130, 50));

        ExitButton.setBackground(new java.awt.Color(245, 245, 220));
        ExitButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(139, 69, 19));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 100, 50));

        UserInfoButton.setBackground(new java.awt.Color(245, 245, 220));
        UserInfoButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        UserInfoButton.setForeground(new java.awt.Color(139, 69, 19));
        UserInfoButton.setText("User Info");
        UserInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UserInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        BookInfoButton.setBackground(new java.awt.Color(245, 245, 220));
        BookInfoButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        BookInfoButton.setForeground(new java.awt.Color(139, 69, 19));
        BookInfoButton.setText("Book Info");
        BookInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BookInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));

        BookInfoGuide.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BookInfoGuide.setForeground(new java.awt.Color(255, 255, 255));
        BookInfoGuide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookInfoGuide.setText("Book Info Guide");
        getContentPane().add(BookInfoGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        userinfoguide.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        userinfoguide.setForeground(new java.awt.Color(255, 255, 255));
        userinfoguide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userinfoguide.setText("User Info Guide");
        getContentPane().add(userinfoguide, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        TitleHello1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        TitleHello1.setForeground(new java.awt.Color(255, 255, 255));
        TitleHello1.setText("Dive into your tasks and help us create the coziest reading experience for our users.");
        getContentPane().add(TitleHello1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        TitleHello2.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        TitleHello2.setForeground(new java.awt.Color(255, 255, 255));
        TitleHello2.setText("Your central hub for managing our delightful collection");
        getContentPane().add(TitleHello2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        uiguide1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        uiguide1.setForeground(new java.awt.Color(255, 255, 255));
        uiguide1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uiguide1.setText("-> Create, update, delete, and search for users. ");
        getContentPane().add(uiguide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        uiguide2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        uiguide2.setForeground(new java.awt.Color(255, 255, 255));
        uiguide2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uiguide2.setText("-> Add new users with detailed information.");
        getContentPane().add(uiguide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        uiguide3.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        uiguide3.setForeground(new java.awt.Color(255, 255, 255));
        uiguide3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uiguide3.setText("-> Modify existing user profiles.");
        getContentPane().add(uiguide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        biguide1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        biguide1.setForeground(new java.awt.Color(255, 255, 255));
        biguide1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        biguide1.setText("-> Check availability status for each book.");
        getContentPane().add(biguide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, -1));

        biguide3.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        biguide3.setForeground(new java.awt.Color(255, 255, 255));
        biguide3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        biguide3.setText("-> Add new books and update details");
        getContentPane().add(biguide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, -1, -1));

        biguide2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        biguide2.setForeground(new java.awt.Color(255, 255, 255));
        biguide2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        biguide2.setText("-> Change availability status, and delete books.");
        getContentPane().add(biguide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/admin bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure to Log Out?", "LOG OUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            Log_In loginFrame = new Log_In();
            loginFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(new JFrame(), "Exit Cozy Reads?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void UserInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserInfoButtonActionPerformed
        Admin_User_Info adminUserInfoFrame = new Admin_User_Info();
        adminUserInfoFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserInfoButtonActionPerformed

    private void BookInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookInfoButtonActionPerformed
        Admin_Book_Info adminBookInfoFrame = new Admin_Book_Info();
        adminBookInfoFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BookInfoButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookInfoButton;
    private javax.swing.JLabel BookInfoGuide;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel TitleHello;
    private javax.swing.JLabel TitleHello1;
    private javax.swing.JLabel TitleHello2;
    private javax.swing.JButton UserInfoButton;
    private javax.swing.JLabel biguide1;
    private javax.swing.JLabel biguide2;
    private javax.swing.JLabel biguide3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel uiguide1;
    private javax.swing.JLabel uiguide2;
    private javax.swing.JLabel uiguide3;
    private javax.swing.JLabel userinfoguide;
    // End of variables declaration//GEN-END:variables
}
