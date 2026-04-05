package all;

public class ClonePair4487 {

    double method1(double[] values){
      double[] tmp_options=new double[values.length];
      int num=0;
      for (int i=0; i < values.length; i++) {
        if (Double.isNaN(values[i])) {
          continue;
        }
     else {
          tmp_options[num]=values[i];
          num++;
        }
      }
      double minDistance=Double.NaN;
      if (num != 0) {
        minDistance=Double.MAX_VALUE;
        for (int i=0; i < num; i++) {
          if (tmp_options[i] < minDistance) {
            minDistance=tmp_options[i];
          }
        }
      }
      return minDistance;
    }

    double method2(double[] x){
      if (x.length == 0)   return Double.NaN;
      double min=Double.MAX_VALUE;
      for (  double v : x) {
        if (min > v)     min=v;
      }
      return min;
    }
}
