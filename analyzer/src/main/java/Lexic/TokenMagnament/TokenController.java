/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexic.TokenMagnament;

import Lexic.StatesMagtnament.StateController;
import Enums.MatrixStates;
import Sintax.ExpressionMagnament.ExpressionControler;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
public class TokenController {

    private String text;
    private int rowCount = 1;
    private int colCount = 1;
    private char[] textAtChar;
    private String lex = "";
    private Token token;
    private StateController stateController = new StateController();
    private ExpressionControler expressionControler;
    private TokenBag tokenBag;

    public TokenController(TokenBag tokenBag) {
        this.tokenBag = tokenBag;
    }

    public void initParser(String text) {
        this.text = text +" ";                            //agregamos un salgo de linea final en caso de que no se indique final de linea
        this.textAtChar = this.text.toCharArray();  // convertimos la cadena de texto a un arreglo de caracteres
        if (textAtChar.length > 1) {                    //leemos siempre y cuando exista al menos un caracter
            readChars();
        }
    }

    public void readChars() {

        char symbolChar;

        for (int i = 0; i < this.textAtChar.length; i++) {

            symbolChar = textAtChar[i];//leemos caracter a caracter
            colCount++;                     // aumentamos conteo de columnas al avanzar en el arreglo de caracteres

            if (symbolChar == '\n') {
                rowCount++;             // aumentamos una fila al saltar de linea
                colCount = 1;           // reseteamos el conteo de columnas al saltar de linea
            }

            if (stateController.isEndState(symbolChar, stateController.getLastState())) {       //evaluamos si se encuentra en un estado de finalizacion de token
                sendToken(colCount, rowCount);                                                          //guardamos token
                           //leemos token en donde se encuentra el conteo siempre que no sea un espacio vacio o un salto de lina
                    lex = Character.toString(symbolChar);
                    stateController.rideStates(symbolChar);
                    sendToken(colCount, rowCount);                      //guardamos token 
                
            } else {
                stateController.rideStates(symbolChar);                 //recorremos la matriz con el token que leemos
                lex += symbolChar;                                          //agregamos el caracter al token que estamos leyendo
            }
        }

        textAtChar = "".toCharArray();                              //limpiamos el arreglo de caracteres al finalizar la lectura
        System.out.println("\n\n\t--- Iniciamos analisis sintactico:\n");
        
        //inicio de alnalisis sintactico
        expressionControler = new ExpressionControler(tokenBag);
        
    }

    public void clearTokens() {
        tokenBag.clearBag();
        this.colCount = 1;
        this.rowCount = 1;
    }

    private void sendToken(int col, int row) {

        if (!lex.equals("")) {  //siempre que el lex que guardamos sea diferente a una cadena vacia
            tokenBag.saveToken(new Token(stateController.getLastState(), lex, row, col));   //guardamos un nuevo token con las caracteristicas obtenidas en una bolsa de tokens(arraylist)
            lex = "";                   //reseteamos el lexema
            stateController.setLastState(MatrixStates.S0.ordinal());  //reseteamos el estado actual de donde se encuentra nuestra matriz
            stateController.setPreviousState(MatrixStates.S0.ordinal());  //reseteamos el estado anterior de donde se encontraba la matriz
        }

    }

}
