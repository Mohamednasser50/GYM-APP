/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seramecproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author m7med nasser
 */
public class add_EmpFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form add_EmpFrame
     */
    public add_EmpFrame() {
        initComponents();
        select();
        pnlLogN.setVisible(false);
        test="0";
        tty="اخرى";
    }

       String Driver="oracle.jdbc.driver.OracleDriver";
    String DatabaseUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
    static final String USER = "sera";
    static final String PASS = "sera147";
    Connection conn;
    
    String test;
    String tblTest;
    String tty;
    int id;
    String type;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDateEmp = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cbLogIn = new javax.swing.JCheckBox();
        pnlLogN = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNameLog = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassLog = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("اضافه عامل");

        jLabel1.setText("الاسم كامل :");

        jLabel2.setText("رقم البطاقه :");

        jLabel3.setText("العنوان :");

        jLabel4.setText("السن :");

        jLabel5.setText("الموبيل :");

        txtDateEmp.setDateFormatString("d_M_ yyyy");

        jLabel6.setText("تاريخ التعين :");

        cbLogIn.setText("تسجيل الخول      ");
        cbLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLogInActionPerformed(evt);
            }
        });

        jLabel7.setText("الاسم :");

        jLabel8.setText("الرقم السرى :");

        javax.swing.GroupLayout pnlLogNLayout = new javax.swing.GroupLayout(pnlLogN);
        pnlLogN.setLayout(pnlLogNLayout);
        pnlLogNLayout.setHorizontalGroup(
            pnlLogNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogNLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(pnlLogNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNameLog, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtPassLog))
                .addGap(18, 18, 18)
                .addGroup(pnlLogNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(2, 2, 2))
        );
        pnlLogNLayout.setVerticalGroup(
            pnlLogNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogNLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnlLogNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNameLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLogNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPassLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbLogIn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAddress)
                            .addComponent(txtAge)
                            .addComponent(txtPhone)
                            .addComponent(txtID)
                            .addComponent(txtName)
                            .addComponent(txtDateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(pnlLogN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtDateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLogN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnAdd.setToolTipText("اضافه");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete2.png"))); // NOI18N
        btnDelete.setToolTipText("حذف");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmp.setEditingColumn(0);
        tblEmp.setEditingRow(0);
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblEmpMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLogInActionPerformed
        // TODO add your handling code here:
        if (cbLogIn.isSelected()) {
            pnlLogN.setVisible(true);
                    test="1";
                    txtNameLog.setText("");
                    txtPassLog.setText("");
                    tty="المساعد";
        }else{
            pnlLogN.setVisible(false);
            
                    test="0";
                    txtNameLog.setText("");
                    txtPassLog.setText("");
                    tty="اخرى";
        }
    }//GEN-LAST:event_cbLogInActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
      
        try{
        if(txtNameLog.getText().equals("")){
           txtNameLog.setText(".");
           
       }
       if( txtPassLog.getText().equals("")){
            txtPassLog.setText(".");
       }
      
        insert();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "يجب اكمال البيانات بطريقه صحيحه...");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMousePressed
        // TODO add your handling code here:
        int row=tblEmp.getSelectedRow();
        /*       dtm.addColumn("الرقم السرى");0
            dtm.addColumn("الاسم");1
            dtm.addColumn("تاريخ التعيين");2
            dtm.addColumn("الموبيل");3
            dtm.addColumn("السن");4
            dtm.addColumn("العنوان");5
            dtm.addColumn("الرقم القومى"); 6
            dtm.addColumn("الاسم كامل");7
            dtm.addColumn("م");8
            dtm.addColumn("النوع");9
            dtm.addColumn("test");10
        11
        */
        tblTest=tblEmp.getValueAt(row, 10).toString();
        test=tblEmp.getValueAt(row,10).toString();
        tty=tblEmp.getValueAt(row,9).toString();
        type=tblEmp.getValueAt(row,9).toString();
        id= Integer.parseInt(tblEmp.getValueAt(row, 8).toString());
        txtName.setText(tblEmp.getValueAt(row, 7).toString());
        txtID.setText( tblEmp.getValueAt(row, 6).toString());
        txtAddress.setText( tblEmp.getValueAt(row, 5).toString());
        txtAge.setText( tblEmp.getValueAt(row, 4).toString());
        txtPhone.setText( tblEmp.getValueAt(row, 3).toString());
        ((JTextField)txtDateEmp.getDateEditor().getUiComponent()).setText(tblEmp.getValueAt(row, 2).toString());
        txtNameLog.setText( tblEmp.getValueAt(row, 1).toString());
        txtPassLog.setText( tblEmp.getValueAt(row, 0).toString());
        
        if (type.equals("المدير")) {
            btnDelete.setEnabled(false); 
            cbLogIn.setSelected(true);
            pnlLogN.setVisible(true);
        }else if (type.equals("المساعد")){
             btnDelete.setEnabled(true);
             cbLogIn.setSelected(true);
            pnlLogN.setVisible(true);
        }else if (type.equals("اخرى")){
            cbLogIn.setSelected(false);
            pnlLogN.setVisible(false);  
        }
          btnAdd.setEnabled(false);
    }//GEN-LAST:event_tblEmpMousePressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtAddress.setText("");
                  txtAge.setText("");
                  ((JTextField)txtDateEmp.getDateEditor().getUiComponent()).setText("");
                  txtID.setText("");
                  txtName.setText("");
                  txtNameLog.setText("");
                  txtPassLog.setText("");
                  txtPhone.setText("");
                  cbLogIn.setSelected(false);
                  pnlLogN.setVisible(false);
                  
                   cbLogIn.setSelected(false);
                   pnlLogN.setVisible(false);
                   btnAdd.setEnabled(true);
                   btnDelete.setEnabled(true);
                    test="0";
                    tty="اخرى";
                  
                           
                           
                    
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(txtNameLog.getText().equals("")){
           txtNameLog.setText(".");
           
       }
       if( txtPassLog.getText().equals("")){
            txtPassLog.setText(".");
       }
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed
public void insert(){
             
             try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            
            String inserQury="insert into employee(FULL_NAME, id_Number, address,age,phone,date_of_Emp,name,password,test,type)"
                    +"Values(?,?,?,?,?,?,?,?,?,?)";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(1, txtName.getText() );
              stmt.setString(2,txtID.getText());
              stmt.setString(3,txtAddress.getText());
              stmt.setInt(4,Integer.parseInt(txtAge.getText()));
              stmt.setString(5,txtPhone.getText());
              String inputtt=((JTextField)txtDateEmp.getDateEditor().getUiComponent()).getText();
              stmt.setString(6, inputtt);
              stmt.setString(7,txtNameLog.getText());
              stmt.setString(8,txtPassLog.getText());
              stmt.setString(9,test);
              stmt.setString(10,tty);
              
              //stmt.setInt(2,cmbId.getSelectedIndex()+1);
             
              int row=stmt.executeUpdate();
              if(row>0){
                  JOptionPane.showMessageDialog(null,"تم الاضافه");
                  select();
                  txtAddress.setText("");
                  txtAge.setText("");
                  ((JTextField)txtDateEmp.getDateEditor().getUiComponent()).setText("");
                  txtID.setText("");
                  txtName.setText("");
                  txtNameLog.setText("");
                  txtPassLog.setText("");
                  txtPhone.setText("");
                  cbLogIn.setSelected(false);
                  pnlLogN.setVisible(false);
                tty="اخرى";
                test="0";
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
public void delete(){
             
                try
            {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="delete from employee where ID = ?";
            PreparedStatement stmt =conn.prepareStatement(inserQury);
              
             //IDياتى من الجدول ونضعه فى متغير انتجر 
             stmt.setInt(1, id);
         
             // System.out.println("id ="+id);
                      
                      
             
              int row=stmt.executeUpdate();
              
              if(row>0){
                            
                         //هنا يكتب رساله بعد اتمام العمليه    
               select();
                     txtAddress.setText("");
                  txtAge.setText("");
                  ((JTextField)txtDateEmp.getDateEditor().getUiComponent()).setText("");
                  txtID.setText("");
                  txtName.setText("");
                  txtNameLog.setText("");
                  txtPassLog.setText("");
                  txtPhone.setText("");
                  cbLogIn.setSelected(false);
                  pnlLogN.setVisible(false);
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
public void select(){
        
        try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM employee"; 
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblEmp.setModel(dtm);
            
            dtm.addColumn("الرقم السرى");
            dtm.addColumn("الاسم");
            dtm.addColumn("تاريخ التعيين");
            dtm.addColumn("الموبيل");
            dtm.addColumn("السن");
            dtm.addColumn("العنوان");
            dtm.addColumn("الرقم القومى"); 
            dtm.addColumn("الاسم كامل");
            dtm.addColumn("م");
            dtm.addColumn("النوع");
            dtm.addColumn("test");
            
           
          // Hide a Column -------------------------------------------------
            tblEmp.getColumn("م").setPreferredWidth(0);
             tblEmp.getColumn("م").setWidth(0);
               tblEmp.getColumn("م").setMinWidth(0);
                tblEmp.getColumn("م").setMaxWidth(0);
               //------------------------------------------------------------      
                    tblEmp.getColumn("النوع").setPreferredWidth(0);
             tblEmp.getColumn("النوع").setWidth(0);
               tblEmp.getColumn("النوع").setMinWidth(0);
                tblEmp.getColumn("النوع").setMaxWidth(0);   
                //----------------------------------------------------------
                  tblEmp.getColumn("test").setPreferredWidth(0);
             tblEmp.getColumn("test").setWidth(0);
               tblEmp.getColumn("test").setMinWidth(0);
                tblEmp.getColumn("test").setMaxWidth(0);  
            
            ResultSet rs= stmt.executeQuery(query);
             
           
            while(rs.next()){
                        dtm.addRow(new Object[]{
                            
                            rs.getString("password"),
                            rs.getString("name"),
                            rs.getString("date_of_emp"),
                            rs.getString("phone"),
                            rs.getInt("age"),
                            rs.getString("address"),
                            rs.getString("id_number"),
                            rs.getString("full_name"),
                            rs.getInt("id"),
                            rs.getString("type"),
                            rs.getString("test")
                                
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
public void update(){
              
            
             try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            String inserQury="update employee set"
                    + " full_name=?"
                    + ",id_number=?"
                    + ",address=?"
                    + ",age=?"
                    + ",phone=?"
                    + ",date_of_emp=?"
                    + ",name=?"
                    + ",password=?"
                    + ",test=?"
                    + ",type=?"
                    + " where id=?";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(   1,txtName.getText());
              stmt.setString(2, txtID.getText());
              stmt.setString(3, txtAddress.getText());
              stmt.setInt   (4, Integer.parseInt(txtAge.getText()));
              stmt.setString(5, txtPhone.getText());
              String input=((JTextField)txtDateEmp.getDateEditor().getUiComponent()).getText();
              stmt.setString(6, input);
              stmt.setString(7,txtNameLog.getText());
              stmt.setString(8,txtPassLog.getText());
              
              stmt.setString(9,test);
              stmt.setString(10,tty);
              
              stmt.setInt   (11, id);
             
              int row=stmt.executeUpdate();
              if(row>0){
                  JOptionPane.showMessageDialog(null, "تم التعديل");
            txtAddress.setText("");
                  txtAge.setText("");
                  ((JTextField)txtDateEmp.getDateEditor().getUiComponent()).setText("");
                  txtID.setText("");
                  txtName.setText("");
                  txtNameLog.setText("");
                  txtPassLog.setText("");
                  txtPhone.setText("");
                  cbLogIn.setSelected(false);
                  pnlLogN.setVisible(false);
        select();
              }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب أكمال البيانات بطريقه صحيحه");
            e.printStackTrace();
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
        
         }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbLogIn;
    private javax.swing.JFileChooser jFileChooser1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlLogN;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private com.toedter.calendar.JDateChooser txtDateEmp;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameLog;
    private javax.swing.JTextField txtPassLog;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
