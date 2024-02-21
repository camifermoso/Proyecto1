package interfaz;

import java.awt.Color;


/**
 *
 * @author camilafermosoiglesias
 */

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        // No se habilitan los botones al iniciar el programa ya que es necesario cargar un grafo primero
        // para poder acceder a las siguientes opciones
       
        /*
        NuevaSimulacion.setEnabled(false);
        AgregarCiudad.setEnabled(false);
        EliminarCiudad.setEnabled(false);
        GuardarGrafo.setEnabled(false);
        */
        
        // en el boton, get nuevasimulacion
        // y que modifique a true
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        NuevaSimulacion = new javax.swing.JButton();
        AgregarCiudad = new javax.swing.JButton();
        EliminarCiudad = new javax.swing.JButton();
        GuardarGrafo = new javax.swing.JButton();
        CargarGrafo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        Exit.setBackground(new java.awt.Color(227, 31, 36));
        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 40, 30));

        NuevaSimulacion.setBackground(new java.awt.Color(255, 255, 255));
        NuevaSimulacion.setForeground(new java.awt.Color(0, 0, 0));
        NuevaSimulacion.setText("Nueva Simulación");
        NuevaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaSimulacionActionPerformed(evt);
            }
        });
        getContentPane().add(NuevaSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 30));

        AgregarCiudad.setBackground(new java.awt.Color(255, 255, 255));
        AgregarCiudad.setForeground(new java.awt.Color(0, 0, 0));
        AgregarCiudad.setText("Agregar Ciudad");
        AgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, 30));

        EliminarCiudad.setBackground(new java.awt.Color(255, 255, 255));
        EliminarCiudad.setForeground(new java.awt.Color(0, 0, 0));
        EliminarCiudad.setText("Eliminar Ciudad");
        EliminarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, 30));

        GuardarGrafo.setBackground(new java.awt.Color(255, 255, 255));
        GuardarGrafo.setForeground(new java.awt.Color(0, 0, 0));
        GuardarGrafo.setText("Guardar Grafo");
        GuardarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarGrafoActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, 30));

        CargarGrafo.setBackground(new java.awt.Color(255, 255, 255));
        CargarGrafo.setForeground(new java.awt.Color(0, 0, 0));
        CargarGrafo.setText("Cargar Grafo");
        CargarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarGrafoActionPerformed(evt);
            }
        });
        getContentPane().add(CargarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resizedhq.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void NuevaSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaSimulacionActionPerformed
        // NuevaSimulacion.setBackground(new java.awt.Color(5,5,5));
        NuevaSimulacion v2 = new NuevaSimulacion(this);
    }//GEN-LAST:event_NuevaSimulacionActionPerformed

    private void AgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCiudadActionPerformed
        AgregarCiudad v3 = new AgregarCiudad(this);
    }//GEN-LAST:event_AgregarCiudadActionPerformed

    private void EliminarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCiudadActionPerformed
       EliminarCiudad v4 = new EliminarCiudad(this);
    }//GEN-LAST:event_EliminarCiudadActionPerformed

    private void GuardarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarGrafoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarGrafoActionPerformed

    private void CargarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarGrafoActionPerformed
        CargarGrafo v5 = new CargarGrafo(this);
        
        //Aqui hay que poner que si se cargo un grafo, los otros botones se habilitan
    }//GEN-LAST:event_CargarGrafoActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCiudad;
    private javax.swing.JButton CargarGrafo;
    private javax.swing.JButton EliminarCiudad;
    private javax.swing.JButton Exit;
    private javax.swing.JButton GuardarGrafo;
    private javax.swing.JButton NuevaSimulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
   
   
    
}