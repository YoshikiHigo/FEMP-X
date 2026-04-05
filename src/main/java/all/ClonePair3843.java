package all;

public class ClonePair3843 {

    double method1(double[] m1,double[] m2){
      double res=0.0;
      for (int i=0; i < m1.length; i++) {
        res+=m1[i] * m2[i];
      }
      return res;
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
