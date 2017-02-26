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
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author m7med nasser
 */
public class sales_Frame extends javax.swing.JInternalFrame {

    /**
     * Creates new form sales_Frame
     */
    public sales_Frame() {
        initComponents();
        Select_customer_id();
        date();
        lblName.setText(mainScreen_Frame.lblNames.getText());
        select_payment();
        allmoney();
        
        new  Thread(){
            public void run(){
                while(timeRun==0){
                    Calendar cal=new GregorianCalendar();
                    int hour=cal.get(Calendar.HOUR);
                    int min=cal.get(Calendar.MINUTE);
                    int sec=cal.get(Calendar.SECOND);
                    int AM_PM=cal.get(Calendar.AM_PM);
                    
                    String day_night ="";
                    if(AM_PM ==1)
                    {
                     day_night ="PM";
                    }else
                    {
                     day_night ="AM";   
                    }
                         
                    String time=hour+":"+min+":"+sec+" "+day_night;
                    lblHours.setText(time);
                }
            }
        }.start();
    }
    

    String Driver="oracle.jdbc.driver.OracleDriver";
    String DatabaseUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
    static final String USER = "sera";
    static final String PASS = "sera147";
    
     
    
    Connection conn;
    String type;
    String color; 
    String Cust_Name;
    
    double price;
    double profit;
    
    int farth;
    int last_quantity;
    int quantity;
    int payment_quantity;
    int id;
    int year;
    int month;
    int id_Sales;
    int type_id;
    int timeRun=0;
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
         month=(today.getMonth()+1);
         year=(today.getYear()+1900);
        lblDate.setText(year+"_"+month+"_"+day);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTypeSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblDate2 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsales = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStore = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtCustomerName = new javax.swing.JTextField();
        btnCancele = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblCustomerId = new javax.swing.JLabel();
        lblHours = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("البيع");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("بحث بالباركود :");

        txtBarcode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("بحث بالصنف :");

        txtTypeSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTypeSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTypeSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(txtTypeSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBarcode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTypeSearch))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "التاريخ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblDate2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate2.setText("jLabel1");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDate2)
                .addComponent(lblDate))
        );

        tblsales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "السعر", "الكميه", "الصنف"
            }
        ));
        tblsales.setEditingColumn(0);
        tblsales.setEditingRow(0);
        tblsales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblsalesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblsales);

        tblStore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "سعر الكرتونه", "الفرز", "اللون", "الكميه", "الصنف"
            }
        ));
        tblStore.setEditingColumn(0);
        tblStore.setEditingRow(0);
        tblStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblStoreMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblStore);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Left add_2.png"))); // NOI18N
        btnAdd.setToolTipText("اضافه الصنف للفاتوره");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Right add.png"))); // NOI18N
        btnRemove.setToolTipText("حذف الصنف من الفاتوره");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnSave.setText("حفظ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الاجمالى", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اسم العامل", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اسم المشترى", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtCustomerName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCancele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/error.png"))); // NOI18N
        btnCancele.setText("الغاء");
        btnCancele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanceleActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "رقم الفاتوره", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblCustomerId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerId.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCustomerId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHours.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHours.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHours.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("الوقت :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCancele, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lblHours, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addComponent(lblHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(btnCancele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBarcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyReleased
        // TODO add your handling code here:
        select_Store();
    }//GEN-LAST:event_txtBarcodeKeyReleased

    private void tblStoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStoreMousePressed
        // TODO add your handling code here:
         int row=tblStore.getSelectedRow();
        /*
            
            dtm.addColumn("سعر الكرتونه");0
         farth 1
         color 2
            dtm.addColumn("الكميه"); 3
            dtm.addColumn("الصنف");4
            dtm.addColumn("م");5*/
      /*   price= Double.parseDouble(tblStore.getValueAt(row, 0).toString());
        farth=  Integer.parseInt(tblStore.getValueAt(row, 1).toString());
        color= tblStore.getValueAt(row, 2).toString();
        last_quantity =Integer.parseInt(tblStore.getValueAt(row, 3).toString());
        type= tblStore.getValueAt(row, 4).toString();*/
        id= Integer.parseInt(tblStore.getValueAt(row, 5).toString());
        Select_From_Stores();
       
       
    }//GEN-LAST:event_tblStoreMousePressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        quantity=Integer.parseInt(JOptionPane.showInputDialog(null,"ادخل الكميه:"));
       
        test_num_item();
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtTypeSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeSearchKeyReleased
        // TODO add your handling code here:
        if (txtTypeSearch.getText().equals("")) {
            empty_table();
        }else
        {
        select_Store_Type();
        }
    }//GEN-LAST:event_txtTypeSearchKeyReleased

    private void tblsalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsalesMousePressed
        // TODO add your handling code here:
        int row=tblsales.getSelectedRow();
        
        /*dtm.addColumn("السعر");0
            dtm.addColumn("الفرز");1
            dtm.addColumn("اللون");2
            dtm.addColumn("الكميه"); 3
            dtm.addColumn("الصنف");4
            dtm.addColumn("م");5
            dtm.addColumn("رقم_الصنف");6*/
       // payment_quantity=Integer.parseInt(tblsales.getValueAt(row, 3).toString());
        id_Sales= Integer.parseInt(tblsales.getValueAt(row, 5).toString());
        type_id= Integer.parseInt(tblsales.getValueAt(row, 6).toString());
        Select_From_Payment();
    }//GEN-LAST:event_tblsalesMousePressed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        update_Store_After_Delete_Payment();
        delete_payment();
        allmoney();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
              insert_Sales();
              jasper();
              update_customer_id();
              Select_customer_id();
              select_payment();
              txtCustomerName.setText("");
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCanceleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanceleActionPerformed
        // TODO add your handling code here:
        int option=  JOptionPane.showConfirmDialog(null, "هل تريد الالغاء", "الغاء", JOptionPane.OK_CANCEL_OPTION);
          if(option==0){
    update_storage();
    delete_all_payment();
            txtCustomerName.setText("");
            select();
            lblTotal.setText("0.0");
        }else if(option==2){
         JOptionPane.showConfirmDialog(null, "لم يتم الالغاء");
        }else{
            JOptionPane.showConfirmDialog(null, "لم يتم الالغاء");
        }
    }//GEN-LAST:event_btnCanceleActionPerformed

