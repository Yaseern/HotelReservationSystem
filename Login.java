package Final_ST2;





import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    Connection conn = new DBConnection().connect();
    commonFunctions validations = new commonFunctions();
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        Login_BUTTON = new javax.swing.JButton();
        User_name = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        LoginForm = new javax.swing.JLabel();
        ABOUT = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 102));
        jLabel4.setText("User Type     :");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 180, 150, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 102));
        jLabel1.setText("User Name   :");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 240, 150, 30);

        jLabel3.setBackground(new java.awt.Color(102, 255, 102));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hotel Reservation System");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 20, 420, 30);

        password.setPreferredSize(new java.awt.Dimension(150, 30));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(420, 290, 171, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 102));
        jLabel2.setText("Password     :");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 290, 150, 30);

        Login_BUTTON.setText("Login");
        Login_BUTTON.setPreferredSize(new java.awt.Dimension(150, 30));
        Login_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_BUTTONActionPerformed(evt);
            }
        });
        jPanel1.add(Login_BUTTON);
        Login_BUTTON.setBounds(320, 350, 96, 30);

        User_name.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(User_name);
        User_name.setBounds(420, 240, 171, 30);

        Exit.setText("Cancel");
        Exit.setPreferredSize(new java.awt.Dimension(150, 30));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(450, 350, 104, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Admin", "Receptionist" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(420, 180, 171, 30);

        LoginForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final_ST2/images/loginForm.png"))); // NOI18N
        LoginForm.setText("jLabel6");
        jPanel1.add(LoginForm);
        LoginForm.setBounds(210, 170, 430, 220);

        ABOUT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ABOUT.setText("About");
        ABOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABOUTActionPerformed(evt);
            }
        });
        jPanel1.add(ABOUT);
        ABOUT.setBounds(400, 530, 73, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final_ST2/images/login.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 850, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_BUTTONActionPerformed
       
        String sql = "SELECT * FROM Employee";
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            String user = validations.getTextValue(User_name);
            String pwd = validations.getPasswordValue(password);
            String userType = validations.getJComboBoxValue(jComboBox1);
            
             if(user.equalsIgnoreCase("")|| pwd.equalsIgnoreCase("")){
                 validations.EmptyForm();
             }
            
           
            else{
                    int tmp = 0;   
                    
                    while(rs.next()){

                        String uname = rs.getString("username");
                        String password = rs.getString("password");                
                        String uType = rs.getString("designation");

                        if((user.equals(uname)) && (pwd.equals(password)) ){

                                if(uType.equals("Manager")){
                                    new MainMenu_for_Manager().setVisible(true);
                                    dispose();

                                }
                                else if(uType.equals("Admin")) {
                                    new MainMenu_for_Admin().setVisible(true);
                                    dispose();

                                }
                                else if(uType.equals("Receptionist")) {
                                    new MainMenu_for_Receptionist().setVisible(true);
                                    dispose();
                                }
                             tmp++;    
                            }

                        }
                    
                    if(tmp ==0){
                            JOptionPane.showMessageDialog(null, "UserName or Password is incorrect!");
                    }
                }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       
    }//GEN-LAST:event_Login_BUTTONActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void ABOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABOUTActionPerformed
          JOptionPane.showMessageDialog(null, "DONE BY\nSLIIT Metropolitan Campus\nWEEKEND BATCH Students\n..........................\nNithushan_Francis      IT15138750\nYasir_Munas     IT15097248\nAhnaf_Siraj\nRaashid_Ahamed");
    }//GEN-LAST:event_ABOUTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABOUT;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel LoginForm;
    private javax.swing.JButton Login_BUTTON;
    private javax.swing.JTextField User_name;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
