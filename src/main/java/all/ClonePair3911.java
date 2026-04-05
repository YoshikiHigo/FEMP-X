package all;

public class ClonePair3911 {

    double method1(double[] value1,double[] value2){
      double max=Double.NEGATIVE_INFINITY;
      for (int i=0; i < value1.length; i++) {
        double v1=value1[i];
        double v2=value2[i];
        if ((!Double.isNaN(v1)) && (!Double.isNaN(v2))) {
          double d=Math.abs(v1 - v2);
          if (d > max)       max=d;
        }
      }
      if (max > Double.NEGATIVE_INFINITY)   return max;
     else   return Double.NaN;
    }

    double method2(double[] value1,double[] value2){
      double sum=0.0;
      int counter=0;
      for (int i=0; i < value1.length; i++) {
        if ((!Double.isNaN(value1[i])) && (!Double.isNaN(value2[i]))) {
          double diff=value1[i] - value2[i];
          sum+=diff * diff;
          counter++;
        }
      }
      if (counter > 0)   return Math.sqrt(sum);
     else   return Double.NaN;
    }
}
