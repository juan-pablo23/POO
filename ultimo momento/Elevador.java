public class Elevador {
    private int id;
    private int pisoACtual;
    private Direccion direccion;
    private Puerta puerta;

    public Elevador(int id, int pisoInicial) {
        this. id = id;
        this. pisoActual = pisoInicial;
        this. direccion = Direccion.QUIETO;
        this. puerta  = new Puerta();
    }
    public int obtenerPisoACtual() { return pisoACtual; }
    public Direccion obteneDireccion() { return direccion; }
    public Puerta obtenerPuerta() { return puerta; }

    public void moberUnPiso() {
        if (direccion == Direccion.SUBIR) pisoActual++;
        else if (direccion == Direccion.BAJAR) pisoACtual--;

        System.out.println("Elevador" + id + "moviéndose al piso" + pisoActual);
    }

    public void irAPiso(int destino) {
        if (destino == pisoActual) dereccion = Direccion.QUIETO;
        else direccion = (detino > pisoACtual) ? Direccion.SUBIR : direccion.BAJAR;
    }

    public void llegarYAbrir() {
        System.out.println("Elevador " + id + "llegó al piso" + pisoACtual);
        puerta.abrir();
    }

    @Override
    public String toString() {
        return "Elevador[id=" + id + ", piso=" + pisoActual + ", dir=" + direccion + ", puerta=" + puerta + "]";
    }
}
