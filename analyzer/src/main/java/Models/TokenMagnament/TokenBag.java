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

    public TokenBag() {     //iniciamos las arraylist por medio del constructor sin parametros
        tokens = new ArrayList<>();     
        unreconogizedTokens = new ArrayList<>();
    }

    public void saveToken(Token token) {      
        if (token.getTokenType() != TokenTypes.UNREC_TKN.ordinal()) {  // si el token obtenido es un token reconocido lo guardamos en un arraylist especifico
            tokens.add(token);
            System.out.println("se agrego el token\n" + token);
        } else {
            unreconogizedTokens.add(token);             // los tokens fuera del lenguaje los guardamos en un arraylist especifico
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

        return report;      //mostramos los tokens agrupados por reconocidos y no reconocidos con separadores simples
    }

    public void clearBag() {

        try {
            do {
                tokens.remove(tokens.size() - 1);       //limpiamos la arraylist hasta que este vacia

            } while (!tokens.isEmpty());

            do {
                unreconogizedTokens.remove(unreconogizedTokens.size() - 1);  //limpiamos la arraylist hasta que este vacia

            } while (!unreconogizedTokens.isEmpty());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        showTokens();       //volvemos a mostrar los tokens para reconocer que en efecto, las listas han sido limpiadas

    }

    public ArrayList<Token> groupTokens(int tokenType) {

        ArrayList<Token> specificTokenTypeGroup = new ArrayList<>();    //creamos una arraylist nueva que sera para agrupar tokens segun su tipo agrupable

        for (Token token : tokens) {    //recorremos la lista de tokens validos en busca de los tokens seleccionados para ser agrupados
            if (token.getTokenGroup() == tokenType) {
                specificTokenTypeGroup.add(token);
            }
        }

        return specificTokenTypeGroup;
    }
    
    public int groupSize(int tokenType) {       

        return groupTokens(tokenType).size() + 1;       //obtenemos la longitud de una lista de tokens de un tipo especifico

    }
}
