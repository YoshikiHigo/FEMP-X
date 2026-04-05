package unverified;

public class ClonePair164 {

    boolean method1(byte[] a,byte[] b){
      int len=a.length;
      if (len != b.length) {
        return false;
      }
      for (int i=0; i < len; ++i) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] signreq2,byte[] signres2){
      boolean retval=true;
      if (signreq2.length != signres2.length) {
        return false;
      }
      for (int i=0; i < signreq2.length; i++) {
        if (signreq2[i] != signres2[i]) {
          return false;
        }
      }
      return retval;
    }
}
