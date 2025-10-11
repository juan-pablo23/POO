import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        double angulo = 92;
        if (angulo == 90) {
            System.out.println("El angulo es un angulo recto");
        } else {
            System.out.println("El angulo no es un angulo recto");
        }

        // ------------------------------------------------------
        double temperatura = 200;
        {
            if (temperatura > 100) {
                System.out.println("Por encima del punto de ebullicon del agua");
            } else {
                System.out.println("Por debajo del punto de ebullicion del agua");
            }

        }

        // ------------------------------------------------------
        double numero = -40;
        double positivo = 25;
        double negativo = -25;
        {
            if (numero > 0) {
                positivo = positivo + numero;
                System.out.println("el total de numeros positivos es de:" + positivo);
            } else {
                negativo = negativo + numero;
                System.out.println("el total de numeros negativos es de:" + negativo);
            }
        }

        // --------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        double X = 30;
        double Y = 27;
        double Z = 16;
        double P;
        {
            if (X > Y && Z < 20) {
                System.out.println("ingrese un valor para P:");
                P = scanner.nextDouble();
                System.out.println("el valor ingresado para P es: " + P);
            } else {
                System.out.println("la condicion para P no se cumple");
            }
        }

        // --------------------------------------------------------
        Scanner tiempoScanner = new Scanner(System.in);
        double distancia = 30;
        double tiempo;
        {
            if (distancia < 20 && distancia > 35) {
                System.out.println("ingrese un valor para el tirmpo: ");
                tiempo = tiempoScanner.nextDouble();
                System.out.println("el valor ingresado para el timepo es: " + tiempo);
            } else {
                System.out.println("la condicion para la variable tiempo no se cumple");
            }
        }

    }
}