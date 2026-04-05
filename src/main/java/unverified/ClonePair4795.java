package unverified;

public class ClonePair4795 {

    double method1(double[] data){
      double max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
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
