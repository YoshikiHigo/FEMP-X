package unverified;

public class ClonePair4483 {

    double method1(double[] arrFunc){
      double dblMax=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] > dblMax) {
        dblMax=arrFunc[index];
      }
      return dblMax;
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
