/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexic.StatesMagtnament;

import Enums.MatrixStates;
import Enums.Symbols;

/**
 *
 * @author sirbon
 */
public class DefLexicMatrix {

    public final int[][] stateMatrix = new int[MatrixStates.values().length][Symbols.values().length];

//definimos los estados de la matriz facilitando el movimiento dentro de la misma segun el token leido y el estado en donde se encuentre
    {
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.UNDERSCORE.ordinal()] = MatrixStates.S1.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S2.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S5.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.HASTAG.ordinal()] = MatrixStates.S8.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.DOBQUOTE.ordinal()] = MatrixStates.S10.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.SIMPLQUOTE.ordinal()] = MatrixStates.S13.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.EQUAL.ordinal()] = MatrixStates.S16.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.MINORQ.ordinal()] = MatrixStates.S18.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.MAYORQ.ordinal()] = MatrixStates.S20.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.EXCLAMTION.ordinal()] = MatrixStates.S22.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.OPENSQBRAQUET.ordinal()] = MatrixStates.S24.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.OPENBRAQUET.ordinal()] = MatrixStates.S26.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.OPENPARENTH.ordinal()] = MatrixStates.S28.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.SUMMATION.ordinal()] = MatrixStates.S30.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.SUBTRACTION.ordinal()] = MatrixStates.S31.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.DIAGONAL.ordinal()] = MatrixStates.S34.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.ASTERISK.ordinal()] = MatrixStates.S32.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.PERCENTAGE.ordinal()] = MatrixStates.S35.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.CLOSESQBRAQUET.ordinal()] = MatrixStates.S25.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.CLOSEBRAQUET.ordinal()] = MatrixStates.S27.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.CLOSEPARENTH.ordinal()] = MatrixStates.S29.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.DOT.ordinal()] = MatrixStates.S37.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.DBLDOT.ordinal()] = MatrixStates.S38.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.COMMA.ordinal()] = MatrixStates.S39.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.SEMICOLON.ordinal()] = MatrixStates.S40.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.ENDLINE.ordinal()] = MatrixStates.S41.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.SPACE.ordinal()] = MatrixStates.S42.ordinal();
        stateMatrix[MatrixStates.S0.ordinal()][Symbols.TABULATOR.ordinal()] = MatrixStates.S43.ordinal();

        stateMatrix[MatrixStates.S1.ordinal()][Symbols.UNDERSCORE.ordinal()] = MatrixStates.S1.ordinal();
        stateMatrix[MatrixStates.S2.ordinal()][Symbols.UNDERSCORE.ordinal()] = MatrixStates.S3.ordinal();
        stateMatrix[MatrixStates.S3.ordinal()][Symbols.UNDERSCORE.ordinal()] = MatrixStates.S3.ordinal();
        stateMatrix[MatrixStates.S4.ordinal()][Symbols.UNDERSCORE.ordinal()] = MatrixStates.S3.ordinal();
        stateMatrix[MatrixStates.S9.ordinal()][Symbols.UNDERSCORE.ordinal()] = MatrixStates.S9.ordinal();

        stateMatrix[MatrixStates.S1.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S2.ordinal();
        stateMatrix[MatrixStates.S2.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S2.ordinal();
        stateMatrix[MatrixStates.S3.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S2.ordinal();
        stateMatrix[MatrixStates.S4.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S2.ordinal();
        stateMatrix[MatrixStates.S8.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S9.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S10.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S13.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S14.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.LETTER.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S2.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S4.ordinal();
        stateMatrix[MatrixStates.S3.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S4.ordinal();
        stateMatrix[MatrixStates.S4.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S4.ordinal();
        stateMatrix[MatrixStates.S5.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S4.ordinal();
        stateMatrix[MatrixStates.S5.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S5.ordinal();
        stateMatrix[MatrixStates.S6.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S7.ordinal();
        stateMatrix[MatrixStates.S7.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S7.ordinal();
        stateMatrix[MatrixStates.S9.ordinal()][Symbols.DIGIT.ordinal()] = MatrixStates.S9.ordinal();

        stateMatrix[MatrixStates.S5.ordinal()][Symbols.DOT.ordinal()] = MatrixStates.S6.ordinal();
        stateMatrix[MatrixStates.S9.ordinal()][Symbols.DOT.ordinal()] = MatrixStates.S9.ordinal();

        stateMatrix[MatrixStates.S8.ordinal()][Symbols.HASTAG.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.SERROR.ordinal()][Symbols.HASTAG.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.SERROR.ordinal()][Symbols.ENDLINE.ordinal()] = MatrixStates.S9.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.DOBQUOTE.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S10.ordinal()][Symbols.DOBQUOTE.ordinal()] = MatrixStates.S12.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.DOBQUOTE.ordinal()] = MatrixStates.S12.ordinal();
        stateMatrix[MatrixStates.SERROR.ordinal()][Symbols.DOBQUOTE.ordinal()] = MatrixStates.S12.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.SIMPLQUOTE.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S13.ordinal()][Symbols.SIMPLQUOTE.ordinal()] = MatrixStates.S15.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.SIMPLQUOTE.ordinal()] = MatrixStates.S15.ordinal();
        stateMatrix[MatrixStates.SERROR.ordinal()][Symbols.SIMPLQUOTE.ordinal()] = MatrixStates.S15.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.EQUAL.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.EQUAL.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.EQUAL.ordinal()] = MatrixStates.S14.ordinal();
        stateMatrix[MatrixStates.S16.ordinal()][Symbols.EQUAL.ordinal()] = MatrixStates.S17.ordinal();
        stateMatrix[MatrixStates.S18.ordinal()][Symbols.EQUAL.ordinal()] = MatrixStates.S19.ordinal();
        stateMatrix[MatrixStates.S20.ordinal()][Symbols.EQUAL.ordinal()] = MatrixStates.S21.ordinal();
        stateMatrix[MatrixStates.S22.ordinal()][Symbols.EQUAL.ordinal()] = MatrixStates.S23.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.MINORQ.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.MINORQ.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.MINORQ.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.MAYORQ.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.MAYORQ.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.MAYORQ.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.EXCLAMTION.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.EXCLAMTION.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.EXCLAMTION.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.OTHER.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S10.ordinal()][Symbols.OTHER.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.OTHER.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S13.ordinal()][Symbols.OTHER.ordinal()] = MatrixStates.S14.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.OTHER.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.OPENSQBRAQUET.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S9.ordinal()][Symbols.CLOSESQBRAQUET.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S24.ordinal()][Symbols.CLOSESQBRAQUET.ordinal()] = MatrixStates.S25.ordinal();
        stateMatrix[MatrixStates.S9.ordinal()][Symbols.CLOSEBRAQUET.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S26.ordinal()][Symbols.CLOSEBRAQUET.ordinal()] = MatrixStates.S27.ordinal();
        stateMatrix[MatrixStates.S9.ordinal()][Symbols.CLOSEPARENTH.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S28.ordinal()][Symbols.CLOSEPARENTH.ordinal()] = MatrixStates.S29.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.SUMMATION.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.SUMMATION.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.SUMMATION.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.SUBTRACTION.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.SUBTRACTION.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.SUBTRACTION.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.DIAGONAL.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.DIAGONAL.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.DIAGONAL.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.ASTERISK.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.ASTERISK.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.ASTERISK.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.PERCENTAGE.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.PERCENTAGE.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.PERCENTAGE.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S8.ordinal()][Symbols.SPACE.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S9.ordinal()][Symbols.SPACE.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S10.ordinal()][Symbols.SPACE.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.SPACE.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S13.ordinal()][Symbols.SPACE.ordinal()] = MatrixStates.S14.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.SPACE.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.DOT.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.DOT.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.DOT.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.DBLDOT.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.DBLDOT.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.DBLDOT.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.TABULATOR.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.TABULATOR.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.TABULATOR.ordinal()] = MatrixStates.S14.ordinal();

        stateMatrix[MatrixStates.S9.ordinal()][Symbols.COMMA.ordinal()] = MatrixStates.S9.ordinal();
        stateMatrix[MatrixStates.S11.ordinal()][Symbols.COMMA.ordinal()] = MatrixStates.S11.ordinal();
        stateMatrix[MatrixStates.S14.ordinal()][Symbols.COMMA.ordinal()] = MatrixStates.S14.ordinal();

    }

    public DefLexicMatrix() {

        for (int i = 0; i < this.stateMatrix.length; i++) {
            for (int j = 0; j < this.stateMatrix[0].length; j++) {
                if (this.stateMatrix[i][j] == 0) {
                    this.stateMatrix[i][j] = MatrixStates.SERROR.ordinal(); //llenamos el resto de la matriz con un estado de error, en caso de moverse a un estado inesperado
                }
            }
        }
    }

    public int getStateMatrix(int state, int symbol) {
        return stateMatrix[state][symbol]; //devolvemos el estado de la matriz
    }

}
