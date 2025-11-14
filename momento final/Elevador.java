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
    public int getPlantaActual(){
        return plantaActual;
    }
    public void setPlantaActual(int planta){
        if(planta < plantaBaja || planta > plantaAlta){
            System.out.println("Esta planta no existe");
        } else {
            plantaActual = planta;
        }
    }
    public void abrirPuerta(){
        puertaAbierta = true;
        System.out.println("Puerta abierta en la planta" + plantaActual);
    }
    public void cerrarPuerta(){
        puertaAbierta = false;
        System.out.println("Puerta cerrada en la planta" + plantaActual);
    }
}