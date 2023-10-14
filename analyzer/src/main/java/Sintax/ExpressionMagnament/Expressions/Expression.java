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
@lombok.NoArgsConstructor
public class Expression {

    private Instruction instruction;
    private int type;
    private String name;
    private int identationCount;
    private int row;
    private int col;

    public Expression(Instruction instruction, int type, String nombre, int identationCount, int row, int col) {
        this.instruction = instruction;
        this.type = type;
        this.name = nombre;
        this.identationCount = identationCount;
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Expression{" + "instruction= " + instruction + " name= " + name + " row= " + row + ", col= " + col + "}\n";
    }

}
