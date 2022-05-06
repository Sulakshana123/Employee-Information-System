package Interface;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class forget extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public forget() {
        initComponents();

        setIconImage();
        setTitle("CEB Employee Information System");
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        this.errorMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        epftxt = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        cpwd = new javax.swing.JPasswordField();
        setpwbtn = new javax.swing.JButton();
        bfpbtn = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("User EPF No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("New Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        epftxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        epftxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                epftxtKeyPressed(evt);
            }
        });
        jPanel1.add(epftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 240, 30));

        pwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdKeyPressed(evt);
            }
        });
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 240, 30));

        cpwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpwdKeyPressed(evt);
            }
        });
        jPanel1.add(cpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 240, 30));

        setpwbtn.setBackground(new java.awt.Color(204, 204, 255));
        setpwbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setpwbtn.setText("Reset Password");
        setpwbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setpwbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpwbtnActionPerformed(evt);
            }
        });
        setpwbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                setpwbtnKeyPressed(evt);
            }
        });
        jPanel1.add(setpwbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 150, 30));

        bfpbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bfpbtn.setText("Back");
        bfpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfpbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bfpbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        errorMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 51, 51));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("jLabel1");
        jPanel1.add(errorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 280, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        setSize(new java.awt.Dimension(435, 239));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setpwbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setpwbtnActionPerformed
        this.fpd();
    }//GEN-LAST:event_setpwbtnActionPerformed

    private void bfpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfpbtnActionPerformed
        login l4 = new login();
        l4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bfpbtnActionPerformed

    private void epftxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_epftxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pwd.requestFocus();
        }
    }//GEN-LAST:event_epftxtKeyPressed

    private void pwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cpwd.requestFocus();
        }
    }//GEN-LAST:event_pwdKeyPressed

    private void cpwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpwdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.fpd();
        }
    }//GEN-LAST:event_cpwdKeyPressed

    private void setpwbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_setpwbtnKeyPressed

    }//GEN-LAST:event_setpwbtnKeyPressed

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
            java.util.logging.Logger.getLogger(forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bfpbtn;
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JTextField epftxt;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JButton setpwbtn;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("8.png")));
    }

    private void fpd() {
        conn = MySqlConnect.ConnectDB();
        try {
            String v1 = epftxt.getText();
            String v2 = pwd.getText();
            String v3 = cpwd.getText();

            if (!v2.equals(v3)) {
                 errorMessage.setText("Passwords do not match!");
                 errorMessage.setVisible(true);
            } else {
                String sql = "update user set password='" + v2 + "' where admin_epf_no='" + v1 + "' ";
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Reset Password Sucessfull");
                login l4 = new login();
                l4.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to reset password");
        }
    }
}
