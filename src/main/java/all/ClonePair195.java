package all;

public class ClonePair195 {

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

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2)   return true;
      if (b1 == null || b2 == null)   return false;
      int length=b1.length;
      if (length != b2.length) {
        return false;
      }
      for (int index=0; index < length; index++) {
        if (!(b1[index] == b2[index])) {
          return false;
        }
      }
      return true;
    }
}
