package unverified;

public class ClonePair2641 {

    boolean method1(byte[] a,byte[] b){
      for (int i=0; i < a.length && i < b.length; i++)   if (a[i] != b[i])   return false;
      return a.length == b.length;
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
