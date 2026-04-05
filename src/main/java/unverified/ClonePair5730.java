package unverified;

public class ClonePair5730 {

    boolean method1(int y){
      if (y % 100 == 0) {
        return (y % 400 == 0);
      }
      return (y % 4 == 0);
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
