package all;

public class ClonePair10996 {

    boolean method1(int row,int col){
      if (col == 1 || col == 4 || col == 5)   return true;
     else   return false;
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
