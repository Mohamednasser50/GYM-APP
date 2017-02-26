/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seramecproject;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static seramecproject.sales_Frame.USER;

/**
 *
 * @author m7med nasser
 */
public class Log_in extends javax.swing.JInternalFrame {

    /**
     * Creates new form Log_in
     */
    public Log_in() {
        initComponents();
        lblError.setVisible(false);
    }

   String Driver="oracle.jdbc.driver.OracleDriver";
    String DatabaseUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
    static final String USER = "sera";
    static final String PASS = "sera147";
    
        public static String test;
    public static String full_name;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNmeLog = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPassLog = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cmbKind = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("تسجيل دخول");

        txtNmeLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNmeLogMousePressed(evt);
            }
        });

        jLabel1.setText("الاسم :");

        txtPassLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassLogMousePressed(evt);
            }
        });
        txtPassLog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassLogKeyPressed(evt);
            }
        });

        jLabel2.setText("الرقم السرى :");

        cmbKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "المدير", "المساعد" }));

        jButton1.setText("تسجيل الدخول");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/error.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassLog)
                            .addComponent(txtNmeLog, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbKind, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNmeLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(cmbKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            //execute immediate  "EXP abdo/abdo FILE=F:\\Abdo\\backupLoop.dmp";
            //     Runtime.getRuntime().exec("EXP abdo/abdo FILE=D:\\backupLoop.dmp");

            Runtime.getRuntime().exec("EXP aera/sera17 FILE=D:\\seraDBloop.DMP");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "لم يتم أخذ نسخه احتيايه");
            ex.printStackTrace();
        }
        // log();
       
    
            log_with_database();
      
            //  log_with_database_assest();
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPassLogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassLogKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         
             
             try {
            //execute immediate  "EXP abdo/abdo FILE=F:\\Abdo\\backupLoop.dmp";
            //     Runtime.getRuntime().exec("EXP abdo/abdo FILE=D:\\backupLoop.dmp");

            Runtime.getRuntime().exec("EXP aera/sera17 FILE=D:\\seraDBloop.DMP");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "لم يتم أخذ نسخه احتيايه");
            ex.printStackTrace();
        }
        // log();
       
    
            log_with_database(); 
        }
    }//GEN-LAST:event_txtPassLogKeyPressed

    private void txtNmeLogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNmeLogMousePressed
        // TODO add your handling code here:
        lblError.setVisible(false);
    }//GEN-LAST:event_txtNmeLogMousePressed

    private void txtPassLogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassLogMousePressed
        // TODO add your handling code here:
        lblError.setVisible(false);
    }//GEN-LAST:event_txtPassLogMousePressed
public void log_with_database(){
      
            String userName=txtNmeLog.getText();
               String password=txtPassLog.getText();
               String userName2=  "'"+userName+"'";
               String  password2="'"+password+"'"; 
               String  kind=cmbKind.getSelectedItem().toString();
        try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM employee where name='"+userName+"'"+"and password='"+password+"' and type='"+kind+"' and test='1'"; 
            //+",password="+password2
                                           
                                          // +" WHERE LOG_NAME = "+userName2
                                          // +" AND LOG_PASS = "+password2;
            
           
            
            ResultSet rs= stmt.executeQuery(query);
                                             
            while(rs.next()){
                
              //  cmbName.addItem(rs.getString("LAST_NAME"));
               if(userName.equals(rs.getString("name"))&&password.equals(rs.getString("password"))){
                   
               }else{
                     JOptionPane.showMessageDialog(null, "Wrong  -_-");
               }
               if(userName.equals(rs.getString("name"))&&password.equals(rs.getString("password"))){
                   if(kind.equals("المدير")){
                full_name=rs.getString("full_name");
                this.setVisible(false);
                    mainScreen_Frame.pnlMain.setVisible(true);
                   mainScreen_Frame.btnStore.setEnabled(true);
                   mainScreen_Frame.btnAddEmp.setEnabled(true);
                   mainScreen_Frame.btnRebh.setEnabled(true);
                   mainScreen_Frame.btnAddcustomer.setEnabled(true);
                   mainScreen_Frame.btnmabyaat.setEnabled(true);
                   mainScreen_Frame.btnMasrof.setEnabled(true);
                   mainScreen_Frame.btnSetting.setEnabled(true);
                   mainScreen_Frame.btnCompany.setEnabled(true);
                   mainScreen_Frame.btnSales.setEnabled(true);
                   mainScreen_Frame.btnCustomers.setEnabled(true);
                   
                    mainScreen_Frame.lblNames.setText(full_name);
                 
                    
                   }else if(kind.equals("المساعد")){
                        full_name=rs.getString("full_name");
                       this.setVisible(false);
                       
                      mainScreen_Frame.pnlMain.setVisible(true);
                   /* mainScreen_Frame.btnStore.setEnabled(false);
                   mainScreen_Frame.btnAddEmp.setEnabled(false);
                   mainScreen_Frame.btnRebh.setEnabled(false);
                    mainScreen_Frame.btnAddcustomer.setEnabled(false);
                     mainScreen_Frame.btnmabyaat.setEnabled(false);*/
                    mainScreen_Frame.lblNames.setText(full_name);
                       Select_From_settings(full_name);
                   }else{
                       lblError.setVisible(true);
                     JOptionPane.showMessageDialog(null, "Wrong  -_-");
                   }
                     
                            
               }else{
                   lblError.setVisible(true);
                     JOptionPane.showMessageDialog(null, "Wrong  -_-");
                    // JOptionPane.showMessageDialog(null, "خطأ    -_-");
                     }
                        }
                
                
                             
            stmt.close();
            conn.close();
            error();
                 
        }
       /* catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.getMessage()+"حاول مره اخرى.....");
            e.printStackTrace();
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }*/
         catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
        
         
  }
