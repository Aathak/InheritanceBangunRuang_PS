package inharitancebangundatar_pakson;

public class LimasSegitiga extends induk{
    double a;
    double t;
    double tLimas;
    double sTegak;
    
    double volume(){
        double Vol = 1/3 * 1/2 * ( a * t ) * sTegak;
        System.out.println("Volume Limas : " + Vol);
        return Vol;
    }
}
