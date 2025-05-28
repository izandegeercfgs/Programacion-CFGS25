public class solution_6 { // Asume fichero llamado solution.java

    static java.util.Scanner teclado;

    public static void casoDePrueba() {

        // TU CÓDIGO AQUÍ
        String cadena = teclado.next();

        String[] Array_cadena = cadena.split("");

        int contador = 0;

        for (int i = 0; i < Array_cadena.length; i++) {
            if (Array_cadena[i].equals("a") || Array_cadena[i].equals("e") || Array_cadena[i].equals("i") || Array_cadena[i].equals("o") || Array_cadena[i].equals("u")){
                contador++;
            }
        }

        int consonantes = (Array_cadena.length - contador);
        int operacion = (Array_cadena.length + 1) / 2;

        if (consonantes > operacion){

        }

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new java.util.Scanner(System.in);

        int numCasos = teclado.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution