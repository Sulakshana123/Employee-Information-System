package Interface;

import codes.Util;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;

public class signup extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;

    public signup() {
        initComponents();

        setIconImage();
        setTitle("CEB Employee Information System");
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        this.errorMessage.setVisible(false);
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("8.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        epfbox = new javax.swing.JTextField();
        emailbox = new javax.swing.JTextField();
        pnobox = new javax.swing.JTextField();
        pwbox = new javax.swing.JPasswordField();
        cpwbox = new javax.swing.JPasswordField();
        bsubtn = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User EPF No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Email Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Phone No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Confirm Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        signupbtn.setBackground(new java.awt.Color(204, 204, 255));
        signupbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signupbtn.setText("Sign Up");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        signupbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signupbtnKeyPressed(evt);
            }
        });
        jPanel1.add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 90, 30));

        epfbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epfboxActionPerformed(evt);
            }
        });
        epfbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                epfboxKeyPressed(evt);
            }
        });
        jPanel1.add(epfbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 290, 30));

        emailbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailboxActionPerformed(evt);
            }
        });
        emailbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailboxKeyPressed(evt);
            }
        });
        jPanel1.add(emailbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 290, 30));

        pnobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnoboxActionPerformed(evt);
            }
        });
        pnobox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnoboxKeyPressed(evt);
            }
        });
        jPanel1.add(pnobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 290, 30));

        pwbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwboxActionPerformed(evt);
            }
        });
        pwbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwboxKeyPressed(evt);
            }
        });
        jPanel1.add(pwbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 290, 30));

        cpwbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpwboxActionPerformed(evt);
            }
        });
        cpwbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpwboxKeyPressed(evt);
            }
        });
        jPanel1.add(cpwbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 290, 30));

        bsubtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bsubtn.setText("Back");
        bsubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubtnActionPerformed(evt);
            }
        });
        jPanel1.add(bsubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 30));

        errorMessage.setBackground(new java.awt.Color(255, 0, 51));
        errorMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 0, 0));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("Invalid User EPF");
        jPanel1.add(errorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(498, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
       this.su();
    }//GEN-LAST:event_signupbtnActionPerformed

    private void cpwboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpwboxActionPerformed
        
    }//GEN-LAST:event_cpwboxActionPerformed

    private void bsubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubtnActionPerformed
        login l3 = new login();
        l3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsubtnActionPerformed

    private void epfboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epfboxActionPerformed

    }//GEN-LAST:event_epfboxActionPerformed

    private void pnoboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnoboxActionPerformed

    }//GEN-LAST:event_pnoboxActionPerformed

    private void pwboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwboxActionPerformed

    }//GEN-LAST:event_pwboxActionPerformed

    private void epfboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_epfboxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            emailbox.requestFocus();
        }
    }//GEN-LAST:event_epfboxKeyPressed

    private void pnoboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnoboxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pwbox.requestFocus();
        }
    }//GEN-LAST:event_pnoboxKeyPressed

    private void pwboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwboxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cpwbox.requestFocus();
        }
    }//GEN-LAST:event_pwboxKeyPressed

    private void cpwboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpwboxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.su();
        }
    }//GEN-LAST:event_cpwboxKeyPressed

    private void signupbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signupbtnKeyPressed
        this.su();
    }//GEN-LAST:event_signupbtnKeyPressed

    private void emailboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailboxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pnobox.requestFocus();
        }
    }//GEN-LAST:event_emailboxKeyPressed

    private void emailboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailboxActionPerformed

    }//GEN-LAST:event_emailboxActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsubtn;
    private javax.swing.JPasswordField cpwbox;
    private javax.swing.JTextField emailbox;
    private javax.swing.JTextField epfbox;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pnobox;
    private javax.swing.JPasswordField pwbox;
    private javax.swing.JButton signupbtn;
    // End of variables declaration//GEN-END:variables

    private Util util = new Util();

    private void su() {
        this.errorMessage.setVisible(false);
        String epf = epfbox.getText();
        String email = emailbox.getText();
        String mobile = pnobox.getText();
        String password = pwbox.getText();
        String confirmPassword = cpwbox.getText();
        String errorString = this.validateSignUp(epf, email, mobile, password, confirmPassword);

        if (errorString != null) {
            errorMessage.setText(errorString);
            this.errorMessage.setVisible(true);
        } else {
            conn = MySqlConnect.ConnectDB();
            String sql = "Insert into user(admin_epf_no,email,phone,password)Value(?,?,?,?)";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, epf);
                pst.setString(2, email);
                pst.setString(3, mobile);
                pst.setString(4, password);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Saved Sucessfully");
                
                login l2 = new login();
                l2.setVisible(true);
                this.dispose();
                
            } catch (Exception e) {
                String error = e.getMessage();
                
                if(error.contains("Duplicate")){
                    JOptionPane.showMessageDialog(null, "EPF number " + epf + " already exists");
                }else{
                    JOptionPane.showMessageDialog(null, "Failed to save data");
                }
            }
        }

    }

    private String validateSignUp(String userEpf, String email, String mobile, String password, String confrimPassword) {
        
        if (!this.util.isNumeric(userEpf)) {
            return "Invalid EPF Number!";
        }

        if (userEpf.length() != 6) {
            return "EPF Number must contain 6 Digits!";
        }

        if (!this.util.isValidEmail(email)) {
            return "Invalid Email!";
        }

        if (!this.util.isNumeric(mobile)) {
            return "Invalid Phone Number!";
        }

        if (mobile.length() != 10) {
            return "Phone Number must contain 10 Digits!";
        }

        if (!password.equals(confrimPassword)) {
            return "Passwords do not match!";
        }

        return null;
    }

    private void cpp() {
        conn = MySqlConnect.ConnectDB();
        String sql = "Insert into user(admin_epf_no,email,phone,password)Value(?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, epfbox.getText());
            pst.setString(2, emailbox.getText());
            pst.setString(3, pnobox.getText());
            pst.setString(4, pwbox.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Saved Sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Save Data");
        }
    }

}
