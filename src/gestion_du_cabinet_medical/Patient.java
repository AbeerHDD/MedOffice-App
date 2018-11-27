/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_du_cabinet_medical;

import java.awt.Color;
import java.awt.HeadlessException;
import java.beans.Statement;
import java.sql.Connection;
 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Patient extends javax.swing.JDialog {

    /**
     * Creates new form Patient
     */
    public Patient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         patient();
         jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false);
    this.getContentPane().setBackground(Color.decode("#000"));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        cab34 = new javax.swing.JFormattedTextField();
        jLabel50 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cab1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        cab10 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        cab5 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cab12 = new javax.swing.JTextArea();
        cab3 = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cab2 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        cab11 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cab8 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        cab9 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cab4 = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        cab13 = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cab15 = new javax.swing.JTextArea();
        cab16 = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cab17 = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        cab18 = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        cab19 = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        cab20 = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cab25 = new javax.swing.JFormattedTextField();
        cab37 = new javax.swing.JFormattedTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        cab23 = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        cab24 = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cab26 = new javax.swing.JTextArea();
        cab27 = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        cab28 = new javax.swing.JFormattedTextField();
        jLabel40 = new javax.swing.JLabel();
        cab29 = new javax.swing.JFormattedTextField();
        jLabel41 = new javax.swing.JLabel();
        cab30 = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        cab31 = new javax.swing.JFormattedTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        cab35 = new javax.swing.JFormattedTextField();
        cab36 = new javax.swing.JFormattedTextField();
        cab32 = new javax.swing.JFormattedTextField();
        cab33 = new javax.swing.JFormattedTextField();
        jLabel47 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 46, 48));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("   Recherche Patient     ");
        jPanel2.add(jLabel48);
        jLabel48.setBounds(200, 10, 470, 40);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Nom :");

        cab34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab34ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Sexe :");

        jRadioButton7.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Homme");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Femme");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("Afficher Tout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton8.setText("Recheche par Nom");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cab34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addGap(19, 19, 19)
                .addComponent(jRadioButton7)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cab34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton7)
                        .addComponent(jRadioButton8))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(20, 70, 850, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(40, 150, 810, 240);

        jButton9.setBackground(new java.awt.Color(255, 0, 51));
        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton9.setText("Annuler");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(350, 400, 140, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_cabinet/arriereplan.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 890, 450);

        jTabbedPane1.addTab("Recherche Patient", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ajouter Patient ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(260, 20, 350, 60);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("NuméroCIN :");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(30, 101, 140, 30);

        cab1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab1ActionPerformed(evt);
            }
        });
        cab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab1KeyReleased(evt);
            }
        });
        jPanel3.add(cab1);
        cab1.setBounds(220, 101, 150, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numéro télephone :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(410, 181, 180, 30);

        cab10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cab10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab10ActionPerformed(evt);
            }
        });
        cab10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab10KeyReleased(evt);
            }
        });
        jPanel3.add(cab10);
        cab10.setBounds(610, 181, 150, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date De Naissance :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 281, 180, 30);

        cab5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cab5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cab5FocusLost(evt);
            }
        });
        cab5.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cab5VetoableChange(evt);
            }
        });
        jPanel3.add(cab5);
        cab5.setBounds(220, 290, 150, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Adresse :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(410, 271, 120, 30);

        cab12.setColumns(20);
        cab12.setRows(5);
        jScrollPane1.setViewportView(cab12);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(610, 271, 260, 120);

        cab3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab3ActionPerformed(evt);
            }
        });
        jPanel3.add(cab3);
        cab3.setBounds(220, 181, 150, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Prénom :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 181, 120, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nom :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 141, 120, 30);

        cab2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab2ActionPerformed(evt);
            }
        });
        jPanel3.add(cab2);
        cab2.setBounds(220, 141, 150, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Numéro GSM :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(410, 221, 180, 30);

        cab11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cab11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab11ActionPerformed(evt);
            }
        });
        cab11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab11KeyReleased(evt);
            }
        });
        jPanel3.add(cab11);
        cab11.setBounds(610, 221, 150, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Age :");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(410, 91, 180, 30);

        cab8.setEditable(false);
        cab8.setBackground(new java.awt.Color(255, 255, 255));
        cab8.setText("0");
        cab8.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cab8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cab8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cab8MouseClicked(evt);
            }
        });
        cab8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab8ActionPerformed(evt);
            }
        });
        cab8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab8KeyReleased(evt);
            }
        });
        jPanel3.add(cab8);
        cab8.setBounds(610, 91, 150, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sexe :");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 230, 130, 30);

        cab9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cab9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab9ActionPerformed(evt);
            }
        });
        cab9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab9KeyReleased(evt);
            }
        });
        jPanel3.add(cab9);
        cab9.setBounds(610, 141, 150, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Prof :");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(410, 141, 180, 30);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Homme");
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(220, 221, 150, 33);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jRadioButton2.setText("Femme");
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(220, 251, 150, 33);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Assuré CNAM  :");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(30, 350, 180, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Qualité :");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(30, 400, 180, 30);

        jButton1.setBackground(new java.awt.Color(79, 184, 72));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(590, 400, 140, 40);

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(430, 400, 140, 40);

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Oui");
        jPanel3.add(jRadioButton3);
        jRadioButton3.setBounds(220, 330, 150, 33);

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jRadioButton4.setText("Non");
        jPanel3.add(jRadioButton4);
        jRadioButton4.setBounds(220, 360, 150, 33);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assure lui même", "Conjoint", "Père", "Mère", "Enfant" }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(220, 400, 190, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_cabinet/arriereplan.jpg"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(1, 0, 890, 1200);

        jTabbedPane1.addTab("Ajouter Patient", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Modifier Patient  ");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(240, 20, 410, 40);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("NuméroCIN :");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(30, 101, 140, 30);

        cab4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab4ActionPerformed(evt);
            }
        });
        cab4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab4KeyReleased(evt);
            }
        });
        jPanel6.add(cab4);
        cab4.setBounds(220, 101, 150, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Numéro télephone :");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(410, 181, 180, 30);

        cab13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab13ActionPerformed(evt);
            }
        });
        cab13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab13KeyReleased(evt);
            }
        });
        jPanel6.add(cab13);
        cab13.setBounds(610, 181, 150, 30);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Date De Naissance :");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(30, 281, 180, 30);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Adresse :");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(410, 271, 120, 30);

        cab15.setColumns(20);
        cab15.setRows(5);
        jScrollPane2.setViewportView(cab15);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(610, 271, 260, 120);

        cab16.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab16ActionPerformed(evt);
            }
        });
        jPanel6.add(cab16);
        cab16.setBounds(220, 280, 150, 30);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Prénom :");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(30, 181, 120, 30);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Nom :");
        jPanel6.add(jLabel26);
        jLabel26.setBounds(30, 141, 120, 30);

        cab17.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab17ActionPerformed(evt);
            }
        });
        jPanel6.add(cab17);
        cab17.setBounds(220, 230, 150, 30);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Numéro GSM :");
        jPanel6.add(jLabel27);
        jLabel27.setBounds(410, 221, 180, 30);

        cab18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab18ActionPerformed(evt);
            }
        });
        cab18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab18KeyReleased(evt);
            }
        });
        jPanel6.add(cab18);
        cab18.setBounds(610, 221, 150, 30);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Age :");
        jPanel6.add(jLabel28);
        jLabel28.setBounds(410, 91, 180, 30);

        cab19.setEditable(false);
        cab19.setBackground(new java.awt.Color(255, 255, 255));
        cab19.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab19ActionPerformed(evt);
            }
        });
        cab19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab19KeyReleased(evt);
            }
        });
        jPanel6.add(cab19);
        cab19.setBounds(610, 91, 150, 30);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Sexe :");
        jPanel6.add(jLabel29);
        jLabel29.setBounds(30, 230, 130, 30);

        cab20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab20ActionPerformed(evt);
            }
        });
        cab20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab20KeyReleased(evt);
            }
        });
        jPanel6.add(cab20);
        cab20.setBounds(610, 141, 150, 30);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Prof :");
        jPanel6.add(jLabel30);
        jLabel30.setBounds(410, 141, 180, 30);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Assuré CNAM  :");
        jPanel6.add(jLabel31);
        jLabel31.setBounds(30, 331, 180, 30);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Qualité :");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(30, 381, 180, 30);

        jButton3.setBackground(new java.awt.Color(79, 184, 72));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);
        jButton3.setBounds(680, 400, 140, 40);

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton4.setText("Annuler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(520, 400, 140, 40);

        cab25.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab25ActionPerformed(evt);
            }
        });
        jPanel6.add(cab25);
        cab25.setBounds(220, 181, 150, 30);

        cab37.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab37ActionPerformed(evt);
            }
        });
        jPanel6.add(cab37);
        cab37.setBounds(220, 141, 150, 30);

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("Oui");
        jPanel6.add(jRadioButton5);
        jRadioButton5.setBounds(220, 330, 150, 33);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assure lui même", "Conjoint", "Père", "Mère", "Enfant" }));
        jPanel6.add(jComboBox2);
        jComboBox2.setBounds(220, 400, 210, 30);

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jRadioButton10.setText("Non");
        jPanel6.add(jRadioButton10);
        jRadioButton10.setBounds(220, 360, 150, 33);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_cabinet/arriereplan.jpg"))); // NOI18N
        jPanel6.add(jLabel6);
        jLabel6.setBounds(1, 0, 890, 1200);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Modifier Patient", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Supprimer Patient ");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(230, 10, 440, 60);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("NuméroCIN :");
        jPanel7.add(jLabel34);
        jLabel34.setBounds(30, 101, 140, 30);

        cab23.setEditable(false);
        cab23.setBackground(new java.awt.Color(255, 255, 255));
        cab23.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab23.setEnabled(false);
        cab23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab23ActionPerformed(evt);
            }
        });
        cab23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab23KeyReleased(evt);
            }
        });
        jPanel7.add(cab23);
        cab23.setBounds(220, 101, 150, 30);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Numéro télephone :");
        jPanel7.add(jLabel35);
        jLabel35.setBounds(410, 181, 180, 30);

        cab24.setEditable(false);
        cab24.setBackground(new java.awt.Color(255, 255, 255));
        cab24.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab24.setEnabled(false);
        cab24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab24ActionPerformed(evt);
            }
        });
        cab24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab24KeyReleased(evt);
            }
        });
        jPanel7.add(cab24);
        cab24.setBounds(610, 181, 150, 30);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Date De Naissance :");
        jPanel7.add(jLabel36);
        jLabel36.setBounds(30, 281, 180, 30);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Adresse :");
        jPanel7.add(jLabel37);
        jLabel37.setBounds(410, 271, 120, 30);

        cab26.setEditable(false);
        cab26.setColumns(20);
        cab26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cab26.setRows(5);
        cab26.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab26.setEnabled(false);
        jScrollPane3.setViewportView(cab26);

        jPanel7.add(jScrollPane3);
        jScrollPane3.setBounds(610, 271, 260, 120);

        cab27.setEditable(false);
        cab27.setBackground(new java.awt.Color(255, 255, 255));
        cab27.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab27.setEnabled(false);
        cab27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab27ActionPerformed(evt);
            }
        });
        jPanel7.add(cab27);
        cab27.setBounds(220, 370, 150, 30);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Prénom :");
        jPanel7.add(jLabel38);
        jLabel38.setBounds(30, 181, 120, 30);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Nom :");
        jPanel7.add(jLabel39);
        jLabel39.setBounds(30, 141, 120, 30);

        cab28.setEditable(false);
        cab28.setBackground(new java.awt.Color(255, 255, 255));
        cab28.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab28.setEnabled(false);
        cab28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab28ActionPerformed(evt);
            }
        });
        jPanel7.add(cab28);
        cab28.setBounds(220, 141, 150, 30);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Numéro GS :");
        jPanel7.add(jLabel40);
        jLabel40.setBounds(410, 221, 180, 30);

        cab29.setEditable(false);
        cab29.setBackground(new java.awt.Color(255, 255, 255));
        cab29.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab29.setEnabled(false);
        cab29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab29ActionPerformed(evt);
            }
        });
        cab29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab29KeyReleased(evt);
            }
        });
        jPanel7.add(cab29);
        cab29.setBounds(610, 221, 150, 30);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Age :");
        jPanel7.add(jLabel41);
        jLabel41.setBounds(410, 91, 180, 30);

        cab30.setEditable(false);
        cab30.setBackground(new java.awt.Color(255, 255, 255));
        cab30.setForeground(new java.awt.Color(255, 255, 255));
        cab30.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab30.setEnabled(false);
        cab30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab30ActionPerformed(evt);
            }
        });
        cab30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab30KeyReleased(evt);
            }
        });
        jPanel7.add(cab30);
        cab30.setBounds(610, 91, 150, 30);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Sexe :");
        jPanel7.add(jLabel42);
        jLabel42.setBounds(30, 230, 130, 30);

        cab31.setEditable(false);
        cab31.setBackground(new java.awt.Color(255, 255, 255));
        cab31.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab31.setEnabled(false);
        cab31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab31ActionPerformed(evt);
            }
        });
        cab31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cab31KeyReleased(evt);
            }
        });
        jPanel7.add(cab31);
        cab31.setBounds(610, 141, 150, 30);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Prof :");
        jPanel7.add(jLabel43);
        jLabel43.setBounds(410, 141, 180, 30);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Assuré CNAM  :");
        jPanel7.add(jLabel44);
        jLabel44.setBounds(30, 331, 180, 30);

        jButton5.setBackground(new java.awt.Color(79, 184, 72));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("Supprimer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5);
        jButton5.setBounds(730, 397, 140, 40);

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Qualité :");
        jPanel7.add(jLabel45);
        jLabel45.setBounds(30, 381, 180, 30);

        jButton6.setBackground(new java.awt.Color(255, 0, 51));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setText("Annuler");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6);
        jButton6.setBounds(540, 400, 140, 40);

        cab35.setEditable(false);
        cab35.setBackground(new java.awt.Color(255, 255, 255));
        cab35.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab35.setEnabled(false);
        cab35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab35ActionPerformed(evt);
            }
        });
        jPanel7.add(cab35);
        cab35.setBounds(220, 181, 150, 30);

        cab36.setEditable(false);
        cab36.setBackground(new java.awt.Color(255, 255, 255));
        cab36.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab36.setEnabled(false);
        cab36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab36ActionPerformed(evt);
            }
        });
        jPanel7.add(cab36);
        cab36.setBounds(220, 230, 150, 30);

        cab32.setEditable(false);
        cab32.setBackground(new java.awt.Color(255, 255, 255));
        cab32.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab32.setEnabled(false);
        cab32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab32ActionPerformed(evt);
            }
        });
        jPanel7.add(cab32);
        cab32.setBounds(220, 330, 150, 30);

        cab33.setEditable(false);
        cab33.setBackground(new java.awt.Color(255, 255, 255));
        cab33.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cab33.setEnabled(false);
        cab33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cab33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cab33ActionPerformed(evt);
            }
        });
        jPanel7.add(cab33);
        cab33.setBounds(220, 280, 150, 30);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons_cabinet/arriereplan.jpg"))); // NOI18N
        jPanel7.add(jLabel47);
        jLabel47.setBounds(1, 0, 890, 450);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Supprimer Patient", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
