/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintax.ExpressionMagnament;

import Enums.*;
import Sintax.ExpressionMagnament.Expressions.Expression;
import Sintax.ExpressionMagnament.Expressions.Instruction;

/**
 *
 * @author sirbon
 */
public class ExpressionConstructor {

    public Expression createExpression(int previousState, int finalstate, Instruction instruction, int identCount) {

        Expression expression;
        if (!instruction.getExpression().equals("")) {
            if (previousState == MatrixStates.S4.ordinal() || previousState == MatrixStates.S8.ordinal()) {
                expression = new Expression(instruction, 1, "VAR_DECL", identCount, instruction.getParts().get(instruction.getParts().size() - 1).getCol(), instruction.getParts().get(instruction.getParts().size() - 1).getRow());
            } else if (finalstate == MatrixStates.S14.ordinal()) {
                expression = new Expression(instruction, 2, "TERNARY_OP", identCount, instruction.getParts().get(instruction.getParts().size() - 1).getCol(), instruction.getParts().get(instruction.getParts().size() - 1).getRow());
            } else if (finalstate == MatrixStates.S18.ordinal()) {
                expression = new Expression(instruction, 3, "ARRAY_DECL", identCount, instruction.getParts().get(instruction.getParts().size() - 1).getCol(), instruction.getParts().get(instruction.getParts().size() - 1).getRow());
            } else if (previousState == MatrixStates.S23.ordinal()) {
                expression = new Expression(instruction, 4, "IF_SENTENCE", identCount, instruction.getParts().get(instruction.getParts().size() - 1).getCol(), instruction.getParts().get(instruction.getParts().size() - 1).getRow());
            } else if (previousState == MatrixStates.S31.ordinal()) {
                expression = new Expression(instruction, 5, "FOR_SENTENCE", identCount, instruction.getParts().get(instruction.getParts().size() - 1).getCol(), instruction.getParts().get(instruction.getParts().size() - 1).getRow());
            } else if (previousState == MatrixStates.S39.ordinal()) {
                expression = new Expression(instruction, 6, "WHILE_SENTENCE", identCount, instruction.getParts().get(instruction.getParts().size() - 1).getCol(), instruction.getParts().get(instruction.getParts().size() - 1).getRow());
            } else if (previousState == MatrixStates.S48.ordinal()) {
                expression = new Expression(instruction, 7, "DEF_FUNCTION", identCount, instruction.getParts().get(instruction.getParts().size() - 1).getCol(), instruction.getParts().get(instruction.getParts().size() - 1).getRow());
            } else {
                expression = new Expression(instruction, 0, "UNREC_STATMENT", identCount, 0, 0);
            }
            return expression;

        } else {
            return null;
        }

    }

}
