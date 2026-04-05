package unverified;

public class ClonePair4877 {

    boolean method1(int year){
      if (year % 4 != 0)   return false;
      if (year % 100 != 0)   return true;
      if (year % 400 == 0)   return true;
     else   return false;
    }

    boolean method2(int ano){
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
}
