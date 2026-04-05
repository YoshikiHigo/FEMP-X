package unverified;

public class ClonePair2774 {

    boolean method1(byte[] a1,byte[] a2){
      if ((a1 == null) || (a2 == null)) {
        return a1 == a2;
      }
      int nLength=a1.length;
      if (nLength != a2.length) {
        return false;
      }
      for (int i=0; i < nLength; i++) {
        if (a1[i] != a2[i]) {
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
