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
    
}
