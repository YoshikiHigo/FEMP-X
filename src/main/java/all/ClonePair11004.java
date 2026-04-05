package all;

public class ClonePair11004 {

    boolean method1(int x,int y){
      if ((x >= 0 && x <= 9) && (y >= 0 && y <= 9)) {
        return true;
      }
      return false;
    }

    boolean method2(int row,int column){
      if (row >= 0 && row < 15 && column >= 0 && column < 15)   return true;
      return false;
    }
}
