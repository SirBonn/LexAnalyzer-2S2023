/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.TokenMagnament;

import Models.enums.MatrixStates;
import Models.enums.ReservedWordsList;
import Models.enums.ReservedWordsTokens;
import Models.enums.TokenTypes;
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

    public Token() {
    }

    public Token(int finalState, String lex) {

        if (finalState == MatrixStates.S2.ordinal() || finalState == MatrixStates.S3.ordinal() || finalState == MatrixStates.S4.ordinal()) {
            if (isReservedWord(lex)) {
                System.out.println(lex + " es una palabra reservada");
                createReservedWordTkn(lex);
            } else {
                this.tokenName = TokenTypes.IDNT_TKN.toString();
                this.tokenSymbol = lex;
                this.tokenType = TokenTypes.IDNT_TKN.ordinal();
                this.tokenGroup = TokenTypes.IDNT_TKN.ordinal();
            }
        } else if (finalState == MatrixStates.S5.ordinal()) {
            //int_tkn
            this.tokenName = TokenTypes.INT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.INT_TKN.ordinal();
            this.tokenGroup = TokenTypes.INT_TKN.ordinal();

        } else if (finalState == MatrixStates.S7.ordinal()) {
            //dec tkn
            this.tokenName = TokenTypes.DEC_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.DEC_TKN.ordinal();
            this.tokenGroup = TokenTypes.DEC_TKN.ordinal();

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
            this.tokenGroup = TokenTypes.CHN_TKN.ordinal();

        } else if (finalState == MatrixStates.S16.ordinal()) {
            //asig tkn
            this.tokenName = TokenTypes.ASGN_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.ASGN_TKN.ordinal();
            this.tokenGroup = TokenTypes.COMPARATOR_TKN.ordinal();
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
            this.tokenGroup = TokenTypes.AGRUPATION_TKN.ordinal();
        } else if (finalState == MatrixStates.S25.ordinal()) {
            //close][ tkn
            this.tokenName = TokenTypes.CLSB_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CLSB_TKN.ordinal();
            this.tokenGroup = TokenTypes.AGRUPATION_TKN.ordinal();
        } else if (finalState == MatrixStates.S26.ordinal()) {
            //opn{ tkn
            this.tokenName = TokenTypes.OPBR_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.OPBR_TKN.ordinal();
            this.tokenGroup = TokenTypes.AGRUPATION_TKN.ordinal();
        } else if (finalState == MatrixStates.S27.ordinal()) {
            //close} tkn
            this.tokenName = TokenTypes.CLBR_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CLBR_TKN.ordinal();
            this.tokenGroup = TokenTypes.AGRUPATION_TKN.ordinal();
        } else if (finalState == MatrixStates.S28.ordinal()) {
            //opn( tkn
            this.tokenName = TokenTypes.OPPRT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.OPPRT_TKN.ordinal();
            this.tokenGroup = TokenTypes.AGRUPATION_TKN.ordinal();
        } else if (finalState == MatrixStates.S29.ordinal()) {
            //close) tkn
            this.tokenName = TokenTypes.CLPRT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.CLPRT_TKN.ordinal();
            this.tokenGroup = TokenTypes.AGRUPATION_TKN.ordinal();
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
            this.tokenName = TokenTypes.EXP_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.EXP_TKN.ordinal();
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
            this.tokenGroup = TokenTypes.SINGN_TKN.ordinal();
        } else if (finalState == MatrixStates.S38.ordinal()) {
            //dbldot tkn
            this.tokenName = TokenTypes.DBLDOT_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.DBLDOT_TKN.ordinal();
            this.tokenGroup = TokenTypes.SINGN_TKN.ordinal();
        } else if (finalState == MatrixStates.S39.ordinal()) {
            //comma tkn
            this.tokenName = TokenTypes.COMMA_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.COMMA_TKN.ordinal();
            this.tokenGroup = TokenTypes.SINGN_TKN.ordinal();

        } else if (finalState != MatrixStates.S0.ordinal() || !lex.equals("")) {
            this.tokenName = TokenTypes.UNREC_TKN.toString();
            this.tokenSymbol = lex;
            this.tokenType = TokenTypes.UNREC_TKN.ordinal();
        }
    }

    private boolean isReservedWord(String lex) {
        Set<String> reservedWords = new HashSet<>();

        for (ReservedWordsList value : ReservedWordsList.values()) {
            reservedWords.add(value.toString().toLowerCase());
        }

        return reservedWords.contains(lex);
    }

    private void createReservedWordTkn(String lex) {
        for (ReservedWordsList value : ReservedWordsList.values()) {
            if (lex.equals(value.toString().toLowerCase())) {
                this.tokenName = ReservedWordsTokens.values()[value.ordinal()].toString();
                this.tokenSymbol = lex;
                this.tokenType = TokenTypes.values().length + ReservedWordsTokens.values()[value.ordinal()].ordinal();
                this.tokenGroup = TokenTypes.RSRVDWRD_TKN.ordinal();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Token:\t" + "|| Token ID:  " + tokenName + "|| Symbolo:  " + tokenSymbol + "|| tokenType=" + tokenType + "||";
    }

}
