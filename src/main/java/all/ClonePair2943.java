package all;

public class ClonePair2943 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      int len=a.length;
      for (int i=0; i < len; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] arr1,byte[] arr2){
      if (arr1.length == arr2.length) {
        for (int i=0; i < arr1.length; i++) {
          if (arr1[i] != arr2[i])       return false;
        }
      }
     else {
        return false;
      }
      return true;
    }
}
