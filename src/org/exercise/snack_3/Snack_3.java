package org.exercise.snack_3;

import java.util.Arrays;

public class Snack_3 {
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
    public static void main(String[] args) {

        int[] numeri = new int[20];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = i + 1;
        }
        System.out.println(Arrays.toString(numeri));

        // Somma dei numeri in posizione dispari
        int sommaDispari = 0;
        for (int i = 0; i < numeri.length; i++) {
            if (i % 2 != 0) {
                sommaDispari += numeri[i];
            }
        }

        System.out.println("La somma dei numeri in posizioni dispari è: " + sommaDispari);
    }
}
