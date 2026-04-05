package all;

public class ClonePair1007 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] arr1,byte[] arr2){
      if (arr1.length != arr2.length) {
        return false;
      }
      for (int i=0; i != arr1.length; i++) {
        if (arr1[i] != arr2[i])     return false;
      }
      return true;
    }
}
