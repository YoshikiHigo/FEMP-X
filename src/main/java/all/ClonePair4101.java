package all;

import java.util.HashSet;
import java.util.Iterator;

public class ClonePair4101 {

    boolean method1(String[] s1,String[] s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null || s2 == null)   return false;
      if (s1.length != s2.length)   return false;
      for (int i=0; i < s1.length; i++) {
        if (s1[i] != s2[i])     return false;
      }
      return true;
    }

    boolean method2(String[] arr1,String[] arr2){
      if (arr1 == null && arr2 == null) {
        return true;
      }
      if (arr1 == null || arr2 == null) {
        return false;
      }
      if (arr1.length != arr2.length) {
        return false;
      }
      HashSet<String> set1=new HashSet<String>();
      HashSet<String> set2=new HashSet<String>();
      for (int i=0; i < arr1.length; i++) {
        set1.add(arr1[i]);
        set2.add(arr2[i]);
      }
      Iterator<String> itr=set1.iterator();
      while (itr.hasNext()) {
        if (!set2.contains(itr.next())) {
          return false;
        }
      }
      return true;
    }
}
