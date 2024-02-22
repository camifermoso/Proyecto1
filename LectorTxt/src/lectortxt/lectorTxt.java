/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectortxt;
import java.io.*;
import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.*; //si no lo importo directamente salta un error
public class lectorTxt {



public File cargarTxt(){
    
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("archivos txt", "txt");
    File archivoSelec;
    JFileChooser selecArchivo;
    selecArchivo = new JFileChooser();
    selecArchivo.setFileFilter(filtro);
    selecArchivo.showOpenDialog(null);
    archivoSelec = selecArchivo.getSelectedFile();
    JOptionPane.showMessageDialog(null, "El archivo seleccionado es " + archivoSelec + 
                   "\n y está ubicado en " + selecArchivo.getCurrentDirectory());
    return archivoSelec;
    
}
public String leerTxt(){
    
    FileReader archivo;
    BufferedReader lector;
    String cadena = "";
    int i = 0;
    String []ciudades = new String[21];
    
    File txt = this.cargarTxt();
        try{
            archivo = new FileReader(txt);
            if (archivo.ready()){
                lector = new BufferedReader(archivo);
                while ((cadena = lector.readLine()) != null){
                    System.out.println(cadena);
                }
            }
            for (int j = 0; j < 10; j++) {
                System.out.println(ciudades[i]);
                
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    
    
    return null;
}
}
