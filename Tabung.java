
package InheritancePt2;

public class Tabung extends BangunRuang{
     
    float r;
    float t;
    
   float volume(){
    double volume = Math.PI*r*r*t;
        System.out.println("Volume Tabung: "+volume);
        return 0;
      }
    }
