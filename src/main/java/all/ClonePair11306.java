package all;

public class ClonePair11306 {

    boolean method1(int row,int col){
      if (col > 0 && col < 7) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int row,int col){
    switch (col) {
    case 1:case 2:case 3:case 4:case 5:    return true;
    default:  return false;
    }
    }
}
