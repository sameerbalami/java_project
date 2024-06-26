/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modify_EMP;

import Dashboard.Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Modify extends javax.swing.JFrame {

    /**
     * Creates new form Modify
     */
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs = null;
        
    public Modify() {
        initComponents();
        connect();
    }
    
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeesystem_db", "root","");
            pstmt = conn.prepareStatement("SELECT * FROM employeedata_tb");
            rs = pstmt.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int n = rsmd.getColumnCount();
            
            DefaultTableModel dtm =(DefaultTableModel) tableofemp1.getModel();
            dtm.setRowCount(0);
            while(rs.next()){
                Vector v = new Vector();
                for(int i = 1; i<=n; i++){
//                v.add(rs.getString("Emp_id"));
//                v.add(rs.getString("Name"));
//                v.add(rs.getString("Email"));
//                v.add(rs.getString("Department"));
//                v.add(rs.getString("Gender"));
//                v.add(rs.getString("FathersName"));
//                v.add(rs.getString("Salary"));
//                v.add(rs.getString("MobileNum"));
//                v.add(rs.getString("Paddress"));
//                v.add(rs.getString("Dob")); 
//                v.add(rs.getString("Taddress"));
//                v.add(rs.getString("DOJ"));
                    v.add(rs.getString(i));
                
                }
                    dtm.addRow(v);
                }
            
        } catch (Exception e) {
            System.out.println("error--->"+e.getMessage());
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        emp_idtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Name_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mobile_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Fathers_txt = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        modifybtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Salary_txt = new javax.swing.JTextField();
        departmentcom = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Email_txt = new javax.swing.JTextField();
        Paddress_txt = new javax.swing.JTextField();
        Taddress_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dobtxt = new com.toedter.calendar.JDateChooser();
        dojtxt = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableofemp1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 228, 230));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Modify");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-button.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(395, 395, 395))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(218, 228, 230));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Emp_id");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Full Name");

        Name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_txtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Mobile");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Permanent Address");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        male.setText("Male");

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        female.setText("Female");

        buttonGroup1.add(other);
        other.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        other.setText("Other");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Gender");

        modifybtn.setText("Modify");
        modifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifybtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Salary");

        departmentcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Salesman", "It Officer", "Accountant", "Manager" }));
        departmentcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentcomActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Email_ID");

        Email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_txtActionPerformed(evt);
            }
        });

        Paddress_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Paddress_txtActionPerformed(evt);
            }
        });

        Taddress_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Taddress_txtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Temporary Address");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Department");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Fathers Name");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Date of Birth");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Date of Joining");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tableofemp1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Emp-id", "Name", "Email", "Department", "Gender", "Fathername", "Salary", "Mobile", "Paddress", "DOB", "Taddress", "DOJ"
            }
        ));
        tableofemp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableofemp1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableofemp1);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Salary_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(emp_idtxt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(mobile_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(female)
                            .addComponent(male)
                            .addComponent(other))))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addGap(16, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Paddress_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Taddress_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(departmentcom, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dojtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(51, 51, 51)
                                        .addComponent(Email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(Fathers_txt)
                        .addGap(8, 8, 8))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(modifybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emp_idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(Name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Salary_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Paddress_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(departmentcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 47, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobile_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Taddress_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(Fathers_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dojtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(male)
                                .addComponent(jLabel14))
                            .addComponent(jLabel15))
                        .addGap(23, 23, 23)
                        .addComponent(female)
                        .addGap(18, 18, 18)
                        .addComponent(other)))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifybtn)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void modifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifybtnActionPerformed
        // TODO add your handling code here:

        try {
            DefaultTableModel tableModel = (DefaultTableModel) tableofemp1.getModel();
            int selectedRow = tableofemp1.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to update.");
                return;
            }
            String emp_id = tableModel.getValueAt(selectedRow, 0).toString();
            String name = Name_txt.getText();
            String email = Email_txt.getText();
            String department = departmentcom.getSelectedItem().toString();
            String gender = male.isSelected()? "Male" : (female.isSelected()?"Female":"Other");
            String fathersname = Fathers_txt.getText();
            String salary=Salary_txt.getText();
            String mobile = mobile_txt.getText();
            String paddress = Paddress_txt.getText();
            String dob = dobtxt.getDate().toString();
            String taddress = Taddress_txt.getText();
            String doj= dojtxt.getDate().toString();
            
           

            

            pstmt = conn.prepareStatement("UPDATE employeedata_tb SET Name=?,Email=?,Department=?,Gender=?,FathersName=?,Salary=?,MobileNum=?,Paddress=?,Dob=?,Taddress=?,DOJ=? WHERE Emp_id=?");

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, department);
            pstmt.setString(4, gender);
            pstmt.setString(5, fathersname);
            pstmt.setString(6, salary);
            pstmt.setString(7, mobile);
            pstmt.setString(8, paddress);
            pstmt.setString(9, dob);
            pstmt.setString(10, taddress);
            pstmt.setString(11, doj);
            pstmt.setString(12, emp_id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User Detail is updated");
                connect();
//                emp_idtxt.setText("");
//                Name_txt.setText("");
//                Email_txt.setText("");
//                Salary_txt.setText("");
//                Paddress_txt.setText("");
//                departmentcom.setSelectedItem(null); 
//                mobile_txt.setText("");
//                Taddress_txt.setText("");
//                Fathers_txt.setText("");
//                dobtxt.setDate(null);
//                dojtxt.setDate(null);
                
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update user detail");
            }
            
            
