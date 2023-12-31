/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexic.TokenMagnament;

import Enums.MatrixStates;
import Enums.ReservedWordsList;
import Enums.ReservedWordsTokens;
import Enums.TokenTypes;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
public class Token {

    private String tokenName;
    private String tokenSymbol;
    private int tokenGroup;
    private int tokenType;
    private int row;
    private int col;

    public Token() {
    }

    public Token(int finalState, String lex, int row, int col) {

        //creamos los tokens segun el estado final de la matriz
        
        if (finalState == MatrixStates.S2.ordinal() || finalState == MatrixStates.S3.ordinal() || finalState == MatrixStates.S4.ordinal()) {
            if (isReservedWord(lex)) { 
                System.out.println(lex + " es una palabra reservada");
                createReservedWordTkn(lex);     //en caso de encontrar el token dentro de la lista de palabras reservadas creamos el token respectivo
            } else {
                this.tokenName = TokenTypes.IDNT_TKN.toString();    //de no ser una palabra reservada creamos un token de identificador
                this.tokenSymbol = lex;
                this.tokenType = TokenTypes.IDNT_TKN.ordinal();
                this.tokenGroup = TokenTypes.IDNT_TKN.ordinal();
            }
        } else if (finalState == MatrixStates.S5.ordinal()) {
            //int_tkn
            this.tokenName = TokenTypes.INT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.INT_TKN.ordinal();
            this.tokenGroup = TokenTypes.EXPRSN_TKN.ordinal();

        } else if (finalState == MatrixStates.S7.ordinal()) {
            //dec tkn
            this.tokenName = TokenTypes.DEC_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.DEC_TKN.ordinal();
            this.tokenGroup = TokenTypes.EXPRSN_TKN.ordinal();

        } else if (finalState == MatrixStates.S8.ordinal() || finalState == MatrixStates.S9.ordinal()) {
            //commnt tkn
            this.tokenName = TokenTypes.CMNT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CMNT_TKN.ordinal();
            this.tokenGroup = TokenTypes.CMNT_TKN.ordinal();
        } else if (finalState == MatrixStates.S12.ordinal() || finalState == MatrixStates.S15.ordinal()) {
            //chn tkn
            this.tokenName = TokenTypes.CHN_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CHN_TKN.ordinal();
            this.tokenGroup = TokenTypes.EXPRSN_TKN.ordinal();

        } else if (finalState == MatrixStates.S16.ordinal()) {
            //asig tkn
            this.tokenName = TokenTypes.ASGN_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.ASGN_TKN.ordinal();
            this.tokenGroup = TokenTypes.ASGN_TKN.ordinal();
        } else if (finalState == MatrixStates.S17.ordinal()) {
            //compare tkn
            this.tokenName = TokenTypes.CMPRCN_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CMPRCN_TKN.ordinal();
            this.tokenGroup = TokenTypes.COMPARATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S18.ordinal()) {
            //minor tkn
            this.tokenName = TokenTypes.MNRQ_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.MNRQ_TKN.ordinal();
            this.tokenGroup = TokenTypes.COMPARATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S19.ordinal()) {
            //minor q tkn
            this.tokenName = TokenTypes.MNEQ_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.MNEQ_TKN.ordinal();
            this.tokenGroup = TokenTypes.COMPARATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S20.ordinal()) {
            //mayr tkn
            this.tokenName = TokenTypes.MYRQ_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.MYRQ_TKN.ordinal();
            this.tokenGroup = TokenTypes.COMPARATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S21.ordinal()) {
            //mayr q tkn
            this.tokenName = TokenTypes.MYEQ_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.MYEQ_TKN.ordinal();
            this.tokenGroup = TokenTypes.COMPARATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S23.ordinal()) {
            //diff tkn
            this.tokenName = TokenTypes.DFNT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.DFNT_TKN.ordinal();
            this.tokenGroup = TokenTypes.COMPARATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S24.ordinal()) {
            //opn[ tkn
            this.tokenName = TokenTypes.OPSQ_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.OPSQ_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPSQ_TKN.ordinal();
        } else if (finalState == MatrixStates.S25.ordinal()) {
            //close][ tkn
            this.tokenName = TokenTypes.CLSB_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CLSB_TKN.ordinal();
            this.tokenGroup = TokenTypes.CLSB_TKN.ordinal();
        } else if (finalState == MatrixStates.S26.ordinal()) {
            //opn{ tkn
            this.tokenName = TokenTypes.OPBR_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.OPBR_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPBR_TKN.ordinal();
        } else if (finalState == MatrixStates.S27.ordinal()) {
            //close} tkn
            this.tokenName = TokenTypes.CLBR_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CLBR_TKN.ordinal();
            this.tokenGroup = TokenTypes.CLBR_TKN.ordinal();
        } else if (finalState == MatrixStates.S28.ordinal()) {
            //opn( tkn
            this.tokenName = TokenTypes.OPPRT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.OPPRT_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPPRT_TKN.ordinal();
        } else if (finalState == MatrixStates.S29.ordinal()) {
            //close) tkn
            this.tokenName = TokenTypes.CLPRT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CLPRT_TKN.ordinal();
            this.tokenGroup = TokenTypes.CLPRT_TKN.ordinal();
        } else if (finalState == MatrixStates.S30.ordinal()) {
            //summon tkn
            this.tokenName = TokenTypes.SUM_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.SUM_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPERATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S31.ordinal()) {
            //rest tkn
            this.tokenName = TokenTypes.REST_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.REST_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPERATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S32.ordinal()) {
            //mult tkn
            this.tokenName = TokenTypes.MULT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.MULT_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPERATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S33.ordinal()) {
            //exp tkn
            this.tokenName = TokenTypes.EXPON_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.EXPON_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPERATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S34.ordinal() || finalState == MatrixStates.S36.ordinal()) {
            //div tkn
            this.tokenName = TokenTypes.DIV_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.DIV_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPERATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S35.ordinal()) {
            //mod tkn
            this.tokenName = TokenTypes.MOD_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.MOD_TKN.ordinal();
            this.tokenGroup = TokenTypes.OPERATOR_TKN.ordinal();
        } else if (finalState == MatrixStates.S37.ordinal()) {
            //dot tkn
            this.tokenName = TokenTypes.DOT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.DOT_TKN.ordinal();
            this.tokenGroup = TokenTypes.DOT_TKN.ordinal();
        } else if (finalState == MatrixStates.S38.ordinal()) {
            //dbldot tkn
            this.tokenName = TokenTypes.DBLDOT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.DBLDOT_TKN.ordinal();
            this.tokenGroup = TokenTypes.DBLDOT_TKN.ordinal();
        } else if (finalState == MatrixStates.S39.ordinal()) {
            //comma tkn
            this.tokenName = TokenTypes.COMMA_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.COMMA_TKN.ordinal();
            this.tokenGroup = TokenTypes.COMMA_TKN.ordinal();

        }else if (finalState == MatrixStates.S40.ordinal()) {
            //comma tkn
            this.tokenName = TokenTypes.SEMICOLON_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.SEMICOLON_TKN.ordinal();
            this.tokenGroup = TokenTypes.SEMICOLON_TKN.ordinal();

        } else if (finalState == MatrixStates.S41.ordinal()) {
            //comma tkn
            this.tokenName = TokenTypes.ENDLINE_TKN.toString();
            this.tokenSymbol = "\\n";
            this.tokenType = TokenTypes.ENDLINE_TKN.ordinal();
            this.tokenGroup = TokenTypes.ENDLINE_TKN.ordinal();

        } else if (finalState == MatrixStates.S42.ordinal()) {
            //comma tkn
            this.tokenName = TokenTypes.SPACE_TKN.toString();
            this.tokenSymbol = " ";
            this.tokenType = TokenTypes.SPACE_TKN.ordinal();
            this.tokenGroup = TokenTypes.SPACE_TKN.ordinal();

        } else if (finalState == MatrixStates.S43.ordinal()) {
            //comma tkn
            this.tokenName = TokenTypes.TABULATOR_TOKEN.toString();
            this.tokenSymbol = "\\t";
            this.tokenType = TokenTypes.TABULATOR_TOKEN.ordinal();
            this.tokenGroup = TokenTypes.TABULATOR_TOKEN.ordinal();

        }else if (finalState != MatrixStates.S0.ordinal() || !lex.equals("")) {
            this.tokenName = TokenTypes.UNREC_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.UNREC_TKN.ordinal();
        }
        this.row = row; //seteamos la posicion del token
        this.col = col;
    }
    
    private boolean isReservedWord(String lex) {
        Set<String> reservedWords = new HashSet<>();

        for (ReservedWordsList value : ReservedWordsList.values()) {
            reservedWords.add(value.toString().toLowerCase());  //creamos un con junto de valores unicos para la lista de palabras reservadas en el enum
        }

        return reservedWords.contains(lex); //devolvemos si el lexema forma parte del conjunto de palabras reservadas
    }

    private void createReservedWordTkn(String lex) {
        
        for (ReservedWordsList value : ReservedWordsList.values()) { //creamos el token de palabra reservada segun los valores del enum
            if (lex.equals(value.toString().toLowerCase())) {
                this.tokenName = ReservedWordsTokens.values()[value.ordinal()].toString();
                this.tokenSymbol = lex;
                this.tokenType = TokenTypes.values().length + ReservedWordsTokens.values()[value.ordinal()].ordinal();
                this.tokenGroup = tokenType;
                break; //rompemos el ciclo terminar la construccion del token
            }
        }
    }

    @Override
    public String toString() {
        return "||Token ["+row+", " +col+"] ID:  " + tokenName + "\t||   Type=" + tokenType + "||\t" + "|| Symbolo:  " + tokenSymbol;
    }

}
