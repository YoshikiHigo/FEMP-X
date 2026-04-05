package all;

public class ClonePair3842 {

    double method1(double[] m1,double[] m2){
      double res=0.0;
      for (int i=0; i < m1.length; i++) {
        res+=m1[i] * m2[i];
      }
      return res;
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
