package unverified;

public class ClonePair3854 {

    double method1(double[] a,double[] b){
      double r=0;
      for (int i=0; i < a.length; i++)   r+=a[i] * b[i];
      return r;
    }

    double method2(double[] a,double[] b){
      final int length=a.length;
      double value=0;
      for (int i=0; i < length; ++i) {
        value+=a[i] * b[i];
      }
      return value;
    }
}
