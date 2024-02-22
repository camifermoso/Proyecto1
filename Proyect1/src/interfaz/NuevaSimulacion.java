package interfaz;

import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author camilafermosoiglesias
 */

public class NuevaSimulacion extends javax.swing.JFrame {

    public static Home v1;
    
    public NuevaSimulacion(Home v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        // La opcion para insertar las constantes no se debe mostrar inicialmente
        valor1.setVisible(false);
        valor1box.setVisible(false);
        valor2.setVisible(false);
        valor2box.setVisible(false);
        valor3.setVisible(false);
        valor3box.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Exit = new javax.swing.JButton();
        BackHome = new javax.swing.JButton();
        BackHome1 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numciclos = new javax.swing.JTextField();
        numhormigas = new javax.swing.JTextField();
        ciudadpartida = new javax.swing.JTextField();
        ciudadllegada = new javax.swing.JTextField();
        Listo = new javax.swing.JButton();
        Exit2 = new javax.swing.JButton();
        BackHome2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        constantes = new javax.swing.JComboBox<>();
        valor1 = new javax.swing.JLabel();
        valor1box = new javax.swing.JTextField();
        valor2 = new javax.swing.JLabel();
        valor2box = new javax.swing.JTextField();
        valor3 = new javax.swing.JLabel();
        valor3box = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        Exit.setBackground(new java.awt.Color(0, 153, 255));
        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        BackHome.setBackground(new java.awt.Color(0, 153, 255));
        BackHome.setText("←");
        BackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHomeActionPerformed(evt);
            }
        });

        BackHome1.setBackground(new java.awt.Color(0, 153, 255));
        BackHome1.setText("←");
        BackHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHome1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número de ciclos a realizar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Número de hormigas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 20));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ciudad de partida:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, 20));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ciudad de llegada:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 20));

        numciclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numciclosActionPerformed(evt);
            }
        });
        numciclos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numciclosKeyTyped(evt);
            }
        });
        getContentPane().add(numciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 170, -1));

        numhormigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numhormigasActionPerformed(evt);
            }
        });
        numhormigas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numhormigasKeyTyped(evt);
            }
        });
        getContentPane().add(numhormigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 170, -1));

        ciudadpartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadpartidaActionPerformed(evt);
            }
        });
        ciudadpartida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciudadpartidaKeyTyped(evt);
            }
        });
        getContentPane().add(ciudadpartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 170, -1));

        ciudadllegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadllegadaActionPerformed(evt);
            }
        });
        ciudadllegada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciudadllegadaKeyTyped(evt);
            }
        });
        getContentPane().add(ciudadllegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 170, -1));

        Listo.setBackground(new java.awt.Color(227, 31, 36));
        Listo.setText("Listo");
        Listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListoActionPerformed(evt);
            }
        });
        getContentPane().add(Listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        Exit2.setBackground(new java.awt.Color(227, 31, 36));
        Exit2.setText("X");
        Exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit2ActionPerformed(evt);
            }
        });
        getContentPane().add(Exit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 40, 30));

        BackHome2.setBackground(new java.awt.Color(0, 153, 255));
        BackHome2.setText("←");
        BackHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHome2ActionPerformed(evt);
            }
        });
        getContentPane().add(BackHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, -1));

        jLabel5.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NUEVA SIMULACIÓN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Constantes (α, β, ρ):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 20));

        constantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por defecto", "Ingresar valores" }));
        constantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constantesActionPerformed(evt);
            }
        });
        getContentPane().add(constantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        valor1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        valor1.setForeground(new java.awt.Color(0, 0, 0));
        valor1.setText("α:");
        getContentPane().add(valor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 20, -1));

        valor1box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1boxActionPerformed(evt);
            }
        });
        valor1box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valor1boxKeyTyped(evt);
            }
        });
        getContentPane().add(valor1box, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 80, -1));

        valor2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        valor2.setForeground(new java.awt.Color(0, 0, 0));
        valor2.setText("β:");
        getContentPane().add(valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 20, -1));

        valor2box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2boxActionPerformed(evt);
            }
        });
        valor2box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valor2boxKeyTyped(evt);
            }
        });
        getContentPane().add(valor2box, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 70, -1));

        valor3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        valor3.setForeground(new java.awt.Color(0, 0, 0));
        valor3.setText("ρ:");
        getContentPane().add(valor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 20, -1));

        valor3box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor3boxActionPerformed(evt);
            }
        });
        valor3box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valor3boxKeyTyped(evt);
            }
        });
        getContentPane().add(valor3box, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 80, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void Exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit2ActionPerformed

    private void numciclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numciclosActionPerformed
        //Se usa esta funcion para que la entrada por parte del usuario solo pueda ser un numero
        
    }//GEN-LAST:event_numciclosActionPerformed

    private void numhormigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numhormigasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numhormigasActionPerformed

    private void ciudadpartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadpartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadpartidaActionPerformed

    private void ciudadllegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadllegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadllegadaActionPerformed

    private void ListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListoActionPerformed
        // Cuando este boton sea presionado, queremos que todos los campos de texto se vacien
        numciclos.setText("");
        numhormigas.setText("");
        valor1box.setText("");
        valor2box.setText("");
        valor3box.setText("");
        ciudadpartida.setText("");
        ciudadllegada.setText("");
        
        // Tambien se vuelve a poner las constantes en por defecto
        valor1.setVisible(false);
        valor1box.setVisible(false);
        valor2.setVisible(false);
        valor2box.setVisible(false);
        valor3.setVisible(false);
        valor3box.setVisible(false);
    }//GEN-LAST:event_ListoActionPerformed

    private void BackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHomeActionPerformed
        this.setVisible(false);
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }//GEN-LAST:event_BackHomeActionPerformed

    private void BackHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHome1ActionPerformed
        this.setVisible(false);
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }//GEN-LAST:event_BackHome1ActionPerformed

    private void BackHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHome2ActionPerformed
        this.setVisible(false);
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }//GEN-LAST:event_BackHome2ActionPerformed

    private void constantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constantesActionPerformed
        // Solo si el usuario selecciona la opcion para ingresar los valores de las constantes, deben aparecer
        // los espacios para ello

        if (constantes.getSelectedIndex() == 1){
            valor1.setVisible(true);
            valor1box.setVisible(true);
            valor2.setVisible(true);
            valor2box.setVisible(true);
            valor3.setVisible(true);
            valor3box.setVisible(true);
        } else {
            valor1.setVisible(false);
            valor1box.setVisible(false);
            valor2.setVisible(false);
            valor2box.setVisible(false);
            valor3.setVisible(false);
            valor3box.setVisible(false);
            }
    }//GEN-LAST:event_constantesActionPerformed

    private void valor1boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor1boxActionPerformed

    private void valor2boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor2boxActionPerformed

    private void valor3boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor3boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor3boxActionPerformed

    private void numciclosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numciclosKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
            // Si el usuario intenta ingresar un valor que no sea un numero, se mostrara un mensaje indicandole que solo puede ingresar numeros
            JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
        }
    }//GEN-LAST:event_numciclosKeyTyped

    private void numhormigasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numhormigasKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_numhormigasKeyTyped

    private void valor1boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valor1boxKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_valor1boxKeyTyped

    private void valor2boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valor2boxKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_valor2boxKeyTyped

    private void valor3boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valor3boxKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_valor3boxKeyTyped

    private void ciudadpartidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciudadpartidaKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_ciudadpartidaKeyTyped

    private void ciudadllegadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciudadllegadaKeyTyped
        // De este modo el usuario solo va a poder ingresar numeros    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <=57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_ciudadllegadaKeyTyped
    
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
            java.util.logging.Logger.getLogger(NuevaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaSimulacion(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackHome;
    private javax.swing.JButton BackHome1;
    private javax.swing.JButton BackHome2;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit2;
    private javax.swing.JButton Listo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JTextField ciudadllegada;
    private javax.swing.JTextField ciudadpartida;
    private javax.swing.JComboBox<String> constantes;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numciclos;
    private javax.swing.JTextField numhormigas;
    private javax.swing.JLabel valor1;
    private javax.swing.JTextField valor1box;
    private javax.swing.JLabel valor2;
    private javax.swing.JTextField valor2box;
    private javax.swing.JLabel valor3;
    private javax.swing.JTextField valor3box;
    // End of variables declaration//GEN-END:variables
}
