package all;

public class ClonePair9402 {

    double method1(double a[]){
      double min=a[0];
      for (  double v : a)   if (v < min)   min=v;
      return min;
    }

    double method2(double ar[]){
      int i;
      double m;
      m=ar[0];
      for (i=1; i < ar.length; ++i) {
        if (m > ar[i])     m=ar[i];
      }
      return m;
    }
}
