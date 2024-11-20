package SistemaPeaje;
import java.util.Vector;

/**
 * Esta clase denominada Peaje modela una estacion de peaje de una
 * carretera. Tiene los atributos nombre de la estacion de peaje, el
 * departamento al que pertenece la estacion, un vector de Vehiculos
 * que llegan a la estacion y total de dinero en peajes recibido. Ademas
 * cuenta con tres atributos estaticos para calcular el total de carros,
 * motos y camiones que llegan al peaje.
 * @version 1.2/2020
 */
public class Peaje {
    // Atributo que identifica el nombre de una estacion de peaje
    String nombre;
    /* Atributo que identifica el nombre del departamento donde
    esta ubicada la estacion de peaje */
    String departamento;
    /* Atributo que identifica el conjunto de vehiculos que llega a la
    estacion de peaje */
    Vector vehiculos;
    /* Atributo que identifica el total de dinero recolectado por la estacion
    de peaje */
    int totalPeaje = 0;
    /* Atributo que identifica el total de camiones que llego a la estacion
    de peaje */
    static int totalCamiones = 0;
    /* Atributo que identifica el total de motos que llego a la estacion de
    peaje */
    static int totalMotos = 0;
    /* Atributo que identifica el total de carros que llego a la estacion de
    peaje */
    static int totalCarros = 0;

    /**
     * Construtor de la clase Peaje
     * @param nombre Parametro que define el nombre de la estacion de
     * peaje
     * @param departamento Parametro que define el departamento
     * donde se encuentra localizado el peaje
     */
    Peaje(String nombre, String departamento){
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new Vector(); // Crea el vector de vehiculos
    }
    /**
     * Metodo que devuelve el nombre de la estacion de peaje
     * @return El nombre de la estacion de peaje
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Metodo que establece el nombre de la estacion de peaje
     * @param nombre Parametro que define el nombre de la estacion
     * peaje
     */
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Metodo que devuelve el departamento donde esta localizada la
     * estacion de peaje
     * @return El departamento donde esta localizada la estacion de
     * peaje
     */
    public String getDepartamento(){
        return departamento;
    }
    /**
     * Metodo que establece el departamento donde esta localizada la
     * estacion de peaje
     * @param deparamento Parametro que define el departamento
     * donde esta localizada la estacion de peaje
     */
    private void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    /**
     * Metodo que permite agregar un vehiculo al vector de vehiculos de
     * la estacion de peaje
     * @param vehiculo Parametro que define el vehiculo a agregar aL
     * vector de vehiculos de la estacion de peaje
     */
    public void añadirVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    /**
     * Metodo que permite calcular el peaje de un vehiculo que llega la
     * estacion de peaje
     * @param Parametro que define el vehiculo que llega a la estacion
     * de peaje
     */
    public int calcularPeaje(Vehiculo vehiculo){
        if (vehiculo instanceof Carro){ // Si el vehiculo que llego es un carro
            totalCarros++; // Actualiza el total de carros que llega el peaje
            totalPeaje += Carro.valorPeaje; // Actualiza el total de dinero del peaje
            return Carro.valorPeaje; // Retorna el dinero pagado por un carro
        } else if (vehiculo instanceof Moto) { // Si el vehiculo que llego es una moto
            totalMotos++; // Actualiza el total de motos que llega al peaje
            totalPeaje += Moto.valorPeaje; // Actualiza el total de dinero del peaje
            return Moto.valorPeaje; // Retorna el dinero pagado por una moto
        } else if (vehiculo instanceof Camion) { // Si el vehiculo que llego es un camion
            totalCamiones++; // Actualiza el total de camiones que llega al peaje
            Camion camion = (Camion) vehiculo; // Obtiene un objeto Camion
            /* Calcula el peaje del camion y actualiza total de dinero del peaje*/
            totalPeaje += camion.numeroEjes * camion.valorPeaje;
            // Retorna el dinero pagado por un camion
            return camion.numeroEjes * camion.valorPeaje;
        } else return -1; // Si llega otro tipo de objeto
    }
    /**
     * Metodo que muestra en pantalla los datos del peaje, el total de
     * vehiculos que llego al peaje discriminado por tipo y el total de
     * dinero recaudado por la estacion de peaje
     */
    public void imprimir(){
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicacion = " + getDepartamento());
        System.out.println("Total de carros = " + totalCarros);
        System.out.println("Total de motos = " + totalMotos);
        System.out.println("Total de camiones = " + totalCamiones);
        int totalVehiculos = totalCarros + totalMotos + totalCamiones;
        System.out.println("Total de vehiculos = " + totalVehiculos);
        System.out.println("Dinero total = $" + totalPeaje);
    }
}
