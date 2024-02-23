package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author camilafermosoiglesias
 * @version 1.9
 * @since 13-02-2024
 */

public class EliminarCiudad extends javax.swing.JFrame {

    public static Home v1;
    
    public EliminarCiudad(Home v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        BackHome2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ciudadaeliminar = new javax.swing.JTextField();
        eliminarciudad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGREGAR CIUDAD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        Exit.setBackground(new java.awt.Color(227, 31, 36));
        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 40, 30));

        BackHome2.setBackground(new java.awt.Color(0, 153, 255));
        BackHome2.setText("←");
        BackHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHome2ActionPerformed(evt);
            }
        });
        getContentPane().add(BackHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, -1));

        jLabel7.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ELIMINAR CIUDAD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ciudad que desea eliminar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 20));

        ciudadaeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadaeliminarActionPerformed(evt);
            }
        });
        ciudadaeliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciudadaeliminarKeyTyped(evt);
            }
        });
        getContentPane().add(ciudadaeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 150, -1));

        eliminarciudad.setText("Eliminar");
        eliminarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarciudadActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * @param text X
     * @param onClickAction Se cierra el programa
     */
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

     /**
     * 
     * @param text ←
     * @param onClickAction Volver a la ventana home (v1)
     */
    private void BackHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHome2ActionPerformed
        this.setVisible(false);
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }//GEN-LAST:event_BackHome2ActionPerformed

    private void ciudadaeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadaeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadaeliminarActionPerformed

    /**
     * 
     * @param onClickAction Eliminar la ciudad ingresada por el usuario
     */
    private void eliminarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarciudadActionPerformed
        int ciudad = 0;
        ciudad = Integer.parseInt(ciudadaeliminar.getText());
        
        ciudadaeliminar.setText("");
    }//GEN-LAST:event_eliminarciudadActionPerformed
     
    /**
     * 
     * @throws IllegalArgumentException Si el texto ingresado por el usuario no es un numero
     */
    private void ciudadaeliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciudadaeliminarKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
             // Si el usuario intenta ingresar un valor que no sea un numero, se mostrara un mensaje indicandole que solo puede ingresar numeros
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
        }
    }//GEN-LAST:event_ciudadaeliminarKeyTyped

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
            java.util.logging.Logger.getLogger(EliminarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarCiudad(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackHome2;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField ciudadaeliminar;
    private javax.swing.JButton eliminarciudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
