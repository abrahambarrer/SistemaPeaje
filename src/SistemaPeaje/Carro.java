package SistemaPeaje;
/**
 * Esta clase denominada Carro modela un tipo especifico de Vehiculo
 * que llega a un peaje. Tiene un atributo estatico que representa su
 * valor del peaje en $10000
 * @version 1.2/2020
 */
public class Carro extends Vehiculo {
    // Atributo estatico que identifica el valor de peaje a pagar por un carro
    static int valorPeaje = 1000;
    /**
     * Constructor de la clase Carro
     * @param placa Parametro que define la placa de un carro
     */
    Carro(String placa){
        super(placa);
    } // Invoca al constructor de la clase padre
    /**
     * Metodo que devuelve el valor del peaje para un carro
     * @return El valor del peaje para un carro
     */
    public int getValorPeaje(){
        return valorPeaje;
    }
    /**
     * Metodo que establece el valor del peaje para un carro
     * @param Parametro que define el valor del peaje para un carro
     */
    static void setValorPeaje(int valorPeaje){
        valorPeaje = valorPeaje;
    }
    /**
     * Metodo que muestra en pantalla la placa y el valor del peaje de un
     * carro
     */
    void imprimir(){
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}
