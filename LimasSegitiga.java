
package InheritancePt2;

public class LimasSegitiga extends BangunRuang {
    float LuasAlas ;
 float TinggiLimas ;
    
    float Ls(){
     double limas = 0.25*LuasAlas*TinggiLimas;
        System.out.println("Volume Limas Segitiga: "+limas);
    return 0;
    }
}
