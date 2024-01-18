package inharitancebangundatar_pakson;

public class Balok extends induk{
    double p;
    double l;
    double t;
    
    double volume(){
        double Vol = p * l * t ;
        System.out.println("Volume Balok : " + Vol);
        return Vol;
    }
    
    double LuasPermukaan(){
        double LP = 2 * ( p * l + p * t + l * t);
        System.out.println("Luas Permukaan Balok : " + LP);
        return LP;
    }
}
