/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintax.StatesMagnament;

import Enums.MatrixStates;
import Enums.ReservedWordsTokens;
import Enums.TokenTypes;

/**
 *
 * @author sirbon
 */
public class DefSintaxMatrix {

    private final int totallyTokens = ReservedWordsTokens.values().length + TokenTypes.values().length;
    private final int totallyStates = MatrixStates.values().length;
    public final int[][] sintaxMatrix = new int[totallyStates][totallyTokens];

    {
        sintaxMatrix[MatrixStates.S0.ordinal()][TokenTypes.IDNT_TKN.ordinal()] = MatrixStates.S5.ordinal();
        sintaxMatrix[MatrixStates.S0.ordinal()][TokenTypes.values().length + ReservedWordsTokens.IF_TKN.ordinal()] = MatrixStates.S19.ordinal();
        sintaxMatrix[MatrixStates.S0.ordinal()][TokenTypes.values().length + ReservedWordsTokens.ELSE_TKN.ordinal()] = MatrixStates.S26.ordinal();
        sintaxMatrix[MatrixStates.S0.ordinal()][TokenTypes.values().length + ReservedWordsTokens.ELIF_TKN.ordinal()] = MatrixStates.S19.ordinal();
        sintaxMatrix[MatrixStates.S0.ordinal()][TokenTypes.values().length + ReservedWordsTokens.FOR_TKN.ordinal()] = MatrixStates.S27.ordinal();
        sintaxMatrix[MatrixStates.S0.ordinal()][TokenTypes.values().length + ReservedWordsTokens.WHILE_TKN.ordinal()] = MatrixStates.S37.ordinal();
        sintaxMatrix[MatrixStates.S0.ordinal()][TokenTypes.values().length + ReservedWordsTokens.DEF_TKN.ordinal()] = MatrixStates.S44.ordinal();
        sintaxMatrix[MatrixStates.S0.ordinal()][TokenTypes.values().length + ReservedWordsTokens.VAR_TKN.ordinal()] = MatrixStates.S1.ordinal();

        sintaxMatrix[MatrixStates.S1.ordinal()][TokenTypes.IDNT_TKN.ordinal()] = MatrixStates.S2.ordinal();

        sintaxMatrix[MatrixStates.S2.ordinal()][TokenTypes.ASGN_TKN.ordinal()] = MatrixStates.S3.ordinal();

        sintaxMatrix[MatrixStates.S3.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.SACEPT.ordinal();
        // sintaxMatrix[MatrixStates.S3.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S3.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S3.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S4.ordinal();

        sintaxMatrix[MatrixStates.S4.ordinal()][TokenTypes.OPERATOR_TKN.ordinal()] = MatrixStates.S3.ordinal();

        sintaxMatrix[MatrixStates.S5.ordinal()][TokenTypes.ASGN_TKN.ordinal()] = MatrixStates.S7.ordinal();
        sintaxMatrix[MatrixStates.S5.ordinal()][TokenTypes.COMMA_TKN.ordinal()] = MatrixStates.S6.ordinal();

        sintaxMatrix[MatrixStates.S6.ordinal()][TokenTypes.IDNT_TKN.ordinal()] = MatrixStates.S5.ordinal();

        sintaxMatrix[MatrixStates.S7.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S8.ordinal();
        // sintaxMatrix[MatrixStates.S7.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S8.ordinal();
        //sintaxMatrix[MatrixStates.S7.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S8.ordinal();
        //sintaxMatrix[MatrixStates.S7.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S8.ordinal();
        sintaxMatrix[MatrixStates.S7.ordinal()][TokenTypes.OPSQ_TKN.ordinal()] = MatrixStates.S15.ordinal();

        sintaxMatrix[MatrixStates.S8.ordinal()][TokenTypes.COMMA_TKN.ordinal()] = MatrixStates.S9.ordinal();
        sintaxMatrix[MatrixStates.S8.ordinal()][TokenTypes.values().length + ReservedWordsTokens.IF_TKN.ordinal()] = MatrixStates.S10.ordinal();

        sintaxMatrix[MatrixStates.S9.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S8.ordinal();
        // sintaxMatrix[MatrixStates.S9.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S8.ordinal();
        //sintaxMatrix[MatrixStates.S9.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S8.ordinal();
        //sintaxMatrix[MatrixStates.S9.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S8.ordinal();

        sintaxMatrix[MatrixStates.S10.ordinal()][TokenTypes.IDNT_TKN.ordinal()] = MatrixStates.S12.ordinal();
        sintaxMatrix[MatrixStates.S10.ordinal()][TokenTypes.values().length + ReservedWordsTokens.NOT_TKN.ordinal()] = MatrixStates.S11.ordinal();

        sintaxMatrix[MatrixStates.S11.ordinal()][TokenTypes.IDNT_TKN.ordinal()] = MatrixStates.S12.ordinal();

        sintaxMatrix[MatrixStates.S12.ordinal()][TokenTypes.values().length + ReservedWordsTokens.ELSE_TKN.ordinal()] = MatrixStates.S13.ordinal();

        sintaxMatrix[MatrixStates.S13.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.SACEPT.ordinal(); 
        // sintaxMatrix[MatrixStates.S13.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S13.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S13.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S4.ordinal();

        sintaxMatrix[MatrixStates.S15.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S16.ordinal();
        // sintaxMatrix[MatrixStates.S15.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S15.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S15.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S4.ordinal();

        sintaxMatrix[MatrixStates.S16.ordinal()][TokenTypes.COMMA_TKN.ordinal()] = MatrixStates.S17.ordinal();
        sintaxMatrix[MatrixStates.S16.ordinal()][TokenTypes.OPSQ_TKN.ordinal()] = MatrixStates.S18.ordinal();

        sintaxMatrix[MatrixStates.S17.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S16.ordinal();
        // sintaxMatrix[MatrixStates.S17.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S17.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S17.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S4.ordinal();

        sintaxMatrix[MatrixStates.S19.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S20.ordinal();
        // sintaxMatrix[MatrixStates.S19.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S19.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S4.ordinal();
        //sintaxMatrix[MatrixStates.S19.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S4.ordinal();

        sintaxMatrix[MatrixStates.S20.ordinal()][TokenTypes.COMPARATOR_TKN.ordinal()] = MatrixStates.S21.ordinal();

        sintaxMatrix[MatrixStates.S21.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S22.ordinal();
        // sintaxMatrix[MatrixStates.S21.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S22.ordinal();
        //sintaxMatrix[MatrixStates.S21.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S22.ordinal();
        //sintaxMatrix[MatrixStates.S21.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S22.ordinal();

        sintaxMatrix[MatrixStates.S22.ordinal()][TokenTypes.DBLDOT_TKN.ordinal()] = MatrixStates.S23.ordinal(); //S23

        sintaxMatrix[MatrixStates.S23.ordinal()][TokenTypes.ENDLINE_TKN.ordinal()] = MatrixStates.S24.ordinal();

        sintaxMatrix[MatrixStates.S24.ordinal()][TokenTypes.TABULATOR_TOKEN.ordinal()] = MatrixStates.S25.ordinal(); //S0 STATE REBOOT

        sintaxMatrix[MatrixStates.S27.ordinal()][TokenTypes.IDNT_TKN.ordinal()] = MatrixStates.S28.ordinal();

        sintaxMatrix[MatrixStates.S28.ordinal()][TokenTypes.values().length + ReservedWordsTokens.IN_TKN.ordinal()] = MatrixStates.S29.ordinal();

        sintaxMatrix[MatrixStates.S29.ordinal()][TokenTypes.IDNT_TKN.ordinal()] = MatrixStates.S30.ordinal();

        sintaxMatrix[MatrixStates.S30.ordinal()][TokenTypes.DBLDOT_TKN.ordinal()] = MatrixStates.SACEPT.ordinal(); //S31

        sintaxMatrix[MatrixStates.S31.ordinal()][TokenTypes.ENDLINE_TKN.ordinal()] = MatrixStates.S32.ordinal();

        sintaxMatrix[MatrixStates.S32.ordinal()][TokenTypes.TABULATOR_TOKEN.ordinal()] = MatrixStates.S33.ordinal(); //S0 STATE REBOOT

        sintaxMatrix[MatrixStates.S35.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S36.ordinal();
        // sintaxMatrix[MatrixStates.S35.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S36.ordinal();
        //sintaxMatrix[MatrixStates.S35.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S36.ordinal();
        //sintaxMatrix[MatrixStates.S35.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S36.ordinal();

        sintaxMatrix[MatrixStates.S36.ordinal()][TokenTypes.COMPARATOR_TKN.ordinal()] = MatrixStates.S37.ordinal();

        sintaxMatrix[MatrixStates.S37.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S38.ordinal();
        // sintaxMatrix[MatrixStates.S37.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S38.ordinal();
        //sintaxMatrix[MatrixStates.S37.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S38.ordinal();
        //sintaxMatrix[MatrixStates.S37.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S38.ordinal();

        sintaxMatrix[MatrixStates.S38.ordinal()][TokenTypes.DBLDOT_TKN.ordinal()] = MatrixStates.SACEPT.ordinal(); //S39

        sintaxMatrix[MatrixStates.S39.ordinal()][TokenTypes.ENDLINE_TKN.ordinal()] = MatrixStates.S40.ordinal();

        sintaxMatrix[MatrixStates.S40.ordinal()][TokenTypes.TABULATOR_TOKEN.ordinal()] = MatrixStates.S41.ordinal(); //S0 STATE REBOOT

        sintaxMatrix[MatrixStates.S42.ordinal()][TokenTypes.IDNT_TKN.ordinal()] = MatrixStates.S43.ordinal();

        sintaxMatrix[MatrixStates.S43.ordinal()][TokenTypes.OPPRT_TKN.ordinal()] = MatrixStates.S44.ordinal();

        sintaxMatrix[MatrixStates.S44.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.SACEPT.ordinal(); //S45
        // sintaxMatrix[MatrixStates.S44.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S22.ordinal();
        //sintaxMatrix[MatrixStates.S44.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S22.ordinal();
        //sintaxMatrix[MatrixStates.S44.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S22.ordinal();

        sintaxMatrix[MatrixStates.S45.ordinal()][TokenTypes.COMMA_TKN.ordinal()] = MatrixStates.S46.ordinal();
        sintaxMatrix[MatrixStates.S45.ordinal()][TokenTypes.CLPRT_TKN.ordinal()] = MatrixStates.S47.ordinal();

        sintaxMatrix[MatrixStates.S46.ordinal()][TokenTypes.EXPRSN_TKN.ordinal()] = MatrixStates.S45.ordinal();
        // sintaxMatrix[MatrixStates.S46.ordinal()][TokenTypes.CHN_TKN.ordinal()] = MatrixStates.S45.ordinal();
        //sintaxMatrix[MatrixStates.S46.ordinal()][TokenTypes.INT_TKN.ordinal()] = MatrixStates.S45.ordinal();
        //sintaxMatrix[MatrixStates.S46.ordinal()][TokenTypes.DEC_TKN.ordinal()] = MatrixStates.S45.ordinal();

        sintaxMatrix[MatrixStates.S47.ordinal()][TokenTypes.DBLDOT_TKN.ordinal()] = MatrixStates.S48.ordinal();

        sintaxMatrix[MatrixStates.S48.ordinal()][TokenTypes.ENDLINE_TKN.ordinal()] = MatrixStates.S49.ordinal();

        sintaxMatrix[MatrixStates.S49.ordinal()][TokenTypes.TABULATOR_TOKEN.ordinal()] = MatrixStates.S50.ordinal(); //S0 STATE REBOOT

    }
    
    public DefSintaxMatrix() {

        for (int i = 0; i < this.sintaxMatrix.length; i++) {
            for (int j = 0; j < this.sintaxMatrix[0].length; j++) {
                if (this.sintaxMatrix[i][j] == 0) {
                    this.sintaxMatrix[i][j] = MatrixStates.SERROR.ordinal(); //llenamos el resto de la matriz con un estado de error, en caso de moverse a un estado inesperado
                }
            }
        }
    }

    public int getStateMatrix(int state, int tkn) {
        return sintaxMatrix[state][tkn]; //devolvemos el estado de la matriz
    }

}
