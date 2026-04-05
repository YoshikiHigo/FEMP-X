package all;

public class ClonePair6113 {

    boolean method1(Object[] o1,Object[] o2){
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
