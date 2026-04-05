package unverified;

public class ClonePair2743 {

    boolean method1(byte[] x,byte[] y){
      if (x == y) {
        return (true);
      }
      int len=x.length;
      if (len != y.length) {
        return (false);
      }
      for (int i=0; i < len; i++) {
        if (x[i] != y[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(byte[] array1,byte[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
