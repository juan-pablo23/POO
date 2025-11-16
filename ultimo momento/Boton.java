public abstract class Boton {
    protected int piso;
    protected boolean iluminado;
    
    public Boton(int piso) {
        this. piso = piso;
        this. iluminado = false;
    }
    public int obtenerPiso() {return piso;}
    public boolean estaIluminado() {return iluminado;}

    public abstract void presionar(ControlElevador control);
}