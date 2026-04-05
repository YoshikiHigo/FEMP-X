package unverified;

public class ClonePair943 {

    boolean method1(byte[] acB,byte[] newAC){
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

    boolean method2(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b2.length; i++) {
        byte b=b2[i];
        if (b != b1[i])     return false;
      }
      return true;
    }
}