if  (jTabbedPane1.getSelectedIndex()>1)
  
{try {
cabinetmedical medical= new cabinetmedical();
ResultSet rers = medical.medical_select("select * from patient where cin='" + jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "'");
int exis = 0;
 if(rers.next())  { 
cab23.setText(rers.getString(1));  
cab4.setText(rers.getString(1)); 
cab28.setText(rers.getString(2)); 
cab37.setText(rers.getString(2)); 
cab35.setText(rers.getString(3)); 
cab25.setText(rers.getString(3)); 
cab36.setText(rers.getString(4)); 
cab17.setText(rers.getString(4)); 
cab27.setText(rers.getString(5)); 
cab16.setText(rers.getString(5));
cab33.setText(rers.getString(5)); 
cab32.setText(rers.getString("cnam"));
cab27.setText(rers.getString("qualite"));
cab31.setText(rers.getString(8)); 
cab20.setText(rers.getString(8)); 
cab24.setText(rers.getString(9)); 
cab13.setText(rers.getString(9)); 
cab29.setText(rers.getString(10));
cab18.setText(rers.getString(10)); 
cab26.setText(rers.getString(11)); 
cab15.setText(rers.getString(11)); 
DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
String date_niss= df.format(rers.getDate(5)); 
 Calendar cal = new GregorianCalendar();  
Date d1 = null;
Date d2 = null;
try {
d1 = df.parse(date_niss);
d2 = df.parse(df.format(cal.getTime()));
 long diff = d2.getTime() - d1.getTime();
long diffDays = diff / (24 * 60 * 60 * 1000);
 long a=diffDays/ 365;
 cab30.setText(""+a)  ; 
 cab19.setText(""+a); 
} catch (Exception e) {
e.printStackTrace();
}  } 
} catch (SQLException | HeadlessException e) { }

}// TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void cab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab1ActionPerformed

    private void cab1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab1KeyReleased
        String ch="";
        if (!cab1.getText().matches("[0-9]*")|| cab1 .getText().toString().length()>8) {
            JOptionPane.showMessageDialog(null,"Une erreur est détecté veuillez vérifier la saisi du champ CIN.","Erreur !",JOptionPane.ERROR_MESSAGE);
            for(int i=0;i<cab1.getText().length()-1;i++)
            ch=ch+cab1.getText().charAt(i);
            cab1 .setText(ch);
        }               
    }//GEN-LAST:event_cab1KeyReleased

    private void cab10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab10ActionPerformed

    private void cab10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab10KeyReleased
        String ch="";
        if (!cab10.getText().matches("[0-9]*")||cab10.getText().toString().length()>8) {
            JOptionPane.showMessageDialog(null,"Une erreur est détecté veuillez vérifier la saisi du champ du  télephone.","Erreur !",JOptionPane.ERROR_MESSAGE);
            for(int i=0;i<cab10.getText().length()-1;i++)
            ch=ch+cab10.getText().charAt(i);
            cab10 .setText(ch);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_cab10KeyReleased

    private void cab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab3ActionPerformed

    private void cab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab2ActionPerformed

    private void cab11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab11ActionPerformed

    private void cab11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab11KeyReleased
  String ch="";
        if (!cab11.getText().matches("[0-9]*")||cab11.getText().toString().length()>8) {
            JOptionPane.showMessageDialog(null,"Une erreur est détecté veuillez vérifier la saisi du champ du  télephone.","Erreur !",JOptionPane.ERROR_MESSAGE);
            for(int i=0;i<cab11.getText().length()-1;i++)
            ch=ch+cab11.getText().charAt(i);
            cab11 .setText(ch);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_cab11KeyReleased

    private void cab8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab8ActionPerformed

    private void cab8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab8KeyReleased

    private void cab9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab9ActionPerformed

    private void cab9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab9KeyReleased

    private void cab4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab4ActionPerformed

    private void cab4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab4KeyReleased

    private void cab13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab13ActionPerformed

    private void cab13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab13KeyReleased
 String ch="";
        if (!cab13.getText().matches("[0-9]*")||cab13.getText().toString().length()>8) {
            JOptionPane.showMessageDialog(null,"Une erreur est détecté veuillez vérifier la saisi du champ du  télephone.","Erreur !",JOptionPane.ERROR_MESSAGE);
            for(int i=0;i<cab13.getText().length()-1;i++)
            ch=ch+cab13.getText().charAt(i);
            cab13 .setText(ch);
        }            // TODO add your handling code here:
    }//GEN-LAST:event_cab13KeyReleased

    private void cab16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab16ActionPerformed

    private void cab17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab17ActionPerformed

    private void cab18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab18ActionPerformed

    private void cab18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab18KeyReleased
 String ch="";
        if (!cab18.getText().matches("[0-9]*")||cab18.getText().toString().length()>8) {
            JOptionPane.showMessageDialog(null,"Une erreur est détecté veuillez vérifier la saisi du champ GSM.","Erreur !",JOptionPane.ERROR_MESSAGE);
            for(int i=0;i<cab18.getText().length()-1;i++)
            ch=ch+cab18.getText().charAt(i);
            cab18 .setText(ch);
        }            // TODO add your handling code here:
    }//GEN-LAST:event_cab18KeyReleased

    private void cab19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab19ActionPerformed

    private void cab19KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab19KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab19KeyReleased

    private void cab20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab20ActionPerformed

    private void cab20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab20KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab20KeyReleased

    private void cab23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab23ActionPerformed

    private void cab23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab23KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab23KeyReleased

    private void cab24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab24ActionPerformed

    private void cab24KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab24KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab24KeyReleased

    private void cab27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab27ActionPerformed

    private void cab28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab28ActionPerformed

    private void cab29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab29ActionPerformed

    private void cab29KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab29KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab29KeyReleased

    private void cab30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab30ActionPerformed

    private void cab30KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab30KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab30KeyReleased

    private void cab31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab31ActionPerformed

    private void cab31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cab31KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cab31KeyReleased

    private void cab34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab34ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
      jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false); 