//            Name_txt.setText("");
//            Email_txt.setText("");
//            Salary_txt.setText("");
//            departmentcom.setSelectedItem(null); 
//            Fathers_txt.setText("");
//            mobile_txt.setText("");
//            Paddress_txt.setText("");
//            
//            buttonGroup1.clearSelection();
//            other.setText("");
//            Taddress_txt.setText("");
//            dobtxt.setDate(null);
//            dobtxt.setDate(null);
//            
//            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
        }
    }//GEN-LAST:event_modifybtnActionPerformed

    private void Name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_txtActionPerformed

    private void Email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_txtActionPerformed

    private void Paddress_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Paddress_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Paddress_txtActionPerformed

    private void Taddress_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Taddress_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Taddress_txtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Admin Db= new Admin();
        Db.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void departmentcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentcomActionPerformed

    private void tableofemp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableofemp1MouseClicked
        // TODO add your handling code here:
                DefaultTableModel tableModel = (DefaultTableModel) tableofemp1.getModel();

        String emp_id= tableModel.getValueAt(tableofemp1.getSelectedRow(),0).toString();
        String name = tableModel.getValueAt(tableofemp1.getSelectedRow(),1).toString();
        String email = tableModel.getValueAt(tableofemp1.getSelectedRow(),2).toString();
        String department = tableModel.getValueAt(tableofemp1.getSelectedRow(),3).toString();
        String gender = tableModel.getValueAt(tableofemp1.getSelectedRow(),4).toString();
        String fathersname= tableModel.getValueAt(tableofemp1.getSelectedRow(),5).toString();
        String salary = tableModel.getValueAt(tableofemp1.getSelectedRow(),6).toString();
        String mobile = tableModel.getValueAt(tableofemp1.getSelectedRow(),7).toString();
        String paddress = tableModel.getValueAt(tableofemp1.getSelectedRow(),8).toString();
        String dob = tableModel.getValueAt(tableofemp1.getSelectedRow(),9).toString();
        String taddress = tableModel.getValueAt(tableofemp1.getSelectedRow(),10).toString();
        String doj = tableModel.getValueAt(tableofemp1.getSelectedRow(),11).toString();

        //        String doj = tableModel.getValueAt(emp_table.getSelectedRow(),7).toString();
        //        String salary = tableModel.getValueAt(emp_table.getSelectedRow(),8).toString();

        emp_idtxt.setText(emp_id);
        Name_txt.setText(name);
        Email_txt.setText(email);
        departmentcom.setSelectedItem(department);
        Salary_txt.setText(salary);
        mobile_txt.setText(mobile);
        Fathers_txt.setText(fathersname);
        Paddress_txt.setText(paddress);
        Taddress_txt.setText(taddress);
        dobtxt.setDateFormatString(dob);
        dojtxt.setDateFormatString(doj);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");

        try {
            // Parse the date strings to Date objects
            Date dobDate = dateFormat.parse(dob);
            dobtxt.setDate(dobDate);

            Date dojDate = dateFormat.parse(doj);
            dojtxt.setDate(dojDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(gender.equals("Male")){
            male.setSelected(true);
        }else if(gender.equals("Female")){
            female.setSelected(true);
        }else if(gender.equals("Other")){
            other.setSelected(true);
        }
        departmentcom.setSelectedItem(department);
        
    }//GEN-LAST:event_tableofemp1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        emp_idtxt.setText("");
        Name_txt.setText("");
         Email_txt.setText("");
            departmentcom.setSelectedItem(null); 
            Fathers_txt.setText("");
            mobile_txt.setText("");
            Paddress_txt.setText("");
            Salary_txt.setText("");
            buttonGroup1.clearSelection();
            other.setText("");
            Taddress_txt.setText("");
            dobtxt.setDate(null);
            dojtxt.setDate(null);
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email_txt;
    private javax.swing.JTextField Fathers_txt;
    private javax.swing.JTextField Name_txt;
    private javax.swing.JTextField Paddress_txt;
    private javax.swing.JTextField Salary_txt;
    private javax.swing.JTextField Taddress_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> departmentcom;
    private com.toedter.calendar.JDateChooser dobtxt;
    private com.toedter.calendar.JDateChooser dojtxt;
    private javax.swing.JTextField emp_idtxt;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JButton modifybtn;
    private javax.swing.JRadioButton other;
    private javax.swing.JTable tableofemp1;
    // End of variables declaration//GEN-END:variables
}
