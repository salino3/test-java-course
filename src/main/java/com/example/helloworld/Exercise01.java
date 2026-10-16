package com.example.helloworld;

public class Exercise01 {
    public static void main(String[] args) {

        System.out.println(getGrade(90));
    }
    // Esercizio:
    // Ecco un
    // esercizio rapido
    // e mirato.
    // Crea una
    // funzione in
    // inglese che
    // riceva un

    // voto numerico (int) e restituisca il giudizio

    // in lettere (String).

    // Regole:
    // Da 90 a 100 -> "A"

    // Da 80 a 89 -> "B"

    // Da 70 a 79 -> "C"

    // Da 60 a 69 -> "D"

    // Sotto 60 -> "F"

    // Se il voto non è compreso tra 0 e 100 -> "Invalid"

    // Mettilo alla prova nel main con qualche numero!

    public static String getGrade(int score) {
        if (score > 100 || score < 0)
            return "Invalid";
        else
            return "-";
    }
}
