package unverified;

public class ClonePair1926 {

    boolean method1(byte[] blob,byte[] sig){
      int n=sig.length;
      for (int i=0; i < n; i++) {
        if (blob[i] != sig[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] src,byte[] cmp){
      for (int i=0; i < cmp.length; i++) {
        if (src[i] != cmp[i]) {
          return false;
        }
      }
      return true;
    }
}