patient_sexe("Femme");
jRadioButton8.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
      jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false);    
patient_sexe("Homme");
jRadioButton7.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void cab35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab35ActionPerformed

    private void cab36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab36ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String ch_sexe=""; 

if(jRadioButton1.isSelected())ch_sexe="Homme";
else
    ch_sexe="Femme";
DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
String ch_date= df.format(cab5.getDate()); 
 int age= Integer.parseInt(cab8.getText());
 String cnam="Non";
 if(jRadioButton3.isSelected())cnam="Oui";
if(ch_date.equals("") ||cab1.getText().equals("") ||cab2.getText().equals("") || cab3.getText().equals("") ||cab9.getText().equals("")||cab10.getText().equals("")||cab11.getText().equals("")||cab12.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Un erreur est detecte veuillez Remplir les champs vides.","Erreur !",JOptionPane.ERROR_MESSAGE);
}
else if (age<0) {
JOptionPane.showMessageDialog(null,"Un erreur est detecte veuillez verifier l'age ","Erreur !",JOptionPane.ERROR_MESSAGE);
cab1.setText("");
} 
else if (! cab1.getText().matches("[0-9]*")||!(cab1.getText().length()==8)) {
JOptionPane.showMessageDialog(null,"Un erreur est detecte veuillez verifier la saisi du champ cin","Erreur !",JOptionPane.ERROR_MESSAGE);
cab1.setText("");
} 
else if (! cab10.getText().matches("[0-9]*")||!(cab10.getText().length()==8)){
JOptionPane.showMessageDialog (null , "un erreur est detecte veuillez verifier la saisi du Numéro télephone   " , "Erreur !" , JOptionPane.ERROR_MESSAGE);
cab10.setText ("");
}
else if (! cab11.getText().matches("[0-9]*")||!(cab11.getText().length()==8)) {
JOptionPane.showMessageDialog(null,"Un erreur est detecte veuillez verifier la saisi du Numéro GSM.","Erreur !",JOptionPane.ERROR_MESSAGE);
cab11.setText("");
} 
else
{
try {
cabinetmedical medical= new cabinetmedical();
ResultSet rers = medical.medical_select("select * from patient where cin='" + cab1.getText() + "'");
int exis = 0;
 if(rers.next())  {
exis = 1;
}
if (exis == 0) {
  
medical.medical_update("INSERT INTO `patient` (`cin`, `nom`, `prenom`, `sexe`, `date_naissance`, `cnam`, `qualite`, `prof`, `telephone`, `gsm`, `adresse`) VALUES " +
"('"+cab1.getText()+"', '"+cab2.getText()+"', '"+cab3.getText()+"', '"+ch_sexe+"', '"+ch_date+"','"+ cnam+"','"+jComboBox1.getSelectedItem()+"', '"+cab9.getText()
        +"',"+ cab10.getText()+","+ cab11.getText()+", '"+cab12.getText()+"')");
       JOptionPane.showMessageDialog(null ," enregistrement effectué");
patient();
jTabbedPane1.setSelectedIndex(0);
 jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false);
cab1.setText("")  ;  
cab2.setText("")  ;
cab3.setText("")  ;
cab4.setText("")  ;  
cab8.setText("")  ;
cab9.setText("")  ;
cab10.setText("")  ;
cab11.setText("")  ;
cab12.setText("")  ;
    
}
if (exis == 1) {
JOptionPane.showMessageDialog(null, "Enregistrement existe deja");
}
} catch (SQLException | HeadlessException e) {
System.out.print(e);
}
 }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
