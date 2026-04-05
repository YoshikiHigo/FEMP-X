package unverified;

public class ClonePair9649 {

    double method1(double data[]){
      double max=data[0];
      for (int i=0; i < data.length; i++) {
        if (data[i] > max)     max=data[i];
      }
      return max;
    }

    double method2(double a[]){
      double max=a[0];
      for (  double v : a)   if (v > max)   max=v;
      return max;
    }
}
