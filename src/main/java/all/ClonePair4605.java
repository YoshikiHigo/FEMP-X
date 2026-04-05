package all;

public class ClonePair4605 {

    double method1(double[] values){
      double min=values[0];
      for (int f=0; f < values.length; f++)   if (values[f] < min)   min=values[f];
      return min;
    }

    double method2(double[] v){
      double min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }
}
