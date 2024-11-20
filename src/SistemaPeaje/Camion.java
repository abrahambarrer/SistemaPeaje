package SistemaPeaje;

/**
 * Esta clase denominada Camion modela un tipo especifico de Vehiculo
 * que llega a un peaje. Tiene un atributo para representar el numero de
 * eje que tiene un camion y un atributo estatico que representa su
 * valor del peaje en $5000 por cada eje
 * @version 1.2/2020
 */
public class Camion extends Vehiculo{
    // Atributo estatico que identifica el valor de peaje a pagar por un camion
    static int valorPeaje = 5000;
    // Atributo que identifica el numero de ejes que tiene un camion
    int numeroEjes;

    /**
     * Constructor de la clase Camion
     * @param placa Parametro que define la placa de un camion
     * @param numeroEjes
     */
    Camion(String placa, int numeroEjes){
        super(placa); // Invoca el constructor de la clase Padre
        this.numeroEjes = numeroEjes;
    }
    /**
     * Metodo que devuelve el valor del peaje para un camion
     * @return El valor del peaje para un camion
     */
    public int getValorPeaje(){
        return valorPeaje;
    }
    /**
     * Metodo que establece el valor del peaje para un camion
     * @param Parametro que define el valor del peaje para un camion
     */
    static void setValorPeaje(int valorPeaje){
        valorPeaje = valorPeaje;
    }
    /**
     * Metodo que muestra en pantalla la placa, el numero de ejes y el
     * valor del peaje de un camion
     */
    void imprimir(){
        System.out.println("Placa = " + placa);
        System.out.println("Numero Ejes = " + numeroEjes);
        System.out.println("Valor peaje = " + valorPeaje);
    }
}