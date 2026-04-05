package unverified;

public class ClonePair4798 {

    double method1(double[] array){
      double min=array[0];
      for (  double d : array)   if (d < min)   min=d;
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
