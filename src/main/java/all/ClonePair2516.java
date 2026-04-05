package all;

public class ClonePair2516 {

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

    boolean method2(byte[] name1,byte[] name2){
      if (name1.length != name2.length)   return false;
      if (name1 == name2)   return true;
      for (int i=name1.length; --i >= 0; )   if (name1[i] != name2[i])   return false;
      return true;
    }
}
