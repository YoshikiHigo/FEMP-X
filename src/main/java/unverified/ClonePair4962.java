package unverified;

public class ClonePair4962 {

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

    boolean method2(int year){
      if ((year & 0x03) != 0)   return false;
      if (0 == (year % 100)) {
        if ((year % 400) != 0)     return false;
      }
      return true;
    }
}
