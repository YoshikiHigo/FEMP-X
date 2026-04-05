package all;

public class ClonePair11026 {

    boolean method1(int row,int col){
      if ((col == 0) || (col == 1) || (col == 2)) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int row,int column){
      if (column == 0) {
        return true;
      }
     else   if (column == 1) {
        return true;
      }
     else   if (column == 2) {
        return true;
      }
     else {
        return false;
      }
    }
}
