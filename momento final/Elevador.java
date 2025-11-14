abstract class Elevador {
    protected int plantaActual;
    protected int plantaBaja;
    protected int plantaAlta;
    protected boolean puertaAbierta;

    public Elevador(int plantaActual, int plantaBaja, int plantaAlta){
        this.plantaActual = plantaActual;
        this.plantaBaja = plantaBaja;
        this.plantaAlta = plantaAlta;
        this.puertaAbierta = false;
    }
    public int getPisoActual(){
        return pisoActual;
    }
}