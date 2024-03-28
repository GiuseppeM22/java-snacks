package org.exercise.snack_4;

import java.util.Scanner;

public class Snack_4 {
    // Data in input una stringa verificare se è palindroma
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parolaUtente = scan.nextLine();

        // Converto la stringa in un array di caratteri
        char[] parolaArray = parolaUtente.toCharArray();

        // Inizializzo un array di caratteri vuoto della stessa lunghezza della parola
        char[] reverseArray = new char[parolaArray.length];

        // Copio la parola invertita nell'array appena creato
        for (int i = 0; i < parolaArray.length; i++) {
            reverseArray[i] = parolaArray[parolaArray.length - 1 - i];
        }

        // ricreo una stringa dall'array invertito
        String parolaUtenteReverse = new String(reverseArray);

        // Verifica palindromo
        if (parolaUtente.equalsIgnoreCase(parolaUtenteReverse)) {
            System.out.println("La parola inserita è palindroma.");
        } else {
            System.out.println("La parola inserita non è palindroma.");
        }
    }
}
