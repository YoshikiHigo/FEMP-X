package all;

public class ClonePair6074 {

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

    boolean method2(Object[] o1,Object[] o2){
      if (o1 == null && o2 == null) {
        return true;
      }
     else   if (o1 == null || o2 == null) {
        return false;
      }
      if (o1.length != o2.length) {
        return false;
      }
      for (int i=0; i < o1.length; i++) {
        if (o1[i] != o2[i]) {
          return false;
        }
      }
      return true;
    }
}
