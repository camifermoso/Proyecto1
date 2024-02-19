package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author camilafermosoiglesias
 */
public class helpers {
    public static int validarNumero(String numString){
        int num;
        
        try{
            num = Integer.parseInt(numString);
            return num;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error, el input no es un numero");
        }
        return 0;
    }
}
