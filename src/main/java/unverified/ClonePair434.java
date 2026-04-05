package unverified;

public class ClonePair434 {

    boolean method1(byte[] a,byte[] b){
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i])       return false;
        }
        return true;
      }
      return false;
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
