
package oopfinals;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class User_My_Books extends javax.swing.JFrame {

    private static int userId;

    public User_My_Books(int userId) {
        initComponents();
        this.userId = userId;
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReturnButton = new javax.swing.JButton();
        TitleYourBooks = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserBooksTable = new javax.swing.JTable();
        BacktoDashButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        MLoadData = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReturnButton.setBackground(new java.awt.Color(245, 245, 220));
        ReturnButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        ReturnButton.setForeground(new java.awt.Color(139, 69, 19));
        ReturnButton.setText("Return Book");
        ReturnButton.setToolTipText("");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        TitleYourBooks.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        TitleYourBooks.setForeground(new java.awt.Color(255, 255, 255));
        TitleYourBooks.setText("Your Books:");
        getContentPane().add(TitleYourBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        UserBooksTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Book Title", "Book Author", "Book Genre", "Book Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserBooksTable.setRowHeight(40);
        jScrollPane1.setViewportView(UserBooksTable);
        if (UserBooksTable.getColumnModel().getColumnCount() > 0) {
            UserBooksTable.getColumnModel().getColumn(0).setResizable(false);
            UserBooksTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            UserBooksTable.getColumnModel().getColumn(1).setResizable(false);
            UserBooksTable.getColumnModel().getColumn(1).setPreferredWidth(1000);
            UserBooksTable.getColumnModel().getColumn(2).setResizable(false);
            UserBooksTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            UserBooksTable.getColumnModel().getColumn(3).setResizable(false);
            UserBooksTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            UserBooksTable.getColumnModel().getColumn(4).setResizable(false);
            UserBooksTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 1130, 400));

        BacktoDashButton.setBackground(new java.awt.Color(245, 245, 220));
        BacktoDashButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BacktoDashButton.setForeground(new java.awt.Color(139, 69, 19));
        BacktoDashButton.setText("Back");
        BacktoDashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BacktoDashButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BacktoDashButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 50));

        LogoutButton.setBackground(new java.awt.Color(245, 245, 220));
        LogoutButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(139, 69, 19));
        LogoutButton.setText("Log Out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 670, 130, 50));

        ExitButton.setBackground(new java.awt.Color(245, 245, 220));
        ExitButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(139, 69, 19));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 670, 100, 50));

        MLoadData.setBackground(new java.awt.Color(245, 245, 220));
        MLoadData.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        MLoadData.setForeground(new java.awt.Color(139, 69, 19));
        MLoadData.setText("Load Data");
        MLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLoadDataActionPerformed(evt);
            }
        });
        getContentPane().add(MLoadData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 560, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/user bg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        int selectedRow = UserBooksTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(new JFrame(), "Please select a book to return.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String bookId = UserBooksTable.getValueAt(selectedRow, 0).toString();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String query = "UPDATE BOOK_LIBRARY SET BOOK_STATUS = 'Available', USER_ID = NULL WHERE BOOK_ID = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, bookId);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Book returned successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Failed to return the book.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void BacktoDashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacktoDashButtonActionPerformed
        User_Dashboard userDashFrame = new User_Dashboard(userId);
        userDashFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BacktoDashButtonActionPerformed

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

    private void MLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLoadDataActionPerformed
        loadData();
    }//GEN-LAST:event_MLoadDataActionPerformed
    
     public void loadData() {
        DefaultTableModel model = (DefaultTableModel) UserBooksTable.getModel();
        model.setRowCount(0); 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            String query = "SELECT BOOK_ID, BOOK_TITLE, BOOK_AUTHOR, BOOK_GENRE, BOOK_STATUS FROM BOOK_LIBRARY WHERE USER_ID = '" + userId + "'";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("BOOK_ID");
                String title = rs.getString("BOOK_TITLE");
                String author = rs.getString("BOOK_AUTHOR");
                String genre = rs.getString("BOOK_GENRE");
                String status = rs.getString("BOOK_STATUS");
                model.addRow(new Object[]{id, title, author, genre, status});
            }

            rs.close();
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error: " + e.getMessage());
        }
    }
     
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_My_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_My_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_My_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_My_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new User_Book_Search(userId).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BacktoDashButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MLoadData;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JLabel TitleYourBooks;
    private javax.swing.JTable UserBooksTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
