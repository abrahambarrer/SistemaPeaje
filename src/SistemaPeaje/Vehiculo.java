package SistemaPeaje;

/**
 * Esta clase abstracta denominada Vehiculo modela diferentes tipos de
 * vehiculos que puede llegar a un peaje. Un vehiculo posee como
 * unico atributo su placa.
 * @version 1.2/2020
 */
public abstract class Vehiculo {
    String placa; // Atributo que define la placa de un vehiculo

    /**
     * Constructor de la clase Vehiculo
     * @param placa Parametro que define la placa de un vehiculo
     */
    Vehiculo(String placa){
        this.placa = placa;
    }
}