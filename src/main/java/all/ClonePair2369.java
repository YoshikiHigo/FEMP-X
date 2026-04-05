package all;

public class ClonePair2369 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if ((b1 == null) || (b2 == null)) {
        return false;
      }
      if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; ++i)   if (b1[i] != b2[i]) {
        return false;
      }
      return true;
    }

    boolean method2(byte[] left,byte[] right){
      if (left == right)   return true;
     else   if (left == null || right == null || left.length != right.length)   return false;
      for (int i=0; i < left.length; i++)   if (left[i] != right[i])   return false;
      return true;
    }
}
