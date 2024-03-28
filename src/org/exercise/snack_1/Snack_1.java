package org.exercise.snack_1;
import java.util.Arrays;
import java.util.Scanner;

public class Snack_1 {
//Chiedi all’utente di continuare ad inserire un numero pari compreso tra 10 e 20.
//Se il numero non corrisponde alla richiesta continuare a chiederlo fino a che non viene inserito un numero valido.
    public static void main(String[] args) {
        int[] numeri = new int[11];

        // Riempimento dell'array con valori da 10 a 20
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = i + 10;
        }
        System.out.println("Array numeri: " + Arrays.toString(numeri));

        Scanner scan = new Scanner(System.in);

        boolean numeroTrovato = false;

        // finche il numero non viene trovato rimaniamo nel while
        while (!numeroTrovato) {
            System.out.print("Digita un numero da 10 a 20: ");
            int numeroUtente = scan.nextInt();

            for (int numero : numeri) {
                if (numero == numeroUtente) {
                    numeroTrovato = true;
                    break;
                }
            }

            if (numeroTrovato) {
                System.out.println("Il numero inserito è presente nell'array.");
            } else {
                System.out.println("Il numero inserito non è presente nell'array. Prova di nuovo.");
            }
        }

    }
}
