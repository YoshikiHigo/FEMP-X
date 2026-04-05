package unverified;

public class ClonePair6072 {

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
      if (o1 == null && o2 == null)   return true;
      if (o1 == null || o2 == null)   return false;
      if (o1.length != o2.length)   return false;
      for (int i=0; i < o1.length; i++) {
        Object a1=o1[i];
        Object a2=o2[i];
        if (!(a1 == null ? a2 == null : a1.equals(a2)))     return false;
      }
      return true;
    }
}
