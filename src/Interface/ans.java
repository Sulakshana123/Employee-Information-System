package Interface;

import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.KeyEvent;

public class ans extends javax.swing.JFrame {

    private ResultSet rs;
    private int dataCount = 0;
    
    static Object getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setModel(TableModel resultSetToTableModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Connection conn = null;
    PreparedStatement pst = null;

    public ans() {
        initComponents();

        setIconImage();
        setTitle("CEB Employee Information System");
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        this.udropans();
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("8.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        udropans = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        sboxd = new javax.swing.JTextField();
        Genbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ans = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Unit");

        udropans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Unit -" }));
        udropans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                udropansKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Designation");

        sboxd.setBackground(new java.awt.Color(255, 255, 153));
        sboxd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sboxdActionPerformed(evt);
            }
        });
        sboxd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sboxdKeyReleased(evt);
            }
        });

        Genbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Genbtn.setText("Generate");
        Genbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenbtnActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EPF No", "Name", "Designation", "Age", "Service"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ansMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ans);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Age & Service");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sboxd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(udropans, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(248, 248, 248)
                        .addComponent(Genbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(udropans, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sboxd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Genbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(870, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void GenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenbtnActionPerformed
        this.Anst();
    }//GEN-LAST:event_GenbtnActionPerformed

    private void sboxdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sboxdActionPerformed

    }//GEN-LAST:event_sboxdActionPerformed

    private void sboxdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sboxdKeyReleased
        this.onSearchdans();
    }//GEN-LAST:event_sboxdKeyReleased

    private void ansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansMouseClicked
        
    }//GEN-LAST:event_ansMouseClicked

    private void udropansKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_udropansKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        Genbtn.requestFocus();
        this.Anst();
        } 
    }//GEN-LAST:event_udropansKeyPressed

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
            java.util.logging.Logger.getLogger(ans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Genbtn;
    private javax.swing.JTable ans;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sboxd;
    private javax.swing.JComboBox<String> udropans;
    // End of variables declaration//GEN-END:variables

    private void onSearchdans() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT user_epf_no,name_with_initial,designation,dob,appointment_date FROM employee WHERE designation='" + sboxd.getText() + "'";
            pst = conn.prepareStatement(sql);
            rs = (ResultSet) pst.executeQuery();
            ans.setModel(DbUtils.resultSetToTableModel(rs));

            if (rs.first()) {
            }
        } catch (Exception e) {
        }
    }

    private void udropans() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  unitreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();

            while (rs.next()) {
                String unit = rs.getString("unit_name");
                udropans.addItem(unit);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Anst() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT user_epf_no,name_with_initial,designation,dob,appointment_date FROM employee WHERE unit = '" + udropans.getSelectedItem() + "' ORDER BY appointment_date ASC ";
            pst = conn.prepareStatement(sql);
            rs = (ResultSet) pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) ans.getModel();

            int i = 0;
            while (rs.next()) {
                dtm.setRowCount(i + 1);
                Object epf = rs.getString("user_epf_no");
                Object name = rs.getString("name_with_initial");
                Object desi = rs.getString("designation");
                Object dobi = rs.getString("dob");
                Object ad = rs.getString("appointment_date");
                Object age = this.getDateDifferenceInYears(dobi.toString(), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date()));
                Object serviceLength = this.getDateDifferenceInYears(ad.toString(), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date()));

                dtm.setValueAt(epf, i, 0);
                dtm.setValueAt(name, i, 1);
                dtm.setValueAt(desi, i, 2);
                dtm.setValueAt(age, i, 3);
                dtm.setValueAt(serviceLength, i, 4);
                i++;
            }
            dataCount = i;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private int getDateDifferenceInYears(String startDate2, String endDate2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD", Locale.ENGLISH);
        Date firstDate2 = sdf.parse(startDate2);
        Date secondDate2 = sdf.parse(endDate2);
        long diffInMillies = Math.abs(secondDate2.getTime() - firstDate2.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return (int) (diff / 365);
    }

    private void generatePDF() {
        try {
            Document my_pdf_report = new Document();
            PdfWriter.getInstance(my_pdf_report, new FileOutputStream("pdf_report_from_sql_using_java.pdf"));
            my_pdf_report.open();
            //we have four columns in our table
            PdfPTable my_report_table = new PdfPTable(dataCount);
            //create a cell object
            PdfPCell table_cell;
            while (rs.next()) {
                String epf = rs.getString("user_epf_no");
                table_cell = new PdfPCell(new Phrase(epf));
                my_report_table.addCell(table_cell);

                String name = rs.getString("name_with_initial");
                table_cell = new PdfPCell(new Phrase(name));
                my_report_table.addCell(table_cell);

                String desi = rs.getString("designation");
                table_cell = new PdfPCell(new Phrase(desi));
                my_report_table.addCell(table_cell);

                String dob = rs.getString("dob");
                Object age = this.getDateDifferenceInYears(dob.toString(), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date()));
                table_cell = new PdfPCell(new Phrase(age.toString()));
                my_report_table.addCell(table_cell);

                String ad = rs.getString("appointment_date");
                Object serviceLength = this.getDateDifferenceInYears(ad.toString(), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date()));
                table_cell = new PdfPCell(new Phrase(serviceLength.toString()));
                my_report_table.addCell(table_cell);
            }
            my_pdf_report.add(my_report_table);
            my_pdf_report.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    
}
