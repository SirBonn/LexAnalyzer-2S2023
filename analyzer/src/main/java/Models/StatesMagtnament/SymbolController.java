/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.StatesMagtnament;

import Models.enums.MatrixStates;
import Models.enums.Symbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sirbon
 */
public class SymbolController {

    private char thisChar;

    public SymbolController() {
    }

    public int getCharValue(char charAt) {

        int charValue;
        if (Character.isDigit(charAt)) {

            charValue = Symbols.DIGIT.ordinal();
        } else if (Character.isLetter(charAt)) {

            charValue = Symbols.LETTER.ordinal();
        } else {

            switch (charAt) {
                case '_':
                    charValue = Symbols.UNDERSCORE.ordinal();
                    break;
                case '.':
                    charValue = Symbols.DOT.ordinal();
                    break;
                case '#':
                    charValue = Symbols.HASTAG.ordinal();
                    break;
                case '"':
                    charValue = Symbols.DOBQUOTE.ordinal();
                    break;
                case '\'':
                    charValue = Symbols.SIMPLQUOTE.ordinal();
                    break;
                case '=':
                    charValue = Symbols.EQUAL.ordinal();
                    break;
                case '<':
                    charValue = Symbols.MINORQ.ordinal();
                    break;
                case '>':
                    charValue = Symbols.MAYORQ.ordinal();
                    break;
                case '!':
                    charValue = Symbols.EXCLAMTION.ordinal();
                    break;
                case '[':
                    charValue = Symbols.OPENSQBRAQUET.ordinal();
                    break;
                case ']':
                    charValue = Symbols.CLOSESQBRAQUET.ordinal();
                    break;
                case '{':
                    charValue = Symbols.OPENBRAQUET.ordinal();
                    break;
                case '}':
                    charValue = Symbols.CLOSEBRAQUET.ordinal();
                    break;
                case '(':
                    charValue = Symbols.OPENPARENTH.ordinal();
                    break;
                case ')':
                    charValue = Symbols.CLOSEPARENTH.ordinal();
                    break;
                case '+':
                    charValue = Symbols.SUMMATION.ordinal();
                    break;
                case '-':
                    charValue = Symbols.SUBTRACTION.ordinal();
                    break;
                case '/':
                    charValue = Symbols.DIAGONAL.ordinal();
                    break;
                case '*':
                    charValue = Symbols.ASTERISK.ordinal();
                    break;
                case '%':
                    charValue = Symbols.PERCENTAGE.ordinal();
                    break;
                case ':':
                    charValue = Symbols.DBLDOT.ordinal();
                    break;
                case ',':
                    charValue = Symbols.COMMA.ordinal();
                    break;
                case ' ':
                    charValue = Symbols.SPACE.ordinal();
                    break;
                case ';':
                    charValue = Symbols.SEMICOLON.ordinal();
                    break;
                case '\n':
                    charValue = Symbols.ENDLINE.ordinal();
                    break;
                case '\t':
                    charValue = Symbols.SPACE.ordinal();
                    break;
                default:
                    return Symbols.OTHER.ordinal();
            }
        }
        return charValue;
    }

    public boolean isReservedChar(char charAt, int state) {

        ArrayList<String> reservedChar = new ArrayList<>();

        reservedChar.add("==");
        reservedChar.add("!=");
        reservedChar.add(">=");
        reservedChar.add("<=");
        reservedChar.add("//");
        reservedChar.add("**");
        reservedChar.add("=");
        reservedChar.add("<");
        reservedChar.add(">");
        reservedChar.add("+");
        reservedChar.add("-");
        reservedChar.add("*");
        reservedChar.add("/");
        reservedChar.add("(");
        reservedChar.add(")");
        reservedChar.add("{");
        reservedChar.add("}");
        reservedChar.add("[");
        reservedChar.add("]");
        reservedChar.add(" ");
        reservedChar.add("\t");
        reservedChar.add("\n");

        System.out.println("el token " + charAt + " esta: " + reservedChar.contains(Character.toString(charAt)));

        if (isAceptedChar(charAt, state)) {
            return false;
        } else {
            return reservedChar.contains(Character.toString(charAt));
        }
    }

    private boolean isAceptedChar(char charAt, int state) {
        if (charAt != '\n') {
            return (state == MatrixStates.S9.ordinal() || state == MatrixStates.S10.ordinal() || state == MatrixStates.S11.ordinal()
                    || state == MatrixStates.S13.ordinal() || state == MatrixStates.S14.ordinal());
        } else {
            return false;

        }
    }

}
