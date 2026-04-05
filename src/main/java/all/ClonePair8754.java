package all;

public class ClonePair8754 {

    Class method1(int col){
    switch (col) {
    case 2:case 3:case 4:case 5:case 6:    return Integer.class;
    default:  return String.class;
    }
    }

    Class method2(int columnIndex){
    switch (columnIndex) {
    case 0:case 1:    return String.class;
    case 2:case 3:case 4:case 5:case 6:  return Integer.class;
    default:return String.class;
    }
    }
}
