package unverified;

public class ClonePair2517 {

    boolean method1(byte[] signreq2,byte[] signres2){
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

    boolean method2(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; ++i)   if (a[i] != b[i])   return false;
      return true;
    }
}
