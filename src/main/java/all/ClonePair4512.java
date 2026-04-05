package all;

public class ClonePair4512 {

    double method1(double[] series){
      double res=0D;
      int count=0;
      for (  double tp : series) {
        if (Double.isNaN(tp) || Double.isInfinite(tp)) {
          continue;
        }
     else {
          res+=tp;
          count+=1;
        }
      }
      if (count > 0) {
        return res / ((Integer)count).doubleValue();
      }
      return Double.NaN;
    }

    double method2(double[] values){
      if (values.length == 0) {
        return Double.NaN;
      }
      double sum=0;
      for (  double d : values) {
        sum+=d;
      }
      return sum / values.length;
    }
}
