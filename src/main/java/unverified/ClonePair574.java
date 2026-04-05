package unverified;

public class ClonePair574 {

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

    boolean method2(byte[] a,byte[] a2){
      if (a == a2) {
        return true;
      }
      if (a == null || a2 == null) {
        return false;
      }
      int length=a.length;
      if (a2.length != length) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (a[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
