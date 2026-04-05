package all;

public class ClonePair3910 {

    double method1(double[] vec1,double[] vec2){
      int n=vec1.length;
      double res=0.0;
      for (int i=0; i < n; ++i)   res+=vec1[i] * vec2[i];
      return (res);
    }

    double method2(double[] ovx,double[] ovy){
      double ddot=0.0;
      if (ovx.length <= 0) {
        return ddot;
      }
      for (int i=0; i < ovx.length; i++) {
        ddot+=ovx[i] * ovy[i];
      }
      return ddot;
    }
}
