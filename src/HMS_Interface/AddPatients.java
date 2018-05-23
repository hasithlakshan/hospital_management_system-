/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Interface;

import HMS_Classes.DBOperation;
import HMS_Classes.PatientsDetails;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class AddPatients extends javax.swing.JFrame {
    DBOperation dbops=new DBOperation();
    
    

    /**
     * Creates new form AddPatients
     */
    public AddPatients() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        btnEnterDetails = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNicNO = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtConNO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiscription = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtGuardianName = new javax.swing.JTextField();
        txtWardNO = new javax.swing.JTextField();
        lblWardNo = new javax.swing.JLabel();
        lblBloodGroup = new javax.swing.JLabel();
        cmbBloodGroup = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtGContact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G.B HOSPITAL");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Patients"));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 76, 149, 34);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Discription");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(18, 436, 149, 34);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NIC No");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(19, 121, 149, 34);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date Of Birth");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(19, 162, 149, 34);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Age");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(19, 203, 149, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(19, 283, 149, 34);

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtFirstName);
        txtFirstName.setBounds(173, 36, 400, 33);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(18, 353, 149, 34);

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(cmbGender);
        cmbGender.setBounds(173, 285, 123, 34);

        btnEnterDetails.setBackground(new java.awt.Color(0, 0, 0));
        btnEnterDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEnterDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnEnterDetails.setText("Enter Details");
        btnEnterDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnterDetails);
        btnEnterDetails.setBounds(173, 706, 160, 34);

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(444, 706, 130, 34);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("First Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(19, 35, 149, 34);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Guardian name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(18, 519, 149, 34);

        txtNicNO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtNicNO);
        txtNicNO.setBounds(173, 122, 400, 33);

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtLastName);
        txtLastName.setBounds(173, 77, 400, 33);

        txtage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtage);
        txtage.setBounds(173, 204, 400, 33);

        txtDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        jPanel1.add(txtDOB);
        txtDOB.setBounds(173, 163, 400, 33);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("contact no");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(19, 242, 149, 34);

        txtConNO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtConNO);
        txtConNO.setBounds(173, 243, 400, 33);

        txtDiscription.setColumns(20);
        txtDiscription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDiscription.setRows(5);
        txtDiscription.setText("\n\n\n");
        jScrollPane1.setViewportView(txtDiscription);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(172, 436, 400, 76);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setText("\n\n\n");
        jScrollPane2.setViewportView(txtAddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(172, 353, 401, 76);

        txtGuardianName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtGuardianName);
        txtGuardianName.setBounds(172, 520, 400, 33);

        txtWardNO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtWardNO);
        txtWardNO.setBounds(172, 602, 400, 33);

        lblWardNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblWardNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWardNo.setText("Ward no");
        jPanel1.add(lblWardNo);
        lblWardNo.setBounds(18, 601, 149, 34);

        lblBloodGroup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBloodGroup.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBloodGroup.setText("Blood Group");
        jPanel1.add(lblBloodGroup);
        lblBloodGroup.setBounds(363, 283, 149, 34);

        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-", "None" }));
        jPanel1.add(cmbBloodGroup);
        cmbBloodGroup.setBounds(517, 283, 56, 63);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("G.contact no");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(18, 560, 149, 34);

        txtGContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtGContact);
        txtGContact.setBounds(172, 561, 400, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed
void clearFields(){
    txtFirstName.setText("");
    txtLastName.setText("");
    txtNicNO.setText("");
    txtDOB.setText("");
    txtage.setText("");
    txtConNO.setText("");
    txtAddress.setText("");
    txtDiscription.setText("");
    txtGContact.setText("");
    txtWardNO.setText("");
    
}
    private void btnEnterDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterDetailsActionPerformed
        // TODO add your handling code here:
        PatientsDetails PD=new PatientsDetails();
        int x=dbops.checkpatirnts(txtNicNO.getText());//check the person he or she already in this sYstem
        if(x==1){
            JOptionPane.showMessageDialog(this,"arlear this pation came to this hospitAL");
        }
        PD.setIndexNO(0);
        PD.setFirstName(txtFirstName.getText());
        PD.setLastName(txtLastName.getText());
        PD.setNICNo(txtNicNO.getText());
        PD.setDateOfBirth(txtDOB.getText());
        PD.setAge(Integer.parseInt(txtage.getText()));
        PD.setContactNO(txtConNO.getText());
        PD.setGender(cmbGender.getSelectedItem().toString());
        PD.setBloodGroup(cmbBloodGroup.getSelectedItem().toString());
        PD.setAddress(txtAddress.getText());
        PD.setDiscription(txtDiscription.getText());
        PD.setGuardianName(txtGuardianName.getText());
        PD.setGContactNo(txtGContact.getText());
        PD.setWardNO(txtWardNO.getText());
        
        boolean result=dbops.AddPatients(PD);
        
        if(result){
            JOptionPane.showMessageDialog(this,"insert successfully");
            clearFields();
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(this,"insert not successfully");
        }
        
        
        
      
        
    }//GEN-LAST:event_btnEnterDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatients().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEnterDetails;
    private javax.swing.JComboBox cmbBloodGroup;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel lblBloodGroup;
    private javax.swing.JLabel lblWardNo;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtConNO;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextArea txtDiscription;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGContact;
    private javax.swing.JTextField txtGuardianName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNicNO;
    private javax.swing.JTextField txtWardNO;
    private javax.swing.JTextField txtage;
    // End of variables declaration//GEN-END:variables
}
