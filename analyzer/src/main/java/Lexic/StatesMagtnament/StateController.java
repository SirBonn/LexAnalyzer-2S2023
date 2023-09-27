/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexic.StatesMagtnament;

import Lexic.enums.MatrixStates;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
public class StateController {

    private int previusState;
    private int lastState;
    private DefinedMatrix definedMatrix = new DefinedMatrix();
    private SymbolController symbolController = new SymbolController();
    private boolean isAcepted;

    public void rideStates(char actualSymb) {
        System.out.println("se lee " + actualSymb);
        this.previusState = lastState;
        this.lastState = definedMatrix.getStateMatrix(previusState, symbolController.getCharValue(actualSymb));     //recorremos la matriz y obtenemos el estado en donde se encuentra
        System.out.println("del estado: [" + previusState + "] pasamos al nuevo estado [" + lastState + "] ");
    }

    public boolean isAceptState() {
        boolean isAcept = false;
        //verificamos si se encuentra en un estado de aceptacion, siempre y cuando sea diferente de 0
        if (lastState != MatrixStates.SERROR.ordinal() || previusState == 0) {
            isAcept = true;
            System.out.println("se encuentra en un estado de aceptacion");
        }
        return isAcept;
    }
    
    public boolean isEndState(char actualChar, int state) {
        //verificamos que el caracter final coincida con un estado de aceptacion
        return symbolController.isReservedChar(actualChar, state);
    }
    
}
