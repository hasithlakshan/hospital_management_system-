
package HMS_Interface;

import HMS_Classes.DBOperation;
import HMS_Classes.DoctorDetails;
import HMS_Classes.DoctorTable;
import HMS_Classes.MaintainStaffDetails;
import HMS_Classes.NurseDetails;
import HMS_Classes.NurseTable;
import HMS_Classes.PatientTable;
import HMS_Classes.MaintainStaffTable;
import HMS_Classes.PatientsDetails;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Admin extends javax.swing.JFrame {
    ArrayList<PatientsDetails> PList;
    ArrayList<DoctorDetails> DList;
    ArrayList<NurseDetails> NList;
    ArrayList<MaintainStaffDetails> MList;
    DBOperation dbops=new DBOperation();
    public Admin() {
        initComponents();
        loadPatients();
        loadDoctor();//the method call to the start Admin
        loadNurse();
        maintainStaff();
    }
    //get the object of patient from the database and pass into the patient table 
    void loadPatients(){
        PList=dbops.getPatients();
        PatientTable PtsTable=new PatientTable(PList);
        tblPatient.setModel(PtsTable);//patien table setting created in the PatientTable Class
         
    }
    void loadDoctor(){
        DList=dbops.getDoctor();
        DoctorTable docTable=new DoctorTable(DList);
        tblDoctor.setModel(docTable);//patien table setting created in the PatientTable Class
         
    }
    
    void loadNurse(){
        NList=dbops.getNurse();
        NurseTable NurTable=new NurseTable(NList);
        tblNurse.setModel(NurTable);//patien table setting created in the PatientTable Class
         
    }
    void maintainStaff(){
        MList=dbops.getmaintainStaff();
        MaintainStaffTable mstf=new MaintainStaffTable(MList);
        tblMaintainStaff.setModel(mstf);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnLogOut = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnAddPatients = new javax.swing.JButton();
        btnViewPatients = new javax.swing.JButton();
        btnUpdatePatients = new javax.swing.JButton();
        btnDeletePatients = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnViewDoctor = new javax.swing.JButton();
        btnAddDoctor = new javax.swing.JButton();
        btnUpdateDoctor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        DeleteDoctor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnViewNurse = new javax.swing.JButton();
        btnAddNurse = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNurse = new javax.swing.JTable();
        btnUpdateNurse = new javax.swing.JButton();
        btnDeleteNurse = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnviewMainTainStaff = new javax.swing.JButton();
        btnAddMaintainStaff = new javax.swing.JButton();
        btnUpdateMainTainStaff1 = new javax.swing.JButton();
        btnDeleteMainTainStaff = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMaintainStaff = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G.B HOSPITAL");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hospital management system Admin"));
        jPanel1.setLayout(null);

        BtnLogOut.setBackground(new java.awt.Color(0, 0, 0));
        BtnLogOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnLogOut.setForeground(new java.awt.Color(255, 255, 0));
        BtnLogOut.setText("LOG OUT");
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogOut);
        BtnLogOut.setBounds(860, 20, 140, 40);

        btnrefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(255, 255, 0));
        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnrefresh);
        btnrefresh.setBounds(860, 60, 140, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("G.B Hospital");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(4, 22, 980, 68);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Management System");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(3, 97, 980, 43);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnAddPatients.setBackground(new java.awt.Color(0, 0, 0));
        btnAddPatients.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddPatients.setForeground(new java.awt.Color(255, 255, 0));
        btnAddPatients.setText("Add Patients");
        btnAddPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientsActionPerformed(evt);
            }
        });

        btnViewPatients.setBackground(new java.awt.Color(0, 0, 0));
        btnViewPatients.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewPatients.setForeground(new java.awt.Color(255, 255, 51));
        btnViewPatients.setText("View Patients");
        btnViewPatients.setActionCommand("view Patients");
        btnViewPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientsActionPerformed(evt);
            }
        });

        btnUpdatePatients.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdatePatients.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdatePatients.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdatePatients.setText("Update Patient");
        btnUpdatePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientsActionPerformed(evt);
            }
        });

        btnDeletePatients.setBackground(new java.awt.Color(0, 0, 0));
        btnDeletePatients.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeletePatients.setForeground(new java.awt.Color(255, 255, 0));
        btnDeletePatients.setText("Delete Patient");
        btnDeletePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientsActionPerformed(evt);
            }
        });

        tblPatient.setBackground(new java.awt.Color(0, 204, 255));
        tblPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPatient);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdatePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 320, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnUpdatePatients, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnDeletePatients, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnViewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Patients", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnViewDoctor.setBackground(new java.awt.Color(0, 0, 0));
        btnViewDoctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewDoctor.setForeground(new java.awt.Color(255, 255, 0));
        btnViewDoctor.setText("View Doctor");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnAddDoctor.setBackground(new java.awt.Color(0, 0, 0));
        btnAddDoctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddDoctor.setForeground(new java.awt.Color(255, 255, 0));
        btnAddDoctor.setText("Add Doctor");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });

        btnUpdateDoctor.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateDoctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateDoctor.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdateDoctor.setText("Update Doctor");
        btnUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDoctorActionPerformed(evt);
            }
        });

        tblDoctor.setBackground(new java.awt.Color(0, 204, 255));
        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblDoctor);

        DeleteDoctor.setBackground(new java.awt.Color(0, 0, 0));
        DeleteDoctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteDoctor.setForeground(new java.awt.Color(255, 255, 0));
        DeleteDoctor.setText("Delete Doctor");
        DeleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 320, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Doctors", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        btnViewNurse.setBackground(new java.awt.Color(0, 0, 0));
        btnViewNurse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewNurse.setForeground(new java.awt.Color(255, 255, 0));
        btnViewNurse.setText("View Nurse");
        btnViewNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewNurseActionPerformed(evt);
            }
        });

        btnAddNurse.setBackground(new java.awt.Color(0, 0, 0));
        btnAddNurse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddNurse.setForeground(new java.awt.Color(255, 255, 0));
        btnAddNurse.setText("Add Nurse");
        btnAddNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNurseActionPerformed(evt);
            }
        });

        tblNurse.setBackground(new java.awt.Color(0, 204, 255));
        tblNurse.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblNurse);

        btnUpdateNurse.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateNurse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateNurse.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdateNurse.setText("Update Nurse");
        btnUpdateNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNurseActionPerformed(evt);
            }
        });

        btnDeleteNurse.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteNurse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteNurse.setForeground(new java.awt.Color(255, 255, 0));
        btnDeleteNurse.setText("Delete Nurse");
        btnDeleteNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNurseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 320, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nurses", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        btnviewMainTainStaff.setBackground(new java.awt.Color(0, 0, 0));
        btnviewMainTainStaff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnviewMainTainStaff.setForeground(new java.awt.Color(255, 255, 0));
        btnviewMainTainStaff.setText("View maintain Staff");
        btnviewMainTainStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewMainTainStaffActionPerformed(evt);
            }
        });

        btnAddMaintainStaff.setBackground(new java.awt.Color(0, 0, 0));
        btnAddMaintainStaff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddMaintainStaff.setForeground(new java.awt.Color(255, 255, 0));
        btnAddMaintainStaff.setText("Add maintain Staff");
        btnAddMaintainStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMaintainStaffActionPerformed(evt);
            }
        });

        btnUpdateMainTainStaff1.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateMainTainStaff1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateMainTainStaff1.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdateMainTainStaff1.setText("Update maintain Staff");
        btnUpdateMainTainStaff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMainTainStaff1ActionPerformed(evt);
            }
        });

        btnDeleteMainTainStaff.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteMainTainStaff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteMainTainStaff.setForeground(new java.awt.Color(255, 255, 0));
        btnDeleteMainTainStaff.setText("Delete maintain Staff");
        btnDeleteMainTainStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMainTainStaffActionPerformed(evt);
            }
        });

        tblMaintainStaff.setBackground(new java.awt.Color(0, 204, 255));
        tblMaintainStaff.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblMaintainStaff);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAddMaintainStaff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnviewMainTainStaff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateMainTainStaff1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteMainTainStaff)
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMaintainStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewMainTainStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteMainTainStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateMainTainStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("maintain Staff", jPanel5);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(16, 166, 970, 580);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS_Image/AdminBackground.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 20, 1000, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientsActionPerformed
         //call to the addPatients Frame
        System.out.println("ok1");
        AddPatients ap=new AddPatients();
        System.out.println("ok2");
        ap.setVisible(true);
    }//GEN-LAST:event_btnAddPatientsActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
         //call to the addDoctor Frame
        AddDoctor Ad=new AddDoctor();
        Ad.setVisible(true);
        
    }//GEN-LAST:event_btnAddDoctorActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:
        try{
     ViewDoctor VD=new ViewDoctor();
     VD.SetFilds(DList.get(tblDoctor.getSelectedRow()));
     VD.setVisible(true);
    }
     catch(Exception e){
         JOptionPane.showMessageDialog(this, "select the fields");
         
     }
    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void btnViewNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewNurseActionPerformed
  try{
     ViewNurse VN=new ViewNurse();
     VN.SetFilds(NList.get(tblNurse.getSelectedRow()));
     VN.setVisible(true);
    }
 catch(Exception e){
         JOptionPane.showMessageDialog(this, "select the fields");
         
     }
    }//GEN-LAST:event_btnViewNurseActionPerformed

    private void btnAddNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNurseActionPerformed
        //call to the addNurse Frame
        AddNurse An=new AddNurse();
        An.setVisible(true);
    }//GEN-LAST:event_btnAddNurseActionPerformed

    private void btnviewMainTainStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewMainTainStaffActionPerformed
        try{
        ViewMaintainStaff VM =new ViewMaintainStaff();
        VM.setField(MList.get(tblMaintainStaff.getSelectedRow()));
        VM.setVisible(true);
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "select the field");
        }
    }//GEN-LAST:event_btnviewMainTainStaffActionPerformed

    private void btnAddMaintainStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMaintainStaffActionPerformed
         //call to the addMaintainStaff Frame
        AddMaintainStaff AM=new AddMaintainStaff();
        AM.setVisible(true);
    }//GEN-LAST:event_btnAddMaintainStaffActionPerformed

    private void btnUpdatePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientsActionPerformed
     try{
     UpdatePatients UP=new UpdatePatients();
     UP.SetFilds(PList.get(tblPatient.getSelectedRow()));
     UP.setVisible(true);
    }
     catch(Exception e){
         JOptionPane.showMessageDialog(this, "select the fields");
         
     }  
    }//GEN-LAST:event_btnUpdatePatientsActionPerformed

    private void btnDeletePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientsActionPerformed
        // TODO add your handling code here:
        dbops.DeletePAtient(PList.get(tblPatient.getSelectedRow()));
        JOptionPane.showMessageDialog(this,"deleted this patients");
    }//GEN-LAST:event_btnDeletePatientsActionPerformed

    private void btnViewPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientsActionPerformed
        // TODO add your handling code here:
        try{
     ViewPatients VP=new ViewPatients();
     VP.SetFilds(PList.get(tblPatient.getSelectedRow()));
     VP.setVisible(true);
    }
     catch(Exception e){
         JOptionPane.showMessageDialog(this, "select the fields");
         
     }
    }//GEN-LAST:event_btnViewPatientsActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        Admin AD=new Admin();
        AD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoctorActionPerformed
        // TODO add your handling code here:
        try{
     UpdateDoctor UP=new UpdateDoctor();
     UP.SetFilds(DList.get(tblDoctor.getSelectedRow()));
     UP.setVisible(true);
    }
     catch(Exception e){
         JOptionPane.showMessageDialog(this, "select the fields");
         
     }
    }//GEN-LAST:event_btnUpdateDoctorActionPerformed

    private void DeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDoctorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"deleted this field");
        try{dbops.DeleteDoctor(DList.get(tblDoctor.getSelectedRow()));}
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "select the field");
            
        }
    }//GEN-LAST:event_DeleteDoctorActionPerformed

    private void btnUpdateNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNurseActionPerformed

        try{
            UpdateNurse UN=new UpdateNurse();
            UN.SetFilds(NList.get(tblNurse.getSelectedRow()));
            UN.setVisible(true);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "select the fields");
         }
    }//GEN-LAST:event_btnUpdateNurseActionPerformed

    private void btnDeleteNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNurseActionPerformed
    JOptionPane.showMessageDialog(this,"deleted this field");    
        try{
            dbops.DeleteNurse(NList.get(tblNurse.getSelectedRow()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"select the feild");
        }
    }//GEN-LAST:event_btnDeleteNurseActionPerformed

    private void btnUpdateMainTainStaff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMainTainStaff1ActionPerformed
        try{
        UpdateMaintainStaff UM=new UpdateMaintainStaff();
        UM.setField(MList.get(tblMaintainStaff.getSelectedRow()));
        UM.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "select feild");
        }
    }//GEN-LAST:event_btnUpdateMainTainStaff1ActionPerformed

    private void btnDeleteMainTainStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMainTainStaffActionPerformed
        // TODO add your handling code here:
        
        try{dbops.DeletemaintainStaff(MList.get(tblMaintainStaff.getSelectedRow()));
            JOptionPane.showMessageDialog(this,"deleted this field");}
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "select the field");
            
        }
        
    }//GEN-LAST:event_btnDeleteMainTainStaffActionPerformed

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        ILogin IL=new ILogin();
        IL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton DeleteDoctor;
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnAddMaintainStaff;
    private javax.swing.JButton btnAddNurse;
    private javax.swing.JButton btnAddPatients;
    private javax.swing.JButton btnDeleteMainTainStaff;
    private javax.swing.JButton btnDeleteNurse;
    private javax.swing.JButton btnDeletePatients;
    private javax.swing.JButton btnUpdateDoctor;
    private javax.swing.JButton btnUpdateMainTainStaff1;
    private javax.swing.JButton btnUpdateNurse;
    private javax.swing.JButton btnUpdatePatients;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JButton btnViewNurse;
    private javax.swing.JButton btnViewPatients;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnviewMainTainStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTable tblMaintainStaff;
    private javax.swing.JTable tblNurse;
    private javax.swing.JTable tblPatient;
    // End of variables declaration//GEN-END:variables
}
