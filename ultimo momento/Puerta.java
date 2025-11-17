public class Puerta {
    private boolean abierta;

    public Puerta() { abierta = false; }

    public boolean estaAbierta() { return abierta; }
    public void abrir() { abierta = true; System.out.println("Puerta abierta"); }
    public void cerrar() { abierta = false; System.out.println("Puerta cerrada"); }

    @Override
    public String toString() { return "Puerta[abierta=" + abierta + "]";}
}