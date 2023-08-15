/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Models.FilesMagnament.FileController;
import Models.TokenMagnament.TokenBag;
import Models.TokenMagnament.TokenController;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author sirbon
 */
public class AnalyzerMainGUI extends javax.swing.JFrame {

    /**
     * Creates new form AnalyzerMainGUI
     */
    private final TokenController tokenController = new TokenController(new TokenBag());
    private final UserInterfaceMagnament userInterfaceMagnament = new UserInterfaceMagnament();
    private final FileController fileController = new FileController();

    public AnalyzerMainGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analyzerPane = new javax.swing.JPanel();
        textScrollPane1 = new javax.swing.JScrollPane();
        textInsertSection = new javax.swing.JTextArea();
        resultScrollPane2 = new javax.swing.JScrollPane();
        resultsSection = new javax.swing.JTextArea();
        runButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        loadFIle = new javax.swing.JButton();
        exportFile = new javax.swing.JButton();
        infoJLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lexic Analyzer");
        setResizable(false);

        textInsertSection.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                userInterfaceMagnament.cellCount(textInsertSection, infoJLabel);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                userInterfaceMagnament.cellCount(textInsertSection, infoJLabel);

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                userInterfaceMagnament.cellCount(textInsertSection, infoJLabel);

            }

        });
        textInsertSection.setColumns(20);
        textInsertSection.setLineWrap(true);
        textInsertSection.setRows(5);
        textScrollPane1.setViewportView(textInsertSection);

        resultsSection.setEditable(false);
        resultsSection.setColumns(20);
        resultsSection.setLineWrap(true);
        resultsSection.setRows(5);
        resultsSection.setToolTipText("");
        resultsSection.setWrapStyleWord(true);
        resultScrollPane2.setViewportView(resultsSection);

        runButton.setText("Analyze");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        loadFIle.setText("Load");
        loadFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFIleActionPerformed(evt);
            }
        });

        exportFile.setText("Exortar");

        infoJLabel.setText("Line: Col:");

        javax.swing.GroupLayout analyzerPaneLayout = new javax.swing.GroupLayout(analyzerPane);
        analyzerPane.setLayout(analyzerPaneLayout);
        analyzerPaneLayout.setHorizontalGroup(
            analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(analyzerPaneLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(analyzerPaneLayout.createSequentialGroup()
                            .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(loadFIle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(exportFile, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                        .addComponent(resultScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, analyzerPaneLayout.createSequentialGroup()
                        .addComponent(infoJLabel)
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        analyzerPaneLayout.setVerticalGroup(
            analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, analyzerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(analyzerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadFIle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoJLabel))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(analyzerPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(analyzerPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        tokenController.clearTokens();
        textInsertSection.setText("");
        resultsSection.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        tokenController.clearTokens();
        tokenController.initParser(textInsertSection.getText());
        resultsSection.setText(tokenController.getTokenBag().showTokens());
    }//GEN-LAST:event_runButtonActionPerformed

    private void loadFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFIleActionPerformed
        fileController.readFIle(loadFIle, textInsertSection);
    }//GEN-LAST:event_loadFIleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel analyzerPane;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exportFile;
    private javax.swing.JLabel infoJLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton loadFIle;
    private javax.swing.JScrollPane resultScrollPane2;
    private javax.swing.JTextArea resultsSection;
    private javax.swing.JButton runButton;
    private javax.swing.JTextArea textInsertSection;
    private javax.swing.JScrollPane textScrollPane1;
    // End of variables declaration//GEN-END:variables
}
