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
//3
    public Lista buscar(String nombre) {
        for (int i = 0; i < this.maximo; i++) {
            if (this.vertices[i].primero.getDato().equals(nombre)) {
                return this.vertices[i];
            }
        }
        return null;
    }

//2,3 
//    public int ciuDisponibles(int posicion, boolean[] visitados) {
//        int m = 0;
//        for (int i = 0; i < this.maximo; i++) {
//            if (i != posicion && !visitados[i] && this.vertices[posicion].Buscar(this.vertices[i].primero.getDato())) {
//                m += 1;
//            }
//        }
//        return m;
//    }
//2,3 
    public double Sumatoria(int posicion, boolean[] visitados, int alpha, int beta) {
        double T = 1;
        double sum = 0;
        for (int i = 0; i < this.maximo; i++) {
            if (i != posicion && !visitados[i] && this.vertices[posicion].Buscar(this.vertices[i].primero.getDato())) {
                sum += Math.pow(1 / this.vertices[posicion].Buscar2(this.vertices[i].primero.getDato()).getFeromonas(), alpha) * Math.pow(1 / this.vertices[posicion].Buscar2(this.vertices[i].primero.getDato()).distancia, beta);
            }
        }
        return sum;

    }

//2,3
    public double calcularProb(int posicion, boolean[] visitados, int posicion2, int alpha, int beta) {
        double sumatoria = this.Sumatoria(posicion, visitados, alpha, beta);
        return Math.pow(1 / this.vertices[posicion].Buscar2(this.vertices[posicion2].primero.getDato()).getFeromonas(), alpha) * Math.pow(1 / this.vertices[posicion].Buscar2(this.vertices[posicion2].primero.getDato()).distancia, beta) / sumatoria;
    }
//2,3 

    public void Recorrer(Hormiga h, int posicion, boolean[] visitados, int alpha, int beta) {
        visitados[posicion] = true;
        h.recorrido += this.vertices[posicion].primero.getDato() + ",";
        Random r = new Random();
        double randomnum = r.nextDouble();
        double probAcumulada = 0;
        if (posicion != this.ultima) {
            for (int i = 0; i < this.maximo; i++) {
                if (i != posicion && !visitados[i] && this.vertices[posicion].Buscar(this.vertices[i].primero.getDato())) {
                    probAcumulada += this.calcularProb(posicion, visitados, i, alpha, beta);
                }
                if (probAcumulada > randomnum) {
                    h.distancia += this.vertices[posicion].Buscar2(this.vertices[i].primero.getDato()).distancia;
                    this.Recorrer(h, i, visitados, alpha, beta);
                }

            }
        }
    }
//2,3

    public Hormiga Profundidad(int alpha, int beta) {
        boolean visitados[] = new boolean[maximo];
        Hormiga h = new Hormiga();
        for (int i = 0; i < this.maximo; i++) { //inicializar vector con campos false
            visitados[i] = false;
        }
        for (int i = 0; i < this.maximo; i++) { //Relanza el recorrido en cada
            if (!visitados[i]) { //vértice visitado
                Recorrer(h, i, visitados, alpha, beta);
            }
        }
        return h;
    }
//3
    public void iniciarFeromonas() {
        for (int i = 0; i < this.maximo; i++) {
            Nodo aux = this.vertices[i].primero;
            if (aux != null) {
                aux = aux.getSiguiente();
                while (aux != null) {
                    aux.setFeromonas(1 / this.cantidad);
                    aux.acumulado = 0;
                    aux = aux.getSiguiente();
                }
            }
        }
    }
//3
    public void actualizarAcumuladoFeromonas(Hormiga h) {
        String[] ciudades = h.recorrido.split(",");
        for (int i = 0; i < ciudades.length; i++) {
            if (i + 1 < ciudades.length) {
                this.buscar(ciudades[i]).Buscar2(ciudades[i + 1]).acumulado += 1 / h.distancia;
                this.buscar(ciudades[i + 1]).Buscar2(ciudades[i]).acumulado += 1 / h.distancia;
            }
        }
    }
}
