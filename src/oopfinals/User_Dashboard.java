
package oopfinals;

import javax.swing.*;

public class User_Dashboard extends javax.swing.JFrame {
    
    private static int userId;
    
    public User_Dashboard(int userId) {
        initComponents();
        this.userId = userId;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mybooksguide = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TitleWelcomeUser = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        UserWelcome1 = new javax.swing.JLabel();
        UserWelcome2 = new javax.swing.JLabel();
        MyBooksButton = new javax.swing.JButton();
        BookSearchButton = new javax.swing.JButton();
        myguide3 = new javax.swing.JLabel();
        myguide1 = new javax.swing.JLabel();
        myguide2 = new javax.swing.JLabel();
        bsguide3 = new javax.swing.JLabel();
        bsguide1 = new javax.swing.JLabel();
        bsguide2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mybooksguide.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        mybooksguide.setForeground(new java.awt.Color(255, 255, 255));
        mybooksguide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mybooksguide.setText("My Books Guide");
        getContentPane().add(mybooksguide, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Book Search Guide");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        TitleWelcomeUser.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        TitleWelcomeUser.setForeground(new java.awt.Color(255, 255, 255));
        TitleWelcomeUser.setText("Welcome User!");
        getContentPane().add(TitleWelcomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

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

        UserWelcome1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        UserWelcome1.setForeground(new java.awt.Color(255, 255, 255));
        UserWelcome1.setText("Explore new titles, track your favorite books, and enjoy the comfort of a cozy reading experience.");
        getContentPane().add(UserWelcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        UserWelcome2.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        UserWelcome2.setForeground(new java.awt.Color(255, 255, 255));
        UserWelcome2.setText("Your personal library awaits. Happy reading!");
        getContentPane().add(UserWelcome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        MyBooksButton.setBackground(new java.awt.Color(245, 245, 220));
        MyBooksButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        MyBooksButton.setForeground(new java.awt.Color(139, 69, 19));
        MyBooksButton.setText("My Books");
        MyBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyBooksButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MyBooksButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        BookSearchButton.setBackground(new java.awt.Color(245, 245, 220));
        BookSearchButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        BookSearchButton.setForeground(new java.awt.Color(139, 69, 19));
        BookSearchButton.setText("Book Search");
        BookSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookSearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BookSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, -1, -1));

        myguide3.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        myguide3.setForeground(new java.awt.Color(255, 255, 255));
        myguide3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myguide3.setText("-> Return books with a click.");
        getContentPane().add(myguide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        myguide1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        myguide1.setForeground(new java.awt.Color(255, 255, 255));
        myguide1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myguide1.setText("-> Manage borrowed books and returns.");
        getContentPane().add(myguide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        myguide2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        myguide2.setForeground(new java.awt.Color(255, 255, 255));
        myguide2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myguide2.setText("-> View details: title, author, due date.");
        getContentPane().add(myguide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        bsguide3.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        bsguide3.setForeground(new java.awt.Color(255, 255, 255));
        bsguide3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bsguide3.setText("-> Search by title or author.");
        getContentPane().add(bsguide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, -1));

        bsguide1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        bsguide1.setForeground(new java.awt.Color(255, 255, 255));
        bsguide1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bsguide1.setText("-> Explore Cozy Reads' library catalog. ");
        getContentPane().add(bsguide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, -1, -1));

        bsguide2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        bsguide2.setForeground(new java.awt.Color(255, 255, 255));
        bsguide2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bsguide2.setText("-> Check availability status of books.");
        getContentPane().add(bsguide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/user bg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

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

    private void MyBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyBooksButtonActionPerformed
        User_My_Books userMyBooksFrame = new User_My_Books(userId);
        userMyBooksFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MyBooksButtonActionPerformed

    private void BookSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookSearchButtonActionPerformed
        User_Book_Search userSearchFrame = new User_Book_Search(userId);
        userSearchFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BookSearchButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new User_Dashboard(userId).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BookSearchButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MyBooksButton;
    private javax.swing.JLabel TitleWelcomeUser;
    private javax.swing.JLabel UserWelcome1;
    private javax.swing.JLabel UserWelcome2;
    private javax.swing.JLabel bsguide1;
    private javax.swing.JLabel bsguide2;
    private javax.swing.JLabel bsguide3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel mybooksguide;
    private javax.swing.JLabel myguide1;
    private javax.swing.JLabel myguide2;
    private javax.swing.JLabel myguide3;
    // End of variables declaration//GEN-END:variables

}
