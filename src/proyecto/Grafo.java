/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class Grafo {

    int maximo;
    int cantidad;
    Lista[] vertices;
    int primero;
    int ultima;

    public Grafo(int max) {
        this.maximo = max;
        this.cantidad = 0;
        this.vertices = new Lista[max];
        int primero = 0;
        ultima = 0;
        for (int i = 0; i < max; i++) {
            this.vertices[i] = new Lista();
        }
    }
//0,1

    public void Insertar(String dato) {
        Nodo nuevo = new Nodo(dato, 0);
        if (this.cantidad < 20) {

            if (this.cantidad != this.maximo) {
                for (int i = 0; i < this.maximo; i++) {
                    if (this.vertices[i].primero == null) {

                        this.vertices[i].InsertarFinal(nuevo);
                        break;
                    }
                }

                this.cantidad++;
            } else {
                Lista[] nueva = new Lista[maximo + 1];
                for (int i = 0; i < this.maximo; i++) {
                    nueva[i].InsertarFinal(this.vertices[i].primero);
                }
                nueva[maximo].InsertarFinal(nuevo);
                this.vertices = nueva;
                this.cantidad++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Haz llegado a la maxia cantidad de ciudades");
        }
    }
//0,1

    public void Eliminar(String dato) {
        if (this.cantidad != 0) {
            for (int i = 0; i < this.maximo; i++) {
                if (this.vertices[i].primero != null && this.vertices[i].primero.getDato().equals(dato)) {
                    this.vertices[i].primero = null;
                    this.cantidad--;
                } else {
                    this.vertices[i].EliminarGeneral(dato);
                }

            }
        }
    }
//0,1

    public void InsertarLista(String dato, String dato2, int dist) {
        if (this.cantidad != 0) {
            for (int i = 0; i < this.maximo; i++) {
                if (this.vertices[i].primero != null && this.vertices[i].primero.getDato().equals(dato)) {
                    this.vertices[i].InsertarFinal(new Nodo(dato2, dist));
                } else if (this.vertices[i].primero != null && this.vertices[i].primero.getDato().equals(dato2)) {
                    this.vertices[i].InsertarFinal(new Nodo(dato, dist));
                }

            }
        }
    }
//1

    public String Imprimir() {
        String lista = "";
        if (this.cantidad != 0) {
            for (int i = 0; i < this.maximo; i++) {
                lista += this.vertices[i].ImprimirLista() + "\n";
            }
        }
        System.out.println(lista);
        return lista;
    }

//2 
    public int ciuDisponibles(int posicion, boolean[] visitados) {
        int m = 0;
        for (int i = 0; i < this.maximo; i++) {
            if (i != posicion && !visitados[i] && this.vertices[posicion].Buscar(this.vertices[i].primero.getDato())) {
                m += 1;
            }
        }
        return m;
    }

//2 
    public double Sumatoria(int posicion, boolean[] visitados) {
        double T = 1 / this.ciuDisponibles(maximo, visitados);
        double sum = 0;
        for (int i = 0; i < this.maximo; i++) {
            if (i != posicion && !visitados[i] && this.vertices[posicion].Buscar(this.vertices[i].primero.getDato())) {
                sum+= 1/T * 1/ this.vertices[posicion].Buscar2(this.vertices[i].primero.getDato()).distancia;
            }
        }
        return sum;

    }

//2
//    public double calcularProb() {
//
//    }
////2 
//
//    public String Recorrer(String recorrido, int posicion, boolean[] visitados) {
//        visitados[posicion] = true;
//        Random r = new Random();
//        double randomnum = r.nextDouble();
//        for (int i = 0; i < this.maximo; i++) {
//            if (i != posicion && !visitados[i] && this.vertices[posicion].Buscar(this.vertices[i].primero.getDato())) {
//                double prob = this.calcularProb();
//            }
//            if (prob > randomnum) {
//                this.Recorrer(recorrido, i, visitados);
//            }
//
//        }
//    }
////2
//
//    public String Profundidad() {
//        boolean visitados[] = new boolean[maximo];
//
//        for (int i = 0; i < this.maximo; i++) { //inicializar vector con campos false
//            visitados[i] = false;
//        }
//        for (int i = 0; i < this.maximo; i++) { //Relanza el recorrido en cada
//            if (!visitados[i]) { //vértice visitado
//                Recorrer("", i, visitados);
//            }
//        }
//
//    }
}