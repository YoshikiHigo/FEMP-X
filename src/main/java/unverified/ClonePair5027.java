package unverified;

public class ClonePair5027 {

    boolean method1(int year){
      if (year % 4 != 0) {
        return false;
      }
      if (year % 400 == 0) {
        return true;
      }
      return (year % 100 != 0);
    }

    boolean method2(int annee){
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
}
