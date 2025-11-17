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
    
    public void solicitudInterna(int piso) {
        System.out.println("Solicitud interna al piso" + piso);
        solicitudes.add(piso);
    }

    public void paso() {
        if (solicitudes.isEmpty()) {
            System.out.println("Sin solicitudes. Elevador quieto");
            elevador.irAPiso(elevador.obtenerPisoActual());
            return;
        }

        int actual = elevador.obtenerPisoActual();
        int destino = obtenerMasCercano(actual);

        elevador.irAPiso(destino);

        if (destino == actual) {
            elevador.llegarYAbrir();
            solicitudes.remove(destino);
            elevador.obtenerPuerta().cerrar();
        } else {
            elevador.moverUnPiso();
            if (solicitudes.contains(elevador.obtenerPisoActual())) {
                elevador.llegarYAbrir();
                solicitudes.remove(elevador.obtenerPisoActual());
                elevador.obtenerPuerta().cerrar();
            }
        }
    }

    private int obtenerMasCercano(int desde) {
        int mejor = -1;
        int mejorDist = Integer.MAX_VALUE;
        for (int p : solicitudes) {
            if (p < 1 || p > pisoMaximo) continue;
            int d = Math.abs(p - desde);
            if (d < mejorDist) { mejorDist = d; mejor = p; }
        }
        return mejor;
    }

    @Override
    public String toString() { return "controlElevador[solicitudes=" + solicitudes + "]";}
}