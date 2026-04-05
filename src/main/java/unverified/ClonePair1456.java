package unverified;

public class ClonePair1456 {

    boolean method1(byte[] b1,byte[] b2){
      boolean ret=b1.length == b2.length;
      for (int i=0; ret && i < b1.length; i++) {
        ret=b1[i] == b2[i];
      }
      return ret;
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
