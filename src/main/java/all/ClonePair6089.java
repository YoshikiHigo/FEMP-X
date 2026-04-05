package all;

public class ClonePair6089 {

    boolean method1(Object[] a,Object[] a2){
      if (a == a2) {
        return true;
      }
      if (a == null || a2 == null) {
        return false;
      }
      int length=a.length;
      if (a2.length != length) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (a[i] != a2[i]) {
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
