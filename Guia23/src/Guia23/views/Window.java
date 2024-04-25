/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Guia23.views;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author alvar
 */
public class Window extends javax.swing.JFrame {
    JLabel etiTexto;
    JLabel etiZona;

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        CreacionVentana();
        
    }
    public void CreacionVentana(){
        
        this.setTitle("Programación de eventos de ratón");
        this.setSize(400,400);
        this.setLocation(100, 100);
        
        etiTexto = new JLabel();
        etiTexto.setBounds(50,10,300,250);
        etiTexto.setText("---");
        this.getContentPane().add(etiTexto);
        
        etiZona = new JLabel();
        etiZona.setBounds(50,50,300,250);
        etiZona.setText("");
        etiZona.setOpaque(true);
        etiZona.setBackground(Color.RED);
        this.getContentPane().add(etiZona);
        
        etiZona.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent evt) {
            etiZonaMouseEntered(evt);
        }

        public void mouseExited(MouseEvent evt){
            etiZonaMouseExited(evt);
        }

        public void mousePressed(MouseEvent evt){
            etiZonaMousePressed(evt);
        }
    });
        
    }
    
    public void etiZonaMouseEntered(MouseEvent evt) {
        etiTexto.setText("EL ratón acaba de entrar a la etiqueta");
    }
    
    public void etiZonaMouseExited(MouseEvent evt){
        etiTexto.setText("El ratón acaba de salir de la etiqueta");
    }
    
    public void etiZonaMousePressed(MouseEvent evt){
        if(evt.getButton()==MouseEvent.BUTTON1){
                etiTexto.setText("Se acaba de pulsar el botón izquierdo");
            } else if(evt.getButton()==MouseEvent.BUTTON2){
                etiTexto.setText("Se acaba de pulsar el botón central");
            } else if(evt.getButton()==MouseEvent.BUTTON3){
                etiTexto.setText("Se acaba de pulsar el botón derecho");
            }    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
