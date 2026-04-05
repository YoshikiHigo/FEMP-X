package unverified;

public class ClonePair3883 {

    double method1(double[] a,double[] b){
      final int length=a.length;
      double value=0;
      for (int i=0; i < length; ++i) {
        value+=a[i] * b[i];
      }
      return value;
    }

    double method2(double[] value1,double[] value2){
      double sum=0.0;
      for (int i=0; i < value1.length; i++) {
        double v1=value1[i];
        double v2=value2[i];
        if ((!Double.isNaN(v1)) && (!Double.isNaN(v2))) {
          sum=sum + v2 * v1;
        }
      }
      return sum;
    }
}
