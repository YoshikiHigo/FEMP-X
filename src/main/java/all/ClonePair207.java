package all;

public class ClonePair207 {

    boolean method1(byte[] a,byte[] b){
      if (a == null && b == null) {
        return true;
      }
      if (a == null || b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
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
