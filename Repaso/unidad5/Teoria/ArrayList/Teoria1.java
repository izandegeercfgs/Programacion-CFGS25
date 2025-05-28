package org.unidad5.Teoria.ArrayList;

import java.util.ArrayList;

public class Teoria1 {
    public static void ArrayLists() {
        ArrayList<String> listaPaises = new ArrayList<>();

        listaPaises.add("España");
        listaPaises.add("Portugal");
        listaPaises.add("Italia");
        // listaPaises -> España, Portugal, Italia

        listaPaises.add(1, "Francia");
        // listaPaises -> España, Francia, Portugal, Italia

        listaPaises.remove(2);
        // listaPaises -> España, Francia, Italia

        listaPaises.remove("Francia");
        // listapaises -> España, Italia

        for (int i = 0; i < listaPaises.size(); i++) {
            System.out.println(listaPaises.get(i));
        }

    }
}
