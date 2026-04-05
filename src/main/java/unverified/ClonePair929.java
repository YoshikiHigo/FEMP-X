package unverified;

public class ClonePair929 {

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

    boolean method2(byte[] d1,byte[] d2){
      if (d1.length != d2.length) {
        return false;
      }
      for (int i=0; i < d1.length; i++) {
        if (d1[i] != d2[i])     return false;
      }
      return true;
    }
}
