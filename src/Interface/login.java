package Interface;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

public class login extends javax.swing.JFrame {
    
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

    public login() {
        initComponents();
        
        setIconImage();
        setTitle("CEB Employee Information System");
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false); 
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("8.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        unamebox = new javax.swing.JTextField();
        pwordbox = new javax.swing.JPasswordField();
        signinbtn = new javax.swing.JButton();
        fpwbtn = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unamebox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unamebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unameboxKeyPressed(evt);
            }
        });
        jPanel1.add(unamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 210, 40));

        pwordbox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pwordbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordboxActionPerformed(evt);
            }
        });
        pwordbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwordboxKeyPressed(evt);
            }
        });
        jPanel1.add(pwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 210, 40));

        signinbtn.setBackground(new java.awt.Color(204, 204, 255));
        signinbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signinbtn.setText("Sign Up");
        signinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtnActionPerformed(evt);
            }
        });
        jPanel1.add(signinbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

        fpwbtn.setBackground(new java.awt.Color(204, 204, 255));
        fpwbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fpwbtn.setText("Forget Password");
        fpwbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpwbtnActionPerformed(evt);
            }
        });
        jPanel1.add(fpwbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, 30));

        loginbtn.setBackground(new java.awt.Color(204, 204, 255));
        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 80, 30));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Name");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 40));

        jPanel4.setBackground(new java.awt.Color(153, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Password");
        jPanel4.add(jLabel2);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 170));

        setSize(new java.awt.Dimension(444, 209));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void pwordboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwordboxActionPerformed
     
    }//GEN-LAST:event_pwordboxActionPerformed

    private void signinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtnActionPerformed
        signup s1 = new signup();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signinbtnActionPerformed

    private void fpwbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpwbtnActionPerformed
        forget f1 = new forget();
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fpwbtnActionPerformed

    @SuppressWarnings("deprecation")
    
    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        this.onLog();
    }//GEN-LAST:event_loginbtnActionPerformed

    private void pwordboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwordboxKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.pkp();
        }
    }//GEN-LAST:event_pwordboxKeyPressed

    private void unameboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameboxKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            pwordbox.requestFocus();
        }
    }//GEN-LAST:event_unameboxKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fpwbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pwordbox;
    private javax.swing.JButton signinbtn;
    private javax.swing.JTextField unamebox;
    // End of variables declaration//GEN-END:variables

    private void onLog() {
        conn = MySqlConnect.ConnectDB();
        String Sql = "Select * from user where admin_epf_no=? and password=?";
        try{
            pst = conn.prepareStatement(Sql);
            pst.setString(1,unamebox.getText());
            pst.setString(2,pwordbox.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){
                Home2 w = new Home2();
                w.setVisible(false);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid User name or Password","Access Denied",JOptionPane.ERROR_MESSAGE);
            }  
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void pkp() {
    conn = MySqlConnect.ConnectDB();
    String Sql = "Select * from user where admin_epf_no=? and password=?";
            
        try{
            pst = conn.prepareStatement(Sql);
            pst.setString(1,unamebox.getText());
            pst.setString(2,pwordbox.getText());
            rs = pst.executeQuery();
                
            if(rs.next()){
                Home2 w = new Home2();
                w.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid User name or Password","Access Denied",JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
