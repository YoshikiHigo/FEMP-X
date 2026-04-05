package unverified;

public class ClonePair5912 {

    int method1(Comparable a,Comparable b){
      int result;
      if (a != null && b != null) {
        result=a.compareTo(b);
      }
     else   if (a == null && b != null) {
        result=-1;
      }
     else   if (b == null && a != null) {
        result=1;
      }
     else {
        result=0;
      }
      return result;
    }

    int method2(Comparable left,Comparable right){
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
}
