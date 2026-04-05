package unverified;

public class ClonePair11322 {

    boolean method1(int row,int column){
      if (row >= 0 && row < 15 && column >= 0 && column < 15)   return true;
      return false;
    }

    boolean method2(int x,int y){
      if (x < 0 || y < 0 || x > 7 || y > 7)   return false;
      return true;
    }
}
