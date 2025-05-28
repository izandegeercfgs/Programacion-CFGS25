package org.example;

import java.util.*;

public class Ordenaciones {
    public static void main(String[] args) {

        List<String> listaCiudades = new ArrayList<>(Arrays.asList("Alicante", "Valencia", "Benidorm", "Albatera"));
        // Collections.sort(listaCiudades,(a,b) -> a.compareTo(b));

        listaCiudades.sort(Comparator.comparing(s -> s));
        System.out.println(listaCiudades);


    }
}
