public class Principal {
    public static void main(String[] args) {
        // versión A
        CuentaBancaria cuenta1 = new CuentaBancaria("juan paolo", "230610", 1000);
        System.out.println("La Cuenta Fue Creada Exitosamente");
        System.out.println(cuenta1.tooString());

        CuentaBancaria cuenta2 = new CuentaBancaria("", "33", -200);
        System.out.println("Cuenta Invalida");
        System.out.println(cuenta2.tooString());

        cuenta1.depositar(3000);
        cuenta2.depositar(-100);

        cuenta1.retirar(2000);
        cuenta2.retirar(1000);

        System.out.println("resultados: ");
        System.out.println(cuenta1.tooString());
        System.out.println(cuenta2.tooString());

        // predicción cuenta 1: 1000 + 3000 - 2000 = 2000
        // predicción cuenta 2: la cuenta queda en 0.0 por que todos los datos eran
        // invalidos

        // versión B
        Producto p1 = new Producto("A123", "logitech G502 Hero", 3, 187000);
        System.out.println("El Producto Fue Creado Correctamente");
        System.out.println(p1.tooString());

        p1.incrementarCantidad(3);
        System.out.println(p1.tooString());

        p1.aplicarDescuento(10);
        System.out.println(p1.tooString());

        System.out.println("El Subtotal Del Producto Es De:");
        System.out.println(p1.calcularSubtotal());
    }
}
