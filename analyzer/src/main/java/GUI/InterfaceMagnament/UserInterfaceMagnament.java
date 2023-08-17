/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.InterfaceMagnament;

import Models.GraphMagnament.GraphvizController;
import Models.TokenMagnament.Token;
import guru.nidi.graphviz.engine.Graphviz;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

/**
 *
 * @author sirbon
 */
public class UserInterfaceMagnament {

    private JDialog jdialogParent;
    private JPanel toGraphPanel;
    private JLabel toGrphLabel;
    
    
    public void cellCount(JTextArea selectedTextArea, JLabel infoJLabel) {

        int row;
        int col;

        try {
            int position = selectedTextArea.getCaretPosition();
            row = selectedTextArea.getLineOfOffset(position);
            col = position - selectedTextArea.getLineStartOffset(row) + 1;
            row += 1;
            infoJLabel.setText("Line: " + row + "  Col:" + col);
        } catch (BadLocationException e) {

        }

    }

    public void tokenStacker(JPanel panelList, ArrayList<Token> tokenGroup) {

        for (Token token : tokenGroup) {
            TokenizerGraph tg = new TokenizerGraph();
            panelList.add(tg.buttonGrapher(token, toGraphPanel, toGrphLabel, jdialogParent));

        }

    }

    public void setJdialogParent(JDialog jdialogParent) {
        this.jdialogParent = jdialogParent;
    }

    public void setToGraphPanel(JPanel toGraphPanel) {
        this.toGraphPanel = toGraphPanel;
    }

    public void setToGrphLabel(JLabel toGrphLabel) {
        this.toGrphLabel = toGrphLabel;
    }
    
    
    
}
