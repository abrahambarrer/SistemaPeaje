package SistemaPeaje;

public class Camion extends Vehiculo{

    static int valorPeaje = 5000;

    int numeroEjes;

    public Camion(String placa, int numeroEjes){
        super(placa);
        this.numeroEjes = numeroEjes;
    }
}