package all;

public class ClonePair2916 {

    boolean method1(byte[] left,byte[] right){
      if (left == right)   return true;
     else   if (left == null || right == null || left.length != right.length)   return false;
      for (int i=0; i < left.length; i++)   if (left[i] != right[i])   return false;
      return true;
    }

    boolean method2(byte[] lhs,byte[] rhs){
      if (lhs == null && rhs != null || lhs != null && rhs == null) {
        return false;
      }
      if (lhs == rhs) {
        return true;
      }
      if (lhs.length != rhs.length) {
        return false;
      }
      for (int i=0; i < lhs.length; i++) {
        if (lhs[i] != rhs[i]) {
          return false;
        }
      }
      return true;
    }
}
