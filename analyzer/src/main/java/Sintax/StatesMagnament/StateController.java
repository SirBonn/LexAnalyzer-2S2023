/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintax.StatesMagnament;

import Enums.*;
import Lexic.TokenMagnament.Token;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
public class StateController {

    private int previousState=0;
    private int lastState;
    private DefSintaxMatrix sintaxMatrix = new DefSintaxMatrix();

    public void rideStates(Token token) {
        System.out.println("se lee " + token);
        this.previousState = lastState;
        this.lastState = sintaxMatrix.getStateMatrix(previousState, token.getTokenGroup());     //recorremos la matriz y obtenemos el estado en donde se encuentra
        System.out.println("\ncon el token " +token.getTokenSymbol() +"[" + token.getTokenGroup()+"]");
        System.out.println("del estado: [" + previousState + "] pasamos al nuevo estado [" + lastState + "] ");
    }

    public boolean isAceptState() {
        boolean isAcept = false;
        //verificamos si se encuentra en un estado de aceptacion, siempre y cuando sea diferente de 0
        if (lastState != MatrixStates.SERROR.ordinal() || previousState == 0) {
            isAcept = true;
            System.out.println("se encuentra en un estado de aceptacion");
        }
        return isAcept;
    }

}
