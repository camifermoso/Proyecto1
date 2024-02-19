/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author santi
 */
public class Lista {

    Nodo primero;
    int tamano;

    public Lista() {
        this.primero = null;
        this.tamano = 0;

    }

    public void InsertarPrimero(Nodo nuevo) {

        if (this.primero == null) {
            this.primero = nuevo;
            tamano++;
        } else {
            nuevo.setSiguiente(this.primero);
            this.primero = nuevo;
            tamano++;
        }
    }

    public void InsertarFinal(Nodo nuevo) {

        if (this.primero == null) {
            this.InsertarPrimero(nuevo);
        } else {
            Nodo aux = this.primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            tamano++;
        }
    }

    public void EliminarGeneral(String dato) {
        if (this.primero != null) {

            Nodo aux = this.primero;
            if (aux.getDato() == dato) {
                this.primero = aux.getSiguiente();
                tamano--;
            } else {

                while (aux.getSiguiente() != null && aux.getSiguiente().getDato() != dato) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() != null) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    tamano--;
                }
            }

        }
    }

    public Nodo FeromonasMax() {
        if (this.primero != null) {
            Nodo aux = this.primero;
            Nodo mayor = this.primero;
            while (aux != null) {
                if (mayor.getFeromonas() < aux.getFeromonas() ) {
                    mayor = aux;
                }
                aux = aux.getSiguiente();
            }
            return mayor;
        }
        return null;    
    }
}
