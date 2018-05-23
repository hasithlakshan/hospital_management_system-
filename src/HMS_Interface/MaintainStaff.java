
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



public class MaintainStaff extends javax.swing.JFrame {
    ArrayList<PatientsDetails> PList;
    ArrayList<DoctorDetails> DList;
    ArrayList<NurseDetails> NList;
    ArrayList<MaintainStaffDetails> MList;
    DBOperation dbops=new DBOperation();
    public MaintainStaff() {
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
        btnViewPatients = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnViewDoctor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnViewNurse = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNurse = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnviewMainTainStaff = new javax.swing.JButton();
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnViewPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnViewNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnviewMainTainStaff)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnviewMainTainStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        MaintainStaff AD=new MaintainStaff();
        AD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrefreshActionPerformed

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
            java.util.logging.Logger.getLogger(MaintainStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintainStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintainStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintainStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintainStaff().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogOut;
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
