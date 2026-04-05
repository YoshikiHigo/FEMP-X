package all;

public class ClonePair11260 {

    boolean method1(int row,int col){
      if (col == 1 || col == 2 || col == 4) {
        return true;
      }
      return false;
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
