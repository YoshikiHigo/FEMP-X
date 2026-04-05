package unverified;

public class ClonePair4617 {

    double method1(double[] a){
      double b=a[0];
      for (int i=0; i < a.length; i++)   if (a[i] > b)   b=a[i];
      return b;
    }

    double method2(double[] array){
      double max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max)     max=array[i];
      }
      return max;
    }
}
