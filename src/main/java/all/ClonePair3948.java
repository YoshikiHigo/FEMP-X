package all;

public class ClonePair3948 {

    int method1(byte[] x,byte[] y){
      int min=x.length < y.length ? x.length : y.length;
      for (int i=0; i < min; i++)   if (x[i] != y[i])   return x[i] - y[i];
      return x.length - y.length;
    }

    int method2(byte[] a,byte[] b){
      int len=Math.min(a.length,b.length);
      for (int i=0; i < len; i++) {
        byte ai=a[i];
        byte bi=b[i];
        if (ai != bi) {
          return ai - bi;
        }
      }
      return a.length - b.length;
    }
}
