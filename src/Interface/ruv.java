package Interface;

import java.awt.Toolkit;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ruv extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    private ResultSet rs;

    public ruv() {
        initComponents();

        setIconImage();
        setTitle("CEB Employee Information System");
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        this.uvdropdb();
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("8.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uvdrop = new javax.swing.JComboBox<>();
        uvgbtn = new javax.swing.JButton();
        uvbbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        noeuvrlbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cnt = new javax.swing.JLabel();
        nme = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        uvrt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Unit Vice Report");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 160, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Unit");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, 30));

        uvdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Unit - " }));
        uvdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvdropActionPerformed(evt);
            }
        });
        jPanel1.add(uvdrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 180, 30));

        uvgbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uvgbtn.setText("Generate");
        uvgbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uvgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvgbtnActionPerformed(evt);
            }
        });
        jPanel1.add(uvgbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 120, 30));

        uvbbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uvbbtn.setText("Back");
        uvbbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvbbtnActionPerformed(evt);
            }
        });
        jPanel1.add(uvbbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 120, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        noeuvrlbl.setBackground(new java.awt.Color(255, 51, 255));
        noeuvrlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noeuvrlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noeuvrlbl.setText("Unit      =  ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("No of Employees      = ");

        cnt.setBackground(new java.awt.Color(255, 51, 255));
        cnt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        nme.setBackground(new java.awt.Color(255, 51, 255));
        nme.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noeuvrlbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nme, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nme, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cnt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(noeuvrlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 730, 130));

        uvrt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "EPF No", "Name", "Designation", "Grade", "DOB", "Appointment Date", "PPD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(uvrt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 730, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(807, 541));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uvgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvgbtnActionPerformed
        this.genUVR();
        this.UVRT();
    }//GEN-LAST:event_uvgbtnActionPerformed

    private void uvbbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvbbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_uvbbtnActionPerformed

    private void uvdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvdropActionPerformed
        
    }//GEN-LAST:event_uvdropActionPerformed

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
            java.util.logging.Logger.getLogger(ruv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ruv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ruv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ruv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ruv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nme;
    private javax.swing.JLabel noeuvrlbl;
    private javax.swing.JButton uvbbtn;
    private javax.swing.JComboBox<String> uvdrop;
    private javax.swing.JButton uvgbtn;
    private javax.swing.JTable uvrt;
    // End of variables declaration//GEN-END:variables

    private void uvdropdb() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  unitreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();

            while (rs.next()) {
                String unit = rs.getString("unit_name");
                uvdrop.addItem(unit);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void genUVR() {
        String selectedValue = uvdrop.getSelectedItem().toString();
        nme.setText(String.valueOf(selectedValue));

        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT COUNT(*) as employeeCount FROM employee WHERE unit = '" + uvdrop.getSelectedItem() + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int count = rs.getInt("employeeCount");
                cnt.setText(String.valueOf(count));
            }
        } catch (Exception e) {
            System.err.println("");
        }
    }

    private void UVRT() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT user_epf_no,name_with_initial,designation,grade,dob,appointment_date,present_promoted_date FROM employee WHERE unit = '" + uvdrop.getSelectedItem() + "'";
            pst = conn.prepareStatement(sql);
            rs = (ResultSet) pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) uvrt.getModel();

            int i = 0;
            while (rs.next()) {
                dtm.setRowCount(i + 1);
                Object epf = rs.getString("user_epf_no");
                Object name = rs.getString("name_with_initial");
                Object desi = rs.getString("designation");
                Object gra = rs.getString("grade");
                Object dob = rs.getString("dob");
                Object ad = rs.getString("appointment_date");
                Object ppd = rs.getString("present_promoted_date");

                dtm.setValueAt(epf, i, 0);
                dtm.setValueAt(name, i, 1);
                dtm.setValueAt(desi, i, 2);
                dtm.setValueAt(gra, i, 3);
                dtm.setValueAt(dob, i, 4);
                dtm.setValueAt(ad, i, 5);
                dtm.setValueAt(ppd, i, 6);
                i++;
            }
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    

}
