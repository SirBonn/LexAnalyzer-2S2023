/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.TokenMagnament;

import Models.enums.TokenTypes;
import java.util.ArrayList;

/**
 *
 * @author sirbon
 */
@lombok.Getter
@lombok.Setter
public class TokenBag {

    private final ArrayList<Token> tokens;
    private final ArrayList<Token> unreconogizedTokens;
    private String report;

    public TokenBag() {
        tokens = new ArrayList<>();
        unreconogizedTokens = new ArrayList<>();
    }

    public void saveToken(Token token) {
        if (token.getTokenType() != TokenTypes.UNREC_TKN.ordinal()) {
            tokens.add(token);
            System.out.println("se agrego el token\n" + token);
        } else {
            unreconogizedTokens.add(token);
            System.out.println("token desconocido");
        }
    }

    public String showTokens() {
        report = "--- Tokens reconocidos ---\n";

        for (Token token : tokens) {
            report += token + "\n";
        }

        report += "\n--- Tokens no reconocidos ---\n";

        for (Token unrecTonk : unreconogizedTokens) {
            report += unrecTonk + "\n";
        }

        return report;
    }

    public void clearBag() {

        try {
            do {
                tokens.remove(tokens.size() - 1);

            } while (!tokens.isEmpty());

            do {
                unreconogizedTokens.remove(unreconogizedTokens.size() - 1);

            } while (!unreconogizedTokens.isEmpty());
        } catch (Exception e) {
            System.out.println(e);
        }

        showTokens();

    }

    public ArrayList<Token> groupTokens(int tokenType) {

        ArrayList<Token> specificTokenTypeGroup = new ArrayList<>();

        for (Token token : tokens) {
            if (token.getTokenGroup() == tokenType) {
                specificTokenTypeGroup.add(token);
            }
        }

        return specificTokenTypeGroup;
    }

    public int groupSize(int tokenType) {

        return groupTokens(tokenType).size() + 1;

    }
}
