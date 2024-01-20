/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritancePt2;

/**
 *
 * @author ASUS
 */
public class mainkan {
    public static void main(String[] args) {
        BangunRuang BR = new BangunRuang();
        
        Tabung tabung = new Tabung();
        tabung.r = 10;
        tabung.t = 10;
        
        Bola bola = new Bola();
        bola.r = 7;

        
        LimasSegitiga LimasS =new LimasSegitiga();
        LimasS.LuasAlas = 7;
        LimasS.TinggiLimas = 7;
        
        Kubus kubus = new Kubus();
            kubus.s = 3;
        
        BR.volume();
        tabung.volume();
        
        BR.volume();
        bola.Bola();
        
        BR.volume();
        kubus.Sisi();
        
        BR.volume();
        LimasS.Ls();
    }
}
