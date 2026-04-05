package all;

public class ClonePair4485 {

    double method1(double[] arrFunc){
      double dblMax=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] > dblMax) {
        dblMax=arrFunc[index];
      }
      return dblMax;
    }

    double method2(double[] x){
      double max=x[0];
      for (  double xi : x) {
        if (xi > max) {
          max=xi;
        }
      }
      return max;
    }
}
