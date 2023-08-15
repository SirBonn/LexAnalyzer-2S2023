/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

/**
 *
 * @author sirbon
 */
public class UserInterfaceMagnament {

    public void cellCount(JTextArea selectedTextArea, JLabel infoJLabel){
        
        int row;
        int col;
        
        try {
            int position = selectedTextArea.getCaretPosition();
            row = selectedTextArea.getLineOfOffset(position);
            col = position - selectedTextArea.getLineStartOffset(row) + 1;
            row += 1;
            infoJLabel.setText("Line: " + row + "  Col:" +col);
        } catch (BadLocationException e) {
        }
        
    }
    
}
