/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Classes;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
/**
 *
 * @author acer
 */
public class MaintainStaffTable extends AbstractTableModel{
    private static final String[] colum_details={"Index NO","First name","Last Name","NIC No","Blood Group","gaurdian c_no","Ward NO"};
    //"Index NO","First Name","Last Name","NIC No","contact no","Reg No","maintain ID"
    private static ArrayList<MaintainStaffDetails> Mlist;

    public MaintainStaffTable(ArrayList<MaintainStaffDetails> list ) {
        Mlist=list;
    }
    public String getColumnName(int columnIndex){
        return colum_details[columnIndex];
        
    }
    
    @Override
    public int getRowCount() {
       return Mlist.size();
    }

    @Override
    public int getColumnCount() {
        return colum_details.length;
        }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return Mlist.get(rowIndex).getIndexNO();
            case 1:
                return Mlist.get(rowIndex).getFirstName();
            case 2:
                return Mlist.get(rowIndex).getLastName();
            case 3:
                return Mlist.get(rowIndex).getNICNo();
            case 4:
                return Mlist.get(rowIndex).getContactNO();
            case 5:
                return Mlist.get(rowIndex).getRegNo();
            case 6:
                return Mlist.get(rowIndex).getMaintainID();
            default:
                return "error";
                
        }
    
    }
    
}
