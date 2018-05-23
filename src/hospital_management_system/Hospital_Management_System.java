/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import HMS_Interface.ILogin;

/**
 *
 * @author acer
 */
public class Hospital_Management_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HMS_Interface.ILogin IL=new ILogin();
        IL.setVisible(true);
    }
}
