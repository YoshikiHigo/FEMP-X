package unverified;

public class ClonePair1594 {

    boolean method1(byte[] bytes1,byte[] bytes2){
      boolean result=(bytes1.length == bytes2.length);
      for (int i=0; i < bytes1.length && result; i++) {
        result=bytes1[i] == bytes2[i];
      }
      return result;
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
