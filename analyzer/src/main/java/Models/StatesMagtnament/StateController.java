/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.StatesMagtnament;

import Models.enums.MatrixStates;

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
        this.lastState = definedMatrix.getStateMatrix(previusState, symbolController.getCharValue(actualSymb));
        System.out.println("del estado: [" + previusState + "] pasamos al nuevo estado [" + lastState + "] ");
    }

    public boolean isAceptState() {
        boolean isAcept = false;

        if (lastState != MatrixStates.SERROR.ordinal() || previusState == 0) {
            isAcept = true;
            System.out.println("se encuentra en un estado de aceptacion");
        }
        return isAcept;
    }
    
    public boolean isAgrupable(){
        return (previusState == lastState || previusState == lastState -1 || previusState == lastState+1);
    }
    
    public boolean isEndState(char actualChar, int state) {
        return symbolController.isReservedChar(actualChar, state);
    }
    
}
