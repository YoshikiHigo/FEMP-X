package all;

import java.util.*;

public class ClonePair6076 {

    boolean method1(Object[] s1,Object[] s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null || s2 == null)   return false;
      if (s1.length != s2.length)   return false;
      for (int i=0; i < s1.length; i++) {
        if (s1[i] != s2[i])     return false;
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
