package all;

public class ClonePair4615 {

    double method1(double[] a){
      double b=a[0];
      for (int i=0; i < a.length; i++)   if (a[i] > b)   b=a[i];
      return b;
    }

    double method2(double[] data){
      double max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }
}
