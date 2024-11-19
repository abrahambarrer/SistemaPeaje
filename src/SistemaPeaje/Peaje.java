package SistemaPeaje;
import java.util.Vector;
public class Peaje {
    String nombre;
    String departamento;
    Vector vehiculos;
    int totalPeaje;
    static int totalCamiones = 0;
    static int totalMotos = 0;
    static int totalCarros = 0;

    public Peaje(String nombre, String departamento){
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new Vector();
    }
}
