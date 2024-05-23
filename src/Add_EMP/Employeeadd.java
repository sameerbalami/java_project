/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Add_EMP;

import Dashboard.Admin;

import java.sql.*;
import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Employeeadd extends javax.swing.JFrame {

    String Gender;   
    
    public Employeeadd() {
        initComponents();
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Name_Txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        departmenttxt = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        save_btn = new javax.swing.JButton();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Others = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        Name_Label = new javax.swing.JLabel();
        Father_Txt = new javax.swing.JTextField();
        Father_Label = new javax.swing.JLabel();
        Paddress_Txt = new javax.swing.JTextField();
        Paddress_Label = new javax.swing.JLabel();
        Email_Txt = new javax.swing.JTextField();
        username_label4 = new javax.swing.JLabel();
        Salary_Label = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        Salary_Txt = new javax.swing.JTextField();
        Email_Label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Number_Txt = new javax.swing.JTextField();
        Number_Label = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Taddress_Txt = new javax.swing.JTextField();
        Taddress_Label = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Menu_btn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 228, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add Employee");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employees.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(218, 228, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Full Name");

        Name_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Name_TxtKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Department");

        departmenttxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Salesman", "It Officer", "Accountant", "Manager" }));
        departmenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmenttxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Father's Name");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Date of Birth");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Date of joining");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Email ID");

        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookmark.png"))); // NOI18N
        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(Others);
        Others.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Others.setText("Other");
        Others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OthersActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Permanent Address");

        Name_Label.setForeground(new java.awt.Color(204, 0, 0));

        Father_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Father_TxtActionPerformed(evt);
            }
        });
        Father_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Father_TxtKeyReleased(evt);
            }
        });

        Father_Label.setForeground(new java.awt.Color(204, 0, 0));

        Paddress_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Paddress_TxtKeyReleased(evt);
            }
        });

        Paddress_Label.setForeground(new java.awt.Color(204, 0, 0));

        Email_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Email_TxtKeyReleased(evt);
            }
        });

        username_label4.setForeground(new java.awt.Color(204, 0, 0));

        Salary_Label.setForeground(new java.awt.Color(204, 0, 0));

        mobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mobile.setText("Mobile Number");

        Salary_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salary_TxtActionPerformed(evt);
            }
        });
        Salary_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Salary_TxtKeyReleased(evt);
            }
        });

        Email_Label.setForeground(new java.awt.Color(204, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Salary");

        Number_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Number_TxtKeyReleased(evt);
            }
        });

        Number_Label.setForeground(new java.awt.Color(204, 0, 0));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Temporary Address");

        Taddress_Txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Taddress_TxtKeyReleased(evt);
            }
        });

        Taddress_Label.setForeground(new java.awt.Color(204, 0, 0));

        Menu_btn.setText("Back");
        Menu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departmenttxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name_Txt)
                            .addComponent(Name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Father_Txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Father_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(username_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Number_Txt)
                            .addComponent(Number_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Email_Txt)
                                        .addComponent(Email_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Taddress_Txt)
                                        .addComponent(Taddress_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(Male)
                                            .addGap(30, 30, 30)
                                            .addComponent(Female)
                                            .addGap(32, 32, 32)
                                            .addComponent(Others))
                                        .addComponent(Salary_Txt)
                                        .addComponent(Salary_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                        .addComponent(Paddress_Txt)
                                        .addComponent(Paddress_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(16, 16, 16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Menu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(408, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(departmenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Email_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Male)
                                    .addComponent(Female)
                                    .addComponent(Others))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Father_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salary_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Father_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salary_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobile)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paddress_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paddress_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Taddress_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(11, 11, 11))))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username_label4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Taddress_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Menu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
        try {
            String sql="INSERT INTO `employeedata_tb`( `Name`,`Email`, `Department`, `Gender`,`FathersName`, `Salary`, `MobileNum`, `Paddress`, `Dob`, `Taddress`, `DOJ`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeesystem_db", "root","");
             
            PreparedStatement ps = conn.prepareStatement(sql);
            

            ps.setString(1, Name_Txt.getText());
            ps.setString(2, Email_Txt.getText());
            ps.setString(3, departmenttxt.getSelectedItem().toString());
            ps.setString(4, Gender);
            ps.setString(5, Father_Txt.getText());
            //ps.setString(5, jDateChooser1.getDate().toString());
            ps.setString(6, Salary_Txt.getText());
            ps.setString(7, Number_Txt.getText());
            ps.setString(8, Paddress_Txt.getText());
            ps.setString(9, jDateChooser1.getDate().toString());
            ps.setString(10, Taddress_Txt.getText());
            ps.setString(11, jDateChooser2.getDate().toString());
            
            
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data stored successfully");
            } else {
                    JOptionPane.showMessageDialog(null, "Failed to store data");
                }
            Name_Txt.setText("");
            Email_Txt.setText("");
            departmenttxt.setSelectedItem(null); 
            Father_Txt.setText("");
            Number_Txt.setText("");
            Paddress_Txt.setText("");
            Salary_Txt.setText("");
            buttonGroup1.clearSelection();
            Others.setText("");
            Taddress_Txt.setText("");
            jDateChooser1.setDate(null);
            jDateChooser2.setDate(null);
            
            conn.close();
        } catch (Exception e) {
            System.out.println("error--->"+e.getMessage());
        }
        
            
            
            
            
            
            
            