cab1.setText("")  ;  
cab2.setText("")  ;
cab3.setText("")  ;
cab4.setText("")  ;  
cab8.setText("")  ;
cab9.setText("")  ;
cab10.setText("")  ;
cab11.setText("")  ;
cab12.setText("")  ;
jTabbedPane1.setSelectedIndex(0);
 jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false); 


    }//GEN-LAST:event_jButton2ActionPerformed
// TODO add your handling code here:
    private void cab5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cab5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cab5FocusLost

    private void cab5VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cab5VetoableChange
    // TODO add your handling code here:
    }//GEN-LAST:event_cab5VetoableChange

    private void cab5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cab5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cab5FocusGained

    private void cab8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cab8MouseClicked
DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
String date_niss= df.format(cab5.getDate()); 

Calendar cal = new GregorianCalendar();  
Date d1 = null;
Date d2 = null;
try {
d1 = df.parse(date_niss);
d2 = df.parse(df.format(cal.getTime()));
//in milliseconds
long diff = d2.getTime() - d1.getTime();
long diffDays = diff / (24 * 60 * 60 * 1000);
long a=diffDays/ 365;
System.out.print(a + "ann, "); 
cab8.setText(""+a);
} catch (Exception e) {
e.printStackTrace();
}             // TODO add your handling code here:
    }//GEN-LAST:event_cab8MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
