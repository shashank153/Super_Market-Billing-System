/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familymart_new;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SHASHANK K SHUKLA
 */
public class ADD_COSTMER extends javax.swing.JFrame {
     String GENDER;
    /**
     * Creates new form ADD_COSTMER
     */
    public ADD_COSTMER() {
        initComponents();
        show_user();
    }
    public ArrayList<user> userList(){
ArrayList<user>usersList=new ArrayList<>();
try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL="jdbc:mysql://localhost:3306/super_market?useTimezone=true&serverTimezone=UTC";
    Connection con;
    con = (Connection) DriverManager.getConnection(databaseURL,"root","");
        
        String query1="SELECT * FROM add_costmer";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query1);
        user user;
        while(rs.next()){
            user=new user(rs.getInt("ID"),rs.getString("FIRST_NAME"),rs.getString("LAST_NAME"),rs.getString("GENDER"),rs.getInt("AGE"),rs.getString("ADDRESS"),rs.getString("CONTACT_NO"));
            usersList.add(user);
        }
        
        }
catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
return usersList;
    }
    private void show_user(){
    ArrayList<user> list = userList();
    DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
    Object[] row = new Object[7];
    for(int i=0;i<list.size();i++){
    row[0]=list.get(i).getID();
    row[1]=list.get(i).getFIRST_NAME();
    row[2]=list.get(i).getLAST_NAME();
    row[3]=list.get(i).getGENDER();
    row[4]=list.get(i).getAGE();
    row[5]=list.get(i).getADDRESS();
    row[6]=list.get(i).getCONTACT_NO();
    model.addRow(row);
}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 97, 86));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("ADD /UPDATE COSTMER DETAILS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("        MALE");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("     FEMALE");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("NOT SPECIFIED");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("AGE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Contact No");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart_new/Male-user-add-icon.png"))); // NOI18N
        jButton1.setText("ADD ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart_new/Go-back-icon.png"))); // NOI18N
        jButton2.setText("DASHBOARD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 204, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart_new/cross-2-icon.png"))); // NOI18N
        jButton3.setText("REMOVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "First Name", "Last Name", "Gender", "Age", "Address", "Contact No"
            }
        ));
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 51, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart_new/Refresh-icon (1).png"))); // NOI18N
        jButton4.setText(" UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/familymart_new/Clear-icon.png"))); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton5)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 255, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con;
        PreparedStatement pst;
        Statement st;
        String FIRST_NAME=jTextField1.getText();
        String LAST_NAME=jTextField2.getText();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL="jdbc:mysql://localhost:3306/super_market?useTimezone=true&serverTimezone=UTC";
            con=(Connection) DriverManager.getConnection(databaseURL,"root","");
            String query="DELETE FROM `add_costmer`(`FIRST_NAME`,`LAST_NAME`) VALUES (?,?)";
            JOptionPane.showMessageDialog(null,"Deleted");
            pst=con.prepareStatement(query);
            pst.setString(1, FIRST_NAME);
            pst.setString(2, LAST_NAME);

            pst.execute();

        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ADD_COSTMER.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EXECUTIVE_dashboard E=new EXECUTIVE_dashboard();
        E.setVisible(true);
        E.setLocationRelativeTo(null);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con;
        PreparedStatement pst;
        Statement st;
        //ResultSet rs;
        String FIRST_NAME=jTextField1.getText();
        String LAST_NAME=jTextField2.getText();
        String AGE=jTextField3.getText();
        String ADDRESS=jTextField4.getText();
        String CONTACT_NO=jTextField5.getText();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL="jdbc:mysql://localhost:3306/super_market?useTimezone=true&serverTimezone=UTC";
            con=(Connection) DriverManager.getConnection(databaseURL,"root","");
            //String query="insert into newuser('"firstName"','"lastName"','"userId"','"Arrays.toString(password)"','"email"')" ;
            
            String query="insert into`add_costmer`(`FIRST_NAME`, `LAST_NAME`, `GENDER`, `AGE`, `ADDRESS`, `CONTACT_NO`) VALUES (?,?,?,?,?,?)";
            //JOptionPane.showMessageDialog(null,"New Costmer Added");
            //st=con.prepareStatement(query);
            //st=con.createStatement();
            // rs=st.executeQuery(query);
            //  System.out.print(x);
            // int x=st.executeUpdate(query);
            pst=con.prepareStatement(query);
            pst.setString(1, FIRST_NAME);
            pst.setString(2, LAST_NAME);
            if(jRadioButton1.isSelected()){
                GENDER="Male";   
            }
             if(jRadioButton2.isSelected()){
                GENDER="Female";   
            }
              if(jRadioButton3.isSelected()){
                GENDER="Not Specified";   
            }
              pst.setString(3, GENDER);
            pst.setString(4, AGE);

            pst.setString(5, ADDRESS);
            pst.setString(6, CONTACT_NO);
           pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
           model.setRowCount(0);
           show_user();
            /*createAccount ca=new createAccount();
            ca.setVisible(false);*/
           JOptionPane.showMessageDialog(null,"Inserted Sucessfully");

           
            /*createAccount ca=new createAccount();
            ca.setVisible(false);*/
           
            
            
            /* BILLING B=new BILLING();
            B.setLocationRelativeTo(null);
            B.setVisible(true);
            this.dispose();*/

        }

        catch(ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(null, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        jTextField1.setText(model.getValueAt(i,1).toString());
        jTextField2.setText(model.getValueAt(i,2).toString());
        String GENDER = model.getValueAt(i,3).toString();
          if(GENDER.equals("Male")){
              jRadioButton1.setSelected(true);
              }
          if(GENDER.equals("Female")){
              jRadioButton2.setSelected(true);
              }
          if(GENDER.equals("Not Specified"))
          {
              jRadioButton2.setSelected(true);
          } else {
          }
        jTextField3.setText(model.getValueAt(i,4).toString());
         jTextField4.setText(model.getValueAt(i,5).toString());
         jTextField5.setText(model.getValueAt(i,6).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL="jdbc:mysql://localhost:3306/super_market?useTimezone=true&serverTimezone=UTC";
            Connection con = (Connection) DriverManager.getConnection(databaseURL,"root","");
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            String query="UPDATE add_costmer SET FIRST_NAME=?,LAST_NAME=?,GENDER=?,AGE=?,ADDRESS=?,CONTACT_NO=? where ID="+value;
              PreparedStatement pst;
        //Statement st;
        //ResultSet rs;    
            pst=con.prepareStatement(query);
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());
            if(jRadioButton1.isSelected()){
                GENDER="Male";   
            }
             if(jRadioButton2.isSelected()){
                GENDER="Female";   
            }
              if(jRadioButton3.isSelected()){
                GENDER="Not Specified";   
            }
              pst.setString(3, GENDER);
            pst.setString(4, jTextField3.getText());

            pst.setString(5, jTextField4.getText());
            pst.setString(6, jTextField5.getText());
           pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
           model.setRowCount(0);
           show_user();
            JOptionPane.showMessageDialog(null,"Updated Sucessfully");

        }

        catch(ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      jTextField1.setText("");
      jTextField2.setText("");
      jRadioButton1.setSelected(false);
      jRadioButton2.setSelected(false);
      jRadioButton3.setSelected(false);
      jTextField3.setText("");
       jTextField4.setText("");
        jTextField5.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ADD_COSTMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_COSTMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_COSTMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_COSTMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_COSTMER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
