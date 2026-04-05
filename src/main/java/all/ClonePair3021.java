package all;

public class ClonePair3021 {

    boolean method1(byte[] a,byte[] b){
      if (a == null || b == null) {
        return false;
      }
      int aLength=a.length;
      if (aLength != b.length) {
        return false;
      }
      for (int i=0; i < aLength; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] one,byte[] two){
      if ((one == null) || (two == null)) {
        return false;
      }
      if (one.length != two.length) {
        return false;
      }
      int length=one.length;
      int byteCount=0;
      while (byteCount < length) {
        if (one[byteCount] != two[byteCount]) {
          return false;
        }
        ++byteCount;
      }
      return true;
    }
}
