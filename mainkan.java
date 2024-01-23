
package InheritancePt2;
import java.util.Scanner;
public class mainkan {
    public static void main(String[] args) {
        Scanner hitung = new Scanner(System.in);
        BangunRuang BR = new BangunRuang();

        Tabung tabung = new Tabung();
        System.out.println("Rumus Volume Tabung: 3,14*r*r*t;");
        System.out.print("Masukan Jari-Jari: ");
    int ri = hitung.nextInt();
    System.out.print("Masukan Tinggi: ");
    int ti = hitung.nextInt();
        tabung.r = ri;
        tabung.t = ti;
        System.out.println("<HASIL>");
                BR.volume();
        tabung.volume();
        System.out.println("<------------------------>");
        
        Bola bola = new Bola();
        System.out.println("Rumus Volume Bola: 3/4*3,14*r*r*r;");
        System.out.print("Masukan Agka: ");
    int bal = hitung.nextInt();
        bola.r = bal;
        System.out.println("<HASIL>");
                BR.volume();
        bola.Bola();
System.out.println("<------------------------>");
        
        LimasSegitiga LimasS =new LimasSegitiga();
        System.out.println("Rumus Limas Segitiga = 1/3*Luas Alas*Tinggi Limas");
                System.out.println("Masukan Luas Alas: ");
    int La = hitung.nextInt();
    System.out.print("Masukan Tinggi Alas: ");
    int Ta = hitung.nextInt();
        LimasS.LuasAlas = La;
        LimasS.TinggiLimas = Ta;
        System.out.println("<HASIL>");
        BR.volume();
        LimasS.Ls();
        System.out.println("<------------------------>");
        
        Kubus kubus = new Kubus();
        System.out.println("Rumus Kubus= S*S*S*S");
                System.out.print("Masukan Sisi: ");
    int bus = hitung.nextInt();
            kubus.s = bus;
            System.out.println("<HASIL>");
         BR.volume();
          kubus.Sisi();
            System.out.println("<------------------------>");
        


        

        

        

    }
}
