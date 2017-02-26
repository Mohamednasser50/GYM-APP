/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seramecproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author m7med nasser
 */
public class Dayly extends javax.swing.JInternalFrame {

    public Dayly() {
        initComponents();
        select_Cheek();
         select_masrof();
    }

      String Driver="oracle.jdbc.driver.OracleDriver";
    String DatabaseUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
    static final String USER = "sera";
    static final String PASS = "sera147";
    Connection conn;
    
    String input;
    int cheek_id;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tblDetails = new javax.swing.JScrollPane();
        tblMasrof = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtdateSearch = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblRebh = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblMasrof = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblTOtal = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("الربح اليومى");

        tblSales.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSalesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("المبيعات", jPanel1);

        tblMasrof.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDetails.setViewportView(tblMasrof);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("المصاريف", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtdateSearch.setDateFormatString("yyyy_M_d");

        btnSearch.setText("بحث");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdateSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(txtdateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الربح", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblRebh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRebh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRebh, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRebh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المصاريف", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblMasrof.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMasrof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMasrof, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMasrof, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "صافى الربح", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblTOtal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTOtal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTOtal, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTOtal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        input=((JTextField)txtdateSearch.getDateEditor().getUiComponent()).getText();
         select_Cheek();
         select_masrof();
         allmoney();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblSalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalesMousePressed
        // TODO add your handling code here:
          int row=tblSales.getSelectedRow();
         /*    dtm.addColumn("اسم العامل");0
            dtm.addColumn("الساعه");1
            dtm.addColumn("التاريخ");2
            dtm.addColumn("الاجمالى"); 3
            dtm.addColumn("اسم المشترى");4
            dtm.addColumn("رقم الفاتوره");5
            dtm.addColumn("م");6*/
         cheek_id=Integer.parseInt(tblSales.getValueAt(row, 5).toString());
         select_Cheek();
    }//GEN-LAST:event_tblSalesMousePressed
public void select_with_date(){
         
        try
        {
            Class.forName(Driver);
             conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM payment where datee ='"+input+"'";          //type ='الاجمالى' and
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblSales.setModel(dtm);
            dtm.addColumn("اسم العامل");
            dtm.addColumn("الساعه");
            dtm.addColumn("التاريخ");
            dtm.addColumn("الاجمالى"); 
            dtm.addColumn("اسم المشترى");
            dtm.addColumn("رقم الفاتوره");
            dtm.addColumn("م");
                   
         // Hide a Column -------------------------------------------------
            tblSales.getColumn("م").setPreferredWidth(0);
             tblSales.getColumn("م").setWidth(0);
               tblSales.getColumn("م").setMinWidth(0);
                tblSales.getColumn("م").setMaxWidth(0);
               //------------------------------------------------------------  
                 
            ResultSet rs= stmt.executeQuery(query);
      
            while(rs.next()){
                        dtm.addRow(new Object[]{
                            rs.getString("emp"),
                            rs.getString("time"),
                            rs.getString("datee"),
                            rs.getDouble("total"),
                            rs.getString("customer_name"),
                            rs.getInt("customer_id"),
                            rs.getInt("ID")
                            
                                       
                                               }
                                  );
                            }
            
            stmt.close();
            conn.close();
                 
                  

        }
        catch(SQLSyntaxErrorException e){
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "اكمل الخطوات بطريقه صحيحه");
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (SQLException es){
        JOptionPane.showMessageDialog(null, "sqlEx");
        es.printStackTrace();
    }catch (ClassNotFoundException es){
        JOptionPane.showMessageDialog(null, "Driver");
    }catch(NullPointerException n){
        JOptionPane.showMessageDialog(null, "القائمه فارغه");
    }
       
      }
 public void select_Cheek(){
        try
        {
            Class.forName(Driver);
             conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM payment where datee ='"+input+"'";          
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblSales.setModel(dtm);
            dtm.addColumn("المكسب");
            dtm.addColumn("السعر");
            dtm.addColumn("الفرز");
            dtm.addColumn("اللون");
            dtm.addColumn("الكميه"); 
            dtm.addColumn("الصنف");
            dtm.addColumn("م");
 
                   
         // Hide a Column -------------------------------------------------
            tblSales.getColumn("م").setPreferredWidth(0);
             tblSales.getColumn("م").setWidth(0);
               tblSales.getColumn("م").setMinWidth(0);
                tblSales.getColumn("م").setMaxWidth(0);
               //------------------------------------------------------------  
  
                    
            ResultSet rs= stmt.executeQuery(query);
      
            while(rs.next()){
                        dtm.addRow(new Object[]{
                                rs.getDouble("profit"),
                                rs.getDouble("PRICE"),
                            rs.getInt("farth"),
                            rs.getString("color"),
                            rs.getInt("QUANTITY"),
                            rs.getString("type"),
                            rs.getInt("id")
                                               }
                                  );
                            }
            
            stmt.close();
            conn.close();
                 
                  

        }
        catch(SQLSyntaxErrorException e){
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "اكمل الخطوات بطريقه صحيحه");
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (SQLException es){
        JOptionPane.showMessageDialog(null, "sqlEx");
        es.printStackTrace();
    }catch (ClassNotFoundException es){
        JOptionPane.showMessageDialog(null, "Driver");
    }catch(NullPointerException n){
        JOptionPane.showMessageDialog(null, "القائمه فارغه");
    }
       
      } 
 public void select_masrof(){
        try
        {
            Class.forName(Driver);
             conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM masrof where datee ='"+input+"'";          
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblMasrof.setModel(dtm);
            dtm.addColumn("اسم العامل");
            dtm.addColumn("القيمه"); 
            dtm.addColumn("النوع");
            dtm.addColumn("م");
 
                   
         // Hide a Column -------------------------------------------------
            tblMasrof.getColumn("م").setPreferredWidth(0);
             tblMasrof.getColumn("م").setWidth(0);
               tblMasrof.getColumn("م").setMinWidth(0);
                tblMasrof.getColumn("م").setMaxWidth(0);
               //------------------------------------------------------------  
  
                    
            ResultSet rs= stmt.executeQuery(query);
      
            while(rs.next()){
                        dtm.addRow(new Object[]{
                            rs.getString("emp"),
                            rs.getDouble("value"),
                            rs.getString("type"),
                            rs.getInt("id")
                                               }
                                  );
                            }
            
            stmt.close();
            conn.close();
                 
                  

        }
        catch(SQLSyntaxErrorException e){
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "اكمل الخطوات بطريقه صحيحه");
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (SQLException es){
        JOptionPane.showMessageDialog(null, "sqlEx");
        es.printStackTrace();
    }catch (ClassNotFoundException es){
        JOptionPane.showMessageDialog(null, "Driver");
    }catch(NullPointerException n){
        JOptionPane.showMessageDialog(null, "القائمه فارغه");
    }
       
      } 
 public void allmoney(){
        double sum=0;
        double sum_masrof=0;
        
        double[] sumArr = new double[tblSales.getRowCount()];
        double[] masrofArr = new double[tblMasrof.getRowCount()];
        
        for (int i = 0; i < tblSales.getRowCount(); i++) {
            sumArr[i]=   Double.parseDouble(tblSales.getValueAt(i, 0).toString());
            }
         for (int i = 0; i < tblMasrof.getRowCount(); i++) {
            masrofArr[i]=   Double.parseDouble(tblMasrof.getValueAt(i, 1).toString());
            }
         for (int i = 0; i < sumArr.length;i++){
                     sum+=sumArr[i];
                  
         }
          for (int i = 0; i < masrofArr.length;i++){
                     sum_masrof+=masrofArr[i];
                  
         }

          lblRebh.setText(""+sum);
          lblMasrof.setText(""+sum_masrof);
          double total=sum-sum_masrof;
          lblTOtal.setText(""+total);
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMasrof;
    private javax.swing.JLabel lblRebh;
    private javax.swing.JLabel lblTOtal;
    private javax.swing.JScrollPane tblDetails;
    private javax.swing.JTable tblMasrof;
    private javax.swing.JTable tblSales;
    private com.toedter.calendar.JDateChooser txtdateSearch;
    // End of variables declaration//GEN-END:variables
}
