package unverified;

public class ClonePair605 {

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

    boolean method2(byte[] a1,byte[] a2){
      if ((a1 == null) || (a2 == null)) {
        return a1 == a2;
      }
      int nLength=a1.length;
      if (nLength != a2.length) {
        return false;
      }
      for (int i=0; i < nLength; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
