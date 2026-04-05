package unverified;

public class ClonePair470 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null) {
        return (b2 == null);
      }
     else   if (b2 == null) {
        return false;
      }
     else   if (b1 == b2) {
        return true;
      }
     else   if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] test,byte[] good){
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
}
