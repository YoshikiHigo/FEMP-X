package all;

public class ClonePair8718 {

    Class method1(int columnIndex){
    switch (columnIndex) {
    case 0:    return Boolean.class;
    case 1:  return Integer.class;
    case 2:return String.class;
    case 3:return String.class;
    case 4:return String.class;
    default:return String.class;
    }
    }

    Class method2(int col){
    switch (col) {
    case 0:    return Boolean.class;
    case 1:  return Integer.class;
    case 2:return String.class;
    case 3:return String.class;
    default:return Object.class;
    }
    }
}
