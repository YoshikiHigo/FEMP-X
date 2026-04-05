package unverified;

public class ClonePair2637 {

    boolean method1(byte[] a,byte[] b){
      for (int i=0; i < a.length && i < b.length; i++)   if (a[i] != b[i])   return false;
      return a.length == b.length;
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
