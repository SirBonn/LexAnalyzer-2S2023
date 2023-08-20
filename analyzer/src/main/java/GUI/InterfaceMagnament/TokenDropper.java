/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.InterfaceMagnament;

import Models.TokenMagnament.Token;
import javax.swing.JButton;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
public class TokenDropper extends JButton {

    private Token token;

    public TokenDropper() {
    }

    public TokenDropper(Token token) {
        super(token.getTokenSymbol());  //configuramos el texto del boton segun el valor del token

        this.setBackground(new java.awt.Color(102, 102, 102));  //configuramos colores del boton
        this.setForeground(new java.awt.Color(153, 255, 153));

        this.token = token;
    }

}
