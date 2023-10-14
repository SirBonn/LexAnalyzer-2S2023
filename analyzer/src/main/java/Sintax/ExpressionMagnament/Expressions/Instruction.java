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
public class Instruction {

    private ArrayList<Token> parts = new ArrayList<>();
    private Instruction parentInstruction;
    private ArrayList<String> stringValues;
    private ArrayList<Integer> intValues;
    private String expression = "";

    public Instruction() {
    }

    public void addToken(Token token) {
        this.parts.add(token);
        this.expression += token.getTokenSymbol();
    }

    @Override
    public String toString() {
        if (this.parentInstruction == null) {
            return "Instruction{" + "Parent Expression= no parent, expression="  + expression + '}';
        } else {
            return "Instruction{" + "Parent Expression= " + this.parentInstruction.getExpression() + ", expression= " + expression + '}';

        }
    }

}
