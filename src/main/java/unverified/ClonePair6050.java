package unverified;

public class ClonePair6050 {

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
