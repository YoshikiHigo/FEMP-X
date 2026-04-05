package unverified;

public class ClonePair3832 {

    double method1(double[] a,double[] b){
      double total=0.0;
      for (int i=0; i < a.length; i++) {
        total+=(a[i] * b[i]);
      }
      return total;
    }

    double method2(double[] a,double[] b){
      double r=0;
      for (int i=0; i < a.length; i++)   r+=a[i] * b[i];
      return r;
    }
}
