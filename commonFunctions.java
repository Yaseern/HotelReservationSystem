/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_ST2;


import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author it15138750
 */
public class commonFunctions {
     Connection conn = new DBConnection().connect();
     
    public String getTextValue(JTextField dataField){
        JTextField data = dataField;
        String value=dataField.getText().trim();
        return value;
    }
    public String getlabelValue(JLabel dataField){
        JLabel data = dataField;
        String value=dataField.getText().trim();
        return value;
    }
    public String getPasswordValue(JPasswordField dataField){
        JPasswordField data = dataField;
        String pwd = new String (data.getPassword());
        return pwd;
    }
    
    public String getJComboBoxValue(JComboBox dataField){
        String value;
        if(isJComboBoxEmpty(dataField)){
            value="N/A";
        }
        else{
            value = dataField.getSelectedItem().toString();
            
        }
        return value;
    }
    
    public int getTextToIntValue(JTextField dataField){
        String val = getTextValue(dataField);
        int data = Integer.parseInt(val);
        return data;
    }
    
    public String getdate(JDateChooser givendate){
        SimpleDateFormat SimpleFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String StringDate = SimpleFormat.format(givendate.getDate());
        return StringDate;
    }
    
    
    public boolean isDateEmpty(JDateChooser dataField){
        boolean ans = false;
        if(dataField == null){
              return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty(String value){
        boolean ans= false;
        if(value.equals("")){
              return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isJTextFieldEmpty(JTextField value){
        boolean ans= false;
        if(value.equals("")){
              return true;
        }
        else {
            return false;
        }
    }
    public boolean isJComboBoxEmpty(JComboBox value){
        boolean ans= false;
        if(value.getSelectedIndex() == -1){
              return true;
        }
        else {
            return false;
        }
    }
    
    
    public void EmptyForm(){
        JOptionPane.showMessageDialog(null," One Or more Fields Enpty");
    }
    public void fieldsDoNotMatch(String f1,String f2){
        JOptionPane.showMessageDialog(null," Fields "+f1+" "+f2+" do not match. try again");
    }
    public void setTextNull(JTextField dataField){
        dataField.setText(null);
        
    }
    public void setJComboBoxNull(JComboBox dataField){
        dataField.setSelectedIndex(0);        
    }
    public void setlabelNull(JLabel dataField){
        dataField.setText("N/A");
        
    }
    
    final void FillJboxList(JComboBox dataField,String query){
        dataField.removeAllItems();
        try{
               Statement stmt = conn.createStatement();
               
               ResultSet rs = stmt.executeQuery(query);

               while(rs.next()){
                 dataField.addItem(rs.getString(1));
               }
           }
           catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    public ResultSet getResultSet(String querry){
        ResultSet result = null;
        try {
            Statement stat = conn.createStatement();
            result = stat.executeQuery(querry);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    
    public java.util.Date getDatevalue(String date){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d = null;
        try {
            d = df.parse(date);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return d;
    }
    public int daysBetween(java.util.Date d1, java.util.Date d2)
   {
       int numberOfDays = (int) (d1.getTime() - d2.getTime())/(1000*60*60*24);
      return numberOfDays;
   }
    
        
    
    
    
 


    
    
    
    
    
        
}
