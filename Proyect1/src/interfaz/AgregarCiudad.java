package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author camilafermosoiglesias
 * @version 1.9
 * @since 13-02-2024
 */

public class AgregarCiudad extends javax.swing.JFrame {

    public static Home v1;
    
    public AgregarCiudad(Home v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        BackHome2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreciudad = new javax.swing.JTextField();
        agregarciudad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        destino = new javax.swing.JComboBox<>();
        distancia = new javax.swing.JTextField();
        agregararista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NUEVA SIMULACIÓN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

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

        jLabel6.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGREGAR CIUDAD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        nombreciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreciudadKeyTyped(evt);
            }
        });
        getContentPane().add(nombreciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 170, -1));

        agregarciudad.setText("Agregar ciudad");
        agregarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarciudadActionPerformed(evt);
            }
        });
        getContentPane().add(agregarciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Destino:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Distancia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        distancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                distanciaKeyTyped(evt);
            }
        });
        getContentPane().add(distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 80, -1));

        agregararista.setText("Agregar arista");
        agregararista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregararistaActionPerformed(evt);
            }
        });
        getContentPane().add(agregararista, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

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

    private void nombreciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreciudadKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
             // Si el usuario intenta ingresar un valor que no sea un numero, se mostrara un mensaje indicandole que solo puede ingresar numeros
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
        }
    }//GEN-LAST:event_nombreciudadKeyTyped

    private void distanciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distanciaKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
             // Si el usuario intenta ingresar un valor que no sea un numero, se mostrara un mensaje indicandole que solo puede ingresar numeros
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
        }
    }//GEN-LAST:event_distanciaKeyTyped
    
    /**
     * 
     * @param onClickAction Agrega la ciudad
     */
    private void agregarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarciudadActionPerformed
        int ciudad = 0;
        ciudad = Integer.parseInt(nombreciudad.getText());
        
        // Cuando se haga click en este boton, queremos que quede en blanco la caja de texto
        nombreciudad.setText("");
    }//GEN-LAST:event_agregarciudadActionPerformed

    /**
     * 
     * @param onClickAction Agrega la arista de la ciudad
     */
    private void agregararistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregararistaActionPerformed
        int distanciadearista = 0;
        distanciadearista = Integer.parseInt(distancia.getText());
        
        distancia.setText("");
    }//GEN-LAST:event_agregararistaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCiudad(v1).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackHome2;
    private javax.swing.JButton Exit;
    private javax.swing.JButton agregararista;
    private javax.swing.JButton agregarciudad;
    private javax.swing.JComboBox<String> destino;
    private javax.swing.JTextField distancia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreciudad;
    // End of variables declaration//GEN-END:variables
}
