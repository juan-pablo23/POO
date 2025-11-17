import java.util.SortedSet;
import java.util.TreeSet;

public class ControlElevador {
    private SortedSet<Integer> solicitudes;
    private Elevador elevador;
    private int pisoMaximo;

    public ControlElevador(Elevador elevador, int pisoMaximo) {
        this. elevador = elevador;
        this. pisoMaximo = pisoMaximo;
        this. solicitudes = new TreeSet<>();
    }
    public void solicitudDesdePiso(int piso, Direccion direccion) {
        System.out.println("Solicitud desde piso" + piso + " dir " + direccion);
        solicitudes.add(piso);
    }
    
}