package all;

public class ClonePair5702 {

    boolean method1(int ano){
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

    boolean method2(int year){
      if ((year & 0x03) != 0)   return false;
      if (0 == (year % 100)) {
        if ((year % 400) != 0)     return false;
      }
      return true;
    }
}
