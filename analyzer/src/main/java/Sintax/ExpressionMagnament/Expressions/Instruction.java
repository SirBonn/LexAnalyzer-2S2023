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
public class Instruction {
    
    private ArrayList<Token> parts = new ArrayList<>();
    private ArrayList<String> stringValues;
    private ArrayList<Integer> intValues;
    private String expression; 

    public Instruction() {
    }
    
    public void addToken(Token token){
        this.parts.add(token);
        this.expression += token.getTokenSymbol();
    }
    
    
}
