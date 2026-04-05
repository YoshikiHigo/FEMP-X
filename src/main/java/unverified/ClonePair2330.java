package unverified;

public class ClonePair2330 {

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

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if ((b1 == null) || (b2 == null)) {
        return false;
      }
      if (b1.length != b2.length) {
        return false;
      }
      for (int i=0; i < b1.length; ++i)   if (b1[i] != b2[i]) {
        return false;
      }
      return true;
    }
}
