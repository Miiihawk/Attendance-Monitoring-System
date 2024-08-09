
package oopfinals;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class Admin_User_Info extends javax.swing.JFrame {

    public Admin_User_Info() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoutButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageUsersTable = new javax.swing.JTable();
        Reminder = new javax.swing.JLabel();
        UCreateButton = new javax.swing.JButton();
        UUpdateButton = new javax.swing.JButton();
        UDeleteButton = new javax.swing.JButton();
        UserLN = new javax.swing.JLabel();
        UserFN = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        PasswordBar = new javax.swing.JPasswordField();
        EmailBar = new javax.swing.JTextField();
        LastNameBar = new javax.swing.JTextField();
        FirstNameBar = new javax.swing.JTextField();
        BacktoDashButton = new javax.swing.JButton();
        USearchButton = new javax.swing.JButton();
        TitleManageUsers = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        TitleSearchUser = new javax.swing.JLabel();
        ULoadDataButton = new javax.swing.JButton();
        UClearButton = new javax.swing.JButton();
        UUserID = new javax.swing.JLabel();
        UserIDBar = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        ManageUsersTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ManageUsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User ID", "First Name", "Last Name", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageUsersTable.setRowHeight(30);
        ManageUsersTable.getTableHeader().setResizingAllowed(false);
        ManageUsersTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ManageUsersTable);
        if (ManageUsersTable.getColumnModel().getColumnCount() > 0) {
            ManageUsersTable.getColumnModel().getColumn(0).setResizable(false);
            ManageUsersTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            ManageUsersTable.getColumnModel().getColumn(1).setResizable(false);
            ManageUsersTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            ManageUsersTable.getColumnModel().getColumn(2).setResizable(false);
            ManageUsersTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            ManageUsersTable.getColumnModel().getColumn(3).setResizable(false);
            ManageUsersTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 590, 370));

        Reminder.setFont(new java.awt.Font("Mongolian Baiti", 2, 14)); // NOI18N
        Reminder.setForeground(new java.awt.Color(255, 255, 255));
        Reminder.setText("*search by user id");
        getContentPane().add(Reminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 180, -1));

        UCreateButton.setBackground(new java.awt.Color(245, 245, 220));
        UCreateButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        UCreateButton.setForeground(new java.awt.Color(139, 69, 19));
        UCreateButton.setText("Create");
        UCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UCreateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UCreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        UUpdateButton.setBackground(new java.awt.Color(245, 245, 220));
        UUpdateButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        UUpdateButton.setForeground(new java.awt.Color(139, 69, 19));
        UUpdateButton.setText("Update");
        UUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UUpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        UDeleteButton.setBackground(new java.awt.Color(245, 245, 220));
        UDeleteButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        UDeleteButton.setForeground(new java.awt.Color(139, 69, 19));
        UDeleteButton.setText("Delete");
        UDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UDeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        UserLN.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        UserLN.setForeground(new java.awt.Color(255, 255, 255));
        UserLN.setText("Last Name");
        getContentPane().add(UserLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        UserFN.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        UserFN.setForeground(new java.awt.Color(255, 255, 255));
        UserFN.setText("First Name");
        getContentPane().add(UserFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        Email.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        Password.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        PasswordBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(PasswordBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 219, 30));

        EmailBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(EmailBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 219, 30));

        LastNameBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(LastNameBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 219, 30));

        FirstNameBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        FirstNameBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameBarActionPerformed(evt);
            }
        });
        getContentPane().add(FirstNameBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 219, 30));

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

        USearchButton.setBackground(new java.awt.Color(245, 245, 220));
        USearchButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        USearchButton.setForeground(new java.awt.Color(139, 69, 19));
        USearchButton.setText("Search");
        USearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(USearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, -1, -1));

        TitleManageUsers.setFont(new java.awt.Font("Mongolian Baiti", 1, 48)); // NOI18N
        TitleManageUsers.setForeground(new java.awt.Color(255, 255, 255));
        TitleManageUsers.setText("Manage Users");
        getContentPane().add(TitleManageUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        SearchBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 219, 30));

        TitleSearchUser.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        TitleSearchUser.setForeground(new java.awt.Color(255, 255, 255));
        TitleSearchUser.setText("Search User:");
        getContentPane().add(TitleSearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        ULoadDataButton.setBackground(new java.awt.Color(245, 245, 220));
        ULoadDataButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        ULoadDataButton.setForeground(new java.awt.Color(139, 69, 19));
        ULoadDataButton.setText("Load Data");
        ULoadDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULoadDataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ULoadDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 500, -1, -1));

        UClearButton.setBackground(new java.awt.Color(245, 245, 220));
        UClearButton.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        UClearButton.setForeground(new java.awt.Color(139, 69, 19));
        UClearButton.setText("Clear");
        UClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        UUserID.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        UUserID.setForeground(new java.awt.Color(255, 255, 255));
        UUserID.setText("User Id");
        getContentPane().add(UUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        UserIDBar.setEditable(false);
        UserIDBar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        getContentPane().add(UserIDBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 219, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopfinals/admin bg.png"))); // NOI18N
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

    private void UCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UCreateButtonActionPerformed
        String fn, ln, em, ps;
    
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
                fn = FirstNameBar.getText();
                ln = LastNameBar.getText();
                em = EmailBar.getText();
                ps = PasswordBar.getText();

                String query = "INSERT INTO users(USER_FIRST_NAME, USER_LAST_NAME, EMAIL, PASSWORD) VALUES (?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, fn);
                pst.setString(2, ln);
                pst.setString(3, em);
                pst.setString(4, ps);

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
    }//GEN-LAST:event_UCreateButtonActionPerformed

    private void UUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UUpdateButtonActionPerformed
        String fn, ln, em, ps;

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
                fn = FirstNameBar.getText();
                ln = LastNameBar.getText();
                em = EmailBar.getText();
                ps = PasswordBar.getText();

                String checkEmailQuery = "SELECT COUNT(*) FROM users WHERE EMAIL = ? AND (USER_FIRST_NAME != ? OR USER_LAST_NAME != ?)";
                PreparedStatement checkEmailStmt = con.prepareStatement(checkEmailQuery);
                checkEmailStmt.setString(1, em);
                checkEmailStmt.setString(2, fn);
                checkEmailStmt.setString(3, ln);
                ResultSet rs = checkEmailStmt.executeQuery();
                rs.next();
                int emailCount = rs.getInt(1);

                if (emailCount > 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Email already in use by another user.", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    String query = "UPDATE users SET USER_FIRST_NAME = ?, USER_LAST_NAME = ?, PASSWORD = ?, EMAIL = ? WHERE EMAIL = ? OR USER_FIRST_NAME = ? OR USER_LAST_NAME = ?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, fn);
                    pst.setString(2, ln);
                    pst.setString(3, ps);
                    pst.setString(4, em);
                    pst.setString(5, em);
                    pst.setString(6, fn);
                    pst.setString(7, ln);

                    int rowsUpdated = pst.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, "Successfully updated.");
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "No user found with the provided criteria.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                    loadData();
                }
                con.close();
            }

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error: " + e.getMessage());
        }
    }//GEN-LAST:event_UUpdateButtonActionPerformed

    private void UDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UDeleteButtonActionPerformed
        String em;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            if ("".equals(EmailBar.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                em = EmailBar.getText();

                String sql = "SELECT USER_ID FROM USERS WHERE EMAIL = ?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, em);

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    String uid = rs.getString("USER_ID");

                    String deleteQuery = "DELETE FROM users WHERE USER_ID = ?";
                    PreparedStatement pst = con.prepareStatement(deleteQuery);
                    pst.setString(1, uid);

                    int rowsAffected = pst.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "User deleted successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                        FirstNameBar.setText("");
                        LastNameBar.setText("");
                        EmailBar.setText("");
                        PasswordBar.setText("");
                        UserIDBar.setText("");
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "No user found with the given email address", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "No user found with the given email address", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                rs.close();
                st.close();
                con.close();
            }

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error: " + e.getMessage());
        }
    }//GEN-LAST:event_UDeleteButtonActionPerformed

    private void FirstNameBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameBarActionPerformed

    private void BacktoDashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacktoDashButtonActionPerformed
        Admin_Dashboard adminDashFrame = new Admin_Dashboard();
        adminDashFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BacktoDashButtonActionPerformed

    private void USearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USearchButtonActionPerformed
        String searchText = SearchBar.getText().trim();
        int notFound = 0;

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "First Name, Last Name, Email or User ID is required", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/finalsoop";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url, user, pass);

            String query = "SELECT USER_ID, USER_FIRST_NAME, USER_LAST_NAME, EMAIL, PASSWORD FROM USERS " +
                           "WHERE USER_ID LIKE ?";
            pst = con.prepareStatement(query);
            pst.setString(1, "%" + searchText + "%");

            rs = pst.executeQuery();

            DefaultTableModel model = new DefaultTableModel(new String[]{"User ID", "First Name", "Last Name", "Email"}, 0);
            ManageUsersTable.setModel(model);

            while (rs.next()) {
                String id = rs.getString("USER_ID");
                String fn = rs.getString("USER_FIRST_NAME");
                String ln = rs.getString("USER_LAST_NAME");
                String em = rs.getString("EMAIL");
                String ps = rs.getString("PASSWORD");

                model.addRow(new Object[]{id, fn, ln, em});
                notFound = 1;

                FirstNameBar.setText(fn);
                LastNameBar.setText(ln);
                EmailBar.setText(em);
                PasswordBar.setText(ps);

                String sql = "SELECT USER_ID FROM USERS WHERE EMAIL = ?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, em);

                ResultSet uidRs = st.executeQuery();
                if (uidRs.next()) {
                    String uid = uidRs.getString("USER_ID");
                    UserIDBar.setText(uid);
                }

                st.close();
            }

            if (notFound == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "No user found matching the search criteria", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_USearchButtonActionPerformed

    private void ULoadDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULoadDataButtonActionPerformed
        try {
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(Admin_User_Info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ULoadDataButtonActionPerformed

    private void UClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UClearButtonActionPerformed
        FirstNameBar.setText("");
        LastNameBar.setText("");
        EmailBar.setText("");
        PasswordBar.setText("");
        UserIDBar.setText("");
    }//GEN-LAST:event_UClearButtonActionPerformed
    
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

            DefaultTableModel model = new DefaultTableModel(new String[]{"User ID", "First Name", "Last Name", "Email"}, 0);
            ManageUsersTable.setModel(model);

            String query = "SELECT USER_ID, USER_FIRST_NAME, USER_LAST_NAME, EMAIL FROM USERS";
            rs = st.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("USER_ID");
                String fn = rs.getString("USER_FIRST_NAME");
                String ln = rs.getString("USER_LAST_NAME");
                String em = rs.getString("EMAIL");
                model.addRow(new Object[]{id, fn, ln, em});
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
            java.util.logging.Logger.getLogger(Admin_User_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_User_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_User_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_User_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Admin_User_Info x = new Admin_User_Info();
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BacktoDashButton;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailBar;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FirstNameBar;
    private javax.swing.JTextField LastNameBar;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTable ManageUsersTable;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordBar;
    private javax.swing.JLabel Reminder;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JLabel TitleManageUsers;
    private javax.swing.JLabel TitleSearchUser;
    private javax.swing.JButton UClearButton;
    private javax.swing.JButton UCreateButton;
    private javax.swing.JButton UDeleteButton;
    private javax.swing.JButton ULoadDataButton;
    private javax.swing.JButton USearchButton;
    private javax.swing.JButton UUpdateButton;
    private javax.swing.JLabel UUserID;
    private javax.swing.JLabel UserFN;
    private javax.swing.JTextField UserIDBar;
    private javax.swing.JLabel UserLN;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
