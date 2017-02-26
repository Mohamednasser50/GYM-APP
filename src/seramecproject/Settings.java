/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seramecproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static seramecproject.Store_Frame.USER;

/**
 *
 * @author m7med nasser
 */
public class Settings extends javax.swing.JInternalFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
        initComponents();
        Select_employees();
    }
     String Driver="oracle.jdbc.driver.OracleDriver";
    String DatabaseUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
    static final String USER = "sera";
    static final String PASS = "sera147";
    
    Connection conn;
    String sales="true",store="true",addEmp="true",addCust="true",Customers="true",Setting="true",mabyaat="true",msrof="true",Company="true",Rebh="true";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbNames = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pnlMain1 = new javax.swing.JPanel();
        btnSales1 = new javax.swing.JButton();
        btnStore = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnAddEmp = new javax.swing.JButton();
        btnAddcustomer = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cmbSales = new javax.swing.JCheckBox();
        cmbStore = new javax.swing.JCheckBox();
        cmbCustomer = new javax.swing.JCheckBox();
        cmbAddCust = new javax.swing.JCheckBox();
        cmbAddEmp = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        btnmabyaat1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cmbCompany = new javax.swing.JCheckBox();
        cmbRebh = new javax.swing.JCheckBox();
        cmbMabyaat = new javax.swing.JCheckBox();
        cmbMasrof = new javax.swing.JCheckBox();
        cmbSetting = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("الاعدادات");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cmbNames.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbNames.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNamesItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("الاسم :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(cmbNames, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlMain1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSales1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSales1.setText("البيع");
        btnSales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSales1ActionPerformed(evt);
            }
        });

        btnStore.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnStore.setText("المخزن");
        btnStore.setToolTipText("");
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreActionPerformed(evt);
            }
        });

        btnEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEmployee.setText("الموردين");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnAddEmp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddEmp.setText("أضافه عامل");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        btnAddcustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddcustomer.setText("انشاء مورد");
        btnAddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddcustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMain1Layout = new javax.swing.GroupLayout(pnlMain1);
        pnlMain1.setLayout(pnlMain1Layout);
        pnlMain1Layout.setHorizontalGroup(
            pnlMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMain1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSales1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddcustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        pnlMain1Layout.setVerticalGroup(
            pnlMain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMain1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSales1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStore, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave.setText("حفظ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cmbSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalesActionPerformed(evt);
            }
        });

        cmbStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStoreActionPerformed(evt);
            }
        });

        cmbCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerActionPerformed(evt);
            }
        });

        cmbAddCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAddCustActionPerformed(evt);
            }
        });

        cmbAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAddEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbSales)
                    .addComponent(cmbStore)
                    .addComponent(cmbCustomer)
                    .addComponent(cmbAddEmp)
                    .addComponent(cmbAddCust))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cmbSales)
                .addGap(32, 32, 32)
                .addComponent(cmbStore)
                .addGap(34, 34, 34)
                .addComponent(cmbCustomer)
                .addGap(35, 35, 35)
                .addComponent(cmbAddEmp)
                .addGap(38, 38, 38)
                .addComponent(cmbAddCust)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton41.setText("الشركات");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        btnmabyaat1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmabyaat1.setText("المبيعات");
        btnmabyaat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmabyaat1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("مصاريف");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton42.setText("الربح");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton43.setText("الاعدادات");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmabyaat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmabyaat1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cmbCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCompanyActionPerformed(evt);
            }
        });

        cmbRebh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRebhActionPerformed(evt);
            }
        });

        cmbMabyaat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMabyaatActionPerformed(evt);
            }
        });

        cmbMasrof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMasrofActionPerformed(evt);
            }
        });

        cmbSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cmbMasrof)
                            .addComponent(cmbSetting)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbRebh)
                            .addComponent(cmbMabyaat)
                            .addComponent(cmbCompany))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cmbMasrof)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(cmbMabyaat)
                .addGap(32, 32, 32)
                .addComponent(cmbRebh)
                .addGap(35, 35, 35)
                .addComponent(cmbCompany)
                .addGap(33, 33, 33)
                .addComponent(cmbSetting)
                .addGap(22, 22, 22))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("اختر الزر الذى تريد اخفائه عن الموظف :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update1.png"))); // NOI18N
        jButton1.setText("اعاده الاختيار");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pnlMain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setBounds(0, 0, 473, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSales1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSales1ActionPerformed

    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStoreActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnAddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddcustomerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAddcustomerActionPerformed

    private void cmbAddCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAddCustActionPerformed
        // TODO add your handling code here:
              if(cmbAddCust.isSelected())
        {
            addCust="false";
        }else{
            addCust ="true";
        }
    }//GEN-LAST:event_cmbAddCustActionPerformed

    private void cmbStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStoreActionPerformed
        // TODO add your handling code here:
         if(cmbStore.isSelected())
        {
            store="false";
        }else{
            store ="true";
        }
    }//GEN-LAST:event_cmbStoreActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void btnmabyaat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmabyaat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmabyaat1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       // Select_To_update();
       
        insert();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalesActionPerformed
        // TODO add your handling code here:
        if(cmbSales.isSelected())
        {
            sales="false";
        }else{
            sales ="true";
        }
    }//GEN-LAST:event_cmbSalesActionPerformed

    private void cmbCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerActionPerformed
        // TODO add your handling code here:
            if(cmbCustomer.isSelected())
        {
            Customers="false";
        }else{
            Customers ="true";
        }
           
    }//GEN-LAST:event_cmbCustomerActionPerformed

    private void cmbAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAddEmpActionPerformed
        // TODO add your handling code here:
            if(cmbAddEmp.isSelected())
        {
            addEmp="false";
        }else{
            addEmp ="true";
        }
    }//GEN-LAST:event_cmbAddEmpActionPerformed

    private void cmbMasrofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMasrofActionPerformed
        // TODO add your handling code here:
              if(cmbMasrof.isSelected())
        {
            msrof="false";
        }else{
            msrof ="true";
        }
    }//GEN-LAST:event_cmbMasrofActionPerformed

    private void cmbMabyaatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMabyaatActionPerformed
        // TODO add your handling code here:
             if(cmbMabyaat.isSelected())
        {
            mabyaat="false";
        }else{
            mabyaat ="true";
        }
    }//GEN-LAST:event_cmbMabyaatActionPerformed

    private void cmbRebhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRebhActionPerformed
        // TODO add your handling code here:
            if(cmbRebh.isSelected())
        {
            Rebh="false";
        }else{
            Rebh ="true";
        }
    }//GEN-LAST:event_cmbRebhActionPerformed

    private void cmbCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCompanyActionPerformed
        // TODO add your handling code here:
             if(cmbCompany.isSelected())
        {
            Company="false";
        }else{
            Company ="true";
        }
    }//GEN-LAST:event_cmbCompanyActionPerformed

    private void cmbSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSettingActionPerformed
        // TODO add your handling code here:
             if(cmbSetting.isSelected())
        {
            Setting="false";
        }else{
            Setting ="true";
        }
    }//GEN-LAST:event_cmbSettingActionPerformed

    private void cmbNamesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNamesItemStateChanged
        // TODO add your handling code here:
        refresh();
        Select_options();
        
        
        Select_To_update();
        
    }//GEN-LAST:event_cmbNamesItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       delete();
    }//GEN-LAST:event_jButton1ActionPerformed