//            String Name,Email,Department,FathersName,Salary,MobileNum,Paddress,Dob,Taddress,DOJ;//,IMG;
//            String sql="insert into addemployee_tb(Name,Email,Department,FathersName,Salary,MobileNum,Paddress,Dob,Taddress,DOJ,IMG,Gender) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            Connect();
//            
//            Name=Name_Txt.getText();
//            Email=Email_Txt.getText();
//            Department=departmenttxt.getSelectedItem().toString();
//            FathersName=Father_Txt.getText();
//            Salary=Salary_Txt.getText();
//            MobileNum=Number_Txt.getText();
//            Paddress=Paddress_Txt.getText();
//            Dob=jDateChooser1.getDate().toString();
//            Taddress=Taddress_Txt.getText();
//            DOJ=jDateChooser2.getDate().toString();
////            IMG=labelImage.getText();
//           
//            
//            pst=conn.prepareStatement(sql);
//            
//            
//            pst.setString(1, Name);
//            pst.setString(2, Email);
//            pst.setString(3, Department);
//            pst.setString(4, FathersName);
//            pst.setString(5, Salary);
//            pst.setString(6, MobileNum);
//            pst.setString(7, Paddress);
//            pst.setString(8, Dob);
//            pst.setString(9, Taddress);
//            pst.setString(10, DOJ);
//            pst.setString(11, Gender);
            //pst.setString(12, Gender);
            
//            InputStream is = new FileInputStream(new File(path2));
//            pst.setBlob(5, is);
//            pst.execute();
//            
//            
//            pst.executeUpdate();
//            
//            int rowsAffected=pst.executeUpdate();
//            if(rowsAffected>0)
//            {
//                JOptionPane.showMessageDialog(null, "Data stored successfully");
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "Failed to store data");
//            }
            
            //JOptionPane.showMessageDialog(this, "Employee Detail's are saved");
            
//            Name_Txt.setText("");
//            Email_Txt.setText("");
//            departmenttxt.setSelectedItem(null);
//            buttonGroup1.clearSelection();
//            //others.setText("");
//            Father_Txt.setText("");
//            Salary_Txt.setText("");
//            Number_Txt.setText("");
//            Paddress_Txt.setText("");
//            jDateChooser1.setDate(null);
//            Taddress_Txt.setText("");
//            jDateChooser2.setDate(null);
//            Male.setText("");
//            Female.setText("");
            //labelImage.setText("");
            
