package all;

public class ClonePair1568 {

    boolean method1(byte[] left,byte[] right){
      if (left == null) {
        return ((right == null) ? true : false);
      }
      if (right == null) {
        return ((left == null) ? true : false);
      }
      if (left.length != right.length)   return false;
      for (int i=0; i < left.length; i++) {
        if (left[i] != right[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == null)   return b == null;
     else   if (b == null)   return false;
     else   if (b.length <= 0)   return a.length <= 0;
      byte diff=(byte)((a.length == b.length) ? 0 : 1);
      int j=0;
      for (int i=0; i < a.length; ++i) {
        diff|=a[i] ^ b[j];
        j=(j + 1) % b.length;
      }
      return diff == 0;
    }
}
