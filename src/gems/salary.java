/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Hp
 */
public class salary extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form salary
     */
    public salary() {
        initComponents();
        setRecordsToTable();
    }

    public void setRecordsToTable() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GEMS;selectMethod=cursor;" + "encrypt=true;trustServerCertificate=true;", "sa", "123456");
            String query1 = "SELECT * FROM Salary";
            PreparedStatement pst = con.prepareStatement(query1);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String Employee_Id = rs.getString("Employee_Id");
                String Transaction_Id = rs.getString("Transaction_Id");
                String Salary_Grade = rs.getString("Salary_Grade");
                String Transaction_Date = rs.getString("Transaction_Date");
                String SalaryYear = rs.getString("SalaryYear");
                String SalaryMonth = rs.getString("SalaryMonth");
                String Basic_Salary = rs.getString("Basic_Salary");
                String Total_Salary = rs.getString("Total_Salary");
                String Addition = rs.getString("Addition");
                String Deduction = rs.getString("Deduction");
                String Payment_Status = rs.getString("Payment_Status");

                Object[] obj = {Employee_Id, Transaction_Id, Salary_Grade, Transaction_Date, SalaryYear, SalaryMonth, Basic_Salary, Total_Salary, Addition, Deduction, Payment_Status};

                model = (DefaultTableModel) jTable1.getModel();
                model.addRow(obj);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void search(String str){
        model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs =new TableRowSorter<>(model);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        Search_bar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SalaryMonth = new javax.swing.JTextField();
        TranDate = new javax.swing.JTextField();
        PaymentStatus = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Insert = new javax.swing.JButton();
        EmpID = new javax.swing.JTextField();
        SalaryYear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2473, 1366));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Salary");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 160, 36));

        BtnBack.setText("Return");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 40));

        Search_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_barActionPerformed(evt);
            }
        });
        Search_bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_barKeyReleased(evt);
            }
        });
        jPanel1.add(Search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 40, 410, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Search:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 30, 80, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1830, 100));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Salary Month:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 129, 54));

        SalaryMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryMonthActionPerformed(evt);
            }
        });
        jPanel2.add(SalaryMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 203, 36));

        TranDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranDateActionPerformed(evt);
            }
        });
        jPanel2.add(TranDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 203, 40));

        PaymentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentStatusActionPerformed(evt);
            }
        });
        jPanel2.add(PaymentStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 203, 30));

        Update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 100, 47));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Tran Id", "Salary Grade", "Tran Date", "SalaryYear", "SalaryMonth", "Basic Salary", "Total salary", "Addition", "Deduction", "Payment Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 1400, 730));

        Insert.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel2.add(Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 91, 47));

        EmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIDActionPerformed(evt);
            }
        });
        jPanel2.add(EmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 203, 36));

        SalaryYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryYearActionPerformed(evt);
            }
        });
        jPanel2.add(SalaryYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 203, 36));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Employee ID:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 129, 54));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Payment Status:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, 54));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Salary Year:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 129, 54));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Transaction Date:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 160, 54));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1920, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        MainForm m=new MainForm();
        m.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void SalaryMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalaryMonthActionPerformed

    private void TranDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TranDateActionPerformed

    private void PaymentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentStatusActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GEMS;selectMethod=cursor;" + "encrypt=true;trustServerCertificate=true;", "sa", "123456");
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 1).toString());
            System.out.println(value);
            //String date = (jTable2.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE Salary SET Employee_Id=?,Salary_Grade=?,Transaction_Date=?,Basic_salary=?,Total_salary=?,SalaryYear=?,SalaryMonth=?,Addition=?,Deduction=?,Payment_Status=?" + " where Transaction_Id=?";

            PreparedStatement pst = con.prepareStatement(query);

            String Employee_id = EmpID.getText();

            String query1 = "select * from Salary_Grade join Department \n"
                    + "on Department.Department_Id=Salary_Grade.Department_Id \n"
                    + "join Allowence on Allowence.department_id = Department.Department_Id\n"
                    + "where Department.Employee_Id=?";
            
            PreparedStatement g = con.prepareStatement(query1);
            
            g.setString(1, Employee_id);
         
            ResultSet s = g.executeQuery();
        
            s.next();
          
            String Grade = s.getString("Grade");
            
            System.out.println(Grade);
            String bs = s.getString("Basic_Salary");
            System.out.println(bs);
            String hrent = s.getString("House_rent");
            System.out.println(hrent);
            String mAllowence = s.getString("Medical_allowence");
            System.out.println(mAllowence);

            String Transportation_fee = s.getString("Transportation_fee");
            System.out.println(Transportation_fee);

            String query2 = "select COUNT(Entry_date) as ta, SUM(over_time) as TotO \n"
                    + "from Attendance join salary \n"
                    + "on Attendance.Employee_Id=Salary.Employee_Id \n"
                    + "where Attendance.Entry_Year=? and Attendance.Entry_Month=?";
 
            PreparedStatement atc = con.prepareStatement(query2);
            atc.setString(1, SalaryYear.getText());
            atc.setString(2, SalaryMonth.getText());

            ResultSet as = atc.executeQuery();
            as.next();
            String Total_Attendence = as.getString("ta");
            System.out.println(Total_Attendence);
            String Total_OverTime = as.getString("TotO");
            System.out.println(Total_OverTime);
             System.out.println("sa");
            int i = Integer.parseInt(Total_Attendence);
           
            double BasicSalaryInt =  Double.parseDouble(bs);
             
            int HouseRentInt = Integer.parseInt(hrent);
             
            int MedicalAllowenceInt = Integer.parseInt(mAllowence);
             
            int TransportationFeeInt = Integer.parseInt(Transportation_fee);
             
            int TOTi = Integer.parseInt(Total_OverTime);
            
            double Addition=0;
            double Deduction=0;
            
            Addition = ((TOTi/60)*((BasicSalaryInt/24)/8)/60);
            double SalaryPerDay = (BasicSalaryInt/24);
            double Salary;
            if (i >= 24) {
                 //System.out.println("Yes");
                 Salary=(BasicSalaryInt+(double)HouseRentInt+(double)MedicalAllowenceInt+(double)TransportationFeeInt+Addition);
            }else{
                 //System.out.println("NO");
                 Deduction=((24-i)*SalaryPerDay);
                 System.out.println(Deduction);
                Salary=(BasicSalaryInt+(double)HouseRentInt+(double)MedicalAllowenceInt+(double)TransportationFeeInt+Addition)-Deduction;
            }
            System.out.println(Salary);
            String TSalary = String.valueOf(Salary);
            String ASalary = String.valueOf(Addition);
            String DSalary = String.valueOf(Deduction);

            pst.setString(1, Employee_id);
            pst.setString(2, Grade);
            pst.setString(3, TranDate.getText());
            pst.setString(4, bs);
            pst.setString(5, TSalary);
            pst.setString(6,SalaryYear.getText());
            pst.setString(7,SalaryMonth.getText());
            pst.setString(8,ASalary);
            pst.setString(9,DSalary);
            pst.setString(10, PaymentStatus.getText());
            pst.setString(11, value);
            
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            setRecordsToTable();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
                                        
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GEMS;selectMethod=cursor;" + "encrypt=true;trustServerCertificate=true;", "sa", "123456");
            
            String query = "insert into Salary(Employee_Id,Salary_Grade,Transaction_Date,Basic_salary,Total_salary,SalaryYear,SalaryMonth,Addition,Deduction,Payment_Status)values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);

            
            
            
            String Employee_id = EmpID.getText();
            pst.setString(1, Employee_id);
            pst.setString(2, "Null");
            pst.setString(3, TranDate.getText());
            pst.setString(4, "0");
            pst.setString(5, "0");
            pst.setString(6,SalaryYear.getText());
            pst.setString(7,SalaryMonth.getText());
            pst.setString(8,"0");
            pst.setString(9,"0");
            pst.setString(10, PaymentStatus.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            setRecordsToTable();
            JOptionPane.showMessageDialog(null, "Inserted successfully!");
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            //System.out.println("notconnect");
        }
        //setRecordsToTable();


    }//GEN-LAST:event_InsertActionPerformed

    private void EmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpIDActionPerformed

    private void SalaryYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalaryYearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model1 = jTable1.getModel();
        EmpID.setText(model1.getValueAt(i, 0).toString());
        SalaryYear.setText(model1.getValueAt(i, 4).toString());
        SalaryMonth.setText(model1.getValueAt(i, 5).toString());
        TranDate.setText(model1.getValueAt(i, 3).toString());
        PaymentStatus.setText(model1.getValueAt(i, 10).toString());
        //attEmpId.setText(model1.getValueAt(i, 5).toString());
        //attOvtime.setText(model1.getValueAt(i,4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void Search_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_barKeyReleased
        // TODO add your handling code here:
        String searchString=Search_bar.getText();
        search(searchString);
    }//GEN-LAST:event_Search_barKeyReleased

    private void Search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_barActionPerformed

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
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JTextField EmpID;
    private javax.swing.JButton Insert;
    private javax.swing.JTextField PaymentStatus;
    private javax.swing.JTextField SalaryMonth;
    private javax.swing.JTextField SalaryYear;
    private javax.swing.JTextField Search_bar;
    private javax.swing.JTextField TranDate;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
