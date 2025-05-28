package org.unidad5;

import java.util.Random;
import java.util.Scanner;

public class Bateria1 {
    // Metodo en el que se controla un Televisor
    public static class Televisor {

        // Primero definimos los atributos
        private int canal = 1;
        private int volumen = 5;

        public Televisor() {
        }

        public Televisor(int canal, int volumen) {
            setCanal(canal);
            setVolumen(volumen);
        }

        public int subirCanal() {
            return this.canal++;
        }

        public int bajarCanal() {
            return this.canal--;
        }

        public int subirVolumen() {
            return this.volumen++;
        }

        public int bajarVolumen() {
            return this.volumen--;
        }

        public int getCanal() {
            return this.canal;
        }

        public void setCanal(int canal) {
            if (canal >= 1 && canal <= 99) {
                this.canal = canal;
            }
        }

        public int getVolumen() {
            return this.volumen;
        }

        public void setVolumen(int volumen) {
            if (volumen >= 0 && volumen <= 100) {
                this.volumen = volumen;
            }
        }

        @Override
        public String toString() {
            return "Televisor : [ canal=" + canal + ", volumen=" + volumen + " ]";
        }
    }

    // Metodo en el que se almacena la información de un paciente
    public static class Paciente {

        public static final int Sobrepeso = 1;
        public static final int pesoIdeal = 0;
        public static final int debajoPesoIdeal = -1;
        public static final char sexo_def = 'X';

        private String nombre;
        private String DNI;
        private char sexo;
        private int edad;
        private double peso;
        private double altura;

        public Paciente(String nombre, int edad, char sexo, double peso, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
        }

        private void generarDNI() {
            Random random = new Random();

            int numeroDNI = random.nextInt(10000000, 99999999);
            int resto = numeroDNI % 23;
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

            this.DNI = Integer.toString(numeroDNI) + letras[resto];
        }

        public void mostrarInformacion() {
            System.out.println("Información paciente");
            System.out.println("--------------------");

            System.out.println("Nombre: " + getNombre());
            System.out.println("Edad: " + getEdad());
            System.out.println("Sexo: " + getSexo());
            System.out.println("Peso: " + getPeso());
            System.out.println("Altura: " + getAltura());
        }

        public int calculoIMC() {

            double IMC = peso / Math.pow(altura, 2);

            if (IMC > 20) {
                return -1;
            } else if (IMC > 25) {
                return 1;
            } else {
                return 0;
            }
        }

        public boolean esMayorEdad() {
            if (edad >= 18) {
                return true;
            } else {
                return false;
            }
        }

        public void sexoEnfermo(char sexo) {
            if (sexo == 'H' || sexo == 'M') {
                this.sexo = sexo;
            } else {
                this.sexo = sexo_def;
            }
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDNI() {
            return DNI;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        @Override
        public String toString() {
            return "Paciente : [ nombre=" + nombre + ", edad=" + edad + ", genero=" + sexo + ", peso=" + peso + ", altura=" + altura + " ]";
        }

    }

    // Metodo en el que se introduce un nuevo paciente
    public static Paciente nuevoPaciente() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** Hospital Mutxamel ****");
        System.out.println("---------------------------");

        System.out.println("Introduzca datos del paciente: ");
        System.out.print("= Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("= Edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();

        char sexo = 'X';
        while (true) {
            System.out.print("= Sexo (X/F): ");
            String lineaSexo = teclado.nextLine().trim();
            if (!lineaSexo.isEmpty()) {
                sexo = lineaSexo.charAt(0);
                break;
            }
            System.out.println("Por favor, introduzca una letra (X/M).");
        }

        System.out.print("= Peso: ");
        double peso = teclado.nextDouble();

        System.out.print("= Altura: ");
        double altura = teclado.nextDouble();

        Paciente nuevoPaciente = new Paciente(nombre, edad, sexo, peso, altura);

        nuevoPaciente.setNombre(nombre);
        nuevoPaciente.setEdad(edad);
        nuevoPaciente.setSexo(sexo);
        nuevoPaciente.setPeso(peso);
        nuevoPaciente.setAltura(altura);

        System.out.println("Almacenando datos del paciente. Mostrando estadísticas... \n");
        return nuevoPaciente;
    }

    // Metodo en el que se comprueba si el paciente tiene sobrepeso
    public static void tieneSobrepeso(Paciente nuevoPaciente) {
        int IMC = nuevoPaciente.calculoIMC();

        switch (IMC) {
            case Paciente.debajoPesoIdeal:
                System.out.println(nuevoPaciente.getNombre() + " está por debajo de su peso ideal.");
                break;
            case Paciente.Sobrepeso:
                System.out.println(nuevoPaciente.getNombre() + " está por encima de su peso ideal.");
                break;
            case Paciente.pesoIdeal:
                System.out.println(nuevoPaciente.getNombre() + " está en su peso ideal.");
                break;
        }
    }

    // Metodo en el que se comprueba si el paciente es mayor de edad
    public static void esMayorEdad(Paciente nuevoPaciente) {
        if (nuevoPaciente.esMayorEdad()) {
            System.out.println(nuevoPaciente.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(nuevoPaciente.getNombre() + " NO es mayor de edad.");
        }
    }
}