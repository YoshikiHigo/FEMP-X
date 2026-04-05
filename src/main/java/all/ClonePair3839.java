package all;

public class ClonePair3839 {

    double method1(double[] a,double[] b){
      double total=0.0;
      for (int i=0; i < a.length; i++) {
        total+=(a[i] * b[i]);
      }
      return total;
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
