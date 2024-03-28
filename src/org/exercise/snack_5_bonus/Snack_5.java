package org.exercise.snack_5_bonus;

import java.util.Scanner;

public class Snack_5 {
//Data una stringa in input mostrare a video quanti caratteri alfabetici contiene,
//quanti numeri e quanti simboli non alfanumerici.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = scan.nextLine();

        //inizializzo le variabili a 0 per aumentarle nel ciclo
        int caratteriAlfabetici = 0;
        int numeri = 0;
        int simboliNonAlfanumerici = 0;

        //ciclo sulla parola ricevuta
        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);
            if (Character.isLetter(carattere)) {
                caratteriAlfabetici++;
            } else if (Character.isDigit(carattere)) {
                numeri++;
            } else {
                simboliNonAlfanumerici++;
            }
        }

        System.out.println("Caratteri alfabetici: " + caratteriAlfabetici);
        System.out.println("Numeri: " + numeri);
        System.out.println("Simboli non alfanumerici: " + simboliNonAlfanumerici);
    }

}
