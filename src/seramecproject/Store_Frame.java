/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seramecproject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static seramecproject.add_Customer_Frame.USER;
import static seramecproject.add_EmpFrame.USER;

/**
 *
 * @author m7med nasser
 */
public class Store_Frame extends javax.swing.JInternalFrame {

    /**
     * Creates new form Store_Frame
     */
    public Store_Frame() {
        initComponents();
        date();
        Select_employees();
        Select_table();
        select();
        lblName.setText( mainScreen_Frame.lblNames.getText());
    }
    String Driver="oracle.jdbc.driver.OracleDriver";
    String DatabaseUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
    static final String USER = "sera";
    static final String PASS = "sera147";
    
    Connection conn;
    int id;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBarCode = new javax.swing.JTextField();
        cmbcustomer = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        cmbFarth = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtGomla = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        btnAddTable = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        lblDate2 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStore = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("المخزن");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("الصنف :");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setText("الكميه :");

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setText("سعر الكرتونه :");

        jLabel5.setText("اسم العميل :");

        jLabel6.setText("الباركود :");

        txtBarCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cmbcustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel7.setText("اللون :");

        txtColor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cmbFarth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel1.setText("الفرز :");

        txtGomla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel8.setText("سعر الجمله :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtBarCode)
                                        .addComponent(cmbcustomer, 0, 155, Short.MAX_VALUE)
                                        .addComponent(cmbFarth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel1)))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtGomla, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtGomla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbFarth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        cmbType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTypeItemStateChanged(evt);
            }
        });

        btnAddTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sum.png"))); // NOI18N
        btnAddTable.setToolTipText("اضافه قائمه جديده");
        btnAddTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTableActionPerformed(evt);
            }
        });

        btnsub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub.png"))); // NOI18N
        btnsub.setToolTipText("حذف قائمه");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        lblDate2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate2.setText("jLabel7");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("jLabel8");

        tblStore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblStore.setEditingColumn(0);
        tblStore.setEditingRow(0);
        tblStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblStoreMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblStore);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اسم العامل", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnAdd.setToolTipText("اضافه");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update3.png"))); // NOI18N
        btnUpdate.setToolTipText("تعديل");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update1.png"))); // NOI18N
        btnRefresh.setToolTipText("تحديث");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete2.png"))); // NOI18N
        btnDelete.setToolTipText("حذف");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnRefresh)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddTable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDate2)
                                    .addComponent(lblDate))
                                .addGap(54, 54, 54))
                            .addComponent(btnAddTable, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
   
        insert();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        Refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void cmbTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTypeItemStateChanged
        // TODO add your handling code here:
        select();
    }//GEN-LAST:event_cmbTypeItemStateChanged

    private void btnAddTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTableActionPerformed
        // TODO add your handling code here:
        String table_name =JOptionPane.showInputDialog(null,"ادخل الاسم :");
        insert_table(table_name);
        
    }//GEN-LAST:event_btnAddTableActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        // TODO add your handling code here:
        delete_table();
    }//GEN-LAST:event_btnsubActionPerformed

    private void tblStoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStoreMousePressed
        // TODO add your handling code here:
        
        int row=tblStore.getSelectedRow();
        /*dtm.addColumn("اسم العامل");0
            dtm.addColumn("الباركود");1
            dtm.addColumn("التاريخ");2
            dtm.addColumn("اسم العميل");3
            dtm.addColumn("سعر الكرتونه");4
        5
               dtm.addColumn("الفرز");6
              dtm.addColumn("اللون");7
            dtm.addColumn("الكميه"); 8
            dtm.addColumn("الصنف");9
            dtm.addColumn("م");10*/
        
        id= Integer.parseInt(tblStore.getValueAt(row, 10).toString());
        txtBarCode.setText(tblStore.getValueAt(row, 1).toString());
        txtName.setText( tblStore.getValueAt(row, 9).toString());
        txtPrice.setText( tblStore.getValueAt(row, 4).toString());
        txtGomla.setText( tblStore.getValueAt(row, 5).toString());
        txtColor.setText( tblStore.getValueAt(row, 7).toString());
        txtQuantity.setText( tblStore.getValueAt(row, 8).toString());
        cmbcustomer.setSelectedItem( tblStore.getValueAt(row, 3).toString());
        cmbFarth.setSelectedItem( tblStore.getValueAt(row, 6).toString());
        
        
         btnAdd.setEnabled(false);
    }//GEN-LAST:event_tblStoreMousePressed
    public void date(){
         java.util.Date today=new java.util.Date();
       // System.out.println(today.getDay());
        //JOptionPane.showMessageDialog(null, today.getDay());
        if(today.getDay()==(1)){
           lblDate2.setText("الاثنين"); 
        }else if(today.getDay()==(2)){
            lblDate2.setText("الثلاثاء");
        }else if(today.getDay()==(3)){
            lblDate2.setText("الاربعاء");
        }else if(today.getDay()==(4)){
            lblDate2.setText("الخميس");
        }else if(today.getDay()==(5)){
            lblDate2.setText("الجمعه");
        }else if(today.getDay()==(6)){
            lblDate2.setText("السبت");
        }else if(today.getDay()==(0)){
            lblDate2.setText("الاحد");
        }
        int day=(today.getDate());
        int month=(today.getMonth()+1);
        int year=(today.getYear()+1900);
        lblDate.setText(year+"_"+month+"_"+day);
    }
    public void Select_employees(){
        
       
          
      
        try{
        
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM customer"; 
            
            ResultSet rs= stmt.executeQuery(query);
           
            while(rs.next()){
                
                cmbcustomer.addItem(rs.getString("name"));
               
                        }
             
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
    public void Select_table(){
        
       
          
      
        try{
        
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM store_table"; 
            
            ResultSet rs= stmt.executeQuery(query);
           
            while(rs.next()){
                
                cmbType.addItem(rs.getString("name"));
               
                        }
             
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
    public void delete_table(){
             
                try
            {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="delete from store_table where name =?";
            PreparedStatement stmt =conn.prepareStatement(inserQury);
              
             //IDياتى من الجدول ونضعه فى متغير انتجر 
             stmt.setString(1, cmbType.getSelectedItem().toString());
         
             // System.out.println("id ="+id);
                      
                      
             
              int row=stmt.executeUpdate();
              
              if(row>0){
              cmbType.removeItem(cmbType.getSelectedItem());
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
            
            
            String inserQury="insert into store(name, QUANTITY, price,customer,barcode,type,datee,emp,Color,Farth,Gomla,Profit)"
                    +"Values(?,?,?,?,?,?,?,?,?,?,?,?)";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(1, txtName.getText() );
              stmt.setInt(2,Integer.parseInt(txtQuantity.getText()));
              stmt.setDouble(3,Double.parseDouble(txtPrice.getText()));
              stmt.setString(4,cmbcustomer.getSelectedItem().toString());
              stmt.setString(5,txtBarCode.getText());
              stmt.setString(6,cmbType.getSelectedItem().toString());
              stmt.setString(7, lblDate.getText());
              stmt.setString(8, lblName.getText());
              stmt.setString(9, txtColor.getText());
              stmt.setInt(10,Integer.parseInt(cmbFarth.getSelectedItem().toString()));
               stmt.setDouble(11,Double.parseDouble(txtGomla.getText()));
               Double pri=Double.parseDouble(txtPrice.getText());
               Double gom=Double.parseDouble(txtGomla.getText());
               Double prof=pri-gom;
                stmt.setDouble(12,prof);
                     
              int row=stmt.executeUpdate();
              if(row>0){
                  JOptionPane.showMessageDialog(null,"تم الاضافه");
                  
                //  Refresh();
                  select();
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
    public void insert_table(String name){
             
             try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            
            String inserQury="insert into store_table(name)"
                    +"Values(?)";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(1, name );
              int row=stmt.executeUpdate();
              if(row>0){
                   cmbType.addItem(name);
                  // Select_table();
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
    public void select(){
        
        try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM Store where type='"+cmbType.getSelectedItem().toString()+"'"; 
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblStore.setModel(dtm);
            dtm.addColumn("اسم العامل");
            dtm.addColumn("الباركود");
            dtm.addColumn("التاريخ");
            dtm.addColumn("اسم العميل");
            dtm.addColumn("سعر الكرتونه");
            dtm.addColumn("سعر الجمله");
             dtm.addColumn("الفرز");
              dtm.addColumn("اللون");
            dtm.addColumn("الكميه"); 
            dtm.addColumn("الصنف");
            dtm.addColumn("م");
       
           
          // Hide a Column -------------------------------------------------
            tblStore.getColumn("م").setPreferredWidth(0);
             tblStore.getColumn("م").setWidth(0);
               tblStore.getColumn("م").setMinWidth(0);
                tblStore.getColumn("م").setMaxWidth(0);
               //------------------------------------------------------------      
       
            ResultSet rs= stmt.executeQuery(query);
             
           
            while(rs.next()){
                        dtm.addRow(new Object[]{
                            
                            rs.getString("emp"),
                            rs.getString("BARCODE"),
                            rs.getString("Datee"),
                            rs.getString("CUSTOMER"),
                            rs.getDouble("PRICE"),
                            rs.getDouble("gomla"),
                            rs.getInt("farth"),
                            rs.getString("color"),
                            rs.getInt("quantity"),
                            rs.getString("name"),
                            rs.getInt("id")
                        
                                 
                                               }
                                  );
                            }
            
            stmt.close();
            conn.close();
                 
                  

        }
        catch(Exception e){
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
      } 
    public void delete(){
             
                try
            {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="delete from store where ID = ?";
            PreparedStatement stmt =conn.prepareStatement(inserQury);
              
             //IDياتى من الجدول ونضعه فى متغير انتجر 
             stmt.setInt(1, id);
         
             // System.out.println("id ="+id);
                      
                      
             
              int row=stmt.executeUpdate();
              
              if(row>0){
                         select();
                         Refresh();
                         //هنا يكتب رساله بعد اتمام العمليه    
               
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
    public void update(){
       try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="update store set"
                           + "  name=?,"
                           + " QUANTITY=?,"
                           + " PRICE=?,"
                           + " BARCODE=?,"
                           + " CUSTOMER=?,"
                           + " color=?,"
                           + " farth=?,"
                           + " gomla=?,"
                           + " profit=?"
                           + " where id=?";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
             stmt.setString(1, txtName.getText());
             stmt.setInt   (2, Integer.parseInt(txtQuantity.getText()));
             stmt.setDouble(3, Double.parseDouble(txtPrice.getText()));
             stmt.setInt   (4,Integer.parseInt(txtBarCode.getText()));
             stmt.setString(5,cmbcustomer.getSelectedItem().toString());
             stmt.setString(6, txtColor.getText());
             stmt.setInt(7,Integer.parseInt(cmbFarth.getSelectedItem().toString()));
             stmt.setDouble(8, Double.parseDouble(txtGomla.getText()));
             
              Double pri=Double.parseDouble(txtPrice.getText());
               Double gom=Double.parseDouble(txtGomla.getText());
               Double prof=pri-gom;
             stmt.setDouble(9, prof);
             stmt.setInt   (10,id);
           
             
             
              int row=stmt.executeUpdate();
              if(row>0){
                  JOptionPane.showMessageDialog(null, "تم التعديل");
                  Refresh();
                  select();
                    
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
    public void Refresh(){
          txtName.setText("");
        txtBarCode.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
        txtGomla.setText("");
        txtColor.setText("");
        btnAdd.setEnabled(true);
        select();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnsub;
    private javax.swing.JComboBox<String> cmbFarth;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JComboBox<String> cmbcustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate2;
    public static javax.swing.JLabel lblName;
    private javax.swing.JTable tblStore;
    private javax.swing.JTextField txtBarCode;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtGomla;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
