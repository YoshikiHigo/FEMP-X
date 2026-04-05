package all;

public class ClonePair4849 {

    double method1(double[] array){
      double max=array[0];
      for (  double d : array)   if (d > max)   max=d;
      return max;
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
