package formalslang.analyzer;

import GUI.AnalyzerMainGUI;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            // añadimos una accion al proceso de cierre del programa
            @Override
            public void run() {
                // accion que sera eliminar los graphicos creados en el programa al finalizar su
                // ejecucion
                deleteGeneratedGraphs();
            }
        }));

        new AnalyzerMainGUI().setVisible(true);
    }

    private static void deleteGeneratedGraphs() {
        String resourcesFolderPath = System.getProperty("user.dir");
        // creamos un buscador de archivos que responda a un filtro para eliminarlos
        File resourcesFolder = new File(resourcesFolderPath);
        if (resourcesFolder.exists() && resourcesFolder.isDirectory()) {
            File[] imageFiles = resourcesFolder.listFiles(new ImageFileFilter());
            if (imageFiles != null) {
                for (File imageFile : imageFiles) {
                    imageFile.delete();
                }
            }
        }
    }

    // creamos un filtro de archivos, para buscar .dot y .png
    private static class ImageFileFilter implements java.io.FileFilter {
        @Override
        public boolean accept(File pathname) {
            return pathname.isFile() && (pathname.getName().endsWith(".png") || pathname.getName().endsWith(".dot"));
        }
    }
}
