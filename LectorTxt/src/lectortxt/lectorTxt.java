/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectortxt;
import javax.swing.*;
import java.io.File;


public class lectorTxt {



public void cargarTxt(){
        File archivoSelec;
        JFileChooser selecArchivo;
        selecArchivo = new JFileChooser();
        selecArchivo.showOpenDialog(null);
        archivoSelec = selecArchivo.getSelectedFile();
        JOptionPane.showMessageDialog(null, "El archivo seleccionado es " + archivoSelec + 
                   "\n y está ubicado en " + selecArchivo.getCurrentDirectory());
}

}