jTabbedPane1.setEnabledAt(2, true);
jTabbedPane1.setEnabledAt(3,true);// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
     // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 
      jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false); 
patient_nom(cab34.getText());
 cab34.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false); 
patient();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  String cnam="Non";
 if(jRadioButton5.isSelected())cnam="Oui";
if( cab20.getText().equals("") ||cab13.getText().equals("") ||cab18.getText().equals("")||cab15.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Un erreur est detecte veuillez Remplir les champs vides.","Erreur !",JOptionPane.ERROR_MESSAGE);
}  
else if (! cab13.getText().matches("[0-9]*")||!(cab13.getText().length()==8)){
JOptionPane.showMessageDialog (null , "un erreur est detecte veuillez verifier la saisi du Numéro télephone   " , "Erreur !" , JOptionPane.ERROR_MESSAGE);
cab13.setText ("");
}
else if (! cab18.getText().matches("[0-9]*")||!(cab18.getText().length()==8)) {
JOptionPane.showMessageDialog(null,"Un erreur est detecte veuillez verifier la saisi du Numéro GSM.","Erreur !",JOptionPane.ERROR_MESSAGE);
cab18.setText("");
}
 
else
{
try {
cabinetmedical medical= new cabinetmedical();
 medical.medical_update("UPDATE `patient` SET  `cnam` =  '"+ cnam +"', `qualite` =  '"+ jComboBox2.getSelectedItem() +"', `prof` =  '"+ cab20.getText() +"', `telephone` =  "+ cab13.getText() +", `gsm` =  "+ cab18.getText() +", `adresse` =  '"+ cab15.getText() +"' WHERE `cin` =  '"+ cab4.getText() +"'");
 JOptionPane.showMessageDialog(null ," enregistrement effectué");
patient();
jTabbedPane1.setSelectedIndex(0);
 jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false); 
 
} catch (SQLException e) {
System.out.print(e);
}}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   int n = JOptionPane.showConfirmDialog(null, "Supprimer l'enregistrement", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
System.out.println(n);
if (n == 0) {
       try {
 cabinetmedical medical= new cabinetmedical();
 String  req_sql="delete from patient where cin='"+ jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "'";
medical.medical_update(req_sql);   
 JOptionPane.showMessageDialog(null ,"Enregistrement effectué");
jTabbedPane1.setSelectedIndex(0);
 jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false);
 
patient();
} catch (SQLException ex) {
           Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
       }
}
     
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cab25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab25ActionPerformed

    private void cab37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab37ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jTabbedPane1.setSelectedIndex(0);
 jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