//            conn.close();
//            
//            
//        }
//        catch (Exception e) {
//            System.err.println(e);
//        }
    }//GEN-LAST:event_save_btnActionPerformed

    private void departmenttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmenttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmenttxtActionPerformed

    private void Salary_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salary_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Salary_TxtActionPerformed

    private void Name_TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Name_TxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-z A-Z]{5,25}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(Name_Txt.getText());
        
        if(!match.matches()){
            Name_Label.setText("Invalid data");
        }
        else{
            Name_Label.setText(null);
        }
    }//GEN-LAST:event_Name_TxtKeyReleased

    private void Email_TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Email_TxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{5,7}[@][a-z]{0,7}[.][c,o,m]{2,3}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(Email_Txt.getText());
        
        if(!match.matches()){
            Email_Label.setText("invalid email");
        }
        else{
            Email_Label.setText(null);
        }
    }//GEN-LAST:event_Email_TxtKeyReleased

    private void Number_TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Number_TxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(Number_Txt.getText());
        
        if(!match.matches()){
            Number_Label.setText("Invalid data");
        }
        else{
            Number_Label.setText(null);
        }
    }//GEN-LAST:event_Number_TxtKeyReleased

    private void Salary_TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Salary_TxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{4,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(Salary_Txt.getText());
        
        if(!match.matches()){
            Salary_Label.setText("Invalid data");
        }
        else{
            Salary_Label.setText(null);
        }
    }//GEN-LAST:event_Salary_TxtKeyReleased

    private void Paddress_TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Paddress_TxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z,0-9-]{6,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(Paddress_Txt.getText());
        
        if(!match.matches()){
            Paddress_Label.setText("Invalid data");
        }
        else{
            Paddress_Label.setText(null);
        }
    }//GEN-LAST:event_Paddress_TxtKeyReleased

    private void Taddress_TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Taddress_TxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z,-0-9]{6,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(Taddress_Txt.getText());
        
        if(!match.matches()){
            Taddress_Label.setText("Invalid data");
        }
        else{
            Taddress_Label.setText(null);
        }
    }//GEN-LAST:event_Taddress_TxtKeyReleased

    private void Father_TxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Father_TxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-z A-Z]{5,25}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(Father_Txt.getText());
        
        if(!match.matches()){
            Father_Label.setText("Invalid data");
        }
        else{
            Father_Label.setText(null);
        }
    }//GEN-LAST:event_Father_TxtKeyReleased

    private void OthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OthersActionPerformed
        // TODO add your handling code here:
        Gender= "Others";
        Male.setSelected(false);
        Female.setSelected(false);
        Others.setSelected(true);
    }//GEN-LAST:event_OthersActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
        Gender= "Male";
        Male.setSelected(true);
        Female.setSelected(false);
        Others.setSelected(false);
    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
        Gender= "Female";
        Male.setSelected(false);
        Female.setSelected(true);
        Others.setSelected(false);
    }//GEN-LAST:event_FemaleActionPerformed

    private void Menu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_btnActionPerformed
        // TODO add your handling code here:
        Admin Db= new Admin();
        Db.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_Menu_btnActionPerformed

    private void Father_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Father_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Father_TxtActionPerformed

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
            java.util.logging.Logger.getLogger(Employeeadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employeeadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employeeadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employeeadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employeeadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email_Label;
    private javax.swing.JTextField Email_Txt;
    private javax.swing.JLabel Father_Label;
    private javax.swing.JTextField Father_Txt;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JButton Menu_btn;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JTextField Name_Txt;
    private javax.swing.JLabel Number_Label;
    private javax.swing.JTextField Number_Txt;
    private javax.swing.JRadioButton Others;
    private javax.swing.JLabel Paddress_Label;
    private javax.swing.JTextField Paddress_Txt;
    private javax.swing.JLabel Salary_Label;
    private javax.swing.JTextField Salary_Txt;
    private javax.swing.JLabel Taddress_Label;
    private javax.swing.JTextField Taddress_Txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> departmenttxt;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mobile;
    private javax.swing.JButton save_btn;
    private javax.swing.JLabel username_label4;
    // End of variables declaration//GEN-END:variables
}
