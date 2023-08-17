/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.InterfaceMagnament;

import Models.GraphMagnament.GraphvizController;
import Models.TokenMagnament.Token;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sirbon
 */
public class TokenizerGraph {

    public JButton buttonGrapher(Token token, JPanel toGrPanel, JLabel toGraphLabel, JDialog jDialog) {
        TokenDropper tokenDropper = new TokenDropper(token);

        GraphvizController gc = new GraphvizController(token);
        tokenDropper.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println(gc.getTknDOT());
                gc.drawGraph(token.getTokenSymbol());
                setGraph(toGraphLabel, toGrPanel, token);
                jDialog.pack();
                jDialog.setLocationRelativeTo(null);
            }
        });

        return tokenDropper;
    }

    public void setGraph(JLabel toGrLabel, JPanel toGrPanel, Token token) {

        
        toGrLabel.setIcon(null);

        String ruta = System.getProperty("user.dir") + "/src/main/Resources/"+token.getTokenSymbol()+".png";
        ImageIcon imageIcon = new ImageIcon(ruta);
        toGrLabel.setIcon(imageIcon);
        
    }

}
