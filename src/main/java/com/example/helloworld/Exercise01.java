package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos,
//  aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
// Map<Integer, String> nombreMap = new HashMap<Integer, String>();
// nombreMap.size(); // Devuelve el numero de elementos del Map
// nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
// nombreMap.put(K clave, V valor); // Añade un elemento al Map
// nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
// nombreMap.clear(); // Borra todos los componentes del Map
// nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
// nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
// nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
// nombreMap.values(); // Devuelve una "Collection" con los valores del Map

public class Exercise01 {
    // 'LinkedHashMap' respects the order of the objects
    // 'HashMap' use random order for his objects
    static Map<String, Integer> grades = new LinkedHashMap<String, Integer>();

    static List<Integer> listNumbers = new ArrayList<>(List.of(4, 2, 3, 7, 8, 1, 6));

    public static void main(String[] args) {
        grades.put("A", 90);
        grades.put("B", 80);
        grades.put("C", 70);
        grades.put("D", 60);
        grades.put("E", 50);

        System.out.println(getGrade(100));
    }

    public static String getGrade(int score) {
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

        // Da 50 a 59 -> "E"

        // Sotto 50 -> "F"

        // Se il voto non è compreso tra 0 e 100 -> "Invalid"

        // Mettilo alla prova nel main con qualche numero!
        if (score > 100 || score < 0)
            return "Invalid";

        for (String grade : grades.keySet()) {
            if (score >= grades.get(grade)) {
                return grade;
            }
        }

        return "F";
    }

    public static int findMissingNumber(int[] numbers) {
        // Crea una
        // funzione che
        // riceva un
        // array di

        // numeri interi (int[]). L'array contiene numeri consecutivi da 1 a $N$, ma uno
        // di essi manca. La funzione deve trovare e restituire il numero mancante.
        int lowerNumber = Collections.min(listNumbers);
        List<Integer> sortedList = new ArrayList<>(listNumbers);
        Collections.sort(sortedList);
        // int lowerNumber = sortedList.get(0);

        for (int num : listNumbers) {

        }
        return 0;
    }
}
