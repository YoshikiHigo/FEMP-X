package all;

public class ClonePair1234 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 != null) {
        if (b2 != null) {
          if (b1.length == b2.length) {
            boolean flag=true;
            for (int i=0; i < b1.length; i++) {
              if (b1[i] != b2[i]) {
                flag=false;
                break;
              }
            }
            return flag;
          }
     else {
            return false;
          }
        }
     else {
          return false;
        }
      }
     else {
        if (b2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
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
