package unverified;

public class ClonePair3835 {

    double method1(double[] a,double[] b){
      double total=0.0;
      for (int i=0; i < a.length; i++) {
        total+=(a[i] * b[i]);
      }
      return total;
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
