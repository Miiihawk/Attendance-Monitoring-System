
package oopfinals;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class Admin_Book_Info extends javax.swing.JFrame {

    public Admin_Book_Info() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleManageBooks = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Author = new javax.swing.JLabel();
        Genre = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        TitleBar = new javax.swing.JTextField();
        UserIDBar = new javax.swing.JTextField();
        StatusBar = new javax.swing.JComboBox<>();
        GenreBar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageBooksTable = new javax.swing.JTable();
        BCreateButton = new javax.swing.JButton();
        BUpdateButton = new javax.swing.JButton();
        BDeleteButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        BacktoDashButton = new javax.swing.JButton();
        TitleSearchBook = new javax.swing.JLabel();
        Reminder = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        BSearchButton = new javax.swing.JButton();
        BLoadDataButton = new javax.swing.JButton();
        BClearButton = new javax.swing.JButton();
        BUserID = new javax.swing.JLabel();
        AuthorBar = new javax.swing.JTextField();
        BBookID = new javax.swing.JLabel();
        BookIdBar = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleManageBooks.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        TitleManageBooks.setForeground(new java.awt.Color(255, 255, 255));
        TitleManageBooks.setText("Manage Books");
        getContentPane().add(TitleManageBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        Title.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Title");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        Author.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Author.setForeground(new java.awt.Color(255, 255, 255));
        Author.setText("Author");
        getContentPane().add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        Genre.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Genre.setForeground(new java.awt.Color(255, 255, 255));
        Genre.setText("Genre");
        getContentPane().add(Genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        Status.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setText("Status");
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        TitleBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        TitleBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleBarActionPerformed(evt);
            }
        });
        getContentPane().add(TitleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 219, 30));

        UserIDBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(UserIDBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 219, 30));

        StatusBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        StatusBar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unavailable", "Available" }));
        StatusBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusBarActionPerformed(evt);
            }
        });
        getContentPane().add(StatusBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 220, 30));

        GenreBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        GenreBar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Adventure", "Biography", "Children", "Contemporary Fiction", "Dystopian", "Fantasy", "Greek Mythology", "Historical Fiction", "History", "Horror", "LGBTQ+", "Literary Fiction", "Mystery", "New Adult", "Novel", "Romance", "Romance Novel", "Science Fiction", "Thriller & Suspense", "Tragedy", "True Crime", "Young Adult" }));
        getContentPane().add(GenreBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 220, 30));

        ManageBooksTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ManageBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Title", "Author", "Genre", "Status", "User ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageBooksTable.setRowHeight(30);
        jScrollPane1.setViewportView(ManageBooksTable);
        if (ManageBooksTable.getColumnModel().getColumnCount() > 0) {
            ManageBooksTable.getColumnModel().getColumn(0).setResizable(false);
            ManageBooksTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            ManageBooksTable.getColumnModel().getColumn(1).setResizable(false);
            ManageBooksTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            ManageBooksTable.getColumnModel().getColumn(2).setResizable(false);
            ManageBooksTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            ManageBooksTable.getColumnModel().getColumn(3).setResizable(false);
            ManageBooksTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            ManageBooksTable.getColumnModel().getColumn(4).setResizable(false);
            ManageBooksTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            ManageBooksTable.getColumnModel().getColumn(5).setResizable(false);
            ManageBooksTable.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 590, 370));

        BCreateButton.setBackground(new java.awt.Color(245, 245, 220));
        BCreateButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BCreateButton.setForeground(new java.awt.Color(139, 69, 19));
        BCreateButton.setText("Create");
        BCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCreateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BCreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        BUpdateButton.setBackground(new java.awt.Color(245, 245, 220));
        BUpdateButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BUpdateButton.setForeground(new java.awt.Color(139, 69, 19));
        BUpdateButton.setText("Update");
        BUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        BDeleteButton.setBackground(new java.awt.Color(245, 245, 220));
        BDeleteButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BDeleteButton.setForeground(new java.awt.Color(139, 69, 19));
        BDeleteButton.setText("Delete");
        BDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        LogoutButton.setBackground(new java.awt.Color(245, 245, 220));
        LogoutButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(139, 69, 19));
        LogoutButton.setText("Log Out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 130, 50));

        ExitButton.setBackground(new java.awt.Color(245, 245, 220));
        ExitButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(139, 69, 19));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 640, 100, 50));

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

        TitleSearchBook.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        TitleSearchBook.setForeground(new java.awt.Color(255, 255, 255));
        TitleSearchBook.setText("Search Book:");
        getContentPane().add(TitleSearchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        Reminder.setFont(new java.awt.Font("Mongolian Baiti", 2, 14)); // NOI18N
        Reminder.setForeground(new java.awt.Color(255, 255, 255));
        Reminder.setText("*search by book id");
        getContentPane().add(Reminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 180, -1));

        SearchBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 219, 30));

        BSearchButton.setBackground(new java.awt.Color(245, 245, 220));
        BSearchButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BSearchButton.setForeground(new java.awt.Color(139, 69, 19));
        BSearchButton.setText("Search");
        BSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, -1, -1));

        BLoadDataButton.setBackground(new java.awt.Color(245, 245, 220));
        BLoadDataButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BLoadDataButton.setForeground(new java.awt.Color(139, 69, 19));
        BLoadDataButton.setText("Load Data");
        BLoadDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoadDataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BLoadDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 500, -1, -1));

        BClearButton.setBackground(new java.awt.Color(245, 245, 220));
        BClearButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        BClearButton.setForeground(new java.awt.Color(139, 69, 19));
        BClearButton.setText("Clear");
        BClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        BUserID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        BUserID.setForeground(new java.awt.Color(255, 255, 255));
        BUserID.setText("User Id");
        getContentPane().add(BUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        AuthorBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(AuthorBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 219, 30));

        BBookID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        BBookID.setForeground(new java.awt.Color(255, 255, 255));
        BBookID.setText("Book Id");
        getContentPane().add(BBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        BookIdBar.setEditable(false);
        BookIdBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(BookIdBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 219, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/admin bg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TitleBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleBarActionPerformed

    private void StatusBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusBarActionPerformed

    private void BCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCreateButtonActionPerformed
        String t, a, g, s;
        Integer id = null;
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            if ("".equals(TitleBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Title is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(AuthorBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Author is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (GenreBar.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Genre is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (StatusBar.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Status is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                t = TitleBar.getText();
                a = AuthorBar.getText();
                g = (String) GenreBar.getSelectedItem();
                s = (String) StatusBar.getSelectedItem();
                String userIdText = UserIDBar.getText();
                if (!"".equals(userIdText)) {
                    id = Integer.valueOf(userIdText);
                }

                String query = "INSERT INTO BOOK_LIBRARY(BOOK_TITLE, BOOK_AUTHOR, BOOK_GENRE, BOOK_STATUS, USER_ID) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, t);
                pst.setString(2, a);
                pst.setString(3, g);
                pst.setString(4, s);
                if (id == null) {
                pst.setNull(5, java.sql.Types.INTEGER); 
                } else {
                    pst.setInt(5, id);
                }

                pst.executeUpdate();
                showMessageDialog(null, "Successfully created");
                loadData();
                con.close();
            }

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BCreateButtonActionPerformed

    private void BUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUpdateButtonActionPerformed
        String t, a, g, s;
        Integer id = null;
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            if ("".equals(TitleBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Title is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(AuthorBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Author is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (GenreBar.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Genre is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (StatusBar.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Status is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                t = TitleBar.getText();
                a = AuthorBar.getText();
                g = (String) GenreBar.getSelectedItem();
                s = (String) StatusBar.getSelectedItem();
                String userIdText = UserIDBar.getText();
                if (!"".equals(userIdText)) {
                    id = Integer.valueOf(userIdText);
                }

                String query = "UPDATE BOOK_LIBRARY SET BOOK_TITLE = ?, BOOK_AUTHOR = ?, BOOK_GENRE = ?, BOOK_STATUS = ?, USER_ID = ? WHERE BOOK_TITLE = ? OR BOOK_AUTHOR = ? OR BOOK_GENRE = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, t);
                pst.setString(2, a);
                pst.setString(3, g);
                pst.setString(4, s);
                if (id == null) {
                pst.setNull(5, java.sql.Types.INTEGER); 
                } else {
                    pst.setInt(5, id);
                }
                pst.setString(6, t);
                pst.setString(7, a);
                pst.setString(8, g);

                int rowsUpdated = pst.executeUpdate();
                if (rowsUpdated > 0) {
                    showMessageDialog(null, "Successfully updated.");
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "No book found with the provided criteria.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                loadData();
                con.close();
            }

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BUpdateButtonActionPerformed

    private void BDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteButtonActionPerformed
        String bid = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

                String t, a, g;
                String sql = "SELECT BOOK_ID FROM BOOK_LIBRARY WHERE BOOK_TITLE = ? AND BOOK_AUTHOR = ? AND BOOK_GENRE = ?";
                PreparedStatement st = con.prepareStatement(sql);
                t = TitleBar.getText();
                a = AuthorBar.getText();
                g = (String) GenreBar.getSelectedItem();
                st.setString(1, t);
                st.setString(2, a);
                st.setString(3, g);

                ResultSet rs = st.executeQuery();
                if (rs.next()) { 
                    bid = rs.getString("BOOK_ID");
                    BookIdBar.setText(bid);

                    if (bid != null) {
                        String query = "DELETE FROM BOOK_LIBRARY WHERE BOOK_ID = ?";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setString(1, bid);

                        int rowsAffected = pst.executeUpdate();

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(new JFrame(), "Book deleted successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                            TitleBar.setText("");
                            AuthorBar.setText("");
                            GenreBar.setSelectedItem(null);
                            StatusBar.setSelectedItem(null);
                            UserIDBar.setText("");
                            BookIdBar.setText("");
                        } else {
                            JOptionPane.showMessageDialog(new JFrame(), "Failed to delete book", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Book not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                con.close();

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BDeleteButtonActionPerformed

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

    private void BacktoDashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacktoDashButtonActionPerformed
        Admin_Dashboard adminDashFrame = new Admin_Dashboard();
        adminDashFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BacktoDashButtonActionPerformed

    private void BSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSearchButtonActionPerformed
        String searchText = SearchBar.getText().trim();
        int notFound = 0;

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Book ID is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            // Search for books matching the searchText in BOOK_ID
            String query = "SELECT BOOK_ID, BOOK_TITLE, BOOK_AUTHOR, BOOK_GENRE, BOOK_STATUS, USER_ID FROM BOOK_LIBRARY " +
                           "WHERE BOOK_ID LIKE ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "%" + searchText + "%");

            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = new DefaultTableModel(new String[]{"Book ID", "Title", "Author", "Genre", "Status", "User ID"}, 0);

            while (rs.next()) {
                String id = rs.getString("BOOK_ID");
                String t = rs.getString("BOOK_TITLE");
                String a = rs.getString("BOOK_AUTHOR");
                String g = rs.getString("BOOK_GENRE");
                String s = rs.getString("BOOK_STATUS");
                String uid = rs.getString("USER_ID");

                // Populate the table model with found books
                model.addRow(new Object[]{id, t, a, g, s, uid});
                notFound = 1;

                // Set details in UI components for the first found book
                if (notFound == 1) {
                    // Retrieve additional details like BOOK_ID based on title, author, genre
                    String bid = "";
                    String selectBookIdQuery = "SELECT BOOK_ID FROM BOOK_LIBRARY WHERE BOOK_TITLE = ? AND BOOK_AUTHOR = ? AND BOOK_GENRE = ?";
                    PreparedStatement st = con.prepareStatement(selectBookIdQuery);
                    st.setString(1, t);
                    st.setString(2, a);
                    st.setString(3, g);

                    ResultSet bookIdRs = st.executeQuery();
                    if (bookIdRs.next()) {
                        bid = bookIdRs.getString("BOOK_ID");
                    }

                    TitleBar.setText(t);
                    AuthorBar.setText(a);
                    GenreBar.setSelectedItem(g);
                    StatusBar.setSelectedItem(s);
                    UserIDBar.setText(uid);
                    BookIdBar.setText(bid);
                }
            }

            if (notFound == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "No book found matching the search criteria", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            ManageBooksTable.setModel(model);

            rs.close();
            pst.close();
            con.close();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BSearchButtonActionPerformed

    private void BLoadDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoadDataButtonActionPerformed
        try {
            loadData();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Admin_Book_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BLoadDataButtonActionPerformed

    private void BClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BClearButtonActionPerformed
        TitleBar.setText("");
        AuthorBar.setText("");
        GenreBar.setSelectedItem(null);
        StatusBar.setSelectedItem(null);
        UserIDBar.setText("");
        BookIdBar.setText("");
    }//GEN-LAST:event_BClearButtonActionPerformed
    
    public void loadData() throws SQLException {
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

            DefaultTableModel model = new DefaultTableModel(new String[]{"Book ID", "Title", "Author", "Genre", "Status", "User ID"}, 0);
            ManageBooksTable.setModel(model);

            String query = "SELECT BOOK_ID, BOOK_TITLE, BOOK_AUTHOR, BOOK_GENRE, BOOK_STATUS, USER_ID FROM BOOK_LIBRARY";
            rs = st.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("BOOK_ID");
                String t = rs.getString("BOOK_TITLE");
                String a = rs.getString("BOOK_AUTHOR");
                String g = rs.getString("BOOK_GENRE");
                String s = rs.getString("BOOK_STATUS");
                String uid = rs.getString("USER_ID");
                model.addRow(new Object[]{id, t, a, g, s, uid});
            }

        } catch (ClassNotFoundException | SQLException ex) {
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
            java.util.logging.Logger.getLogger(Admin_Book_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Book_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Book_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Book_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Admin_Book_Info x = new Admin_Book_Info();
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author;
    private javax.swing.JTextField AuthorBar;
    private javax.swing.JLabel BBookID;
    private javax.swing.JButton BClearButton;
    private javax.swing.JButton BCreateButton;
    private javax.swing.JButton BDeleteButton;
    private javax.swing.JButton BLoadDataButton;
    private javax.swing.JButton BSearchButton;
    private javax.swing.JButton BUpdateButton;
    private javax.swing.JLabel BUserID;
    private javax.swing.JLabel Background;
    private javax.swing.JButton BacktoDashButton;
    private javax.swing.JTextField BookIdBar;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Genre;
    private javax.swing.JComboBox<String> GenreBar;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTable ManageBooksTable;
    private javax.swing.JLabel Reminder;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JLabel Status;
    private javax.swing.JComboBox<String> StatusBar;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField TitleBar;
    private javax.swing.JLabel TitleManageBooks;
    private javax.swing.JLabel TitleSearchBook;
    private javax.swing.JTextField UserIDBar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