jTabbedPane1.setSelectedIndex(0);
 jTabbedPane1.setEnabledAt(2, false);
jTabbedPane1.setEnabledAt(3,false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cab32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab32ActionPerformed

    private void cab33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cab33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cab33ActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Patient dialog = new Patient(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JFormattedTextField cab1;
    private javax.swing.JFormattedTextField cab10;
    private javax.swing.JFormattedTextField cab11;
    private javax.swing.JTextArea cab12;
    private javax.swing.JFormattedTextField cab13;
    private javax.swing.JTextArea cab15;
    private javax.swing.JFormattedTextField cab16;
    private javax.swing.JFormattedTextField cab17;
    private javax.swing.JFormattedTextField cab18;
    private javax.swing.JFormattedTextField cab19;
    private javax.swing.JFormattedTextField cab2;
    private javax.swing.JFormattedTextField cab20;
    private javax.swing.JFormattedTextField cab23;
    private javax.swing.JFormattedTextField cab24;
    private javax.swing.JFormattedTextField cab25;
    private javax.swing.JTextArea cab26;
    private javax.swing.JFormattedTextField cab27;
    private javax.swing.JFormattedTextField cab28;
    private javax.swing.JFormattedTextField cab29;
    private javax.swing.JFormattedTextField cab3;
    private javax.swing.JFormattedTextField cab30;
    private javax.swing.JFormattedTextField cab31;
    private javax.swing.JFormattedTextField cab32;
    private javax.swing.JFormattedTextField cab33;
    private javax.swing.JFormattedTextField cab34;
    private javax.swing.JFormattedTextField cab35;
    private javax.swing.JFormattedTextField cab36;
    private javax.swing.JFormattedTextField cab37;
    private javax.swing.JFormattedTextField cab4;
    private com.toedter.calendar.JDateChooser cab5;
    private javax.swing.JFormattedTextField cab8;
    private javax.swing.JFormattedTextField cab9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 
 
 void patient()
 {
try {
 DateFormat df = new SimpleDateFormat("dd-MMMM-yyyy"); 
cabinetmedical cabinet=new cabinetmedical();
String req_sql = "SELECT * FROM patient";
ResultSet rs_medical = cabinet.statement.executeQuery(req_sql);
String titre [] = { "Cin","Nom", "Prenom","Date de Naissance", "Sexe","Telephone","Adresse"};
 int indis = 0; 
rs_medical.last();
String donnee_bd[][] = new String[rs_medical.getRow()][7];
rs_medical.beforeFirst();
 while (rs_medical.next()) { 
donnee_bd[indis][0] = ""+rs_medical.getString(1);
donnee_bd[indis][1] = ""+rs_medical.getString(2);
donnee_bd[indis][2] = ""+rs_medical.getString(3);
donnee_bd[indis][3] = ""+df.format(rs_medical.getDate(5));
donnee_bd[indis][4] = ""+rs_medical.getString(4);
donnee_bd[indis][5] = ""+rs_medical.getString(9);
donnee_bd[indis][6] = ""+rs_medical.getString(11);
 indis++;
}
DefaultTableModel model = new DefaultTableModel(donnee_bd, titre );
jTable1.setModel(model);  
} catch (SQLException ex) {
ex.printStackTrace();
}
}
 
  void  patient_nom(String nom)
 {
try {
 DateFormat df = new SimpleDateFormat("dd-MMMM-yyyy"); 
cabinetmedical cabinet=new cabinetmedical();
String req_sql = "SELECT * FROM patient where nom LIKE  '%"+nom+"%'";
ResultSet rs_medical = cabinet.statement.executeQuery(req_sql);
String titre [] = { "Cin","Nom", "Prenom","Date de Naissance", "Sexe","Telephone","Adresse"};
 int indis = 0; 
rs_medical.last();
String donnee_bd[][] = new String[rs_medical.getRow()][7];
rs_medical.beforeFirst();
 while (rs_medical.next()) { 
donnee_bd[indis][0] = ""+rs_medical.getString(1);
donnee_bd[indis][1] = ""+rs_medical.getString(2);
donnee_bd[indis][2] = ""+rs_medical.getString(3);
donnee_bd[indis][3] = ""+df.format(rs_medical.getDate(5));
donnee_bd[indis][4] = ""+rs_medical.getString(4);
donnee_bd[indis][5] = ""+rs_medical.getString(9);
donnee_bd[indis][6] = ""+rs_medical.getString(11);
 indis++;
}
DefaultTableModel model = new DefaultTableModel(donnee_bd, titre );
jTable1.setModel(model);  
} catch (SQLException ex) {
ex.printStackTrace();
}
}
 void  patient_sexe(String sexe)
 {
try {
 DateFormat df = new SimpleDateFormat("dd-MMMM-yyyy"); 
cabinetmedical cabinet=new cabinetmedical();
String req_sql = "SELECT * FROM patient where sexe='"+sexe+"'";
ResultSet rs_medical = cabinet.statement.executeQuery(req_sql);
String titre [] = { "Cin","Nom", "Prenom","Date de Naissance", "Sexe","GSM","Adresse"};
 int indis = 0; 
rs_medical.last();
String donnee_bd[][] = new String[rs_medical.getRow()][7];
rs_medical.beforeFirst();
 while (rs_medical.next()) { 
donnee_bd[indis][0] = ""+rs_medical.getString(1);
donnee_bd[indis][1] = ""+rs_medical.getString(2);
donnee_bd[indis][2] = ""+rs_medical.getString(3);
donnee_bd[indis][3] = ""+df.format(rs_medical.getDate(5));
donnee_bd[indis][4] = ""+rs_medical.getString(4);
donnee_bd[indis][5] = ""+rs_medical.getString("gsm");
donnee_bd[indis][6] = ""+rs_medical.getString(11);
 indis++;
}
DefaultTableModel model = new DefaultTableModel(donnee_bd, titre );
jTable1.setModel(model);  
} catch (SQLException ex) {
ex.printStackTrace();
}
}
}
