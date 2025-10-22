public class Portatil extends Computador {
    
    private int bateria;

    public Portatil(String marca, int bateria) {
        super(marca);
        this.bateria = bateria;
    }

    @Override
    public void optimizar() {
        rendimiento += 10; 
    }

    @Override
    public String info() {
        return "Portátil " + marca + " (" + bateria + "h de batería) tiene un rendimiento de " + rendimiento + "%";
    }
}