public void select_Store(){
        
        try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM Store where BARCODE="+txtBarcode.getText(); 
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblStore.setModel(dtm);
           
            dtm.addColumn("سعر الكرتونه");
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

                            
                            rs.getDouble("PRICE"),
                            rs.getInt("farth"),
                            rs.getString("color"),
                            rs.getInt("QUANTITY"),
                            rs.getString("name"),
                            rs.getInt("id"),
                        
                                 
                                               }
                                  );
                            }
            
            stmt.close();
            conn.close();
                 
                  

        }
        catch(Exception e){
            
            e.printStackTrace();
           // JOptionPane.showMessageDialog(null, "Error");
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
      } 

 public void jasper (){

try {
  
    Class.forName(Driver);
    Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
  
    JasperDesign jd = JRXmlLoader.load("D:\\Seramic_Reports\\SeramicReport.jrxml");
            String sql = "SELECT\n" +
"     SALES.\"ID\" AS SALES_ID,\n" +
"     SALES.\"CUSTOMER_NAME\" AS SALES_CUSTOMER_NAME,\n" +
"     SALES.\"CUSTOMER_ID\" AS SALES_CUSTOMER_ID,\n" +
"     SALES.\"DATEE\" AS SALES_DATEE,\n" +
"     SALES.\"MONTH\" AS SALES_MONTH,\n" +
"     SALES.\"YEAR\" AS SALES_YEAR,\n" +
"     SALES.\"EMP\" AS SALES_EMP,\n" +
"     SALES.\"TOTAL\" AS SALES_TOTAL,\n" +
"     SALES.\"TIME\" AS SALES_TIME,\n" +
"     SALES.\"KHASM\" AS SALES_KHASM,\n" +
"     PAYMENT.\"ID\" AS PAYMENT_ID,\n" +
"     PAYMENT.\"TYPE\" AS PAYMENT_TYPE,\n" +
"     PAYMENT.\"QUANTITY\" AS PAYMENT_QUANTITY,\n" +
"     PAYMENT.\"PRICE\" AS PAYMENT_PRICE,\n" +
"     PAYMENT.\"CUSTOMER_ID\" AS PAYMENT_CUSTOMER_ID,\n" +
"     PAYMENT.\"CUSTOMER_NAME\" AS PAYMENT_CUSTOMER_NAME,\n" +
"     PAYMENT.\"DATEE\" AS PAYMENT_DATEE,\n" +
"     PAYMENT.\"FARTH\" AS PAYMENT_FARTH,\n" +
"     PAYMENT.\"COLOR\" AS PAYMENT_COLOR,\n" +
"     PAYMENT.\"TYPE_ID\" AS PAYMENT_TYPE_ID,\n" +
"     PAYMENT.\"EMP\" AS PAYMENT_EMP,\n" +
"     PAYMENT.\"MONTH\" AS PAYMENT_MONTH,\n" +
"     PAYMENT.\"YEAR\" AS PAYMENT_YEAR,\n" +
"     PAYMENT.\"PROFIT\" AS PAYMENT_PROFIT,\n" +
"     PAYMENT.\"KHASM\" AS PAYMENT_KHASM,\n" +
"     IMAGE_TABLE.\"ID\" AS IMAGE_TABLE_ID,\n" +
"     IMAGE_TABLE.\"IMAGE\" AS IMAGE_TABLE_IMAGE\n" +
"FROM\n" +
"     \"SERA\".\"SALES\" SALES,\n" +
"     \"SERA\".\"PAYMENT\" PAYMENT,\n" +
"     \"SERA\".\"IMAGE_TABLE\" IMAGE_TABLE\n" +
"where SALES.\"CUSTOMER_ID\"='"+lblCustomerId.getText()+"'" +
"and  PAYMENT.\"CUSTOMER_ID\"='"+lblCustomerId.getText()+"'";
            JRDesignQuery newquery= new JRDesignQuery();
            newquery.setText(sql);
            jd.setQuery(newquery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp,false);
    } catch (Exception e) {
            e.printStackTrace();
        }



}
public void select(){
        
        try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM Store where id="+id; 
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblStore.setModel(dtm);
           
            dtm.addColumn("سعر الكرتونه");
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

                            
                            rs.getDouble("PRICE"),
                            rs.getInt("farth"),
                            rs.getString("color"),
                            rs.getInt("QUANTITY"),
                            rs.getString("name"),
                            rs.getInt("id"),
                        
                                 
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
public void select_Store_Type(){
        
        try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM Store where name like '%"+txtTypeSearch.getText()+"%'"; 
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblStore.setModel(dtm);
           
            dtm.addColumn("سعر الكرتونه");
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

                            
                            rs.getDouble("PRICE"),
                            rs.getInt("farth"),
                            rs.getString("color"),
                            rs.getInt("QUANTITY"),
                            rs.getString("name"),
                            rs.getInt("id"),
                        
                                 
                                               }
                                  );
                            }
            
            stmt.close();
            conn.close();
                 
                  

        }
        catch(Exception e){
            
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error");
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
      } 
