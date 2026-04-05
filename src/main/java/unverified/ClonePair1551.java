package unverified;

public class ClonePair1551 {

    boolean method1(byte[] left,byte[] right){
      if (left == null) {
        return ((right == null) ? true : false);
      }
      if (right == null) {
        return ((left == null) ? true : false);
      }
      if (left.length != right.length)   return false;
      for (int i=0; i < left.length; i++) {
        if (left[i] != right[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] arr1,byte[] arr2){
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
}
