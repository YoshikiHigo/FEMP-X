package unverified;

public class ClonePair2900 {

    boolean method1(byte[] a,byte[] b){
      for (int i=0; i != a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] fixed,byte[] temp){
      for (int i=0; i < fixed.length; i++) {
        if (temp[i] != fixed[i])     return false;
      }
      return true;
    }
}
