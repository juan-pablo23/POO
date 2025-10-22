public class Gamer extends Computador {
    private String tarjetaGrafica;

    public Gamer(String marca, String tarjetaGrafica) {
        super(marca);
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public void optimizar() {
        rendimiento += 20; 
    }

    @Override
    public String info() {
        return "Computador Gamer " + marca + " con GPU " + tarjetaGrafica + " tiene un rendimiento de " + rendimiento + "%";
    }
}