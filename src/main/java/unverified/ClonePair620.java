package unverified;

public class ClonePair620 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length == b2.length) {
        for (int ii=0; ii < b1.length; ++ii) {
          if (b1[ii] != b2[ii]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] acB,byte[] newAC){
      if (acB.length != newAC.length) {
        return false;
      }
      for (int i=0; i < acB.length; i++) {
        if (acB[i] != newAC[i]) {
          return false;
        }
     else {
          break;
        }
      }
      return true;
    }
}
