package unverified;

public class ClonePair5791 {

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
      if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
        return true;
      }
      return false;
    }
}
