package all;

public class ClonePair3879 {

    double method1(double[] v1,double[] v2){
      final int m=v1.length;
      double sum=0;
      for (int r=0; r < m; r++) {
        sum+=v1[r] * v2[r];
      }
      return sum;
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
