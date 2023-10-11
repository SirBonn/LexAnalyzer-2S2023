/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintax.ExpressionMagnament;

import Lexic.TokenMagnament.TokenBag;
import Lexic.TokenMagnament.Token;
import Sintax.StatesMagnament.StateController;
import Enums.*;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
public class ExpressionControler {

    private TokenBag tokenBag;
    private StateController stateController = new StateController();

    public ExpressionControler(TokenBag tokenBag) {
        this.tokenBag = tokenBag;
        sintaxLauncher();
    }

    private void sintaxLauncher() {

        for (Token tkn : tokenBag.getTokens()) {
            if (tkn.getTokenType() != TokenTypes.SPACE_TKN.ordinal()) {
                stateController.rideStates(tkn);
            }

        }

    }

}
