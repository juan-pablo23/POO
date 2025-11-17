public class BotonPiso extends Boton {
    private Direccion direccion;
    
    public BotonPiso(int piso, Direccion direccion) {
        super(piso);
        this. direccion = direccion;
    }
    
    @Override
    public void presionar(ControlElevador control) {
        iluminado = true;
        control.solicitudDesdePiso(piso, direccion);
    }

    @Override
    public String toString() {
        return "BotonPiso[piso=" + piso + ", dir=" + direccion + "iluminado=" + iluminado + "]";
    }
}