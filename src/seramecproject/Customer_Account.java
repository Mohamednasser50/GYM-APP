/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seramecproject;

import java.awt.event.KeyEvent;
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
import static seramecproject.Store_Frame.lblName;
import static seramecproject.add_Customer_Frame.USER;
import static seramecproject.add_EmpFrame.USER;

/**
 *
 * @author m7med nasser
 */
public class Customer_Account extends javax.swing.JInternalFrame {

    /**
     * Creates new form Store_Frame
     */
    public Customer_Account() {
        initComponents();
        date();
        Select_employees();  
        select();
        allmoney();
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
        jLabel5 = new javax.swing.JLabel();
        cmbcustomer = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStore = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblDate2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtDown = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPay = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblDown = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPay = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("العملاء");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("اسم العميل :");

        cmbcustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbcustomer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbcustomerItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        tblStore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblStoreKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblStore);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("jLabel8");

        lblDate2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate2.setText("jLabel7");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDate2)
                .addComponent(lblDate))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtDown.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDown.setToolTipText("اضغط (Enter)للتنزيل");
        txtDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDownActionPerformed(evt);
            }
        });
        txtDown.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDownKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("التنزيل :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("المدفوع :");

        txtPay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPay.setToolTipText("اضغط (Enter)للدفع");
        txtPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPayKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDown, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "تنزيل", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblDown.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDown, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "مدفوع", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblPay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPay.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPay, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الباقى", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اسم العامل", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("jLabel7");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void tblStoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStoreMousePressed
        // TODO add your handling code here:
        
        int row=tblStore.getSelectedRow();
    
        id= Integer.parseInt(tblStore.getValueAt(row, 4).toString());
        
      
    }//GEN-LAST:event_tblStoreMousePressed

    private void txtDownKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDownKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         insert_Down_CustAccount();
             allmoney();
             update();
        }
    }//GEN-LAST:event_txtDownKeyPressed

    private void txtDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDownActionPerformed

    private void tblStoreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblStoreKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_DELETE){
         delete();
             allmoney();
             update();
        }
    }//GEN-LAST:event_tblStoreKeyPressed

    private void txtPayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         insert_Pay_CustAccount();
             allmoney();
             update();
        }
    }//GEN-LAST:event_txtPayKeyPressed

    private void cmbcustomerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbcustomerItemStateChanged
        // TODO add your handling code here:
        select();
        allmoney();
    }//GEN-LAST:event_cmbcustomerItemStateChanged
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
public void insert_Down_CustAccount(){
             
             try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            
            String inserQury="insert into customer_account(name, down, datee, emp_name)"
                    +"Values(?,?,?,?)";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(1,cmbcustomer.getSelectedItem().toString() );
              stmt.setDouble(2,Double.parseDouble(txtDown.getText()));
              stmt.setString(3, lblDate.getText());
              stmt.setString(4, lblName.getText());
              int row=stmt.executeUpdate();
              if(row>0){
                //  JOptionPane.showMessageDialog(null,"تم الاضافه");
                  txtDown.setText("");
                  txtPay.setText("");
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
public void insert_Pay_CustAccount(){
             
             try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            
            String inserQury="insert into customer_account(name, pay, datee,emp_name)"
                    +"Values(?,?,?,?)";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(1,cmbcustomer.getSelectedItem().toString() );
              stmt.setDouble(2,Double.parseDouble(txtPay.getText()));
              stmt.setString(3, lblDate.getText());
               stmt.setString(4, lblName.getText());
              int row=stmt.executeUpdate();
              if(row>0){
                 // JOptionPane.showMessageDialog(null,"تم الاضافه");
                  txtDown.setText("");
                  txtPay.setText("");
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
public void select(){
        
        try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM customer_account where name='"+cmbcustomer.getSelectedItem().toString()+"'"; 
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblStore.setModel(dtm);
            dtm.addColumn("المدفوع");
            dtm.addColumn("التنزيل");
            dtm.addColumn("اسم العامل");
            dtm.addColumn("التاريخ");
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
                            rs.getDouble("pay"),
                            rs.getDouble("down"),
                            rs.getString("emp_name"),
                            rs.getString("datee"),
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
            
            String inserQury="delete from customer_account where ID = ?";
            PreparedStatement stmt =conn.prepareStatement(inserQury);
             stmt.setInt(1, id);
              int row=stmt.executeUpdate();
              
              if(row>0){
                         select();       
              }
              stmt.close();
              conn.close();       
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
            
            String inserQury="update customer set"
                           + "  pay=?"
                           + " where name=?";  
            PreparedStatement stmt =conn.prepareStatement(inserQury);
            stmt.setString(1, lblTotal.getText());
             stmt.setString(2,cmbcustomer.getSelectedItem().toString());
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
public void allmoney(){
  
        double down = 0;
        double pay = 0;
        double result=0;
        double[] downArr = new double[tblStore.getRowCount()];
        double[] payArr = new double[tblStore.getRowCount()];
        for (int i = 0; i < tblStore.getRowCount(); i++) {
            downArr[i]=   Double.parseDouble(tblStore.getValueAt(i, 1).toString());
            payArr[i]=  Double.parseDouble( tblStore.getValueAt(i, 0).toString());
        }       
         for (int i = 0; i < downArr.length;i++){
                     down+=downArr[i];
                  
        }  
           for (int i = 0; i < payArr.length;i++){
                     pay+=payArr[i];
                  
        }  
        lblDown.setText(""+down);
         lblPay.setText(""+pay);
         double total=down-pay;
          lblTotal.setText(""+total);
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbcustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate2;
    private javax.swing.JLabel lblDown;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPay;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblStore;
    private javax.swing.JTextField txtDown;
    private javax.swing.JTextField txtPay;
    // End of variables declaration//GEN-END:variables
}
