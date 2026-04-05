package all;

public class ClonePair9785 {

    double method1(double ar[]){
      int i;
      double m;
      m=ar[0];
      for (i=1; i < ar.length; ++i) {
        if (m < ar[i])     m=ar[i];
      }
      return m;
    }

    double method2(double a[]){
      double max=a[0];
      for (  double v : a)   if (v > max)   max=v;
      return max;
    }
}
