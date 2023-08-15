/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.TokenMagnament;

import Models.StatesMagtnament.StateController;
import Models.enums.MatrixStates;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
public class TokenController {

    private String text;
    private int rowCount;
    private int colCount;
    private char[] textAtChar;
    private String lex = "";
    private Token token;
    private StateController stateController = new StateController();
    private TokenBag tokenBag;

    public TokenController(TokenBag tokenBag) {
        this.tokenBag = tokenBag;
    }

    public void initParser(String text) {
        this.text = text + "\n";
        this.textAtChar = this.text.toCharArray();
        if (textAtChar.length > 1) {
            readChars();
        }
    }

    public void readChars() {

        char symbolChar;

        for (int i = 0; i < this.textAtChar.length; i++) {
            symbolChar = textAtChar[i];
            colCount++;
            if (symbolChar == '\n') {
                rowCount++;
            }

            if (stateController.isEndState(symbolChar, stateController.getLastState())) {
                sendToken();
                if (symbolChar != '\n' && symbolChar != ' ') {
                    lex = Character.toString(symbolChar);
                    stateController.rideStates(symbolChar);
                    sendToken();
                }
            } else {
                stateController.rideStates(symbolChar);
                lex += symbolChar;
            }
        }

        textAtChar = "".toCharArray();
    }

    public void clearTokens() {
        tokenBag.clearBag();
    }

    private void sendToken() {
        if (!lex.equals("")) {
            tokenBag.saveToken(new Token(stateController.getLastState(), lex));
            lex = "";
            stateController.setLastState(MatrixStates.S0.ordinal());
            stateController.setPreviusState(MatrixStates.S0.ordinal());
        }

    }

}
