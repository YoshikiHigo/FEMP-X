package all;

public class ClonePair10604 {

    double method1(double a[]){
      double max=a[0];
      for (  double v : a)   if (v > max)   max=v;
      return max;
    }

    double method2(double... values){
      double value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] >= value)     value=values[i];
      }
      return value;
    }
}
