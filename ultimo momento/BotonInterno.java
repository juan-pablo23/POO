public class BotonInterno extends Boton {
    public BotonInterno(int piso) { super(piso); }

    @Override
    public void presionar(ControlElevador control) {
        iluminado = true;
        control.solicitudInterna(piso);
    }
    
    @Override
    public String toString() {
        return "BotonInterno[piso=" + piso + ",iluminado=" + iluminado + "]";
    }
}