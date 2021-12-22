
package org.jgp.system.models;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class Table extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);   
         if (table.getValueAt(row,column).toString().equals("inactive")){
         
                setBackground(new Color(91,91,91));
                setForeground(new Color(255,255,255));
                
             
         }else{
            setBackground(new Color(255,255,255)); 
            setForeground(new Color(0,0,0));
         }
         return this;
    }
    
}
