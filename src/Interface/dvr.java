package Interface;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dvr extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    private ResultSet rs;
    

    public dvr() {
        initComponents();
        
        setIconImage();
        setTitle("CEB Employee Information System");
        
        this.genUnit();
        this.genDesig();
        this.genGrade();
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("8.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dvudrop = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dvdrop = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dvgdrop = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dvgbtn = new javax.swing.JButton();
        dvbbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        noeuvrlbl = new javax.swing.JLabel();
        noeuvrlbl1 = new javax.swing.JLabel();
        noeuvrlbl2 = new javax.swing.JLabel();
        noeuvrlbl3 = new javax.swing.JLabel();
        des = new javax.swing.JLabel();
        uni = new javax.swing.JLabel();
        gra = new javax.swing.JLabel();
        noemp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dvrt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Designation Vice Report");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 230, 40));

        dvudrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Unit -" }));
        dvudrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvudropActionPerformed(evt);
            }
        });
        jPanel1.add(dvudrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Unit");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        dvdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Designation -" }));
        dvdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvdropActionPerformed(evt);
            }
        });
        jPanel1.add(dvdrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Designation");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        dvgdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Grade -" }));
        jPanel1.add(dvgdrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 180, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Grade");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        dvgbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dvgbtn.setText("Generate");
        dvgbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dvgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvgbtnActionPerformed(evt);
            }
        });
        jPanel1.add(dvgbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 120, 30));

        dvbbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dvbbtn.setText("Back");
        dvbbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvbbtnActionPerformed(evt);
            }
        });
        jPanel1.add(dvbbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 120, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        noeuvrlbl.setBackground(new java.awt.Color(255, 51, 255));
        noeuvrlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noeuvrlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noeuvrlbl.setText("Unit      =  ");

        noeuvrlbl1.setBackground(new java.awt.Color(255, 51, 255));
        noeuvrlbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noeuvrlbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noeuvrlbl1.setText("Designation      =  ");

        noeuvrlbl2.setBackground(new java.awt.Color(255, 51, 255));
        noeuvrlbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noeuvrlbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noeuvrlbl2.setText("Grade      =  ");

        noeuvrlbl3.setBackground(new java.awt.Color(255, 51, 255));
        noeuvrlbl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noeuvrlbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noeuvrlbl3.setText("No of Employees     =  ");

        des.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        uni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        gra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        noemp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noeuvrlbl3)
                    .addComponent(noeuvrlbl2)
                    .addComponent(noeuvrlbl1)
                    .addComponent(noeuvrlbl))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uni, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noeuvrlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noeuvrlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(noeuvrlbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gra, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noeuvrlbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noemp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 730, 200));

        dvrt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EPF No", "Name", "DOB", "Appointment Date", "PPD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(dvrt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 730, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(823, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dvgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvgbtnActionPerformed
        this.setUnit();
        this.setDesi();
        this.setNOE();
        this.DVRT();
    }//GEN-LAST:event_dvgbtnActionPerformed

    private void dvbbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvbbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_dvbbtnActionPerformed

    private void dvdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvdropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dvdropActionPerformed

    private void dvudropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvudropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dvudropActionPerformed

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
            java.util.logging.Logger.getLogger(dvr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dvr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dvr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dvr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dvr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel des;
    private javax.swing.JButton dvbbtn;
    private javax.swing.JComboBox<String> dvdrop;
    private javax.swing.JButton dvgbtn;
    private javax.swing.JComboBox<String> dvgdrop;
    private javax.swing.JTable dvrt;
    private javax.swing.JComboBox<String> dvudrop;
    private javax.swing.JLabel gra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noemp;
    private javax.swing.JLabel noeuvrlbl;
    private javax.swing.JLabel noeuvrlbl1;
    private javax.swing.JLabel noeuvrlbl2;
    private javax.swing.JLabel noeuvrlbl3;
    private javax.swing.JLabel uni;
    // End of variables declaration//GEN-END:variables

    private void genUnit() {
        try{
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  unitreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                String unit=rs.getString("unit_name");
                dvudrop.addItem(unit);
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void genDesig() {
        try{
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  designationreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                String unit=rs.getString("designation");
                dvdrop.addItem(unit);
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void genGrade() {
       try{
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  gradereg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                String unit=rs.getString("grade");
                dvgdrop.addItem(unit);
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void setUnit() {
        String selectedValue = dvudrop.getSelectedItem().toString();
        uni.setText(String.valueOf(selectedValue));
    }

    private void setDesi() {
        String selectedValue = dvdrop.getSelectedItem().toString();
        des.setText(String.valueOf(selectedValue));
    }

    

    private void setNOE(){
        String selectedValue = dvgdrop.getSelectedItem().toString();
        gra.setText(String.valueOf(selectedValue));
        
        try{
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT COUNT(*) as employeeCount FROM employee WHERE unit = '"+dvudrop.getSelectedItem()+"'&& designation = '"+dvdrop.getSelectedItem()+"'&& grade = '"+dvgdrop.getSelectedItem()+"'" ;
         
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                int count = rs.getInt("employeeCount");
                noemp.setText(String.valueOf(count));
            }
        }catch(Exception e){
            System.err.println("");
        }
    }

    private void DVRT(){
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT user_epf_no,name_with_initial,dob,appointment_date,present_promoted_date FROM employee WHERE unit = '"+dvudrop.getSelectedItem()+"' && designation = '"+dvdrop.getSelectedItem()+"' && grade = '"+dvgdrop.getSelectedItem()+"'";
            pst = conn.prepareStatement(sql);
            rs = (ResultSet) pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) dvrt.getModel();

            int i = 0;
            while (rs.next()) {
                dtm.setRowCount(i + 1);
                Object epf = rs.getString("user_epf_no");
                Object name = rs.getString("name_with_initial");
                Object dob = rs.getString("dob");
                Object ad = rs.getString("appointment_date");
                Object ppd = rs.getString("present_promoted_date");

                dtm.setValueAt(epf, i, 0);
                dtm.setValueAt(name, i, 1);
                dtm.setValueAt(dob, i, 2);
                dtm.setValueAt(ad, i, 3);
                dtm.setValueAt(ppd, i, 4);
                i++;
            }
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
}
