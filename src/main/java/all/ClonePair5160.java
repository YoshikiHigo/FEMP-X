package all;

public class ClonePair5160 {

    boolean method1(double[] x,double[] y){
      if (x.length != y.length) {
        return false;
      }
      for (int i=0; i < y.length; i++) {
        if (x[i] != y[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(double[] a,double[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
