
package oopfinals;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class User_Book_Search extends javax.swing.JFrame {
    
    private static int userId;
    
    public User_Book_Search(int userId) {
        initComponents();
        this.userId = userId;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchBar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookSearchTable = new javax.swing.JTable();
        LogoutButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        BacktoDashButton = new javax.swing.JButton();
        BorrowBookButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        BLoadData = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchBar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        SearchBar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarActionPerformed(evt);
            }
        });
        getContentPane().add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 270, 30));

        BookSearchTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BookSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Author", "Genre", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BookSearchTable.setAlignmentX(1.0F);
        BookSearchTable.setAlignmentY(1.0F);
        BookSearchTable.setRowHeight(40);
        BookSearchTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(BookSearchTable);
        if (BookSearchTable.getColumnModel().getColumnCount() > 0) {
            BookSearchTable.getColumnModel().getColumn(0).setResizable(false);
            BookSearchTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            BookSearchTable.getColumnModel().getColumn(1).setResizable(false);
            BookSearchTable.getColumnModel().getColumn(1).setPreferredWidth(1000);
            BookSearchTable.getColumnModel().getColumn(2).setResizable(false);
            BookSearchTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            BookSearchTable.getColumnModel().getColumn(3).setResizable(false);
            BookSearchTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            BookSearchTable.getColumnModel().getColumn(4).setResizable(false);
            BookSearchTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 1150, 400));

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

        SearchButton.setBackground(new java.awt.Color(245, 245, 220));
        SearchButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(139, 69, 19));
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 94, 130, -1));

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

        BorrowBookButton.setBackground(new java.awt.Color(245, 245, 220));
        BorrowBookButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        BorrowBookButton.setForeground(new java.awt.Color(139, 69, 19));
        BorrowBookButton.setText("Borrow Book");
        BorrowBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BorrowBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, -1));

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

        BLoadData.setBackground(new java.awt.Color(245, 245, 220));
        BLoadData.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BLoadData.setForeground(new java.awt.Color(139, 69, 19));
        BLoadData.setText("Load Data");
        BLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoadDataActionPerformed(evt);
            }
        });
        getContentPane().add(BLoadData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 560, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/user bg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBarActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure to Log Out?", "LOG OUT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            Log_In loginFrame = new Log_In();
            loginFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String searchText = SearchBar.getText().trim();
        int notFound = 0;

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Book Title or Author name is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
        
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            // Using PreparedStatement for parameterized queries
            String query;
            PreparedStatement pst;

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Search input is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            // Search by either book title or author
            query = "SELECT BOOK_ID, BOOK_TITLE, BOOK_AUTHOR, BOOK_GENRE, BOOK_STATUS FROM BOOK_LIBRARY " +
                    "WHERE BOOK_TITLE LIKE ? OR BOOK_AUTHOR LIKE ? OR BOOK_GENRE LIKE ?";
            pst = con.prepareStatement(query);
            pst.setString(1, "%" + searchText + "%");
            pst.setString(2, "%" + searchText + "%");
            pst.setString(3, "%" + searchText + "%");
        }

        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = new DefaultTableModel(new String[]{"Book ID", "Book Title", "Author", "Genre", "Status"}, 0);
        BookSearchTable.setModel(model);

        while (rs.next()) {
            String id = rs.getString("BOOK_ID");
            String bookTitle = rs.getString("BOOK_TITLE");
            String author = rs.getString("BOOK_AUTHOR");
            String genre = rs.getString("BOOK_GENRE");
            String status = rs.getString("BOOK_STATUS");
            model.addRow(new Object[]{id, bookTitle, author, genre, status});
            notFound = 1;
        }

        if (notFound == 0) {
            JOptionPane.showMessageDialog(new JFrame(), "No books found matching the search criteria", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        rs.close();
        pst.close();
        con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void BacktoDashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacktoDashButtonActionPerformed
        User_Dashboard userDashFrame = new User_Dashboard(userId);
        userDashFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BacktoDashButtonActionPerformed

    private void BorrowBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowBookButtonActionPerformed
        int selectedRow = BookSearchTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(new JFrame(), "Please select a book to borrow.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String bookId = BookSearchTable.getValueAt(selectedRow, 0).toString();
        String bookStatus = BookSearchTable.getValueAt(selectedRow, 4).toString();

        if (bookStatus.equalsIgnoreCase("Unavailable")) {
            JOptionPane.showMessageDialog(new JFrame(), "This book is currently unavailable.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String query = "UPDATE BOOK_LIBRARY SET BOOK_STATUS = 'Unavailable', USER_ID = ? WHERE BOOK_ID = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, userId);
            pst.setString(2, bookId);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Book borrowed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadData();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Failed to borrow the book.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BorrowBookButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(new JFrame(), "Exit Cozy Reads?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoadDataActionPerformed
        loadData();
    }//GEN-LAST:event_BLoadDataActionPerformed
    
    public void loadData() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();

            DefaultTableModel model = new DefaultTableModel(new String[]{"Book ID", "Book Title", "Author", "Genre", "Status"}, 0);
            BookSearchTable.setModel(model);
            String query = "SELECT BOOK_ID, BOOK_TITLE, BOOK_AUTHOR, BOOK_GENRE, BOOK_STATUS FROM BOOK_LIBRARY";
            rs = st.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("BOOK_ID");
                String title = rs.getString("BOOK_TITLE");
                String author = rs.getString("BOOK_AUTHOR");
                String genre = rs.getString("BOOK_GENRE");
                String status = rs.getString("BOOK_STATUS");
                model.addRow(new Object[]{id, title, author, genre, status});
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (Exception e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
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
            java.util.logging.Logger.getLogger(User_Book_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Book_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Book_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Book_Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new User_Dashboard(userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLoadData;
    private javax.swing.JLabel Background;
    private javax.swing.JButton BacktoDashButton;
    private javax.swing.JTable BookSearchTable;
    private javax.swing.JButton BorrowBookButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton SearchButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
