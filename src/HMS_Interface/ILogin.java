/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Interface;
import HMS_Classes.DBOperation;
import javax.swing.*;
import HMS_Classes.Login;
import java.util.ArrayList;
/**
 *
 * @author acer
 */
public class ILogin extends javax.swing.JFrame {
    DBOperation dbops=new DBOperation();
    Login LG=new Login();
    ArrayList<Login> LList;
    

    /**
     * Creates new form ILogin
     */
    public ILogin() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbselectuser = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G.B HOSPITAL");
        setPreferredSize(new java.awt.Dimension(1000, 760));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("LOGIN DETAILS"));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 760));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 381, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 430, 120, 30);
        jPanel1.add(txtUserName);
        txtUserName.setBounds(270, 380, 470, 32);

        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("LOGIN");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(430, 520, 110, 35);

        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("HELP");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(640, 520, 110, 35);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(270, 430, 470, 34);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 56)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 20, 1000, 68);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Management System");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 160, 1000, 43);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("G.B Hospital");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 90, 1000, 68);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("You Are");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 330, 120, 40);

        cmbselectuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbselectuser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Reception", "Doctor", "Nurse", "MaintainStaff", "Patient" }));
        cmbselectuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbselectuserActionPerformed(evt);
            }
        });
        jPanel1.add(cmbselectuser);
        cmbselectuser.setBounds(270, 329, 153, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS_Image/loginBackground.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(1000, 760));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 20, 1000, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Enter Your usename and Password\n" +
                "select who you are"+
"eg:-USERNAME:SDC15000\n" +
"    PASSWORD:R124s@5"+"                                                                                                   ");
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        if("Admin".equals(cmbselectuser.getSelectedItem().toString())){
            if("Admin".equals(txtUserName.getText()) && "hasith".equals(txtPassword.getText())){
            Admin AD=new Admin();
            AD.setVisible(true);
            }
        }
        if("Reception".equals(cmbselectuser.getSelectedItem().toString())){
            LList=dbops.LoginReception(txtUserName.getText());
            if(LList.get(0).getUserName().equals(txtUserName.getText()) && LList.get(0).getPassword().equals(txtPassword.getText())){
            Reception RS=new Reception();
            RS.setVisible(true);
            this.dispose();
            }
            else{ JOptionPane.showMessageDialog(this,"your username or password incorrect"
                        + "select the First who tou are"
                        + "enter correct username and password");
            }
            
        }
        if("Doctor".equals(cmbselectuser.getSelectedItem().toString())){
            
            LList=dbops.LoginDoctor(txtUserName.getText());
            if(LList.get(0).getUserName().equals(txtUserName.getText()) && LList.get(0).getPassword().equals(txtPassword.getText())){
                Doctor DR=new Doctor();
                DR.setVisible(true);
            this.dispose();
            }
            else{ JOptionPane.showMessageDialog(this,"your username or password incorrect"
                        + "select the First who tou are"
                        + "enter correct username and password");
            }
            
            
        }
        
        if("Nurse".equals(cmbselectuser.getSelectedItem().toString())){
            LList=dbops.LoginNurse(txtUserName.getText());
            if(LList.get(0).getUserName().equals(txtUserName.getText()) && LList.get(0).getPassword().equals(txtPassword.getText())){
            Nurse NR=new Nurse();
            NR.setVisible(true);
            this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"your username or password incorrect"
                        + "select the First who tou are"
                        + "enter correct username and password");
            }
      
      
        }
        
         if("MaintainStaff".equals(cmbselectuser.getSelectedItem().toString())){
            LList=dbops.LoginMaintainStaff(txtUserName.getText());
            if(LList.get(0).getUserName().equals(txtUserName.getText()) && LList.get(0).getPassword().equals(txtPassword.getText())){
            MaintainStaff MS=new MaintainStaff();
            MS.setVisible(true);
            this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"your username or password incorrect"
                        + "select the First who tou are"
                        + "enter correct username and password");
            }
      
      
        }
         if("Patient".equals(cmbselectuser.getSelectedItem().toString())){
            System.out.println("ok1");
            LList=dbops.LoginPatients(txtUserName.getText());
            System.out.println("DB");
            if(LList.get(0).getUserName().equals(txtUserName.getText()) && LList.get(0).getPassword().equals(txtPassword.getText())){
           Patients PT=new Patients();
            PT.setVisible(true);
            this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"your username or password incorrect"
                        + "select the First who tou are"
                        + "enter correct username and password");
            }
      
      
        }
       
    }//GEN-LAST:event_btn1ActionPerformed

    private void cmbselectuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbselectuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbselectuserActionPerformed

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
            java.util.logging.Logger.getLogger(ILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ILogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox cmbselectuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
