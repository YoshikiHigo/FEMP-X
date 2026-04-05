package all;

public class ClonePair5565 {

    boolean method1(int year){
      if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))   return true;
     else   return false;
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
