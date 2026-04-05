package unverified;

public class ClonePair6046 {

    boolean method1(Object[] a,Object[] b){
      if (a == b)   return true;
      if (a == null || b == null)   return false;
      int len=a.length;
      if (len != b.length)   return false;
      for (int i=0; i < len; ++i) {
        if (a[i] == null) {
          if (b[i] != null)       return false;
        }
     else {
          if (!a[i].equals(b[i]))       return false;
        }
      }
      return true;
    }

    boolean method2(Object[] s1,Object[] s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null || s2 == null)   return false;
      if (s1.length != s2.length)   return false;
      for (int i=0; i < s1.length; i++) {
        if (s1[i] != s2[i])     return false;
      }
      return true;
    }
}
