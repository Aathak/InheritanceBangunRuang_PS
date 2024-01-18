package inharitancebangundatar_pakson;

public class InharitanceBangunDatar_PakSon {

    public static void main(String[] args) {
        induk BangunRuang = new induk();
        
        bola Bola = new bola();
        Bola.jarijari = 2.0;
        
        Balok Balok = new Balok();
        Balok.l = 12.0;
        Balok.p = 9.0;
        
        LimasSegitiga LimasSegitiga = new LimasSegitiga();
        LimasSegitiga.a = 10.0;
        LimasSegitiga.t = 15.0;
        LimasSegitiga.tLimas = 17.0;
        
        tabung Tabung = new tabung();
        Tabung.r = 14.0;
        Tabung.t = 20.0;
        
        BangunRuang.LuasPermukaan();
        BangunRuang.volume();
        
        
    }
    
}
