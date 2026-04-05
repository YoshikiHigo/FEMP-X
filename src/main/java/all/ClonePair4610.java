package all;

public class ClonePair4610 {

    double method1(double[] values){
      double min=values[0];
      for (int f=0; f < values.length; f++)   if (values[f] < min)   min=values[f];
      return min;
    }

    double method2(double[] d){
      double low=d[0];
      for (int k=1; k < d.length; k++) {
        if (d[k] < low) {
          low=d[k];
        }
      }
      return low;
    }
}
