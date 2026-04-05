package all;

public class ClonePair2918 {

    boolean method1(byte[] left,byte[] right){
      if (left == right)   return true;
     else   if (left == null || right == null || left.length != right.length)   return false;
      for (int i=0; i < left.length; i++)   if (left[i] != right[i])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] a2){
      boolean equal=false;
      if (a == a2) {
        equal=true;
      }
     else   if (a == null && a2 == null) {
        equal=true;
      }
     else   if (a == null || a2 == null) {
        equal=false;
      }
     else   if (a.length != a2.length) {
        equal=false;
      }
     else {
        equal=true;
        for (int i=0; i < a.length; i++) {
          if (a[i] != a2[i]) {
            equal=false;
            break;
          }
        }
      }
      return equal;
    }
}
