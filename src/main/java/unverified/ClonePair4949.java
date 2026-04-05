package unverified;

public class ClonePair4949 {

    boolean method1(int ano){
      boolean bisiesto;
      if (ano % 4 != 0) {
        bisiesto=false;
      }
     else   if (ano % 400 == 0) {
        bisiesto=true;
      }
     else   if (ano % 100 == 0) {
        bisiesto=false;
      }
     else {
        bisiesto=true;
      }
      return bisiesto;
    }

    boolean method2(int ano){
      int in;
      if ((ano / 100) * 100 != ano) {
        if ((ano / 4) * 4 != ano)     return false;
     else     return true;
      }
     else {
        in=ano / 100;
        if ((in / 4) * 4 != in)     return false;
        in=in * 100;
        ano=ano - in;
        if ((ano / 4) * 4 != ano)     return false;
     else     return true;
      }
    }
}
