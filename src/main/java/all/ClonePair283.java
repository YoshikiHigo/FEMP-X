package all;

public class ClonePair283 {

    boolean method1(byte[] a,byte[] b){
      int alength=(a == null) ? 0 : a.length;
      int blength=(b == null) ? 0 : b.length;
      if (alength != blength) {
        return false;
      }
      for (int i=0; i < alength; ++i) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] array1,byte[] array2){
      if (array1 == null || array1.length == 0) {
        return array2 == null || array2.length == 0;
      }
      if (array2 == null || array1.length != array2.length) {
        return false;
      }
      for (int i=array1.length - 1; i >= 0; i--) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
