package inharitancebangundatar_pakson;

public class tabung extends induk{
    double r;
    double t;
    
    double volume(){
        double Vol = Math.PI * r * r * t ;
        System.out.println("Volume Tabung : " + Vol);
        return Vol;
    }
    
    double LuasPermukaan(){
        double LP = 2 * Math.PI * r * (r+t);
        System.out.println("Luas Permukaan Tabung : " + LP);
        return 0;
    }
}
