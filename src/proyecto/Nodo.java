/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author santi
 */
public class Nodo {
// 0,3
    private String dato;
    private Nodo siguiente;
    private double feromonas;
    int distancia;
    double acumulado;

    public Nodo(String pal, int d) {
        this.dato = pal;
        this.siguiente = null;
        this.feromonas = 0;
        this.distancia = d;
        this.acumulado = 0;

    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the feromonas
     */
    public double getFeromonas() {
        return feromonas;
    }

    /**
     * @param feromonas the feromonas to set
     */
    public void setFeromonas(double feromonas) {
        this.feromonas = feromonas;
    }
}
