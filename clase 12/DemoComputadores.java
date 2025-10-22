public class DemoComputadores {
    
    public static void main(String[] args) {
        Computador c1 = new Portatil("Lenovo", 8);
        Computador c2 = new Gamer("Asus", "RTX 4060");

        c1.optimizar();
        c2.optimizar();

        System.out.println(c1.info());
        System.out.println(c2.info());
    }
}