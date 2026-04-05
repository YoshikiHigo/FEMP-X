package all;

public class ClonePair3846 {

    double method1(double[] m1,double[] m2){
      double res=0.0;
      for (int i=0; i < m1.length; i++) {
        res+=m1[i] * m2[i];
      }
      return res;
    }

    double method2(double[] vec1,double[] vec2){
      int n=vec1.length;
      double res=0.0;
      for (int i=0; i < n; ++i)   res+=vec1[i] * vec2[i];
      return (res);
    }
}
