package all;

public class ClonePair3833 {

    double method1(double[] a,double[] b){
      double total=0.0;
      for (int i=0; i < a.length; i++) {
        total+=(a[i] * b[i]);
      }
      return total;
    }

    double method2(double[] v1,double[] v2){
      double r=0;
      for (int i=0; i < v1.length; ++i) {
        r+=v1[i] * v2[i];
      }
      return r;
    }
}
