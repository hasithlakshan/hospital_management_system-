/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Classes;

/**
 *
 * @author acer
 */
public class NurseDetails extends employee {
   
    private String RegNO;
    private String NurseID;

  
    public String getNurseID() {
        return NurseID;
    }

    /**
     * @param NurseID the NurseID to set
     */
    public void setNurseID(String NurseID) {
        this.NurseID = NurseID;
    }

    /**
     * @return the RegNO
     */
    public String getRegNO() {
        return RegNO;
    }

    /**
     * @param RegNO the RegNO to set
     */
    public void setRegNO(String RegNO) {
        this.RegNO = RegNO;
    }

    /**
     * @return the MBBSNo
     */

    
}