public void error(){
      
            String userName=txtNmeLog.getText();
               String password=txtPassLog.getText();
               String userName2=  "'"+userName+"'";
               String  password2="'"+password+"'"; 
               String  kind=cmbKind.getSelectedItem().toString();
        try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM employee where test='1'"; 
            //+",password="+password2
                                           
                                          // +" WHERE LOG_NAME = "+userName2
                                          // +" AND LOG_PASS = "+password2;
            
           
            
            ResultSet rs= stmt.executeQuery(query);
                                             
            while(rs.next()){
                
              //  cmbName.addItem(rs.getString("LAST_NAME"));
               if(userName.equals(rs.getString("name"))&&password.equals(rs.getString("password"))){
                   
               }else{
                     //JOptionPane.showMessageDialog(null, "Wrong  -_-");
                     lblError.setVisible(true);
               }
             
                        }
                
                
                             
            stmt.close();
            conn.close();
                 
        }
       /* catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.getMessage()+"حاول مره اخرى.....");
            e.printStackTrace();
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }*/
         catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
        
         
  }
public void Select_From_settings(String name){
        try{
        
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM settings where name='"+name+"' and test=1"; 
            ResultSet rs= stmt.executeQuery(query); 
     
            while(rs.next()){
                String cmbSales=rs.getString("CMBSALES");
                boolean cbsales;
                if(cmbSales.equals("true")){
                    cbsales=true;
                }else
                    cbsales=false;
             mainScreen_Frame.btnSales.setEnabled(cbsales);
             //---------------------------------------------------------
             String cmbStore=rs.getString("CMBSTORES");
                boolean cbstor;
                if(cmbStore.equals("true")){
                    cbstor=true;
                }else
                    cbstor=false;
             mainScreen_Frame.btnStore.setEnabled(cbstor);
             //----------------------------------------------------------
              String cmbCUSTOMERS=rs.getString("CMBCUSTOMERS");
                boolean cbcmbCUSTOMERS;
                if(cmbCUSTOMERS.equals("true")){
                    cbcmbCUSTOMERS=true;
                }else
                    cbcmbCUSTOMERS=false;
             mainScreen_Frame.btnCustomers.setEnabled(cbcmbCUSTOMERS);
             //----------------------------------------------------------
              String cmbCMBADDEMP=rs.getString("CMBADDEMP");
                boolean cbCMBADDEMP;
                if(cmbCMBADDEMP.equals("true")){
                    cbCMBADDEMP=true;
                }else
                    cbCMBADDEMP=false;
             mainScreen_Frame.btnAddEmp.setEnabled(cbCMBADDEMP);
             //----------------------------------------------------------
              String cmbCMBADDCUST=rs.getString("CMBADDCUST");
                boolean cbCMBADDCUST;
                if(cmbCMBADDCUST.equals("true")){
                    cbCMBADDCUST=true;
                }else
                    cbCMBADDCUST=false;
             mainScreen_Frame.btnAddcustomer.setEnabled(cbCMBADDCUST);
             //----------------------------------------------------------
              String cmbCMBMASAREF=rs.getString("CMBMASAREF");
                boolean cbCMBMASAREF;
                if(cmbCMBMASAREF.equals("true")){
                    cbCMBMASAREF=true;
                }else
                    cbCMBMASAREF=false;
             mainScreen_Frame.btnMasrof.setEnabled(cbCMBMASAREF);
             //----------------------------------------------------------
              String cmbCMBMABYAAT=rs.getString("CMBMABYAAT");
                boolean cbCMBMABYAAT;
                if(cmbCMBMABYAAT.equals("true")){
                    cbCMBMABYAAT=true;
                }else
                    cbCMBMABYAAT=false;
             mainScreen_Frame.btnmabyaat.setEnabled(cbCMBMABYAAT);
             //----------------------------------------------------------
              String cmbCMBREBH=rs.getString("CMBREBH");
                boolean cbCMBREBH;
                if(cmbCMBREBH.equals("true")){
                    cbCMBREBH=true;
                }else
                    cbCMBREBH=false;
             mainScreen_Frame.btnRebh.setEnabled(cbCMBREBH);
             //----------------------------------------------------------
              String cmbCMBCOMPANY=rs.getString("CMBCOMPANY");
                boolean cbCMBCOMPANY;
                if(cmbCMBCOMPANY.equals("true")){
                    cbCMBCOMPANY=true;
                }else
                    cbCMBCOMPANY=false;
             mainScreen_Frame.btnCompany.setEnabled(cbCMBCOMPANY);
             //----------------------------------------------------------
              String cmbCMBSETTINGS=rs.getString("CMBSETTINGS");
                boolean cbCMBSETTINGS;
                if(cmbCMBSETTINGS.equals("true")){
                    cbCMBSETTINGS=true;
                }else
                    cbCMBSETTINGS=false;
             mainScreen_Frame.btnSetting.setEnabled(cbCMBSETTINGS);
             //----------------------------------------------------------
                        }
             
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbKind;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblError;
    public static javax.swing.JTextField txtNmeLog;
    private javax.swing.JPasswordField txtPassLog;
    // End of variables declaration//GEN-END:variables
}
