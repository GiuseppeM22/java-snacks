package org.exercise.snack_6_bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Snack_6 {
//Scrivere un programma che dati dei secondi li converta in ore,
// minuti, secondi e mostri a video la stringa generata nel formato “hh:mm:ss”
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int secondiUtete = 0;

        //dato che int accetta un numero massimo di 2147483647, gestisco l'eccezzione InputMismatchException
        //in un try catch per evitare errori in console
        try {
            System.out.print("Inserisci un numero intero: ");
            secondiUtete = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Errore: Input non valido. Massimo valore accettato: 2147483647");
            scan.next();
        }

        int ore = secondiUtete / 3600;
        //Poiché ci sono 3600 secondi in un'ora, questo calcolo ci darà il numero di
        //secondi rimanenti dopo aver sottratto tutte le ore. dividendolo per 60 ne otterremo i minuti
        int minuti = (secondiUtete % 3600) / 60;
        int secondi = secondiUtete % 60;

        String tempoFormattato = String.format("%02d:%02d:%02d", ore, minuti, secondi);

        if(secondi > 0 || minuti > 0 || ore > 0){
            System.out.println(tempoFormattato);

        }


    }
}
