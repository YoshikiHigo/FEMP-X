package all;

public class ClonePair2024 {

    boolean method1(byte[] a,byte[] b){
      boolean v=a.length == b.length;
      for (int i=0; i < a.length && v; i++) {
        if (a[i] != b[i])     v=false;
      }
      return v;
    }

    boolean method2(byte[] x,byte[] y){
      if (x == y) {
        return (true);
      }
      int len=x.length;
      if (len != y.length) {
        return (false);
      }
      for (int i=0; i < len; i++) {
        if (x[i] != y[i]) {
          return (false);
        }
      }
      return (true);
    }
}
