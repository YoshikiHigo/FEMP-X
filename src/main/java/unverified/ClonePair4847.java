package unverified;

public class ClonePair4847 {

    double method1(double[] array){
      double max=array[0];
      for (  double d : array)   if (d > max)   max=d;
      return max;
    }

    double method2(double[] array){
      int len=array.length;
      int best=0;
      double max=array[0];
      for (int i=1; i < len; i++) {
        if (array[i] > max) {
          best=i;
          max=array[i];
        }
      }
      return max;
    }
}
