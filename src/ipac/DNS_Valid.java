/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipac;

import java.net.InetAddress;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Arga Diaz Prawira Yudha
 */
public class DNS_Valid extends javax.swing.JFrame {

    /**
     * Creates new form DNS_Valid
     */
    public DNS_Valid() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dnsValidPane = new javax.swing.JPanel();
        dnsLabel = new javax.swing.JLabel();
        dnsTextField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IPAC - Beta Version 1.0.0");
        setResizable(false);

        dnsValidPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dnsLabel.setText("Insert URL");

        generateButton.setText("Generate");
        generateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dnsValidPaneLayout = new javax.swing.GroupLayout(dnsValidPane);
        dnsValidPane.setLayout(dnsValidPaneLayout);
        dnsValidPaneLayout.setHorizontalGroup(
            dnsValidPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dnsValidPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dnsValidPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dnsTextField)
                    .addGroup(dnsValidPaneLayout.createSequentialGroup()
                        .addComponent(dnsLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dnsValidPaneLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        dnsValidPaneLayout.setVerticalGroup(
            dnsValidPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dnsValidPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dnsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dnsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Calculator Type");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Maximum Host");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Class Type");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("DNS Validation");
        jMenuItem4.setEnabled(false);
        jMenu1.add(jMenuItem4);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dnsValidPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dnsValidPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MaxHostIP menu = new MaxHostIP();
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Class_Type menu = new Class_Type();
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        if(!dnsTextField.getText().isEmpty() && Operation.isURLFormat(dnsTextField.getText())){
            String url=dnsTextField.getText();
            if(Operation.validAddress(url) != null){
                InetAddress validAddress=Operation.validAddress(url);
                String hostname = validAddress.getHostName();
                String hostaddress = validAddress.getHostAddress();
                
                JOptionPane.showMessageDialog(new JFrame(), hostname+" using IP "+hostaddress, "Connection Success", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(new JFrame(), "Invalid domain connection or check your connection", 
                        "Connection Failed", JOptionPane.ERROR_MESSAGE);
            }
                        
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "Invalid URL Format!", "Error Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_generateButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dnsLabel;
    private javax.swing.JTextField dnsTextField;
    private javax.swing.JPanel dnsValidPane;
    private javax.swing.JButton generateButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
