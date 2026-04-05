package unverified;

public class ClonePair2609 {

    boolean method1(byte[] a1,byte[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
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
