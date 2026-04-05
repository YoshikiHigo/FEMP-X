package all;

import java.util.*;

public class ClonePair6094 {

    boolean method1(Object[] array1,Object[] array2){
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

    boolean method2(Object[] array1,Object[] array2){
      if (array1 == null && array2 == null) {
        return true;
      }
     else   if (array1 == null || array2 == null) {
        return false;
      }
      if (array1.length != array2.length) {
        return false;
      }
      final List<Object> list=Arrays.asList(array2);
      final int length=array1.length;
      for (int i=0; i < length; i++) {
        final Object o1=array1[i];
        if (!list.contains(o1)) {
          return false;
        }
      }
      return true;
    }
}
