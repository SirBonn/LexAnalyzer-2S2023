/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintax.ExpressionMagnament.Expressions;

import Lexic.TokenMagnament.Token;
import java.util.ArrayList;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
public class Function extends Instruction{

    private ArrayList<Token> parameters = new ArrayList<>();
    
    public Function() {
    }
    
    
}
