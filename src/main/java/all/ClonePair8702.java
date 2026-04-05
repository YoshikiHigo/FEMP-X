package all;

public class ClonePair8702 {

    Class method1(int col){
    switch (col) {
    case 0:    return Integer.class;
    case 1:  return String.class;
    case 2:return String.class;
    case 3:return String.class;
    case 4:return String.class;
    case 5:return String.class;
    }
    return Object.class;
    }

    Class method2(int column){
    switch (column) {
    case 0:    return Integer.class;
    case 1:  return String.class;
    case 3:return String.class;
    default:return String.class;
    }
    }
}
