package formalslang.analyzer;

import GUI.AnalyzerMainGUI;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Código para eliminar las imágenes generadas
            deleteGeneratedGraphs();
        }));

        new AnalyzerMainGUI().setVisible(true);
    }

    private static void deleteGeneratedGraphs() {
        String resourcesFolderPath = System.getProperty("user.dir") + "/src/main/Resources";

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
    
    
    private static class ImageFileFilter implements java.io.FileFilter {
        @Override
        public boolean accept(File pathname) {
            return pathname.isFile() && (pathname.getName().endsWith(".png") || pathname.getName().endsWith(".dot"));  // Cambia la extensión si es diferente
        }
    }
}
