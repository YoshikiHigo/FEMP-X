package all;

import java.util.*;

public class ClonePair6067 {

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

    boolean method2(Object[] array1,Object[] array2){
      if ((array1 == null) && (array2 == null)) {
        return true;
      }
     else   if ((array1 == null) || (array2 == null)) {
        return false;
      }
      if (array1.length != array2.length) {
        return false;
      }
      List<Object> list=Arrays.asList(array2);
      for (int i=0; i < array1.length; i++) {
        Object o1=array1[i];
        if (!list.contains(o1)) {
          return false;
        }
      }
      return true;
    }
}
