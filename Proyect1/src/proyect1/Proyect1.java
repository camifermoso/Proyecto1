package proyect1;

// Importar Interfaz
import interfaz.Home;
import interfaz.NuevaSimulacion;

/**
 *
 * @author camilafermosoiglesias
 */
public class Proyect1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Interfaz Grafica
    // Inicializar Ventanas
    Home ventana = new Home();
    ventana.setVisible(true);
    
    NuevaSimulacion ventana2 = new NuevaSimulacion();
    ventana2.setVisible(true);
    }
    
}
