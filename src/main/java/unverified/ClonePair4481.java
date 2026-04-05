package unverified;

public class ClonePair4481 {

    double method1(double[] arrFunc){
      double dblMax=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] > dblMax) {
        dblMax=arrFunc[index];
      }
      return dblMax;
    }

    double method2(double[] array){
      double max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max)     max=array[i];
      }
      return max;
    }
}
