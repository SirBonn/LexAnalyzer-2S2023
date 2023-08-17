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
public class TokenDropper extends JButton{
    
    private Token token;

    public TokenDropper() {
    }

    public TokenDropper(Token token) {
        super(token.getTokenSymbol());
        this.token = token;
    }
    
    
    
}
