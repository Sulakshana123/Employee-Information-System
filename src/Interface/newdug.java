package Interface;

import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class newdug extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;

    public newdug() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ndaddbtn = new javax.swing.JButton();
        nddltbtn = new javax.swing.JButton();
        ndtxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ndtbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        dsearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ndidtxt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nuaddbtn = new javax.swing.JButton();
        nudltbtn = new javax.swing.JButton();
        nutxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        nutbl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        usearch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nuidtxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ngaddbtn = new javax.swing.JButton();
        ngdltbtn = new javax.swing.JButton();
        ngtxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ngtbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        gsearch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        ngidtxt = new javax.swing.JLabel();
        dugbckbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("New Registration ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 220, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Designation");

        ndaddbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ndaddbtn.setText("Add");
        ndaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ndaddbtnActionPerformed(evt);
            }
        });
        ndaddbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ndaddbtnKeyPressed(evt);
            }
        });

        nddltbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nddltbtn.setText("Delete");
        nddltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nddltbtnActionPerformed(evt);
            }
        });

        ndtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ndtxtActionPerformed(evt);
            }
        });
        ndtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ndtxtKeyPressed(evt);
            }
        });

        ndtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Designation Id", "New Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ndtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ndtblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ndtbl);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Designation ID");

        dsearch.setBackground(new java.awt.Color(255, 255, 153));
        dsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsearchActionPerformed(evt);
            }
        });
        dsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dsearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dsearchKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Designation");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ndidtxt.setBackground(new java.awt.Color(255, 255, 255));
        ndidtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ndidtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ndidtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ndaddbtn)
                        .addGap(63, 63, 63)
                        .addComponent(nddltbtn)
                        .addGap(62, 62, 62)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(ndidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(ndtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(dsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ndidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ndtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ndaddbtn)
                            .addComponent(nddltbtn)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 770, 170));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Unit");

        nuaddbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nuaddbtn.setText("Add");
        nuaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuaddbtnActionPerformed(evt);
            }
        });

        nudltbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nudltbtn.setText("Delete");
        nudltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nudltbtnActionPerformed(evt);
            }
        });

        nutxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nutxtKeyPressed(evt);
            }
        });

        nutbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Unit Id", "New Unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nutbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nutblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(nutbl);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Unit ID");

        usearch.setBackground(new java.awt.Color(255, 255, 153));
        usearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usearchKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Unit");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nuidtxt.setBackground(new java.awt.Color(255, 255, 255));
        nuidtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nuidtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuidtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nuaddbtn)
                        .addGap(54, 54, 54)
                        .addComponent(nudltbtn)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usearch, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addComponent(nuidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuaddbtn)
                            .addComponent(nudltbtn)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 770, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Grade");

        ngaddbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ngaddbtn.setText("Add");
        ngaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaddbtnActionPerformed(evt);
            }
        });

        ngdltbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ngdltbtn.setText("Delete");
        ngdltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngdltbtnActionPerformed(evt);
            }
        });

        ngtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ngtxtKeyPressed(evt);
            }
        });

        ngtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Grade id", "new Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ngtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ngtblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ngtbl);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Grade ID");

        gsearch.setBackground(new java.awt.Color(255, 255, 153));
        gsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gsearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gsearchKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Grade");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ngidtxt.setBackground(new java.awt.Color(255, 255, 255));
        ngidtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ngidtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ngidtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ngaddbtn)
                        .addGap(52, 52, 52)
                        .addComponent(ngdltbtn)
                        .addGap(58, 58, 58)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngtxt)
                            .addComponent(ngidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(ngtxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ngaddbtn)
                            .addComponent(ngdltbtn)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 770, 160));

        dugbckbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dugbckbtn.setText("Back");
        dugbckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugbckbtnActionPerformed(evt);
            }
        });
        jPanel1.add(dugbckbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(826, 710));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dugbckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugbckbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_dugbckbtnActionPerformed

    private void ndaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ndaddbtnActionPerformed
        this.AddDesignation();
        this.refreshndJTable();
        this.clearndFields();
    }//GEN-LAST:event_ndaddbtnActionPerformed

    private void nddltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nddltbtnActionPerformed
        this.delDesig();
        this.refreshndJTable();
        this.clearndFields();
    }//GEN-LAST:event_nddltbtnActionPerformed

    private void ndaddbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ndaddbtnKeyPressed

    }//GEN-LAST:event_ndaddbtnKeyPressed

    private void ndtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ndtblMouseClicked
        this.mouseClicknd();
    }//GEN-LAST:event_ndtblMouseClicked

    private void nuaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuaddbtnActionPerformed
        this.Addunit();
        this.refreshnuJTable();
        this.clearnuFields();
    }//GEN-LAST:event_nuaddbtnActionPerformed

    private void nudltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nudltbtnActionPerformed
        this.delunit();
        this.refreshnuJTable();
        this.clearnuFields();
    }//GEN-LAST:event_nudltbtnActionPerformed

    private void ndtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ndtxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ndtxt.requestFocus();
        }
    }//GEN-LAST:event_ndtxtKeyPressed

    private void nutblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nutblMouseClicked
        this.mouseClicknu();
    }//GEN-LAST:event_nutblMouseClicked

    private void nutxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nutxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nutxt.requestFocus();
        }
    }//GEN-LAST:event_nutxtKeyPressed

    private void ngaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngaddbtnActionPerformed
        this.Addgrade();
        this.refreshngJTable();
        this.clearngFields();
    }//GEN-LAST:event_ngaddbtnActionPerformed

    private void ngdltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngdltbtnActionPerformed
        this.delgrade();
        this.refreshngJTable();
        this.clearngFields();
    }//GEN-LAST:event_ngdltbtnActionPerformed

    private void ngtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ngtxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ngtxt.requestFocus();
        }
    }//GEN-LAST:event_ngtxtKeyPressed

    private void ngtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ngtblMouseClicked
        this.mouseClickng();
    }//GEN-LAST:event_ngtblMouseClicked

    private void dsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dsearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsearchKeyPressed

    private void dsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsearchActionPerformed

    private void usearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usearchKeyPressed

    private void gsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gsearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gsearchKeyPressed

    private void dsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dsearchKeyReleased
        this.onSearchd();
    }//GEN-LAST:event_dsearchKeyReleased

    private void usearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usearchKeyReleased
        this.onSearchu();
    }//GEN-LAST:event_usearchKeyReleased

    private void gsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gsearchKeyReleased
        this.onSearchg();
    }//GEN-LAST:event_gsearchKeyReleased

    private void ndtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ndtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ndtxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.refreshndJTable();
        this.clearndFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.refreshnuJTable();
        this.clearnuFields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.refreshngJTable();
        this.clearngFields();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(newdug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newdug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newdug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newdug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newdug().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dsearch;
    private javax.swing.JButton dugbckbtn;
    private javax.swing.JTextField gsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton ndaddbtn;
    private javax.swing.JButton nddltbtn;
    private javax.swing.JLabel ndidtxt;
    private javax.swing.JTable ndtbl;
    private javax.swing.JTextField ndtxt;
    private javax.swing.JButton ngaddbtn;
    private javax.swing.JButton ngdltbtn;
    private javax.swing.JLabel ngidtxt;
    private javax.swing.JTable ngtbl;
    private javax.swing.JTextField ngtxt;
    private javax.swing.JButton nuaddbtn;
    private javax.swing.JButton nudltbtn;
    private javax.swing.JLabel nuidtxt;
    private javax.swing.JTable nutbl;
    private javax.swing.JTextField nutxt;
    private javax.swing.JTextField usearch;
    // End of variables declaration//GEN-END:variables

    //Add New Designation
    private void AddDesignation() {
        conn = MySqlConnect.ConnectDB();
        String sql = "Insert into designationreg(designation)Value(?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, ndtxt.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Saved Sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void delDesig() {
        int a = JOptionPane.showConfirmDialog((Component) null, "Do you want to delete ?", "DELETE", JOptionPane.YES_NO_OPTION);
        
        if (a == 0) {
            int row = ndtbl.getSelectedRow();
            String cell = ndtbl.getModel().getValueAt(row, 0).toString();
            String sql = "DELETE FROM designationreg where designation_id = " + cell;

            try {
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted Succesfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void refreshndJTable() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "select * from designationreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            ndtbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        ndtxt.setText("");
    }

    private void clearndFields() {
        ndidtxt.setText("");
        ndtxt.setText("");
    }

    private void mouseClicknd() {
        int selectedRow = ndtbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ndtbl.getModel();

        ndidtxt.setText(model.getValueAt(selectedRow, 0).toString());
        ndtxt.setText(model.getValueAt(selectedRow, 1).toString());
    }

    private void onSearchd() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM designationreg WHERE designation ='" + dsearch.getText() + "'";

            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            ndtbl.setModel(DbUtils.resultSetToTableModel(rs));

            if (rs.first()) {
                ndidtxt.setText(rs.getString("designation_id"));
                ndtxt.setText(rs.getString("designation"));
            }
        } catch (Exception e) {
        }
    }

    //Add New Unit
    private void Addunit() {
        conn = MySqlConnect.ConnectDB();
        String sql = "Insert into unitreg(unit_name)Value(?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, nutxt.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Saved Sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void delunit() {
        int a = JOptionPane.showConfirmDialog((Component) null, "Do you want to delete ?", "DELETE", JOptionPane.YES_NO_OPTION);
        
        if (a == 0) {
            int row = nutbl.getSelectedRow();
            String cell = nutbl.getModel().getValueAt(row, 0).toString();
            String sql = "DELETE FROM unitreg where unit_id = " + cell;

            try {
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted Succesfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void refreshnuJTable() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "select * from unitreg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            nutbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void clearnuFields() {
        nuidtxt.setText("");
        nutxt.setText("");
    }

    private void mouseClicknu() {
        int selectedRow = nutbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) nutbl.getModel();

        nuidtxt.setText(model.getValueAt(selectedRow, 0).toString());
        nutxt.setText(model.getValueAt(selectedRow, 1).toString());
    }

    private void onSearchu() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM unitreg WHERE unit_name ='" + usearch.getText() + "'";

            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            nutbl.setModel(DbUtils.resultSetToTableModel(rs));

            if (rs.first()) {
                nuidtxt.setText(rs.getString("unit_id"));
                nutxt.setText(rs.getString("unit_name"));
            }
        } catch (Exception e) {
        }
    }

    //Add New Grade
    private void Addgrade() {
        conn = MySqlConnect.ConnectDB();
        String sql = "Insert into gradereg(grade)Value(?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, ngtxt.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Saved Sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void delgrade() {
        int a = JOptionPane.showConfirmDialog((Component) null, "Do you want to delete ?", "DELETE", JOptionPane.YES_NO_OPTION);
        
        if (a == 0) {
            int row = ngtbl.getSelectedRow();
            String cell = ngtbl.getModel().getValueAt(row, 0).toString();
            String sql = "DELETE FROM gradereg where grade_id = " + cell;

            try {
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted Succesfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void refreshngJTable() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "select * from gradereg";
            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            ngtbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void clearngFields() {
        ngidtxt.setText("");
        ngtxt.setText("");
    }

    private void mouseClickng() {
        int selectedRow = ngtbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ngtbl.getModel();

        ngidtxt.setText(model.getValueAt(selectedRow, 0).toString());
        ngtxt.setText(model.getValueAt(selectedRow, 1).toString());
    }

    private void onSearchg() {
        try {
            conn = MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM gradereg WHERE grade='" + gsearch.getText() + "'";

            pst = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) pst.executeQuery();
            ngtbl.setModel(DbUtils.resultSetToTableModel(rs));

            if (rs.first()) {
                ngidtxt.setText(rs.getString("grade_id"));
                ngtxt.setText(rs.getString("grade"));
            }
        } catch (Exception e) {
        }
    }

}
