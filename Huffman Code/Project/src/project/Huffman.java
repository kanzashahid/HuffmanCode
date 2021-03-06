/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kainat bangash hayat
 */
public class Huffman extends javax.swing.JFrame {
 JFileChooser chooser ;
 HuffmanTree HH ;
  Compression p ;
    /**
     * Creates new form Huffman
     */
    public Huffman() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
       
        ((JPanel)getContentPane()).setOpaque(false);
     
        JLabel background = new JLabel();
       
        getLayeredPane().add(background,JLayeredPane.FRAME_CONTENT_LAYER) ;
       
        
    }
 public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent); ;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        File = new javax.swing.JButton();
        comp = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        size = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Csize = new javax.swing.JTextField();
        Decode = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 440));
        getContentPane().setLayout(null);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 60, 420, 290);

        File.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        File.setText("Choose File ");
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });
        getContentPane().add(File);
        File.setBounds(80, 30, 120, 25);

        comp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comp.setText("Compress");
        comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compActionPerformed(evt);
            }
        });
        getContentPane().add(comp);
        comp.setBounds(80, 200, 120, 25);

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(160, 360, 60, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("File Size : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 110, 130, 30);

        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });
        getContentPane().add(size);
        size.setBounds(170, 110, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Compressed Size :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 270, 140, 20);

        Csize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsizeActionPerformed(evt);
            }
        });
        getContentPane().add(Csize);
        Csize.setBounds(170, 270, 80, 30);

        Decode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Decode.setText("Decode");
        Decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecodeActionPerformed(evt);
            }
        });
        getContentPane().add(Decode);
        Decode.setBounds(10, 360, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/White-Abstract-Wallpapers-HD-Download.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 720, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void Chooser(String s){
      
        try {
            FileReader reader = new FileReader(s);
            BufferedReader br = new BufferedReader(reader);
            TextArea.read(br , null);
            br.close();
            TextArea.requestFocus();
        }
        catch(Exception e){
            System.out.println("");
        } 
 }
    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        // TODO add your handling code here:
         chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        java.io.File f = chooser.getSelectedFile();
        
        String filename = f.getAbsolutePath();
            Chooser(filename);
            HH = new HuffmanTree();
        try {
      String s = Integer.toString(HH.BinaryCount(TextArea.getText()));
       size.setText(s);
    }
         catch(Exception e){
            System.out.println("");
        } 
       
           
       filing file = new filing();
       try {
        file.ReadTextFile("CSSample.txt");  
       }
       catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_FileActionPerformed

    private void compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compActionPerformed
        // TODO add your handling code here:
      /*   filing file = new filing();
       try {
        file.ReadTextFile("CSSample.txt");  
       }
       catch(Exception e){
           System.out.println(e);
       } */
     if(TextArea.getText() == null){
           
              JOptionPane.showMessageDialog(null ,"First choose a file");
        }
        else { 
         
     p = new Compression();
      try {
           
           java.io.File f = chooser.getSelectedFile();
           String filename = f.getAbsolutePath();
           p.ReadText(filename);
     TextArea.setText(p.x);
     }
     catch(Exception e){
         System.out.println(e);
     }
      try {
      String s = Integer.toString(p.t);
       Csize.setText(s);
    }         catch(Exception e){
            System.out.println("Error ");
        } 
      
            /* HuffmanTree t = new HuffmanTree();
      try {
     t.count(TextArea.getText());
     TextArea.setText(t.c);
    
      }
      catch(Exception e){
            System.out.println("");
        } 
      
        try {
      String s = Integer.toString(t.BinaryCount(TextArea.getText()));
       Csize.setText(s);
    }
         catch(Exception e){
            System.out.println("");
        } 
       
     */
         }
    
    }//GEN-LAST:event_compActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        // TODO add your handling code here:
        HH = new HuffmanTree();
        try {
      String s = Integer.toString(HH.BinaryCount(TextArea.getText()));
       size.setText(s);
    }
         catch(Exception e){
            System.out.println("");
        } 
       
    }//GEN-LAST:event_sizeActionPerformed

    private void CsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsizeActionPerformed
        // TODO add your handling code here:
       HH = new HuffmanTree();
        try {
      String s = Integer.toString(HH.BinaryCount(TextArea.getText()));
       size.setText(s);
    }
         catch(Exception e){
            System.out.println("");
        } 
       
    }//GEN-LAST:event_CsizeActionPerformed

    private void DecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecodeActionPerformed
        // TODO add your handling code here:
        if (Csize==null){
            JOptionPane.showMessageDialog(null ,"File is not compressed");
        }
        else {
            
         try {
           
           java.io.File f = chooser.getSelectedFile();
           String filename = f.getAbsolutePath();
             System.out.println(filename);
           if (filename.equals("C:\\Users\\Kainat bangash\\Documents\\NetBeansProjects\\Project\\CSSample.txt")) {
                 filing file = new filing();
                TextArea.setText(file.ReadTextFile("CSSample.txt")) ;
           }
           else {
             JOptionPane.showMessageDialog(null ,"This is not the sample File");  
           }
     
     }
     catch(Exception e){
         System.out.println(e);
     }
        }
      
    }//GEN-LAST:event_DecodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Huffman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Huffman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Huffman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Huffman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Huffman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Csize;
    private javax.swing.JButton Decode;
    private javax.swing.JButton File;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton comp;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField size;
    // End of variables declaration//GEN-END:variables
}
