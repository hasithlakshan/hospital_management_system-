/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Classes;

/**
 *
 * @author acer
 */
public class MaintainStaffDetails extends employee{
    private String RegNo;
    private String MaintainID;

    /**
     * @return the RegNo
     */
    public String getRegNo() {
        return RegNo;
    }

    /**
     * @param RegNo the RegNo to set
     */
    public void setRegNo(String RegNo) {
        this.RegNo = RegNo;
    }

    /**
     * @return the MaintainID
     */
    public String getMaintainID() {
        return MaintainID;
    }

    /**
     * @param MaintainID the MaintainID to set
     */
    public void setMaintainID(String MaintainID) {
        this.MaintainID = MaintainID;
    }
}
