package unverified;

public class ClonePair6041 {

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
