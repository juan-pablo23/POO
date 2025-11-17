public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(1, 1);
        controlElevador control = new ControlElevador(elevador, 10);

        BotonPiso boton5 = new BotonPiso(5, Direccion.SUBIR);
        BotonInterno boton8 = new BotonInterno(8);

        System.out.println("---- Escenario 1: solidtud desde piso 5 ----");
        boton5.presionar(control);
        for (int i = 0; i < 10; i++) control.paso();

        System.out.println("---- Escenario 2: solitud interna al psio 8 ----");
        boton8.presionar(control);
        for (int i = 0; i < 10; i++) control.paso();

        System.out.println("Estado final: " + elevador);
    }
}