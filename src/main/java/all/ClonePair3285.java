package all;

public class ClonePair3285 {

    boolean method1(int[] xs,int[] ys){
      if (xs.length != ys.length)   return false;
      for (int i=xs.length - 1; i >= 0; i--) {
        if (xs[i] != ys[i])     return false;
      }
      return true;
    }

    boolean method2(int[] a,int[] b){
      if (a.length != b.length)   return false;
      for (int i=0, bound=a.length; i < bound; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
