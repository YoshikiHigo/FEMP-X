package unverified;

public class ClonePair1341 {

    boolean method1(byte[] arr1,byte[] arr2){
      if (arr1.length != arr2.length) {
        return false;
      }
      for (int i=0; i != arr1.length; i++) {
        if (arr1[i] != arr2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      boolean v=a.length == b.length;
      for (int i=0; i < a.length && v; i++) {
        if (a[i] != b[i])     v=false;
      }
      return v;
    }
}
