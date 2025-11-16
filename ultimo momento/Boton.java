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

    public void cancelar() {iluminado = false;}

    @Override
    public String toString() {
        return "Boton[piso=" + piso + ", iluminado=" + iluminado + "]";
    }
}