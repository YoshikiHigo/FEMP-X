package unverified;

public class ClonePair612 {

    boolean method1(byte[] test,byte[] good){
      if ((test == null) || (good == null)) {
        return (test == null) && (good == null);
      }
      if (test.length != good.length) {
        return false;
      }
      if (test.length == 0) {
        return true;
      }
      int bits=0;
      for (int i=0; i < good.length; i++) {
        bits|=test[i] ^ good[i];
      }
      return bits == 0;
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
