public class TallerVariablesC {
    
        public static void main(String[] args) {
        
        double d1 = 50.0, d2 = 45.0, d3 = 32.0;
        double t1 = 2.7, t2 = 0.5, t3 = 3.1;
        double l1 = 3.4, l2 = 6.0, l3 = 8.2;
        double precioLitro = 3.5;
        double masaCargakg = 1999;
        double largo = 1.2, ancho = 2.3, alto = 1.0;
        double p1 = 5.3, p2 = 1.5, p3 = 4.4;
        double deprecPorkm = 0.090;
        double volCamionM3 = 14.0;
        double fc02 = 5.64;
        double galPorlitro = 0.264172;
        double vmin = 30, vmax = 90;
        double va = 40, vb = 80, ca = 0.05, cb = 0.09;
        double a = -0.0009, b = 0.09, c = 3.8;
        //paso 2 parte 1
        double v1 = d1/t1; 
        double v2 = d2/t2;
        double v3 = d3/t3; 
        double vprom = (d1*v1+d2*v2+d3*v3)/(d1+d2+d3);
        System.out.println("el valor de la velocidad 1 es: "+ v1);
        System.out.println("el valor de la velocidad 2 es: "+ v2);
        System.out.println("el valor de la velocidad 3 es: "+ v3);
        System.out.println("el valor de la velocidad promedio es: "+ vprom);
        //paso 2 parte 2
        double kml1 = d1/l1; 
        double kml2 = d2/l2;
        double kml3 = d3/l3; 
        double kmltotal = (d1+d2+d3)/(l1+l2+l3);
        System.out.println("la cantidad de kilimetros por litro 1 es: "+ kml1);
        System.out.println("la cantidad de kilometros por litro 2 es: "+ kml2);
        System.out.println("la cantidad de kilometros por litro 3 es: "+ kml3);
        System.out.println("la cantidad de kilometros por litro total es: "+ kmltotal);
        //paso 3
        double costoComb = (l1+l2+l3)*precioLitro;
        double deprec = (d1+d2+d3)*deprecPorkm;
        double peajes = p1+p2+p3;
        double costoDirecto = costoComb+deprec+peajes;
        double costoPorkm = costoDirecto/(d1+d2+d3);
        System.out.println("el costo del combustible  es: "+ costoComb);
        System.out.println("la depreciación es de: "+ deprec);
        System.out.println("el costo de los peajes es de: "+ peajes);
        System.out.println("el costo directo es de: "+ costoDirecto);
        System.out.println("el costo por kilometro es de: "+ costoPorkm);
        //paso 4
        double volumenM3 = largo*ancho*alto;
        double densidad = masaCargakg/volumenM3;
        double ocupacion = volumenM3/volCamionM3;
        System.out.println("el volumen es de: "+ volumenM3);
        System.out.println("la densidad es de: "+ densidad);
        System.out.println("la ocupacion es de: "+ ocupacion);
        //paso 5
        double co2total = (l1+l2+l3)*fc02;
        double co2porkm = co2total/(d1+d2+d3);
        System.out.println("la cantidad de co2 total es de: "+ co2total);
        System.out.println("la cantidad de co2 por kilometro es de: "+ co2porkm);
        //paso 6 parte 1
        double vpromms = vprom*1000/3600;
        double galTot = (l1+l2+l3)*galPorlitro;
        System.out.println("la velocidad promedio en metros por segundo es de: "+ vpromms);
        System.out.println("la cantidad de galones por litro total es de: "+ galTot);
        //paso 6 parte 2
        double vnorm = (vprom-vmin)/(vmax-vmin);
        System.out.println("la velocidad normal es de: "+ vnorm);
        //paso 7  
        double vmendia = (v1+v2+v3)/3;
        double σ = Math.sqrt(((v1-vmendia)*(v1-vmendia)+(v2-vmendia)*(v2-vmendia)+(v3-vmendia)*(v3-vmendia))/3);
        double vpond_t = (t1*v1+t2*v2+t3*v3)/(t1+t2+t3);
        System.out.println("la velocidad media es de: "+ vmendia);
        System.out.println("σ es de: "+ σ);
        System.out.println("la vpond_t es de: "+ vpond_t);
        //paso 8
        double cvrpom = ca+(cb-ca)*(vprom-va)/(vb-va);
        double costoMant = cvrpom*(d1+d2+d3);
        System.out.println("el cvprom es de: "+ cvrpom);
        System.out.println("el costoMant es de: "+ costoMant);
        //paso 9
        double kmlModelo = a*vprom*vprom+b*vprom+c;
        double litrosModelo = (d1+d2+d3)/kmlModelo;
        System.out.println("el kmlModelo es de: "+ kmlModelo);
        System.out.println("los litrosModelo son de: "+ litrosModelo);
        //paso 10 
        double w1 = 0.25, w2 = 0.25, w3 = 0.25, w4 = 0.25;
        double score = w1*(1/costoPorkm)+w2*kmltotal+w3*(1/co2porkm)+w4*(1/(1+σ));
        System.out.println("el score es de: "+ score);
    }

}
