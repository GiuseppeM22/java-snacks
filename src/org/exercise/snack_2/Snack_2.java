package org.exercise.snack_2;

import java.util.Random;

public class Snack_2 {
//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
//e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome
    public static void main(String[] args) {
        String[] nomi = {"Albert", "Marie", "Isaac", "Leonardo", "Charles"};
        String[] cognomi = {"Einstein", "Curie", "Newton", "da Vinci", "Darwin"};

        //falsa lista di invitati
        Random random = new Random();
        System.out.println("Falsa lista di invitati:");

        for (int i = 0; i < nomi.length; i++) {
            String nome = nomi[random.nextInt(nomi.length)];
            String cognome = cognomi[random.nextInt(cognomi.length)];
            System.out.println((i + 1) + ". " + nome + " " + cognome);
        }

    }
}
