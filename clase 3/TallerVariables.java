public class TallerVariables {

    public static void main(String[] args) {
        
        double d1 = 42.0, d2 = 58.5, d3 = 37.2;
        double t1 = 0.9, t2 = 1.4, t3 = 0.8;
        double l1 = 5.1, l2 = 69, l3 = 4.3;
        double precioLitro = 1.35;
        double masaCargakg = 1200;
        double largo = 2.0, ancho = 1.2, alto = 1.1;
        double p1 = 2.5, p2 = 3.0, p3 = 2.0;
        double deprecPorkm = 0.08;
        double volCamionM3 = 10.0;
        double fc02 = 2.68;
        double galPorlitro = 0.264172;
        double vmin = 30, vmax = 90;
        double va = 40, vb = 80, ca = 0.05, cb = 0.09;
        double a = -0.0008, b = 0.08, c = 4.0;

        double v1 = d1/t1; 
        double v2 = d2/t2;
        double v3 = d3/t3; 
        double vprom = (d1*v1+d2*v2+d3*v3)/(d1+d2+d3);
        System.out.println("el valor de la velocidad 1 es:"+ v1);
    }
}