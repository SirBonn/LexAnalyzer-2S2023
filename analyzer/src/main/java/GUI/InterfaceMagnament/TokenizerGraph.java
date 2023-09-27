/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.InterfaceMagnament;

import Lexic.GraphMagnament.GraphvizController;
import Lexic.TokenMagnament.Token;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author sirbon
 */
public class TokenizerGraph {

    public JButton buttonGrapher(Token token, JScrollPane toGrPanel, JLabel toGraphLabel, JDialog jDialog) { //creamos el boton que formara parte del panel para mostrar
        
        TokenDropper tokenDropper = new TokenDropper(token);

        GraphvizController gc = new GraphvizController(token);
        tokenDropper.addMouseListener(new java.awt.event.MouseAdapter() { 
            //agregamos la actividad que tendra el boton al darle click
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
                System.out.println(gc.getTknDOT());
                gc.drawGraph(token.getTokenSymbol());
                setGraph(toGraphLabel, toGrPanel, token);
                jDialog.pack(); //configuramos el jdialog para que se acomode al tamaño de la imagen seteada
                jDialog.setLocationRelativeTo(null);    //configuramos para que siemrpe quede centrado en la pantalla
            }
        });

        return tokenDropper;
    }

    public void setGraph(JLabel toGrLabel, JScrollPane toGrPanel, Token token) {

        //configuramos el grafico en el lugar requerido
        
        toGrLabel.setIcon(null);
        String ruta = System.getProperty("user.dir") + "/"+token.getTokenSymbol()+".png";
        ImageIcon imageIcon = new ImageIcon(ruta);
        toGrLabel.setIcon(imageIcon);
        
    }

}
