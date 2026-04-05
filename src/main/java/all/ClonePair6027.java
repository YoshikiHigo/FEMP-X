package all;

public class ClonePair6027 {

    boolean method1(Object[] a,Object[] b){
      if (a == null || b == null || a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; i++) {
        if (!a[i].equals(b[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Object[] a,Object[] b){
      if (a == null || b == null)   return false;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (!(a[i].equals(b[i])))     return false;
      }
      return true;
    }
}
