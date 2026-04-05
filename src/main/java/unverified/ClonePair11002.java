package unverified;

public class ClonePair11002 {

    boolean method1(int row,int col){
      if (col == 1 || col == 5 || col == 6) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int row,int col){
      if (col > 0 && col < 7) {
        return true;
      }
     else {
        return false;
      }
    }
}
