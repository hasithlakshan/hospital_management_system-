/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Classes;

/**
 *
 * @author acer
 */
public class DoctorDetails extends employee{
    
    private String MBBSNo;
    private String DoctorID;
    private String DoctorType;


    public String getMBBSNo() {
        return MBBSNo;
    }

    /**
     * @param MBBSNo the MBBSNo to set
     */
    public void setMBBSNo(String MBBSNo) {
        this.MBBSNo = MBBSNo;
    }

    /**
     * @return the DoctorID
     */
    public String getDoctorID() {
        return DoctorID;
    }

    /**
     * @param DoctorID the DoctorID to set
     */
    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    /**
     * @return the DoctorType
     */
    public String getDoctorType() {
        return DoctorType;
    }

    /**
     * @param DoctorType the DoctorType to set
     */
    public void setDoctorType(String DoctorType) {
        this.DoctorType = DoctorType;
    }
    
}
