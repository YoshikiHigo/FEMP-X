package unverified;

public class ClonePair1799 {

    boolean method1(byte[] bytesA,byte[] bytesB){
      if (bytesA == bytesB) {
        return true;
      }
      if (bytesA == null || bytesB == null) {
        return false;
      }
      if (bytesA.length != bytesB.length) {
        return false;
      }
      for (int i=0; i < bytesA.length; i++) {
        if (bytesA[i] != bytesB[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a1,byte[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
    }
}
