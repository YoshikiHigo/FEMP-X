package all;

public class ClonePair11149 {

    boolean method1(int X,int Y){
      if (X % 2 == 0) {
        if (Y % 2 == 0) {
          return false;
        }
     else {
          return true;
        }
      }
     else {
        if (Y % 2 == 0) {
          return true;
        }
     else {
          return false;
        }
      }
    }

    boolean method2(int i,int j){
      if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
        return true;
      }
     else {
        return false;
      }
    }
}
