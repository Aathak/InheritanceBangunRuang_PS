package inharitancebangundatar_pakson;

public class bola extends induk{
    double jarijari;
    
    @Override
    double volume(){
        double volume = 4/3 * Math.PI * jarijari * jarijari * jarijari ;
        System.out.println("Volume Bola : " + volume);
        return volume;
    }
    double LuasPermukaan(){
        double LP = 4 * Math.PI * jarijari * jarijari ;
        System.out.println("Luas Permukaan Bola : " + LP);
        return LP;
    }
    
    
}


