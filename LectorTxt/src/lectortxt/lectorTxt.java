
package lectortxt;
/**
 *Clase lectorTxt que tiene las funciones leerTxt, cargar Txt y EscribirTxt
 * @author Diego Oliveros
 * @version 22/02/23
 */


import java.io.*;
import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.*; //si no lo importo directamente salta un error
public class lectorTxt {

/**
 *cargarTxt busca entre los archivos del equipo los archivos con la extension txt
 * @author Diego Oliveros
 * @version 22/02/23
 * @return el archivo seleccionado por el usuario
 */


public File cargarTxt() throws Exception{
    // inicializamos el filtro para la busqueda de archivos
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("archivos txt", "txt");
    //inicializamos las variables para el archivo y el selector
    File archivoSelec;
    JFileChooser selecArchivo;
    selecArchivo = new JFileChooser();
    selecArchivo.setFileFilter(filtro); //Inicia el proceso de busqueda de archivos con el filtro
    selecArchivo.showOpenDialog(null);
    archivoSelec = selecArchivo.getSelectedFile();
    

    if (archivoSelec.getName().endsWith("txt")){
        JOptionPane.showMessageDialog(null, "El archivo seleccionado es " + archivoSelec + 
                   "\n y está ubicado en " + selecArchivo.getCurrentDirectory());
        return archivoSelec; //retorna el archivo seleccionado para usarlo en el lector
    }else{
        throw new Exception("El archivo seleccionado no es un txt");
    }
}


/**
 *leerTxt lee el archivo seleccionado por el usuario y almacena la canridad de ciudades y las aristas
 * @author Diego Oliveros
 * @version 22/02/23
 * @return la cantidad de ciudades y las aristas
 */

public String leerTxt() throws Exception{
    
    int ciudades = 0;
    try{
    Object[] lineas;
    String cadena;

    
    FileReader archivo;
    BufferedReader lector;
    File txt = this.cargarTxt();
    archivo = new FileReader(txt);
    lector = new BufferedReader(archivo);
    
    while((cadena= lector.readLine()) != null){
        System.out.println(cadena);
    }
    
    /**
     * lo transforma en un array, va aumentando la variable ciudades hasta que llega a la parte de aristas
    lineas = lector.lines().toArray();// convierte el txt en un array
    for (int i = 1; i < 10 ; i++) { // si cambias el 10 por lineas.length ciudades triplica su valor
        if (!lineas[i].equals("")) {
            ciudades++;
            System.out.println(ciudades);
        } else if (lineas.equals("aristas")){
            System.out.println(lineas[i]);
            }
    }   **/
                
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error" + e);
    }
     return String.valueOf(ciudades);
}

/**
 *EscribirTxt valida los datos de la simulacion y sobreescribe el grafo para guardar los nuevos datos
 * @author 
 * @version 23/02/23
 * @return el txt con los nuevos datos
 */

/**
public File EscribirTxt(){
    
    return null;
    
}**/ 
}
