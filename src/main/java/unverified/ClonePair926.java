package unverified;

public class ClonePair926 {

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

    boolean method2(byte[] o1,byte[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
    }
}
