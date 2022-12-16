/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pila;

/**
 *
 * @author abela
 */
public class Pila {

    public static void main(String[] args) {
    private int tope = -1;
    private Nodo inicio;

    public boolean EMPTY() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }

    }
    public void PUSH(int valor, String nombre, String promedioVida, String tamanoPromedio, String habitad) {

        Nodo nuevo = new Nodo(valor, nombre, promedioVida, tamanoPromedio, habitad);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo act = inicio;
            while (act.getSig() != null) {
                act = act.getSig();
            }
            act.setSig(nuevo);
        }
        tope++;

    }

    public int Check() {
        return tope + 1;
    }

    public int Pop() {
        if (!EMPTY()) {
            Nodo act = inicio;
            Nodo ant = null;

            while (act.getSig() != null) {
                ant = act;
                act = act.getSig();
            }
            int valor = act.getValor();
            if (inicio.getSig() == null) {
                inicio = inicio.getSig();
            } else {
                ant.setSig(act.getSig());
            }
            tope--;
            return valor;
        } else {
            System.out.println("La pila esta vacia");
            return -1;
        }
    }

    public void Imprimir() {
        if (!EMPTY()) {
            Nodo act = inicio;
            while (act != null) {

                System.out.print(+act.getValor() + ".- ");
                System.out.println("\t********** " + act.nombre + " **********");
                System.out.println("Promedio de vida:\t" + act.promedioVida);
                System.out.print("TamaÃ±o promedio: \t" + act.tamanoPromedio + "\n");
                System.out.println("Habitat: \t" + act.habitad);
                System.out.println("\t*************************************");
                act = act.getSig();
            }
        } else {
            System.out.println("La pila esta vacia");
        }
    }
}

