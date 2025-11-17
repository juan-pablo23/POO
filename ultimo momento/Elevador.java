public class Elevador {
    private int id;
    private int pisoActual;
    private Direccion direccion;
    private Puerta puerta;

    public Elevador(int id, int pisoInicial) {
        this. id = id;
        this. pisoActual = pisoInicial;
        this. direccion = Direccion.QUIETO;
        this. puerta  = new Puerta();
    }
    public int obtenerPisoActual() { return pisoActual; }
    public Direccion obteneDireccion() { return direccion; }
    public Puerta obtenerPuerta() { return puerta; }

    public void moverUnPiso() {
        if (direccion == Direccion.SUBIR) pisoActual++;
        else if (direccion == Direccion.BAJAR) pisoActual--;

        System.out.println("Elevador" + id + "moviéndose al piso" + pisoActual);
    }

    public void irAPiso(int destino) {
        if (destino == pisoActual) dereccion = Direccion.QUIETO;
        else direccion = (detino > pisoActual) ? Direccion.SUBIR : Direccion.BAJAR;
    }

    public void llegarYAbrir() {
        System.out.println("Elevador " + id + "llegó al piso" + pisoActual);
        puerta.abrir();
    }

    @Override
    public String toString() {
        return "Elevador[id=" + id + ", piso=" + pisoActual + ", dir=" + direccion + ", puerta=" + puerta + "]";
    }
}
