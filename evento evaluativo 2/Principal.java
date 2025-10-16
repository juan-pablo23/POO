public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("juan paolo", "230610", 10000000);
        System.out.println("La Cuenta Fue Creada Exiitosamente");
        System.out.println(cuenta1.tooString());

        CuentaBancaria cuenta2 = new CuentaBancaria("", "33", 200);
        System.out.println("Cuenta Invalida");
        System.out.println(cuenta2.tooString());
    }
}
