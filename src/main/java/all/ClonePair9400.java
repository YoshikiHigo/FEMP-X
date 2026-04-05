package all;

public class ClonePair9400 {

    double method1(double a[]){
      double min=a[0];
      for (  double v : a)   if (v < min)   min=v;
      return min;
    }

    double method2(double... values){
      double value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] <= value)     value=values[i];
      }
      return value;
    }
}
