/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 * @Descripcion 
 * @author Santiago
 * @param 
 * @retorna 
 * @see
 * @version 23/02/2024
 */
public class Nodo {
// 0,3,4
    private String dato;
    private Nodo siguiente;
    private double feromonas;
    private double distancia;
    private double acumulado;

    public Nodo(String pal, double d) {
        this.dato = pal;
        this.siguiente = null;
        this.feromonas = 1/4;
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

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the acumulado
     */
    public double getAcumulado() {
        return acumulado;
    }

    /**
     * @param acumulado the acumulado to set
     */
    public void setAcumulado(double acumulado) {
        this.acumulado = acumulado;
    }
}
