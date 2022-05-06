package Interface;

import com.ibm.icu.text.SimpleDateFormat;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;

public class add extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    
    public add() {
        initComponents();
        
        setIconImage();
        setTitle("CEB Employee Information System");
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        this.udropdb();
        this.ddropdb();
        this.gdropdb();
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("8.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        epftxt = new javax.swing.JTextField();
        nwitxt = new javax.swing.JTextField();
        udrop = new javax.swing.JComboBox<>();
        ddrop = new javax.swing.JComboBox<>();
        gdrop = new javax.swing.JComboBox<>();
        subbtn = new javax.swing.JButton();
        upbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        bbtn = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        adda = new com.toedter.calendar.JDateChooser();
        ppddc = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        eM = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        emp = new javax.swing.JTable();
        refbtn = new javax.swing.JButton();
        sbox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add / Update Employee Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User EPF No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name with Initials");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unit");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Designation");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Grade");

        epftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epftxtActionPerformed(evt);
            }
        });
        epftxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                epftxtKeyPressed(evt);
            }
        });

        nwitxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nwitxtKeyPressed(evt);
            }
        });

        udrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Unit - " }));
        udrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udropActionPerformed(evt);
            }
        });
        udrop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                udropKeyPressed(evt);
            }
        });

        ddrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Designation -" }));
        ddrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddropActionPerformed(evt);
            }
        });
        ddrop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ddropKeyPressed(evt);
            }
        });

        gdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Grade -" }));
        gdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdropActionPerformed(evt);
            }
        });
        gdrop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gdropKeyPressed(evt);
            }
        });

        subbtn.setBackground(new java.awt.Color(204, 204, 255));
        subbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subbtn.setText("Add");
        subbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbtnActionPerformed(evt);
            }
        });
        subbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subbtnKeyPressed(evt);
            }
        });

        upbtn.setBackground(new java.awt.Color(204, 204, 255));
        upbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upbtn.setText("Update");
        upbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbtnActionPerformed(evt);
            }
        });

        delbtn.setBackground(new java.awt.Color(204, 204, 255));
        delbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delbtn.setText("Delete");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        bbtn.setBackground(new java.awt.Color(204, 204, 255));
        bbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bbtn.setText("Back");
        bbtn.setMaximumSize(new java.awt.Dimension(75, 25));
        bbtn.setMinimumSize(new java.awt.Dimension(75, 25));
        bbtn.setPreferredSize(new java.awt.Dimension(75, 25));
        bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtnActionPerformed(evt);
            }
        });

        dob.setDateFormatString("yyyy-MM-dd");

        adda.setDateFormatString("yyyy-MM-dd");

        ppddc.setDateFormatString("yyyy-MM-dd");
        ppddc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ppddcMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Appointmemt Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Present Promoted Date");

        eM.setForeground(new java.awt.Color(255, 0, 0));
        eM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eM.setText("EPF number must contain 6 Digits !");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(subbtn)
                                .addGap(63, 63, 63)
                                .addComponent(upbtn)
                                .addGap(60, 60, 60)
                                .addComponent(delbtn)
                                .addGap(66, 66, 66)
                                .addComponent(bbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(nwitxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(udrop, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ddrop, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(epftxt, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gdrop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ppddc, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eM)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(epftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gdrop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nwitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(adda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(udrop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ddrop, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ppddc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(upbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(delbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });

        emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EPF  Number", "Name With Initials", "Unit", "Designation", "Grade", "DOB", "Appointment Date", "PPD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empMouseClicked(evt);
            }
        });
        table.setViewportView(emp);

        refbtn.setBackground(new java.awt.Color(204, 204, 255));
        refbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refbtn.setText("Refresh");
        refbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refbtnActionPerformed(evt);
            }
        });

        sbox.setBackground(new java.awt.Color(255, 255, 153));
        sbox.setMinimumSize(new java.awt.Dimension(15, 20));
        sbox.setPreferredSize(new java.awt.Dimension(15, 20));
        sbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sboxActionPerformed(evt);
            }
        });
        sbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sboxKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("EPF No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(refbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sbox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sbox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(1018, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbtnActionPerformed
        this.onAddNewUser();
        this.refreshJTable();
        this.clearFields();
    }//GEN-LAST:event_subbtnActionPerformed

    private void refbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refbtnActionPerformed
        this.refreshJTable();
    }//GEN-LAST:event_refbtnActionPerformed

    private void nwitxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nwitxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        udrop.requestFocus();
        } 
    }//GEN-LAST:event_nwitxtKeyPressed

    private void udropKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_udropKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        ddrop.requestFocus();
        } 
    }//GEN-LAST:event_udropKeyPressed

    private void ddropKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ddropKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        gdrop.requestFocus();
        } 
    }//GEN-LAST:event_ddropKeyPressed

    private void gdropKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gdropKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){     
        }
    }//GEN-LAST:event_gdropKeyPressed

    private void subbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subbtnKeyPressed

    }//GEN-LAST:event_subbtnKeyPressed

    private void upbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbtnActionPerformed
        this.Updateuser();
        this.refreshJTable();
    }//GEN-LAST:event_upbtnActionPerformed

    private void empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empMouseClicked
        this.mouseClick();
    }//GEN-LAST:event_empMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
            
    }//GEN-LAST:event_tableMouseClicked

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        this.delBtn();
        this.refreshJTable();
        this.clearFields();
    }//GEN-LAST:event_delbtnActionPerformed

    private void sboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sboxActionPerformed
        
    }//GEN-LAST:event_sboxActionPerformed

    private void sboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sboxKeyReleased
        this.onSearch();
    }//GEN-LAST:event_sboxKeyReleased

    private void bbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_bbtnActionPerformed

    private void udropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udropActionPerformed
        
    }//GEN-LAST:event_udropActionPerformed

    private void epftxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_epftxtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        nwitxt.requestFocus();
        } 
    }//GEN-LAST:event_epftxtKeyPressed

    private void ppddcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppddcMouseClicked
        this.onAddNewUser();
        this.refreshJTable();
        this.clearFields();
    }//GEN-LAST:event_ppddcMouseClicked

    private void ddropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddropActionPerformed
       
    }//GEN-LAST:event_ddropActionPerformed

    private void gdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdropActionPerformed
      
    }//GEN-LAST:event_gdropActionPerformed

    private void epftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epftxtActionPerformed

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
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser adda;
    private javax.swing.JButton bbtn;
    private javax.swing.JComboBox<String> ddrop;
    private javax.swing.JButton delbtn;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JLabel eM;
    private javax.swing.JTable emp;
    private javax.swing.JTextField epftxt;
    private javax.swing.JComboBox<String> gdrop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nwitxt;
    private com.toedter.calendar.JDateChooser ppddc;
    private javax.swing.JButton refbtn;
    private javax.swing.JTextField sbox;
    private javax.swing.JButton subbtn;
    private javax.swing.JScrollPane table;
    private javax.swing.JComboBox<String> udrop;
    private javax.swing.JButton upbtn;
    // End of variables declaration//GEN-END:variables
   
    private void clearFields(){
        epftxt.setText("");
        nwitxt.setText("");
        udrop.setSelectedIndex(0);
        ddrop.setSelectedIndex(0);
        gdrop.setSelectedIndex(0);
        dob.setCalendar(null);
        adda.setCalendar(null);
        ppddc.setCalendar(null);
    }
    
    private void onAddNewUser(){
        conn = MySqlConnect.ConnectDB();
        String sql = "Insert into employee(user_epf_no,name_with_initial,unit,designation,grade,dob,appointment_date,present_promoted_date)Value(?,?,?,?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,epftxt.getText());
            pst.setString(2,nwitxt.getText());
            pst.setString(3, (String) udrop.getSelectedItem());
            pst.setString(4, (String) ddrop.getSelectedItem());
            pst.setString(5, (String) gdrop.getSelectedItem());
            pst.setString(6, ((JTextField)dob.getDateEditor().getUiComponent()).getText());
            pst.setString(7, ((JTextField)adda.getDateEditor().getUiComponent()).getText());
            pst.setString(8, ((JTextField)ppddc.getDateEditor().getUiComponent()).getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data Saved Sucessfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
    private void refreshJTable(){
        try{
            conn = MySqlConnect.ConnectDB();
            String sql = "select user_epf_no,name_with_initial,unit,designation,grade,dob,appointment_date,present_promoted_date from employee";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            emp.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        epftxt.setText("");
        nwitxt.setText("");
        udrop.setSelectedIndex(0);
        ddrop.setSelectedIndex(0);
        gdrop.setSelectedIndex(0);
        dob.setCalendar(null);
        adda.setCalendar(null);
        ppddc.setCalendar(null);
    }
    
    private void mouseClick(){
        try{
            int selectedRow = emp.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)emp.getModel();
            
            epftxt.setText(model.getValueAt(selectedRow, 0).toString());
            nwitxt.setText(model.getValueAt(selectedRow, 1).toString());
            udrop.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
            ddrop.setSelectedItem(model.getValueAt(selectedRow, 3).toString());
            gdrop.setSelectedItem(model.getValueAt(selectedRow, 4).toString());
            Date dobDate = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(selectedRow, 5).toString());
            dob.setDate(dobDate);
            Date dobDate1 = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(selectedRow, 6).toString());
            adda.setDate(dobDate1);
            Date dobDate2 = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(selectedRow, 7).toString());
            ppddc.setDate(dobDate2);
            epftxt.disable();
            nwitxt.disable();
            eM.disable();
        }
        catch (ParseException ex){
            Logger.getLogger(add.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void delBtn(){
        int a = JOptionPane.showConfirmDialog((Component)null,"Do you want to delete ?","DELETE", JOptionPane.YES_NO_OPTION);
        
        if(a == 0){
            int row = emp.getSelectedRow();
            String cell = emp.getModel().getValueAt(row,0).toString();
            String sql = "DELETE FROM employee where user_epf_no = " + cell;
            
            try{
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Deleted Succesfully");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void onSearch(){
        try {
            conn = MySqlConnect.ConnectDB();
            String sql="SELECT  user_epf_no,name_with_initial,unit,designation,grade,dob,appointment_date,present_promoted_date FROM employee WHERE user_epf_no='"+sbox.getText()+"'";
            
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            emp.setModel(DbUtils.resultSetToTableModel(rs));
            
            if(rs.first()){
                epftxt.setText(rs.getString("epf_no"));
                nwitxt.setText(rs.getString("name_with_initials"));     
            }
        }
        catch (Exception e){
        }
    }
    
    private void Updateuser(){
    try {
        String v1 = epftxt.getText();
        String v2 = nwitxt.getText();
        String v3 = (String) udrop.getSelectedItem();
        String v4 = (String) ddrop.getSelectedItem();
        String v5 = (String) gdrop.getSelectedItem();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String theDate = dateFormat.format(dob.getDate());
        String theDate1 = dateFormat.format(adda.getDate());
        String theDate2 = dateFormat.format(ppddc.getDate());
        
        
        String sql = "update employee set user_epf_no='"+v1+"', name_with_initial='"+v2+"', unit='"+v3+"', designation='"+v4+"', grade='"+v5+"', dob='"+theDate+"', appointment_date='"+theDate1+"', present_promoted_date='"+theDate2+"'  where user_epf_no='"+v1+"' ";
        
        pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Data Update Sucessfully");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data Update Unsucessfully");
    }
}

    private void udropdb() {
        try{
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM  unitreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            
            while(rs.next()){
                String unit=rs.getString("unit_name");
                udrop.addItem(unit);
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void ddropdb() {
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

    private void gdropdb(){
        try{
            conn = MySqlConnect.ConnectDB();
            String sql="SELECT * FROM  gradereg";
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


    
    
}
