/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexic.FilesMagnament;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author sirbon
 */
public class FileController {
    
    public void readFIle(JButton readButton, JTextArea textArea) {
          
          readButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                JFileChooser chooseFile = new JFileChooser();
                chooseFile.showOpenDialog(null);
                File file = chooseFile.getSelectedFile();
                try {
                    FileReader readData = new FileReader(file);
                    BufferedReader br = new BufferedReader(readData);
                    String text = "";
                    String line;
                    while ((line = br.readLine()) != null) {
                        text += line + "\n";    //creamos un bloque de texto por cada linea leida por el buffer de lectura
                    }
                    textArea.setText(text); //seteamos el texto extraido del archivo
                } catch (IOException a) {
                    
                }
            }
        });
     }
     
}
