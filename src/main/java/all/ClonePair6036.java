package all;

import java.util.*;

public class ClonePair6036 {

    boolean method1(Object[] a,Object[] b){
      if (a == null) {
        return (b == null);
      }
     else {
        if (b == null) {
          return false;
        }
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] == null) {
          if (b[i] != null) {
            return false;
          }
          continue;
        }
     else {
          if (b[i] == null) {
            return false;
          }
        }
        if (!a[i].equals(b[i])) {
          return false;
        }
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
