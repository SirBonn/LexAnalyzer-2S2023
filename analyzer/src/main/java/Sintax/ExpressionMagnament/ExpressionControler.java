/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintax.ExpressionMagnament;

import Enums.MatrixStates;
import Enums.TokenTypes;
import Lexic.TokenMagnament.TokenBag;
import Lexic.TokenMagnament.Token;
import Sintax.ExpressionMagnament.Expressions.Expression;
import Sintax.ExpressionMagnament.Expressions.Instruction;
import Sintax.ExpressionMagnament.Validators.TokenValidator;
import Sintax.StatesMagnament.StateController;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
public class ExpressionControler {

    private TokenBag tokenBag = new TokenBag();
    private TokenValidator tokenValidator = new TokenValidator();
    private StateController stateController = new StateController();
    private ExpressionConstructor ec = new ExpressionConstructor();
    private Instruction instruction = new Instruction();
    private ExpressionBag expressionBag = new ExpressionBag();
    private Expression expression;
    private Token actualToken;
    private Token prevToken;
    private int tabIterator = 0;
    private int commaIterator = 0;
    private int counter;
    private boolean isValid = false;

    public ExpressionControler(TokenBag tokenBag) {
        this.tokenBag = tokenBag;
        sintaxLauncher();
    }

    private void sintaxLauncher() {

        for (Token tkn : tokenBag.getTokens()) {

            validateToken(tkn);

        }

    }

    public void validateToken(Token token) {
        this.actualToken = token;
        tokenRecognize(token);
        this.prevToken = actualToken;
    }

    private void tokenRecognize(Token token) {

        if (token.getTokenType() != TokenTypes.CMNT_TKN.ordinal()) {
            if (token.getTokenType() != TokenTypes.SPACE_TKN.ordinal()) {
                stateController.rideStates(token);
            }

            if (token.getTokenType() == TokenTypes.TABULATOR_TOKEN.ordinal()) {
                tabIterator++;                     //aumenta el contador global de tabuladores registrados
                System.out.println("se leyeron " + tabIterator + " tabulaciones");

            } else if (token.getTokenType() == TokenTypes.COMMA_TKN.ordinal()) {
                if (stateController.getPreviousState() == MatrixStates.S5.ordinal() && stateController.getLastState() == MatrixStates.S6.ordinal()) {
                    commaIterator++;                     //aumenta el contador global de comas registrados
                    System.out.println("se leyeron aumento en uno el numero de comas");
                }
            } else if (token.getTokenType() == TokenTypes.ENDLINE_TKN.ordinal()) {
                expression = ec.createExpression(stateController.getPreviousState(), stateController.getLastState(), instruction, tabIterator);
                if (expression != null) {

                    expressionBag.addExpresion(validateParent(expression));
                    System.out.println("se guarda la expresion" + expression);
                }

                this.instruction = new Instruction();
            } else {
                this.instruction.addToken(token);
            }
        }

    }

    private Expression validateParent(Expression expression) {

        if (!expressionBag.getInstStack().isEmpty()) {
            if (expressionBag.peekExpression().getIdentationCount() < expression.getIdentationCount()) {
                if (expressionBag.peekExpression().getInstruction().getParentInstruction() == null) {
                    expression.getInstruction().setParentInstruction(expressionBag.peekExpression().getInstruction());
                } else {
                    expression.getInstruction().setParentInstruction(expressionBag.peekExpression().getInstruction().getParentInstruction());
                }
            } else if (expressionBag.peekExpression().getIdentationCount() > expression.getIdentationCount()) {
                while (expressionBag.peekExpression().getIdentationCount() > expression.getIdentationCount()) {
                    expressionBag.getInstStack().pop();
                }
                if (expressionBag.peekExpression().getInstruction().getParentInstruction() == null) {
                    expression.getInstruction().setParentInstruction(expressionBag.peekExpression().getInstruction());
                } else {
                    expression.getInstruction().setParentInstruction(expressionBag.peekExpression().getInstruction().getParentInstruction());
                }
            }
        }

        return expression;
    }

    public String showExpressions() {
        String report = "--- Expresiones reconocidas ---\n";

        for (Expression exp : expressionBag.getExpressions()) {
            report += exp.toString() + "\n";
        }

        return report;
    }

}
