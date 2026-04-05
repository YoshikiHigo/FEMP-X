package all;

public class ClonePair5519 {

    boolean method1(int year){
      boolean result=false;
      if (((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0))) {
        result=true;
      }
      return result;
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
