package org.example;

@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(Profesor profesor);
}
