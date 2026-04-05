package unverified;

public class ClonePair761 {

    boolean method1(byte[] a,byte[] a2){
      if (a == a2) {
        return true;
      }
      if (a == null || a2 == null) {
        return false;
      }
      int length=a.length;
      if (a2.length != length) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (a[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] bytesA,byte[] bytesB){
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
}
