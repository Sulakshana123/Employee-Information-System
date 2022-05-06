package Interface;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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
import net.proteanit.sql.DbUtils;

public class ppd extends javax.swing.JFrame {
    
    private ResultSet rs;
    private int dataCount = 0;
    Connection conn = null;
    PreparedStatement pst = null;

    public ppd() {
        initComponents();
        
        setIconImage();
        setTitle("CEB Employee Information System");
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        this.udropppd();
        this.ddropppd();
        this.gdropppd();
    }
    
    private void setIconImage(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("8.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        udropppd = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        gdrop = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ddrop = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dbox = new javax.swing.JTextField();
        Genbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ppdsp = new javax.swing.JScrollPane();
        ppdt = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Unit");

        udropppd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Unit -" }));
        udropppd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                udropppdKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Grade");

        gdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Grade -" }));
        gdrop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gdropKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Designation");

        ddrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Designation -" }));
        ddrop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ddropKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Designation");

        dbox.setBackground(new java.awt.Color(255, 255, 153));
        dbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dboxMouseReleased(evt);
            }
        });
        dbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dboxActionPerformed(evt);
            }
        });
        dbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dboxKeyReleased(evt);
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

        ppdsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ppdt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "EPF No", "Name", "Unit", "Designation", "Grade", "PPD", "Service"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ppdsp.setViewportView(ppdt);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Present Promotion Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ppdsp)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(udropppd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(gdrop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ddrop, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dbox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Genbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(udropppd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ddrop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gdrop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Genbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(ppdsp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        setSize(new java.awt.Dimension(838, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gdropKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gdropKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Genbtn.requestFocus();
            this.genPPD();
        } 
    }//GEN-LAST:event_gdropKeyPressed

    private void ddropKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ddropKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            gdrop.requestFocus();
        } 
    }//GEN-LAST:event_ddropKeyPressed

    private void dboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dboxActionPerformed
        
    }//GEN-LAST:event_dboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dboxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dboxMouseReleased
        
    }//GEN-LAST:event_dboxMouseReleased

    private void GenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenbtnActionPerformed
        this.genPPD();
    }//GEN-LAST:event_GenbtnActionPerformed

    private void dboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dboxKeyReleased
        this.onSearchdppd();
    }//GEN-LAST:event_dboxKeyReleased

    private void udropppdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_udropppdKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ddrop.requestFocus();    
        } 
    }//GEN-LAST:event_udropppdKeyPressed

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
            java.util.logging.Logger.getLogger(ppd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ppd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ppd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ppd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ppd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Genbtn;
    private javax.swing.JTextField dbox;
    private javax.swing.JComboBox<String> ddrop;
    private javax.swing.JComboBox<String> gdrop;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane ppdsp;
    private javax.swing.JTable ppdt;
    private javax.swing.JComboBox<String> udropppd;
    // End of variables declaration//GEN-END:variables

    private void onSearchdppd() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT user_epf_no,name_with_initial,unit,designation,grade,present_promoted_date FROM employee WHERE designation='"+dbox.getText()+"'";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            ppdt.setModel(DbUtils.resultSetToTableModel(rs));
            
            if(rs.first()){   
            }
        }
        catch (Exception e){
        }
    }

    private void udropppd() {
        try{
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  unitreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                String unit=rs.getString("unit_name");
                udropppd.addItem(unit);
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void ddropppd() {
        try{
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  designationreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                String designation=rs.getString("designation");
                ddrop.addItem(designation);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void gdropppd() {
       try{
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  gradereg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                String grade=rs.getString("grade");
                gdrop.addItem(grade);
            }  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void genPPD(){
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT user_epf_no,name_with_initial,unit,designation,grade,present_promoted_date FROM employee WHERE unit = '"+udropppd.getSelectedItem()+"' && designation = '"+ddrop.getSelectedItem()+"' && grade = '"+gdrop.getSelectedItem()+"' ORDER BY present_promoted_date ASC" ;
            pst = conn.prepareStatement(sql);
            rs = (ResultSet) pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) ppdt.getModel();

            int i = 0;
            while (rs.next()) {
                dtm.setRowCount(i + 1);
                Object epf = rs.getString("user_epf_no");
                Object name = rs.getString("name_with_initial");
                Object uni = rs.getString("unit");
                Object desi = rs.getString("designation");
                Object gra = rs.getString("grade");
                Object ppd = rs.getString("present_promoted_date");
                Object serviceLength = this.getDateDifferenceInYears(ppd.toString(), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date()));

                dtm.setValueAt(epf, i, 0);
                dtm.setValueAt(name, i, 1);
                dtm.setValueAt(uni, i, 2);
                dtm.setValueAt(desi, i, 3);
                dtm.setValueAt(gra, i, 4);
                dtm.setValueAt(ppd, i, 5);
                dtm.setValueAt(serviceLength, i, 6);
                i++;
            }
            dataCount = i;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private int getDateDifferenceInYears(String startDate1, String endDate) throws ParseException  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD", Locale.ENGLISH);
        Date firstDate = sdf.parse(startDate1);
        Date secondDate = sdf.parse(endDate);
        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS); 
        return (int)(diff/365);
    }

}
