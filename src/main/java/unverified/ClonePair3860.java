package unverified;

public class ClonePair3860 {

    double method1(double[] v1,double[] v2){
      double r=0;
      for (int i=0; i < v1.length; ++i) {
        r+=v1[i] * v2[i];
      }
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
