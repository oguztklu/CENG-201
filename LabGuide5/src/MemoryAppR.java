
import ClinicalCase.ClinicalCase;
import Memory.Alzheimer;
import Memory.Amnesia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OGUZ
 */
public class MemoryAppR extends javax.swing.JFrame {

    /**
     * Creates new form MemoryApp
     */
    public MemoryAppR() {
        initComponents();
        jpAlzheimer.setVisible(false);
        jpAmnesia.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpMemory = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfDeficit_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcMemoryLoss = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jrAlzheimer = new javax.swing.JRadioButton();
        jrAmnesia = new javax.swing.JRadioButton();
        jpAmnesia = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcAmnesia_cause = new javax.swing.JComboBox<>();
        jcAmnesia_Type = new javax.swing.JComboBox<>();
        jcAmnesia_Brain_Location = new javax.swing.JComboBox<>();
        jpAlzheimer = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jcAlzheimer_Affacted_Area = new javax.swing.JComboBox<>();
        jpAddDeficit = new javax.swing.JButton();
        jtfPatientID = new javax.swing.JTextField();
        jtfPatient_NAME_SURNAME = new javax.swing.JTextField();
        jtfAge = new javax.swing.JTextField();
        jtfGender = new javax.swing.JTextField();
        jpDisplay_and_Search = new javax.swing.JPanel();
        jpDisplayDeficit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaDisplay = new javax.swing.JTextArea();
        jpTotalDeficit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaTotal = new javax.swing.JTextArea();
        jpSearch_by_DeficitID = new javax.swing.JButton();
        jcSearchedID = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaSearch = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 51)));

        jpMemory.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Memory Deficit"));

        jLabel1.setText("Memory Loss");

        jLabel2.setText("Patient ID :");

        jcMemoryLoss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcMemoryLoss.setSelectedIndex(-1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Clinical Case");

        jLabel4.setText("Deficit ID:");

        jLabel5.setText("Patient Name,Surname : ");

        jLabel6.setText("Age :");

        jLabel7.setText("Gender :");

        jLabel8.setText("Deficit Types :");

        buttonGroup1.add(jrAlzheimer);
        jrAlzheimer.setText("Alzheimer");
        jrAlzheimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAlzheimerActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrAmnesia);
        jrAmnesia.setText("Amnesia");
        jrAmnesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAmnesiaActionPerformed(evt);
            }
        });

        jpAmnesia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Amnesia"));

        jLabel9.setText("Type :");

        jLabel10.setText("Cause :");

        jLabel11.setText("Brain Location :");

        jcAmnesia_cause.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ITEM1", "ITEM2", "ITEM3", "ITEM4" }));
        jcAmnesia_cause.setSelectedIndex(-1);

        jcAmnesia_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        jcAmnesia_Type.setSelectedIndex(-1);

        jcAmnesia_Brain_Location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcAmnesia_Brain_Location.setSelectedIndex(-1);

        javax.swing.GroupLayout jpAmnesiaLayout = new javax.swing.GroupLayout(jpAmnesia);
        jpAmnesia.setLayout(jpAmnesiaLayout);
        jpAmnesiaLayout.setHorizontalGroup(
            jpAmnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAmnesiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAmnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpAmnesiaLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcAmnesia_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAmnesiaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcAmnesia_Brain_Location, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpAmnesiaLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcAmnesia_cause, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAmnesiaLayout.setVerticalGroup(
            jpAmnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAmnesiaLayout.createSequentialGroup()
                .addGroup(jpAmnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAmnesia_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAmnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAmnesia_cause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAmnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAmnesia_Brain_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jpAlzheimer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Alzheimer"));

        jLabel12.setText("Affacted Area :");

        jcAlzheimer_Affacted_Area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEYIN", "AM", "GOT", "MEME" }));
        jcAlzheimer_Affacted_Area.setSelectedIndex(-1);

        javax.swing.GroupLayout jpAlzheimerLayout = new javax.swing.GroupLayout(jpAlzheimer);
        jpAlzheimer.setLayout(jpAlzheimerLayout);
        jpAlzheimerLayout.setHorizontalGroup(
            jpAlzheimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlzheimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcAlzheimer_Affacted_Area, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAlzheimerLayout.setVerticalGroup(
            jpAlzheimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlzheimerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAlzheimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAlzheimer_Affacted_Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jpAddDeficit.setText("Add Deficit");
        jpAddDeficit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpAddDeficitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMemoryLayout = new javax.swing.GroupLayout(jpMemory);
        jpMemory.setLayout(jpMemoryLayout);
        jpMemoryLayout.setHorizontalGroup(
            jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMemoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMemoryLayout.createSequentialGroup()
                        .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpAlzheimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpAmnesia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpMemoryLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDeficit_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcMemoryLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpMemoryLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrAmnesia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jrAlzheimer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMemoryLayout.createSequentialGroup()
                                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfPatient_NAME_SURNAME)
                                    .addComponent(jtfPatientID)
                                    .addComponent(jtfAge)
                                    .addComponent(jtfGender, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addGroup(jpMemoryLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))))
            .addGroup(jpMemoryLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jpAddDeficit, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpMemoryLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(314, Short.MAX_VALUE)))
        );
        jpMemoryLayout.setVerticalGroup(
            jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMemoryLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jtfDeficit_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMemoryLoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPatient_NAME_SURNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrAlzheimer)
                    .addComponent(jrAmnesia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpAmnesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpAlzheimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpAddDeficit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpMemoryLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(322, Short.MAX_VALUE)))
        );

        jpDisplay_and_Search.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Display And Search"));

        jpDisplayDeficit.setText("Display Deficit");
        jpDisplayDeficit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpDisplayDeficitActionPerformed(evt);
            }
        });

        jTaDisplay.setEditable(false);
        jTaDisplay.setColumns(20);
        jTaDisplay.setRows(5);
        jScrollPane1.setViewportView(jTaDisplay);

        jpTotalDeficit.setText("Total Deficit");
        jpTotalDeficit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpTotalDeficitActionPerformed(evt);
            }
        });

        jtaTotal.setEditable(false);
        jtaTotal.setColumns(20);
        jtaTotal.setRows(5);
        jScrollPane2.setViewportView(jtaTotal);

        jpSearch_by_DeficitID.setText("Search By Deficit ID :");
        jpSearch_by_DeficitID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpSearch_by_DeficitIDActionPerformed(evt);
            }
        });

        jtaSearch.setEditable(false);
        jtaSearch.setColumns(20);
        jtaSearch.setRows(5);
        jScrollPane3.setViewportView(jtaSearch);

        javax.swing.GroupLayout jpDisplay_and_SearchLayout = new javax.swing.GroupLayout(jpDisplay_and_Search);
        jpDisplay_and_Search.setLayout(jpDisplay_and_SearchLayout);
        jpDisplay_and_SearchLayout.setHorizontalGroup(
            jpDisplay_and_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDisplay_and_SearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDisplay_and_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpDisplay_and_SearchLayout.createSequentialGroup()
                        .addGroup(jpDisplay_and_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpDisplayDeficit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpTotalDeficit, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpDisplay_and_SearchLayout.createSequentialGroup()
                                .addComponent(jpSearch_by_DeficitID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcSearchedID, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDisplay_and_SearchLayout.setVerticalGroup(
            jpDisplay_and_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDisplay_and_SearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpDisplayDeficit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTotalDeficit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpDisplay_and_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpSearch_by_DeficitID)
                    .addComponent(jcSearchedID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDisplay_and_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpDisplay_and_Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpDisplayDeficitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpDisplayDeficitActionPerformed
        if (jrAlzheimer.isSelected()) {
        jTaDisplay.setText(InfoClass.getAlzheimer());
        }
        else if(jrAmnesia.isSelected()){
        jTaDisplay.setText(InfoClass.getAmnesia());
        }
        
    }//GEN-LAST:event_jpDisplayDeficitActionPerformed

    private void jrAmnesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAmnesiaActionPerformed
        jpAmnesia.setVisible(true);
        jpAlzheimer.setVisible(false);
    }//GEN-LAST:event_jrAmnesiaActionPerformed

    public void clearAllup(){
    jtfAge.setText("");
    jtfDeficit_ID.setText("");
    jtfGender.setText("");
    jtfPatientID.setText("");
    jtfPatient_NAME_SURNAME.setText("");
    
    jcAlzheimer_Affacted_Area.setSelectedIndex(-1);
    jcAmnesia_Brain_Location.setSelectedIndex(-1);
    jcAmnesia_Type.setSelectedIndex(-1);
    jcAmnesia_cause.setSelectedIndex(-1);
    jcMemoryLoss.setSelectedIndex(-1);
    jcMemoryLoss.setSelectedIndex(-1);
    
    }
    
    private void jrAlzheimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAlzheimerActionPerformed
       jpAlzheimer.setVisible(true);
       jpAmnesia.setVisible(false);
    }//GEN-LAST:event_jrAlzheimerActionPerformed

    private void jpAddDeficitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpAddDeficitActionPerformed
        
        if(jrAlzheimer.isSelected()){
        String []names = jtfPatient_NAME_SURNAME.getText().split(",");
            Alzheimer x = new Alzheimer(jcAlzheimer_Affacted_Area.getSelectedItem().toString(), jtfPatientID.getText(),names[0], names[1], Integer.parseInt(jtfAge.getText()), jtfGender.getText(), jtfDeficit_ID.getText(), jcMemoryLoss.getSelectedItem().toString());
           InfoClass.addMemory(x);
        clearAllup();
        jcSearchedID.addItem(x.getDeficit_id());
        jTaDisplay.append("\nAlzheimer is added!!");
        

        }
        else if(jrAmnesia.isSelected()){
        String []names = jtfPatient_NAME_SURNAME.getText().split(",");
            Amnesia x = new Amnesia(jcAmnesia_Type.getSelectedItem().toString(), jcAmnesia_cause.getSelectedItem().toString(), jcAmnesia_Brain_Location.getSelectedItem().toString(), jtfPatientID.getText(), names[0], names[1], Integer.parseInt(jtfAge.getText()), jtfGender.getText(), jtfDeficit_ID.getText(), jcMemoryLoss.getSelectedItem().toString());
            InfoClass.addMemory(x);
        clearAllup();
        jcSearchedID.addItem(x.getDeficit_id());
        jcSearchedID.setSelectedIndex(-1);
        jTaDisplay.append("\nAmnesia is added!");
        
        
        }
    }//GEN-LAST:event_jpAddDeficitActionPerformed

    private void jpTotalDeficitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpTotalDeficitActionPerformed
      jtaTotal.setText(InfoClass.showTotalMemory());
      // TODO add your handling code here:
    }//GEN-LAST:event_jpTotalDeficitActionPerformed

    private void jpSearch_by_DeficitIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpSearch_by_DeficitIDActionPerformed
       jtaSearch.setText(InfoClass.searchMemory(jcSearchedID.getSelectedItem().toString()).toString());
    }//GEN-LAST:event_jpSearch_by_DeficitIDActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(MemoryAppR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoryAppR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoryAppR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoryAppR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoryAppR().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTaDisplay;
    private javax.swing.JComboBox<String> jcAlzheimer_Affacted_Area;
    private javax.swing.JComboBox<String> jcAmnesia_Brain_Location;
    private javax.swing.JComboBox<String> jcAmnesia_Type;
    private javax.swing.JComboBox<String> jcAmnesia_cause;
    private javax.swing.JComboBox<String> jcMemoryLoss;
    private javax.swing.JComboBox<String> jcSearchedID;
    private javax.swing.JButton jpAddDeficit;
    private javax.swing.JPanel jpAlzheimer;
    private javax.swing.JPanel jpAmnesia;
    private javax.swing.JButton jpDisplayDeficit;
    private javax.swing.JPanel jpDisplay_and_Search;
    private javax.swing.JPanel jpMemory;
    private javax.swing.JButton jpSearch_by_DeficitID;
    private javax.swing.JButton jpTotalDeficit;
    private javax.swing.JRadioButton jrAlzheimer;
    private javax.swing.JRadioButton jrAmnesia;
    private javax.swing.JTextArea jtaSearch;
    private javax.swing.JTextArea jtaTotal;
    private javax.swing.JTextField jtfAge;
    private javax.swing.JTextField jtfDeficit_ID;
    private javax.swing.JTextField jtfGender;
    private javax.swing.JTextField jtfPatientID;
    private javax.swing.JTextField jtfPatient_NAME_SURNAME;
    // End of variables declaration//GEN-END:variables
}
