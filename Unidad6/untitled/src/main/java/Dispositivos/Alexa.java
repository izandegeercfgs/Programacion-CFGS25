package Dispositivos;

public class Alexa extends Dispositivo {
    public Alexa(String nombre) {
        super(nombre);
    }

    public void encender() {

        if(getEstado()){
            System.out.println("El parlante ya está encendido.");
        }else{
            System.out.println("Activando parlante con comando de voz...");
            setEstado(true);
        }
    }
}
