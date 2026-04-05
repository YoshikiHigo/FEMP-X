package unverified;

public class ClonePair5915 {

    int method1(Comparable left,Comparable right){
      if (left != null) {
        if (right != null) {
          return left.compareTo(right);
        }
     else {
          return 1;
        }
      }
     else {
        if (right == null) {
          return 0;
        }
     else {
          return -1;
        }
      }
    }

    int method2(Comparable a,Comparable b){
      if ((a == null) || (b == null)) {
        if (a == b) {
          return 0;
        }
        if (a == null) {
          return -1;
        }
        return 1;
      }
      return a.compareTo(b);
    }
}
