package all;

public class ClonePair4490 {

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

    double method2(double[] values){
      double min=Double.NaN;
      if (values.length > 0) {
        min=values[0];
        for (int i=values.length; --i >= 1; ) {
          if (values[i] < min) {
            min=values[i];
          }
        }
      }
      return min;
    }
}
