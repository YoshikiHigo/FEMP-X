package unverified;

public class ClonePair6079 {

    boolean method1(Object[] s1,Object[] s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null || s2 == null)   return false;
      if (s1.length != s2.length)   return false;
      for (int i=0; i < s1.length; i++) {
        if (s1[i] != s2[i])     return false;
      }
      return true;
    }

    boolean method2(Object[] a,Object[] b){
      if (a == b)   return true;
      if ((a == null && b != null) || (a != null && b == null))   return false;
      if (a == null && b == null)   return true;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] == null) {
          if (b[i] != null)       return false;
        }
     else {
          if (!a[i].equals(b[i]))       return false;
        }
      }
      return true;
    }
}