public void Select_employees(){
        
       
          
      
        try{
        
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM employee where type='المساعد'"; 
            
            ResultSet rs= stmt.executeQuery(query);
           
            while(rs.next()){
                cmbNames.addItem(rs.getString("full_name"));
                        }
             
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
public void Select_options(){
        
       
          
      
        try{
        
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM settings where name='"+cmbNames.getSelectedItem()+"'"; 
            
            ResultSet rs= stmt.executeQuery(query);
           
            while(rs.next()){
                
                if(rs.getString("test").equals("1")){
                 String cmbSaless=rs.getString("CMBSALES");
                boolean cbsales;
                if(cmbSaless.equals("false")){
                    cbsales=true;
                }else
                    cbsales=false;
             cmbSales.setSelected(cbsales);
             //---------------------------------------------------------
             String cmbStoree=rs.getString("CMBSTORES");
                boolean cbstor;
                if(cmbStoree.equals("false")){
                    cbstor=true;
                }else
                    cbstor=false;
             cmbStore.setSelected(cbstor);
             //----------------------------------------------------------
              String cmbCUSTOMERS=rs.getString("CMBCUSTOMERS");
                boolean cbcmbCUSTOMERS;
                if(cmbCUSTOMERS.equals("false")){
                    cbcmbCUSTOMERS=true;
                }else
                    cbcmbCUSTOMERS=false;
            cmbCustomer.setSelected(cbcmbCUSTOMERS);
             //----------------------------------------------------------
              String cmbCMBADDEMP=rs.getString("CMBADDEMP");
                boolean cbCMBADDEMP;
                if(cmbCMBADDEMP.equals("false")){
                    cbCMBADDEMP=true;
                }else
                    cbCMBADDEMP=false;
             cmbAddEmp.setSelected(cbCMBADDEMP);
             //----------------------------------------------------------
              String cmbCMBADDCUST=rs.getString("CMBADDCUST");
                boolean cbCMBADDCUST;
                if(cmbCMBADDCUST.equals("false")){
                    cbCMBADDCUST=true;
                }else
                    cbCMBADDCUST=false;
            cmbAddCust.setSelected(cbCMBADDCUST);
             //----------------------------------------------------------
              String cmbCMBMASAREF=rs.getString("CMBMASAREF");
                boolean cbCMBMASAREF;
                if(cmbCMBMASAREF.equals("false")){
                    cbCMBMASAREF=true;
                }else
                    cbCMBMASAREF=false;
             cmbMasrof.setSelected(cbCMBMASAREF);
             //----------------------------------------------------------
              String cmbCMBMABYAAT=rs.getString("CMBMABYAAT");
                boolean cbCMBMABYAAT;
                if(cmbCMBMABYAAT.equals("false")){
                    cbCMBMABYAAT=true;
                }else
                    cbCMBMABYAAT=false;
             cmbMabyaat.setSelected(cbCMBMABYAAT);
             //----------------------------------------------------------
              String cmbCMBREBH=rs.getString("CMBREBH");
                boolean cbCMBREBH;
                if(cmbCMBREBH.equals("false")){
                    cbCMBREBH=true;
                }else
                    cbCMBREBH=false;
             cmbRebh.setSelected(cbCMBREBH);
             //----------------------------------------------------------
              String cmbCMBCOMPANY=rs.getString("CMBCOMPANY");
                boolean cbCMBCOMPANY;
                if(cmbCMBCOMPANY.equals("false")){
                    cbCMBCOMPANY=true;
                }else
                    cbCMBCOMPANY=false;
             cmbCompany.setSelected(cbCMBCOMPANY);
             //----------------------------------------------------------
              String cmbCMBSETTINGS=rs.getString("CMBSETTINGS");
                boolean cbCMBSETTINGS;
                if(cmbCMBSETTINGS.equals("false")){
                    cbCMBSETTINGS=true;
                }else
                    cbCMBSETTINGS=false;
             cmbSetting.setSelected(cbCMBSETTINGS);
                            
                    }
            } 
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
public void refresh(){
     cmbAddCust.setSelected(false);
                    cmbAddEmp.setSelected(false);
                    cmbCompany.setSelected(false);
                    cmbCustomer.setSelected(false);
                    cmbMabyaat.setSelected(false);
                    cmbMasrof.setSelected(false);
                    cmbSales.setSelected(false);
                    cmbStore.setSelected(false);
                    cmbRebh.setSelected(false);
                    cmbSetting.setSelected(false);
}
public void Select_To_update(){
        try{
        btnSave.setEnabled(true);
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM settings where name ='"+cmbNames.getSelectedItem()+"'"; 
            
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next()){
            /**  if(rs.getString("updated").equals("1")){
            JOptionPane.showMessageDialog(null, "موجود بالفعل");
            }else{
                System.out.println("select to update = 0  so insert");
                insert();
            }
                
                */
                btnSave.setEnabled(false);
        
            } 
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
public void delete(){
             
                try
            {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="delete from settings where name ='"+cmbNames.getSelectedItem()+"'"; 
            PreparedStatement stmt =conn.prepareStatement(inserQury);
              
             //IDياتى من الجدول ونضعه فى متغير انتجر 
           //  stmt.setString(1, cmbNames.getSelectedItem().toString());
         
             // System.out.println("id ="+id);
                      
                      
             
              int row=stmt.executeUpdate();
              
              if(row>0){
             refresh();
             btnSave.setEnabled(true);
              }
              stmt.close();
              conn.close();
// select_store();
                    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
         
        }
        
         }
public void insert(){
             
             try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            
            String inserQury="insert into settings(CMBSALES"
                    + ",CMBSTORES"
                    + ", CMBCUSTOMERS"
                    + ",CMBADDEMP"
                    + ",CMBADDCUST"
                    + ",CMBMASAREF"
                    + ",CMBMABYAAT"
                    + ",CMBREBH"
                    + ",CMBCOMPANY"
                    + ",CMBSETTINGS"
                    + ",TEST"
                    + ",NAME)"
                    +"Values(?,?,?,?,?,?,?,?,?,?,?,?)";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(1,sales);
              stmt.setString(2,store);
              stmt.setString(3,Customers);
              stmt.setString(4,addEmp);
              stmt.setString(5,addCust);
              stmt.setString(6,msrof);
              stmt.setString(7, mabyaat);
              stmt.setString(8, Rebh);
              stmt.setString(9, Company);
              stmt.setString(10,Setting);
              stmt.setString(11, "1");
              stmt.setString(12,cmbNames.getSelectedItem().toString() );
              int row=stmt.executeUpdate();
              if(row>0){
                 // update_Employee();
                  JOptionPane.showMessageDialog(null,"تم الحفظ...");
                  btnSave.setEnabled(false);
                  //refresh();
              }
              stmt.close();
              conn.close();
             // select_store();

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب أكمال البيانات بطريقه صحيحه");
            e.printStackTrace();
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
        
         }
public void update_Employee(){
       try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="update employee set updated='1' where name=?";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
             stmt.setString(1, cmbNames.getSelectedItem().toString());
              int row=stmt.executeUpdate();
              if(row>0){
  
              }
              
              stmt.close();
              conn.close();
              
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب ادخال رقم الصنف");
            e.printStackTrace();
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
         
  }
public void update_Settings(){
       try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="update settings Set CMBSALES=?"
                    + ",CMBSTOES=?"
                    + ",CMBCUSTOMERS=?"
                    + ",CMBADDEMP=?"
                    + ",CMBADDCUST=?"
                    + ",CMBMASAREF=?"
                    + ",CMBMABYAAT=?"
                    + ",CMBREBH=?"
                    + ",CMBCOMPANY=?"
                    + ",CMBSETTINGS=? "
                    + "where name=?";  
            
       
        
            String Test="true";
            PreparedStatement stmt =conn.prepareStatement(inserQury);
             stmt.setString(1, Test);
             stmt.setString(2, Test);
             stmt.setString(3, Test);
             stmt.setString(4, Test);
             stmt.setString(5, Test);
             stmt.setString(6, Test);
             stmt.setString(7,Test);
             stmt.setString(8, Test);
             stmt.setString(9, Test);
             stmt.setString(10, Test);
             stmt.setString(11, cmbNames.getSelectedItem().toString());
             
              int row=stmt.executeUpdate();
              if(row>0){
  
              }
              
              stmt.close();
              conn.close();
              
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب ادخال رقم الصنف");
            e.printStackTrace();
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
         
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddEmp;
    public static javax.swing.JButton btnAddcustomer;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnSales1;
    private javax.swing.JButton btnSave;
    public static javax.swing.JButton btnStore;
    public static javax.swing.JButton btnmabyaat1;
    private javax.swing.JCheckBox cmbAddCust;
    private javax.swing.JCheckBox cmbAddEmp;
    private javax.swing.JCheckBox cmbCompany;
    private javax.swing.JCheckBox cmbCustomer;
    private javax.swing.JCheckBox cmbMabyaat;
    private javax.swing.JCheckBox cmbMasrof;
    private javax.swing.JComboBox<String> cmbNames;
    private javax.swing.JCheckBox cmbRebh;
    private javax.swing.JCheckBox cmbSales;
    private javax.swing.JCheckBox cmbSetting;
    private javax.swing.JCheckBox cmbStore;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel pnlMain1;
    // End of variables declaration//GEN-END:variables
}
