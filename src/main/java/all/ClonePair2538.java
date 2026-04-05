package all;

public class ClonePair2538 {

    boolean method1(byte[] bytes1,byte[] bytes2){
      if (bytes1 == null && bytes2 == null) {
        return true;
      }
     else   if (bytes1 == null || bytes2 == null) {
        return false;
      }
      if (bytes1.length != bytes2.length) {
        return false;
      }
      for (int i=0; i < bytes1.length; i++) {
        if (bytes1[i] != bytes2[i]) {
          return false;
        }
      }
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
