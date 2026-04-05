package unverified;

public class ClonePair2661 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=b1.length; --i >= 0; ) {
        if (b1[i] != b2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i])     return false;
      }
      return true;
    }
}
