package all;

public class ClonePair3859 {

    double method1(double[] v1,double[] v2){
      double r=0;
      for (int i=0; i < v1.length; ++i) {
        r+=v1[i] * v2[i];
      }
      return r;
    }

    double method2(double[] v1,double[] v2){
      final int m=v1.length;
      double sum=0;
      for (int r=0; r < m; r++) {
        sum+=v1[r] * v2[r];
      }
      return sum;
    }
}
