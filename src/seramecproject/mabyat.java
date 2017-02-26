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
public class mabyat extends javax.swing.JInternalFrame {

    public mabyat() {
        initComponents();
         select_with_date();
         //select_Cheek();
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
        table_details = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtdateSearch = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("المبيعات");

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("المبيعات", jPanel1);

        table_details.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDetails.setViewportView(table_details);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("التفاصيل", jPanel2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        input=((JTextField)txtdateSearch.getDateEditor().getUiComponent()).getText();
         select_with_date();
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
            String query="SELECT * FROM sales where datee ='"+input+"'";          //type ='الاجمالى' and
            
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
            String query="SELECT * FROM payment where customer_id ="+cheek_id;          
            
            DefaultTableModel dtm=new DefaultTableModel();
            table_details.setModel(dtm);
           dtm.addColumn("السعر");
            dtm.addColumn("الفرز");
            dtm.addColumn("اللون");
            dtm.addColumn("الكميه"); 
            dtm.addColumn("الصنف");
            dtm.addColumn("م");
 
                   
         // Hide a Column -------------------------------------------------
            table_details.getColumn("م").setPreferredWidth(0);
             table_details.getColumn("م").setWidth(0);
               table_details.getColumn("م").setMinWidth(0);
                table_details.getColumn("م").setMaxWidth(0);
               //------------------------------------------------------------  
  
                    
            ResultSet rs= stmt.executeQuery(query);
      
            while(rs.next()){
                        dtm.addRow(new Object[]{
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable table_details;
    private javax.swing.JScrollPane tblDetails;
    private javax.swing.JTable tblSales;
    private com.toedter.calendar.JDateChooser txtdateSearch;
    // End of variables declaration//GEN-END:variables
}
