/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintax.ExpressionMagnament.Expressions;

/**
 *
 * @author sirbon
 */
@lombok.Setter
@lombok.Getter
public class Expression {
    
    private Instruction instruction;
    private String type;
    private String nombre;
    private int row;
    private int col;
    
}
