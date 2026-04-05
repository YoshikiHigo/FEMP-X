package unverified;

public class ClonePair3878 {

    double method1(double[] v1,double[] v2){
      final int m=v1.length;
      double sum=0;
      for (int r=0; r < m; r++) {
        sum+=v1[r] * v2[r];
      }
      return sum;
    }

    double method2(double[] vec1,double[] vec2){
      int n=vec1.length;
      double res=0.0;
      for (int i=0; i < n; ++i)   res+=vec1[i] * vec2[i];
      return (res);
    }
}
