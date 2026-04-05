package all;

public class ClonePair6053 {

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
