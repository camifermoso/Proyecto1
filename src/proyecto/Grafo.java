/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

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
        }}
        else{
                JOptionPane.showMessageDialog(null, "Haz llegado a la maxia cantidad de ciudades");
                }
    }

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
    
////    public String Recorrer(String recorrido, int posicion){
////        
////        for (int i = 0; i < this.maximo; i++) {
////            if(this.vertices[posicion].Buscar(this.vertices[i].primero.getDato())){
////                this.vertices[i];
////            }
////        }
//    }
}
