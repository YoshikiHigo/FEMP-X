package all;

public class ClonePair3848 {

    double method1(double[] doubleArray,double[] d2Array){
      double temp=0;
      double sum=0;
      for (int i=0; i < doubleArray.length; i++) {
        temp=doubleArray[i] - d2Array[i];
        if (temp < 0) {
          sum-=temp;
        }
     else {
          sum+=temp;
        }
      }
      return sum;
    }

    double method2(double[] value1,double[] value2){
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
}
