/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintax.ExpressionMagnament;

import Sintax.ExpressionMagnament.Expressions.Expression;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
public class ExpressionBag {

    private ArrayList<Expression> expressions;
    private Stack<Expression> instStack;
    private String report;

    public ExpressionBag() {
        this.expressions = new ArrayList<>();
        this.instStack = new Stack<>();
    }

    public void addExpresion(Expression expression) {
        expressions.add(expression);
        pushExpression(expression);
    }

    public void pushExpression(Expression expression) {
        instStack.push(expression);
    }

    public Expression peekExpression() {
        return instStack.peek();
    }

}
