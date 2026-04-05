package unverified;

public class ClonePair11251 {

    boolean method1(int rowIndex,int columnIndex){
    switch (columnIndex) {
    case 0:    return false;
    case 1:  return true;
    case 2:return true;
    case 3:return true;
    default:return false;
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
