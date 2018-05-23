/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Classes;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author acer
 */
public class PatientTable extends AbstractTableModel {
    private static final String[] colum_details={"Index NO","First name","Last Name","NIC No","Blood Group","gaurdian c_no","Ward NO"};
    private static ArrayList<PatientsDetails> list;


    public PatientTable(ArrayList<PatientsDetails> plist) {
        list=plist;
    }
    public String getColumnName(int columnIndex){
        return colum_details[columnIndex];
    }
    
    
    //@Override
    public int getRowCount() {
        return list.size();
       }

    @Override
    public int getColumnCount() {
        return colum_details.length;
       }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getIndexNO();
            case 1:
                return list.get(rowIndex).getFirstName();
            case 2:
                return list.get(rowIndex).getLastName();
            case 3:
                return list.get(rowIndex).getNICNo();
            case 4:
                return list.get(rowIndex).getBloodGroup();
            case 5:
                return list.get(rowIndex).getGContactNo();
            case 6:
                return list.get(rowIndex).getWardNO();
             default:
                 return "error";
                
        }
        }
    
}
