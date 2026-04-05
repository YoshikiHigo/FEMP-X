package unverified;

public class ClonePair5793 {

    boolean method1(int annee){
      if ((annee % 4) == 0) {
        if (((annee % 100) == 0) && ((annee % 400) != 0)) {
          return false;
        }
     else {
          return true;
        }
      }
     else {
        return false;
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
