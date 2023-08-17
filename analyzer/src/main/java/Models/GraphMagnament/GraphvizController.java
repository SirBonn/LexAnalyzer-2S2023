/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.GraphMagnament;

import Models.TokenMagnament.Token;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sirbon
 */
public class GraphvizController {

    private Token token;

    public GraphvizController() {
    }

    public GraphvizController(Token token) {
        this.token = token;
    }

    public String getTknDOT() {
        char[] tknSymbs = this.token.getTokenSymbol().toCharArray();
        String tknToGraph = "S0->";
        for (int i = 0; i < tknSymbs.length; i++) {
            if (i != (tknSymbs.length - 1)) {
                tknToGraph += tknSymbs[i] + "->";
            } else {
                tknToGraph += tknSymbs[i];
            }
        }
        return tknToGraph;
    }

    private String getTknGraph(String tknSymb) {

        String txt = "digraph G\n"
                + "{\n"
                + "     node [style = filled]\n"
                + "     node [fillcolor = \"#ffd200\"]\n"
                + "     node [color = \"#a0522d\"]\n"
                + "     edge [color = \"#000000\"]\n";

        txt += getTknDOT();

        txt += "      rankdir = LR;\n"
                + "}";

        return txt;
    }

    private void dotFileMaker(String contenido) {

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        String ruta = System.getProperty("user.dir") + "/src/main/Resources/tkn_grph.dot";
        try {
            fileWriter = new FileWriter(ruta);
            printWriter = new PrintWriter(fileWriter);
            printWriter.write(contenido);
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

    }

    public void drawGraph(String tknSymb) {
        
        try {
            
            dotFileMaker(getTknGraph(tknSymb));
            String ruta = System.getProperty("user.dir") + "/src/main/Resources/tkn_grph.dot";
            String rutaGr = System.getProperty("user.dir") + "/src/main/Resources/"+tknSymb+".png";
            ProcessBuilder processBuilder = new ProcessBuilder("dot", "-Tpng", "-o", rutaGr, ruta);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Gráfico generado");
            } else {
                System.out.println("Error al generar el gráfico.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

}
