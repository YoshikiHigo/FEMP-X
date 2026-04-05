package unverified;

public class ClonePair774 {

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

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if ((b1 == null) || (b2 == null)) {
        return false;
      }
      if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; ++i)   if (b1[i] != b2[i]) {
        return false;
      }
      return true;
    }
}
