package unverified;

public class ClonePair2509 {

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

    boolean method2(byte[] first,byte[] second){
      boolean equal=first.length == second.length;
      for (int i=0; i < first.length && equal; i++) {
        equal=first[i] == second[i];
      }
      return equal;
    }
}
