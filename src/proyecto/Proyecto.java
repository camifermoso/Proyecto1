/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class Proyecto {
//1
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo grafo = new Grafo(5);
        grafo.Insertar("1");
        grafo.Insertar("2");
        grafo.Insertar("3");
        grafo.Insertar("4");

        grafo.InsertarLista("2", "3", 3);
        grafo.InsertarLista("1", "4", 6);
        grafo.InsertarLista("1", "3", 7);
        
        grafo.Eliminar("2");

        grafo.Imprimir();
    }

}