public void empty_table(){
        
      
            DefaultTableModel dtm=new DefaultTableModel();
            tblStore.setModel(dtm);
           
            dtm.addColumn("سعر الكرتونه");
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
       
       
      } 
public void select_payment(){
        
        try
        {
            Class.forName(Driver);
            conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM payment where customer_id="+lblCustomerId.getText(); 
            
            DefaultTableModel dtm=new DefaultTableModel();
            tblsales.setModel(dtm);
            dtm.addColumn("السعر");
            dtm.addColumn("الفرز");
            dtm.addColumn("اللون");
            dtm.addColumn("الكميه"); 
            dtm.addColumn("الصنف");
            dtm.addColumn("م");
            dtm.addColumn("رقم_الصنف");
       
           
          // Hide a Column -------------------------------------------------
            tblsales.getColumn("م").setPreferredWidth(0);
             tblsales.getColumn("م").setWidth(0);
               tblsales.getColumn("م").setMinWidth(0);
                tblsales.getColumn("م").setMaxWidth(0);
               //------------------------------------------------------------      
        tblsales.getColumn("رقم_الصنف").setPreferredWidth(0);
             tblsales.getColumn("رقم_الصنف").setWidth(0);
               tblsales.getColumn("رقم_الصنف").setMinWidth(0);
                tblsales.getColumn("رقم_الصنف").setMaxWidth(0);
                
            ResultSet rs= stmt.executeQuery(query);
             
           
            while(rs.next()){
                        dtm.addRow(new Object[]{
                            rs.getDouble("PRICE"),
                            rs.getInt("farth"),
                            rs.getString("color"),
                            rs.getInt("QUANTITY"),
                            rs.getString("type"),
                            rs.getInt("id"),
                             rs.getInt("type_id")
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
public void Select_customer_id(){
        try{
        
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM employee where type='المدير'"; 
            ResultSet rs= stmt.executeQuery(query); 
            while(rs.next()){
                lblCustomerId.setText(rs.getInt("customer_id")+"");
                        }
             
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
public void Select_From_Stores(){
        try{
        
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM store where id="+id; 
            ResultSet rs= stmt.executeQuery(query); 
     
            while(rs.next()){
             price=rs.getDouble("price");
             profit=rs.getDouble("profit");
             farth=rs.getInt("farth");
             color=rs.getString("color");
             last_quantity=rs.getInt("quantity");
             type=rs.getString("name");
                        }
             
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
public void Select_From_Payment(){
        try{
        
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            Statement stmt=conn.createStatement();
            String query="SELECT * FROM payment where id="+id_Sales; 
            
            ResultSet rs= stmt.executeQuery(query); 
            
            while(rs.next()){
             
             payment_quantity=rs.getInt("quantity");
          
                        }
             
            stmt.close();
            conn.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
       }
public void allmoney(){
  
        double sum=0;
        double[] sumArr = new double[tblsales.getRowCount()];
        for (int i = 0; i < tblsales.getRowCount(); i++) {
            sumArr[i]=   Double.parseDouble(tblsales.getValueAt(i, 0).toString());
            }       
         for (int i = 0; i < sumArr.length;i++){
                     sum+=sumArr[i];
                  
         }

          lblTotal.setText(""+sum);
   }
public void insert_Payment(){
             
             try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="insert into payment(type, QUANTITY, PRiCE,CUSTOMER_NAME,customer_id,datee,farth,color,type_id,emp,month,year,profit)"
                    +"Values(?,?,?,?,?,?,?,?,?,?,?,?,?)";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(1, type );
              stmt.setInt(2, quantity);
              double total=quantity*price;
              stmt.setDouble(3,total);
              stmt.setString(4,txtCustomerName.getText());
              stmt.setInt(5,Integer.parseInt(lblCustomerId.getText()));
              stmt.setString(6,lblDate.getText());
              stmt.setInt(7,farth);
              stmt.setString(8,color);
              stmt.setInt(9,id);
              stmt.setString(10,lblName.getText());
              stmt.setInt(11,month);
              stmt.setInt(12,year);
               stmt.setDouble(13,profit);
              //stmt.setInt(2,cmbId.getSelectedIndex()+1);
             
              int row=stmt.executeUpdate();
              if(row>0){
                  update();
                  select();
                  select_payment();
              }
              stmt.close();
              conn.close();
             // select_store();

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب ادخال اسم المشترى");
            e.printStackTrace();
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
        
         }
public void insert_Sales(){
             
             try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="insert into sales(customer_name, customer_id, datee,month,year,emp,total,time)"
                    +"Values(?,?,?,?,?,?,?,?)";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
           
              stmt.setString(1, txtCustomerName.getText() );
              stmt.setInt(2,Integer.parseInt(lblCustomerId.getText()));
              stmt.setString(3,lblDate.getText());
              stmt.setInt(4,month);
              stmt.setInt(5,year);
              stmt.setString(6,lblName.getText());
              stmt.setDouble(7,Double.parseDouble(lblTotal.getText()));
               stmt.setString(8,lblHours.getText());
               
              int row=stmt.executeUpdate();
              if(row>0){
                  lblTotal.setText("0.0");
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
public void update(){
       try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="update store set"
                           + "  quantity=?"
                           + " where id=?";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
            int fina=last_quantity-quantity;
             stmt.setInt(1,fina);
             stmt.setInt(2,id);
           
             
             
              int row=stmt.executeUpdate();
              if(row>0){
        
              }
              
              stmt.close();
              conn.close();
// select_store();
              
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب ادخال رقم الصنف");
            e.printStackTrace();
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
         
  }
public void delete_payment(){
             
                try
            {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="delete from payment where ID = ?";
            PreparedStatement stmt =conn.prepareStatement(inserQury);
             stmt.setInt(1, id_Sales);
              int row=stmt.executeUpdate();
              
              if(row>0){
           select_payment();
              }
              stmt.close();
              conn.close();
                    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
         
        }
        
         }
public void delete_all_payment(){
             
                try
            {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="delete from payment where customer_id = ?";
            PreparedStatement stmt =conn.prepareStatement(inserQury);
             stmt.setInt(1, Integer.parseInt(lblCustomerId.getText()));
              int row=stmt.executeUpdate();
              if(row>0){
           select_payment();
              }
              stmt.close();
              conn.close();
                    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
         
        }
        
         }
public void update_storage(){
            
          /*          dtm.addColumn("السعر");0
            dtm.addColumn("الفرز");1
            dtm.addColumn("اللون");2
            dtm.addColumn("الكميه"); 3
            dtm.addColumn("الصنف");4
            dtm.addColumn("م");5
            dtm.addColumn("رقم_الصنف");6
*/  
        
        int s = 0;
        int result=0;
        int[] Type_id_Arr = new int[tblsales.getRowCount()];
        int[] num_Type_Arr = new int[tblsales.getRowCount()];
        for (int i = 0; i < tblsales.getRowCount(); i++) {
            num_Type_Arr[i]=   Integer.parseInt(tblsales.getValueAt(i, 3).toString());
            Type_id_Arr[i]=  Integer.parseInt( tblsales.getValueAt(i, 6).toString());
              try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="update store set"
                           + "  quantity=quantity+?"
                           + " where id=?";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
          
             stmt.setInt(1, num_Type_Arr[i]);
              stmt.setInt(2,Type_id_Arr[i]);
           
             conn.setAutoCommit(false);
              int row=stmt.executeUpdate();
              if(row>0){
    
              }
              stmt.close();
              conn.close();
              
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب ادخال رقم الصنف");
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
             
            
        }
        
         
    }
public void update_Store_After_Delete_Payment(){
       try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="update store set"
                           + "  quantity=quantity + ?"
                           + " where id=?";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
             stmt.setInt(1,payment_quantity);
             stmt.setInt(2,type_id);
           
             
             
              int row=stmt.executeUpdate();
              if(row>0){
        select();
              }
              
              stmt.close();
              conn.close();
// select_store();
              
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب ادخال رقم الصنف");
            e.printStackTrace();
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
         
  }
public void update_customer_id(){
       try
        {
            Class.forName(Driver);
            Connection conn= DriverManager.getConnection(DatabaseUrl, USER, PASS);
            
            String inserQury="update employee set"
                           + "  customer_id=customer_id + ?"
                           + " where type='المدير'";  
            
            
            PreparedStatement stmt =conn.prepareStatement(inserQury);
             stmt.setInt(1,1);
           
             
             
              int row=stmt.executeUpdate();
              if(row>0){
              }
              
              stmt.close();
              conn.close();
// select_store();
              
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "يجب ادخال رقم الصنف");
            e.printStackTrace();
          // JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            
             JOptionPane.showMessageDialog(null, "Driver......");
        }
         
  }
 public void print(){
         MessageFormat header=new MessageFormat("الاسم :"+txtCustomerName.getText()+"......."+" التاريخ:"+lblDate.getText());
        MessageFormat footer=new MessageFormat("Page{0,number,integer}"+"........... الاجمالى:"+lblTotal.getText());
        try {
            tblsales.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        //} catch (Exception e) {
         //   JOptionPane.showMessageDialog(null, e.getMessage());
       // }
        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n",e.getMessage());
            
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
 public void test_num_item(){

        try
        {
           
            Class.forName(Driver);
             conn= DriverManager.getConnection(DatabaseUrl,USER,PASS);
            //Statement stmt=conn.createStatement();
            
            String SelectQuery="SELECT  * FROM store where id=?"; 
            PreparedStatement stmt =conn.prepareStatement(SelectQuery);
            stmt.setInt(1,id);
            
            
            ResultSet rs= stmt.executeQuery();
              
            while(rs.next()){
              
                
                if(rs.getInt("QUANTITY")<quantity){
                     JOptionPane.showMessageDialog(null, "لا يوجد عدد كافى فالمخزن");
                }else{
                     insert_Payment();
                     allmoney();
                   //JOptionPane.showMessageDialog(null, "here"); 
                }
                            } 
                 
            stmt.close();
            conn.close();
    
        }
    
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "يجب أكمال البيانات بطريقه صحيحه");
         //  JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancele;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate2;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblStore;
    private javax.swing.JTable tblsales;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtTypeSearch;
    // End of variables declaration//GEN-END:variables
}
