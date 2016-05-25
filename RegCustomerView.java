package Final_ST2;




import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegCustomerView extends javax.swing.JFrame {
    java.sql.Connection conn = new DBConnection().connect();
    commonFunctions validations = new commonFunctions();

    /**
     * Creates new form RegCustomer
     */
    public RegCustomerView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        custIDField = new javax.swing.JTextField();
        civilStatusField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        fnameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        genderBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NICField = new javax.swing.JTextField();
        SUBMIT = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(742, 530));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Registration Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(238, 11, 267, 24);

        BackBtn.setText("Back");
        BackBtn.setPreferredSize(new java.awt.Dimension(100, 30));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn);
        BackBtn.setBounds(461, 922, 100, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("Customer ID :");
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 103, 100, 30);

        custIDField.setBackground(new java.awt.Color(204, 204, 255));
        custIDField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(custIDField);
        custIDField.setBounds(165, 104, 150, 30);

        civilStatusField.setBackground(new java.awt.Color(204, 204, 255));
        civilStatusField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(civilStatusField);
        civilStatusField.setBounds(165, 340, 150, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Email :");
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(388, 339, 100, 30);

        addressField.setBackground(new java.awt.Color(204, 204, 255));
        addressField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(addressField);
        addressField.setBounds(522, 104, 150, 30);

        fnameField.setBackground(new java.awt.Color(204, 204, 255));
        fnameField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(fnameField);
        fnameField.setBounds(165, 165, 150, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Phone :");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(388, 283, 100, 30);

        lnameField.setBackground(new java.awt.Color(204, 204, 255));
        lnameField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(lnameField);
        lnameField.setBounds(165, 225, 150, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Gender :");
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 398, 100, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("First Name : ");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 164, 100, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Civil Status :");
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 339, 100, 30);

        ageField.setBackground(new java.awt.Color(204, 204, 255));
        ageField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(ageField);
        ageField.setBounds(165, 284, 150, 30);

        cityField.setBackground(new java.awt.Color(204, 204, 255));
        cityField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(cityField);
        cityField.setBounds(522, 165, 150, 30);

        genderBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        genderBox.setSelectedIndex(-1);
        genderBox.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(genderBox);
        genderBox.setBounds(165, 399, 150, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Address :");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(388, 103, 100, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Last Name : ");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 224, 100, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("City :");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(388, 164, 100, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("Age :");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 283, 100, 30);

        phoneField.setBackground(new java.awt.Color(204, 204, 255));
        phoneField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(phoneField);
        phoneField.setBounds(522, 284, 150, 30);

        emailField.setBackground(new java.awt.Color(204, 204, 255));
        emailField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(emailField);
        emailField.setBounds(522, 340, 150, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("NIC");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(388, 224, 100, 30);

        NICField.setBackground(new java.awt.Color(204, 204, 255));
        NICField.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(NICField);
        NICField.setBounds(522, 225, 150, 30);

        SUBMIT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SUBMIT.setText("SUMBIT");
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });
        jPanel1.add(SUBMIT);
        SUBMIT.setBounds(609, 480, 100, 23);

        Back_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back_Button.setText("BACK");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_Button);
        Back_Button.setBounds(480, 480, 100, 23);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Final_ST2/images/CustomerDetailss.png"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(-8, 0, 760, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed
        
        String GENDER = validations.getJComboBoxValue(genderBox);

        if("".equals(custIDField.getText()) ||"".equals(fnameField.getText()) ||"".equals(lnameField.getText()) ||"".equals(ageField.getText()) ||"".equals(addressField.getText()) ||"".equals(genderBox.getSelectedItem()) ||"".equals(phoneField.getText()) ||"".equals(emailField.getText()) ){
        
                validations.EmptyForm();
        }
        
        else{
            PreparedStatement ps = null; 
            try{
            Statement stm = conn.createStatement();
            String sql;
            sql = "INSERT INTO Customer VALUES ('" + custIDField.getText() + "','" + fnameField.getText() + "','" + lnameField.getText() + "','" + ageField.getText()+ "','" +civilStatusField.getText()  + "','" + genderBox.getSelectedItem() + "','" + addressField.getText() + "','" + cityField.getText() + "','" + NICField.getText() + "','" + phoneField.getText() + "','" + emailField.getText() + "')";
            stm.executeUpdate(sql);
            
            
            JOptionPane.showMessageDialog(null, "Customer Registered Successfully...!");   
            }

            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }
        
        }
    }//GEN-LAST:event_SUBMITActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
      dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegCustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel Background;
    private javax.swing.JTextField NICField;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField civilStatusField;
    private javax.swing.JTextField custIDField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fnameField;
    private javax.swing.JComboBox genderBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lnameField;
    private javax.swing.JTextField phoneField;
    // End of variables declaration//GEN-END:variables
}
