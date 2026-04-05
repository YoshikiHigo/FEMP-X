package unverified;

public class ClonePair6090 {

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
      if (o1 == null && o2 == null) {
        return true;
      }
     else   if (o1 == null || o2 == null) {
        return false;
      }
      if (o1.length != o2.length) {
        return false;
      }
      for (int i=0; i < o1.length; i++) {
        if (o1[i] != o2[i]) {
          return false;
        }
      }
      return true;
    }
}
