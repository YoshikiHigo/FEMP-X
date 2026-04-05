package all;

public class ClonePair6228 {

    boolean method1(boolean[] a,boolean[] b){
      if (a.length != b.length) {
        return false;
      }
      boolean res=true;
      for (int i=0; i < a.length; i++) {
        res&=a[i] == b[i];
      }
      return res;
    }

    boolean method2(boolean[] a,boolean[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
