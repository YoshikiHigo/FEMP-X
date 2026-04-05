package unverified;

public class ClonePair160 {

    boolean method1(byte[] a,byte[] b){
      int len=a.length;
      if (len != b.length) {
        return false;
      }
      for (int i=0; i < len; ++i) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] bytea,byte[] byteb){
      boolean equal=true;
      if (bytea.length == byteb.length) {
        for (int i=0; i < bytea.length; i++) {
          if (bytea[i] != byteb[i]) {
            equal=false;
            break;
          }
        }
      }
     else {
        equal=false;
      }
      return equal;
    }
}
