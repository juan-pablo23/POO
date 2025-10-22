public class Computador {
    
    protected String marca;
    protected int rendimiento; 

    public Computador(String marca) {
        this.marca = marca;
        this.rendimiento = 50; 
    }

    public void optimizar() {
        rendimiento += 5; 
    }

    public String info() {
        return "Computador " + marca + " tiene un rendimiento de " + rendimiento + "%";
    }
}