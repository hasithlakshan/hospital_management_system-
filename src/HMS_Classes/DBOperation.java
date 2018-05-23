/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
/**
 *
 * @author acer
 */
public class DBOperation { //class for connecting the database
    String Url="jdbc:mysql://localhost:3306/hospital management system";//connection url
    String username="root";
    String Password="";
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
   
    
    /**
     *
     * @param PD
     * @return
     */
    
    //ADD operatrion
    
    
    public boolean AddPatients(PatientsDetails PD){//add to the details to patients table
        try{
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "INSERT INTO Patients VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst=(PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,PD.getIndexNO());//add valu to the sql query
        pst.setString(2,PD.getFirstName());//add valu to the sql query
        pst.setString(3,PD.getLastName());//add valu to the sql query
        pst.setString(4,PD.getNICNo());//add valu to the sql query
        pst.setString(5,PD.getDateOfBirth());//add valu to the sql query
        pst.setInt(6,PD.getAge());//add valu to the sql query
        pst.setString(7,PD.getContactNO());//add valu to the sql query
        pst.setString(8,PD.getGender());//add valu to the sql query
        pst.setString(9,PD.getBloodGroup());//add valu to the sql query
        pst.setString(10,PD.getAddress());//add valu to the sql query
        pst.setString(11,PD.getDiscription());//add valu to the sql query
        pst.setString(12,PD.getGuardianName());//add valu to the sql query
        pst.setString(13,PD.getGContactNo());//add valu to the sql query
        pst.setString(14,PD.getWardNO());//add valu to the sql query
        
        pst.executeUpdate();//execute to the sql quary ant enter the details to the table
        
        return  true;
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
    
    
    public boolean AddDoctor(DoctorDetails DD){//add to the details to patients table
        try{
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "INSERT INTO doctor VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst=(PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,DD.getIndexNO());//add valu to the sql query
        pst.setString(2,DD.getFirstName());//add valu to the sql query
        pst.setString(3,DD.getLastName());//add valu to the sql query
        pst.setString(4,DD.getNICNo());//add valu to the sql query
        pst.setString(5,DD.getDateOfBirth());//add valu to the sql query
        pst.setInt(6,DD.getAge());//add valu to the sql query
        pst.setString(7,DD.getContactNO());//add valu to the sql query
        pst.setString(8,DD.getGender());//add valu to the sql query
        pst.setString(9,DD.getDoctorType());//add valu to the sql query
        pst.setString(10,DD.getAddress());//add valu to the sql query
        pst.setString(11,DD.getDiscription());//add valu to the sql query
        pst.setString(12,DD.getMBBSNo());//add valu to the sql query
        pst.setString(13,DD.getDoctorID());//add valu to the sql query
        pst.setString(14,DD.getNICNo());//add valu to the sql query
        
        pst.executeUpdate();//execute to the sql quary ant enter the details to the table
        
        return  true;
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
    
    
    
    
    
    
    
    
        public boolean AddNurse(NurseDetails ND){//add to the details to patients table
        try{
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "INSERT INTO Nurse VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst=(PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,ND.getIndexNO());//add valu to the sql query
        pst.setString(2,ND.getFirstName());//add valu to the sql query
        pst.setString(3,ND.getLastName());//add valu to the sql query
        pst.setString(4,ND.getNICNo());//add valu to the sql query
        pst.setString(5,ND.getDateOfBirth());//add valu to the sql query
        pst.setInt(6,ND.getAge());//add valu to the sql query
        pst.setString(7,ND.getContactNO());//add valu to the sql query
        pst.setString(8,ND.getGender());//add valu to the sql query
        pst.setString(9,ND.getAddress());//add valu to the sql query
        pst.setString(10,ND.getDiscription());//add valu to the sql query
        pst.setString(11,ND.getRegNO());//add valu to the sql query
        pst.setString(12,ND.getNurseID());//add valu to the sql query
        pst.setString(13,ND.getNICNo());//add valu to the sql query
        
        pst.executeUpdate();//execute to the sql quary ant enter the details to the table
        
        return  true;
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
        
        public boolean AddMaintainStaff(MaintainStaffDetails MS){//add to the details to patients table
        try{
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "INSERT INTO Maintainstaff VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst=(PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,MS.getIndexNO());//add valu to the sql query
        pst.setString(2,MS.getFirstName());//add valu to the sql query
        pst.setString(3,MS.getLastName());//add valu to the sql query
        pst.setString(4,MS.getNICNo());//add valu to the sql query
        pst.setString(5,MS.getDateOfBirth());//add valu to the sql query
        pst.setInt(6,MS.getAge());//add valu to the sql query
        pst.setString(7,MS.getContactNO());//add valu to the sql query
        pst.setString(8,MS.getGender());//add valu to the sql query
        pst.setString(9,MS.getAddress());//add valu to the sql query
        pst.setString(10,MS.getDiscription());//add valu to the sql query
        pst.setString(11,MS.getRegNo());//add valu to the sql query
        pst.setString(12,MS.getMaintainID());//add valu to the sql query
        pst.setString(13,MS.getNICNo());//add valu to the sql query
        
        pst.executeUpdate();//execute to the sql quary ant enter the details to the table
        
        return  true;
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
    
        
       //get operation 
        
        public ArrayList<PatientsDetails> getPatients(){//add to the details to patients table
        try{
            //creatin the array list Patients details type
        ArrayList<PatientsDetails> list=new ArrayList<PatientsDetails>();
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "SELECT * FROM Patients";
        pst=(PreparedStatement)con.prepareStatement(query);
        
        
        rs=pst.executeQuery();//get the result of the quary from the database
       //in each iteration get all deails from specific row and add to the list 
        while(rs.next()){
            PatientsDetails p =new PatientsDetails();
            p.setIndexNO(rs.getInt(1));
            p.setFirstName(rs.getString(2));
            p.setLastName(rs.getString(3));
            p.setNICNo(rs.getString(4));
            p.setDateOfBirth(rs.getString(5));
            p.setAge(rs.getInt(6));
            p.setContactNO(rs.getString(7));
            p.setGender(rs.getString(8));
            p.setBloodGroup(rs.getString(9));
            p.setAddress(rs.getString(10));
            p.setDiscription(rs.getString(11));
            p.setGuardianName(rs.getString(12));
            p.setGContactNo(rs.getString(13));
            p.setWardNO(rs.getString(14));
            list.add(p);
        }
        return list;//after returning the list of Patients
       
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return null;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
        
        
        public ArrayList<DoctorDetails> getDoctor(){//add to the details to patients table
        try{
            //creatin the array list Patients details type
        ArrayList<DoctorDetails> list=new ArrayList<DoctorDetails>();
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "SELECT * FROM doctor";
        pst=(PreparedStatement)con.prepareStatement(query);
        
        
        rs=pst.executeQuery();//get the result of the quary from the database
       //in each iteration get all deails from specific row and add to the list 
        while(rs.next()){
            DoctorDetails DD =new DoctorDetails();
            DD.setIndexNO(rs.getInt(1));
            DD.setFirstName(rs.getString(2));
            DD.setLastName(rs.getString(3));
            DD.setNICNo(rs.getString(4));
            DD.setDateOfBirth(rs.getString(5));
            DD.setAge(rs.getInt(6));
            DD.setContactNO(rs.getString(7));
            DD.setGender(rs.getString(8));
            DD.setDoctorType(rs.getString(9));
            DD.setAddress(rs.getString(10));
            DD.setDiscription(rs.getString(11));
            DD.setMBBSNo(rs.getString(12));
            DD.setDoctorID(rs.getString(13));
            
            list.add(DD);
        }
        return list;//after returning the list of Patients
       
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return null;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
        
    public ArrayList<NurseDetails> getNurse(){//add to the details to patients table
        try{
            //creatin the array list Patients details type
        ArrayList<NurseDetails> list=new ArrayList<NurseDetails>();
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "SELECT * FROM nurse";
        pst=(PreparedStatement)con.prepareStatement(query);
        
        
        rs=pst.executeQuery();//get the result of the quary from the database
       //in each iteration get all deails from specific row and add to the list 
        while(rs.next()){
            NurseDetails ND =new NurseDetails();
            ND.setIndexNO(rs.getInt(1));
            ND.setFirstName(rs.getString(2));
            ND.setLastName(rs.getString(3));
            ND.setNICNo(rs.getString(4));
            ND.setDateOfBirth(rs.getString(5));
            ND.setAge(rs.getInt(6));
            ND.setContactNO(rs.getString(7));
            ND.setGender(rs.getString(8));
            ND.setAddress(rs.getString(9));
            ND.setDiscription(rs.getString(10));
            ND.setRegNO(rs.getString(11));
            ND.setNurseID(rs.getString(12));
            
            list.add(ND);
        }
        return list;//after returning the list of Patients
       
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return null;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
    
    public ArrayList<MaintainStaffDetails> getmaintainStaff(){
        try{
            ArrayList<MaintainStaffDetails> list=new ArrayList<MaintainStaffDetails>();//create a arraylist object
            con=DriverManager.getConnection(Url, username, Password);//get the connection
            String query="SELECT * FROM maintainstaff";
            pst=(PreparedStatement)con.prepareStatement(query);
            rs=pst.executeQuery();//execute the cuary
        
            while(rs.next()){
                MaintainStaffDetails MD=new MaintainStaffDetails();
                MD.setIndexNO(rs.getInt(1));
                MD.setFirstName(rs.getString(2));
                MD.setLastName(rs.getString(3));
                MD.setNICNo(rs.getString(4));
                MD.setDateOfBirth(rs.getString(5));
                MD.setAge(rs.getInt(6));
                MD.setContactNO(rs.getString(7));
                MD.setGender(rs.getString(8));
                MD.setAddress(rs.getString(9));
                MD.setDiscription(rs.getString(10));
                MD.setRegNo(rs.getString(11));
                MD.setMaintainID(rs.getString(12));
                list.add(MD);
                }
            return list;
            
        }
        catch(Exception e){
            System.out.println(e);
            return null;
           }
        finally{
            try{
                if(pst!=null){
                pst.close();
            }
            if(con!=null){
                con.close();
            }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
        
        
   //update oparation     
        
        public boolean UpdatePatient(PatientsDetails PD){
            try{
                con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
                String query = "UPDATE patients SET FirstName='"+PD.getFirstName()+"',LastName='"+PD.getLastName()+"',NICNo='"+PD.getNICNo()+"',DateOfBirth='"+PD.getDateOfBirth()+"',Age="+PD.getAge()+",ContactNo='"+PD.getContactNO()+"',Gender='"+PD.getGender()+"',BloodGroup='"+PD.getBloodGroup()+"',Address='"+PD.getAddress()+"',Discription='"+PD.getDiscription()+"',GuardianName='"+PD.getGuardianName()+"',GContactNo='"+PD.getGContactNo()+"',WardNO='"+PD.getWardNO()+"' WHERE IndexNo="+PD.getIndexNO();
                pst=(PreparedStatement)con.prepareStatement(query);
                System.out.println("ok");
                pst.executeUpdate();//execute the quary
                System.out.println("ok");
                return true;
            }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
            
        }
        
        
        public boolean UpdateDoctor(DoctorDetails DD){
            try{
                con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
                String query = "UPDATE doctor SET FirstName='"+DD.getFirstName()+"',LastName='"+DD.getLastName()+"',NICNo='"+DD.getNICNo()+"',DateOfBirth='"+DD.getDateOfBirth()+"',Age="+DD.getAge()+",ContactNo='"+DD.getContactNO()+"',Gender='"+DD.getGender()+"',DoctorType='"+DD.getDoctorType()+"',Address='"+DD.getAddress()+"',Discription='"+DD.getDiscription()+"',MBBSNo='"+DD.getMBBSNo()+"',DoctorID='"+DD.getDoctorID()+"' WHERE IndexNo="+DD.getIndexNO();
                pst=(PreparedStatement)con.prepareStatement(query);
                System.out.println("ok");
                pst.executeUpdate();//execute the quary
                System.out.println("ok");
                return true;
            }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
            
        }
        
        public boolean UpdateNurse(NurseDetails ND){
            try{
                con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
                String query = "UPDATE nurse SET FirstName='"+ND.getFirstName()+"',LastName='"+ND.getLastName()+"',NICNo='"+ND.getNICNo()+"',DateOfBirth='"+ND.getDateOfBirth()+"',Age="+ND.getAge()+",ContactNo='"+ND.getContactNO()+"',Gender='"+ND.getGender()+"',Address='"+ND.getAddress()+"',Discription='"+ND.getDiscription()+"',RegNo='"+ND.getRegNO()+"',NurseID='"+ND.getNurseID()+"' WHERE IndexNo="+ND.getIndexNO();
                pst=(PreparedStatement)con.prepareStatement(query);
                System.out.println("ok");
                pst.executeUpdate();//execute the quary
                System.out.println("ok");
                return true;
            }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
            
        }
        public boolean UpdateMaintainStaff(MaintainStaffDetails MD){
            try{
                con=(Connection)DriverManager.getConnection(Url, username, Password);
                String query="UPDATE maintainstaff SET FirstName='"+MD.getFirstName()+"',LastName='"+MD.getLastName()+"',NICNo='"+MD.getNICNo()+"',DateOfBirth='"+MD.getDateOfBirth()+"',Age="+MD.getAge()+",ContactNo='"+MD.getContactNO()+"',Gender='"+MD.getGender()+"',Address='"+MD.getAddress()+"',Discription='"+MD.getDiscription()+"',RegNO='"+MD.getRegNo()+"',MaintainID='"+MD.getMaintainID()+"' WHERE IndexNo="+MD.getIndexNO();
                System.out.println("quary ok");
                pst=(PreparedStatement)con.prepareStatement(query);
                pst.executeUpdate();
                
                return true;
            }
            catch(Exception e){
                System.out.println(e);
                return false;
                
            }
            finally{
                try{
                if(con!=null){
                    con.close();
                    }
                if(pst!=null){
                    pst.close();
                }}
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        
        
        
        
        
        
     //delete operation   
        
        public boolean DeletePAtient(PatientsDetails PD){
            try{
                con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
                String query = "DELETE FROM patients  WHERE IndexNo="+PD.getIndexNO();
                pst=(PreparedStatement)con.prepareStatement(query);
                
                pst.executeUpdate();
                
                return true;
            }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
            
        }
        
        public boolean DeleteDoctor(DoctorDetails DD){
            try{
                con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
                String query = "DELETE FROM doctor  WHERE IndexNo="+DD.getIndexNO();
                pst=(PreparedStatement)con.prepareStatement(query);
                
                pst.executeUpdate();
                
                return true;
            }catch(Exception e){ //exeption catch
            System.out.println(e);
            return false ;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        }
            
        public boolean DeleteNurse(NurseDetails ND){
            try{
                con=(Connection)DriverManager.getConnection(Url, username, Password);
                String query="DELETE FROM nurse WHERE IndexNo="+ND.getIndexNO();
                pst=(PreparedStatement)con.prepareStatement(query);
                pst.executeUpdate();
                return true;
            }
            catch(Exception e){
                System.out.println(e);
                return false;
                
            }
            finally{
            try{
                if(con!=null){
                    con.close();
                }
                if(pst!=null){
                    pst.close();
                }
                
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        }
        }
        
         public boolean DeletemaintainStaff(MaintainStaffDetails MD){
            try{
                con=(Connection)DriverManager.getConnection(Url, username, Password);
                String query="DELETE FROM maintainstaff WHERE IndexNo="+MD.getIndexNO();
                pst=(PreparedStatement)con.prepareStatement(query);
                pst.executeUpdate();
                return true;
            }
            catch(Exception e){
                System.out.println(e);
                return false;
                
            }
            finally{
            try{
                if(con!=null){
                    con.close();
                }
                if(pst!=null){
                    pst.close();
                }
                
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        }
        }
            
        
    
    
    
    
    
    
    
    
    
    
    
    //check operatioin
    
    
    
    
   public int checkpatirnts(String NICNo){
        try{
         con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
         String query = "SELECT NICNo FROM Patients ";
        pst=(PreparedStatement)con.prepareStatement(query);
        rs= pst.executeQuery();
        
        while(rs.next()){
            
            if(NICNo.equals(rs.getString(1))){
                return 1;
            }
        }
        return 2;
        
        }catch(Exception e){
            System.out.println(e);
            return 3;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }

}
   public int checkDoctor(String NICNo){
        try{
         con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
         String query = "SELECT NICNo FROM doctor";
        pst=(PreparedStatement)con.prepareStatement(query);
        rs= pst.executeQuery();
        
        while(rs.next()){
            
            if(NICNo.equals(rs.getString(1))){
                  return 1;
              } else {
             }
        }
        return 2;
        
        }catch(Exception e){
            System.out.println(e);
            return 3;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }

}
  
public int checkNurse(String NICNo){
        try{
         con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
         String query = "SELECT NICNo FROM Nurse";
        pst=(PreparedStatement)con.prepareStatement(query);
        rs= pst.executeQuery();
        
        while(rs.next()){
            
            if(NICNo.equals(rs.getString(1))){
                  return 1;
              } else {
             }
        }
        return 2;
        
        }catch(Exception e){
            System.out.println(e);
            return 3;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }

}
public int checkMaintainstaff(String NICNo){
        try{
         con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
         String query = "SELECT NICNo FROM Maintainstaff";
        pst=(PreparedStatement)con.prepareStatement(query);
        rs= pst.executeQuery();
        
        while(rs.next()){
            
            if(NICNo.equals(rs.getString(1))){
                  return 1;
              } else {
             }
        }
        return 2;
        
        }catch(Exception e){
            System.out.println(e);
            return 3;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }

}



//check username & password to login to the System
   public ArrayList<Login> LoginDoctor(String Username){//add to the details to patients table
        try{
            //creatin the array list login details type
        ArrayList<Login> list=new ArrayList<Login>();
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "SELECT DoctorID,Password FROM doctor WHERE DoctorID='"+Username+"'";
        pst=(PreparedStatement)con.prepareStatement(query);
        
        
        rs=pst.executeQuery();//get the result of the quary from the database
       //in each iteration get all deails from specific row and add to the list 
        while(rs.next()){
            Login LG =new Login();
            LG.setUserName(rs.getString(1));
            LG.setPassword(rs.getString(2));
          
            
            list.add(LG);
           
        }
        System.out.println("ok3");
        return list;//after returning the list of Patients
       
        }catch(Exception e){ //exeption catch
           
            return null;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }

   
    public ArrayList<Login> LoginReception(String Username){//add to the details to patients table
        try{
            //creatin the array list login details type
        ArrayList<Login> list=new ArrayList<Login>();
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "SELECT MaintainID,Password FROM maintainstaff WHERE MaintainID='"+Username+"'";
        pst=(PreparedStatement)con.prepareStatement(query);
       
        rs=pst.executeQuery();//get the result of the quary from the database
        
       //in each iteration get all deails from specific row and add to the list 
        while(rs.next()){
            Login LG =new Login();
            LG.setUserName(rs.getString(1));
            LG.setPassword(rs.getString(2));
            list.add(LG);
            
        }
        return list;//after returning the list of Patients
       
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return null;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
    
     public ArrayList<Login> LoginNurse(String Username){//add to the details to patients table
        try{
            //creatin the array list login details type
        ArrayList<Login> list=new ArrayList<Login>();
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "SELECT NurseID,Password FROM nurse WHERE NurseID='"+Username+"'";
        pst=(PreparedStatement)con.prepareStatement(query);
       
        rs=pst.executeQuery();//get the result of the quary from the database
        
       //in each iteration get all deails from specific row and add to the list 
        while(rs.next()){
            Login LG =new Login();
            LG.setUserName(rs.getString(1));
            LG.setPassword(rs.getString(2));
            list.add(LG);
            
        }
        return list;//after returning the list of Patients
       
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return null;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
     
     public ArrayList<Login> LoginMaintainStaff(String Username){//add to the details to patients table
        try{
            //creatin the array list login details type
        ArrayList<Login> list=new ArrayList<Login>();
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "SELECT MaintainID,Password FROM maintainstaff WHERE MaintainID='"+Username+"'";
        pst=(PreparedStatement)con.prepareStatement(query);
       
        rs=pst.executeQuery();//get the result of the quary from the database
        
       //in each iteration get all deails from specific row and add to the list 
        while(rs.next()){
            Login LG =new Login();
            LG.setUserName(rs.getString(1));
            LG.setPassword(rs.getString(2));
            list.add(LG);
            
        }
        return list;//after returning the list of Patients
       
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return null;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
     
     public ArrayList<Login> LoginPatients(String Username){//add to the details to patients table
        try{
            //creatin the array list login details type
        ArrayList<Login> list=new ArrayList<Login>();
        con=(Connection)DriverManager.getConnection(Url, username, Password);//get the connection
        String query = "SELECT ContactNo,NICNo FROM patients WHERE ContactNo='"+Username+"'";
        System.out.println("ok2");
        pst=(PreparedStatement)con.prepareStatement(query);
       System.out.println("ok3");
        rs=pst.executeQuery();//get the result of the quary from the database
        System.out.println("ok4");
       //in each iteration get all deails from specific row and add to the list 
        while(rs.next()){
            Login LG =new Login();
            LG.setUserName(rs.getString(1));
            LG.setPassword(rs.getString(2));
            list.add(LG);
            
        }
        return list;//after returning the list of Patients
       
        }catch(Exception e){ //exeption catch
            System.out.println(e);
            return null;
            
        }finally{ //clasing all the resourses
            try{
                if(pst!=null){
                pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch(Exception e){
                System.out.println(e);
             }
        }
        
    }
}
