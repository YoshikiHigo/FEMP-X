package all;

public class ClonePair5341 {

    boolean method1(int yyyy){
      if ((yyyy % 4) != 0) {
        return false;
      }
     else   if ((yyyy % 400) == 0) {
        return true;
      }
     else   if ((yyyy % 100) == 0) {
        return false;
      }
     else {
        return true;
      }
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
