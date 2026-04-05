package all;

public class ClonePair2991 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b2.length; i++) {
        byte b=b2[i];
        if (b != b1[i])     return false;
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
