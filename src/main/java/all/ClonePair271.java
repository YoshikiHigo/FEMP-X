package all;

public class ClonePair271 {

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

    boolean method2(byte[] arr1,byte[] arr2){
      if (arr1 == null && arr2 == null)   return true;
      if (arr1 == null || arr2 == null)   return false;
      if (arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i])     return false;
      }
      return true;
    }
}
