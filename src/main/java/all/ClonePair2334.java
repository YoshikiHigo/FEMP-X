package all;

public class ClonePair2334 {

    boolean method1(byte[] arr1,byte[] arr2){
      if (arr1 == null && arr2 == null)   return true;
      if (arr1 == null ^ arr2 == null)   return false;
      if (!arr1.getClass().equals(arr2.getClass()))   return false;
      if (arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; ++i) {
        byte b1=arr1[i];
        byte b2=arr2[i];
        if (b1 != b2)     return false;
      }
      return true;
    }

    boolean method2(byte[] bytes1,byte[] bytes2){
      if (bytes1 == null && bytes2 == null) {
        return true;
      }
     else   if (bytes1 == null || bytes2 == null) {
        return false;
      }
      if (bytes1.length != bytes2.length) {
        return false;
      }
      for (int i=0; i < bytes1.length; i++) {
        if (bytes1[i] != bytes2[i]) {
          return false;
        }
      }
      return true;
    }
}
