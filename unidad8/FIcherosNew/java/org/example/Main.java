import java.io.File;

public static void main(String[] args) {

        File ficheros = new File(("src/Main/resources/prueba.txt"));
        if (ficheros.exists()){
            System.out.println(ficheros.getName() + " existe.");
        } else {
            System.out.println(ficheros.getName() + " no existe.");
        }

    try {
        ficheros.createNewFile();
    } catch (IOException e) {
        System.out.println("Algo ha ido mal.");
        e.printStackTrace();
    }

    if (ficheros.exists()){
        System.out.println(ficheros.getName() + " existe.");
    } else {
        System.out.println(ficheros.getName() + " no existe.");
    }

    System.out.println("Tamaño del fichero: " + ficheros.length());
    System.out.println("Ruta del fichero: " + ficheros.getAbsolutePath());

    File carpeta = new File("src/main/resources/paco");

    if (carpeta.exists()) {
        System.out.println("La carpeta " + carpeta.getName() + " existe.");
    } else {
        System.out.println("La carpeta " + carpeta.getName() + " no existe.");
    }

    carpeta.mkdir();

}