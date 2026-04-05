package unverified;

public class ClonePair6069 {

    boolean method1(Object[] arr1,Object[] arr2){
      if (arr1 == null && arr2 == null)   return true;
      if (arr1 == null ^ arr2 == null)   return false;
      if (!arr1.getClass().equals(arr2.getClass()))   return false;
      if (arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; ++i) {
        Object obj1=arr1[i];
        Object obj2=arr2[i];
        if (obj1 == null ^ obj2 == null)     return false;
        if (obj1 != null && !obj1.equals(obj2))     return false;
      }
      return true;
    }

    boolean method2(Object[] ar1,Object[] ar2){
      if (ar1 == ar2) {
        return true;
      }
      if (ar1 == null) {
        return ar2 == null;
      }
      if (ar2 == null) {
        return false;
      }
      int len1=ar1.length;
      int len2=ar2.length;
      if (len1 != len2) {
        return false;
      }
      for (int i=0; i < len1; i++) {
        if ((ar1[i] != null && !ar1[i].equals(ar2[i])) || (ar1[i] == null && ar2[i] != null)) {
          return false;
        }
      }
      return true;
    }
}
