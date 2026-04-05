package all;

public class ClonePair4599 {

    double method1(double[] arrFunc){
      double dblMin=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] < dblMin) {
        dblMin=arrFunc[index];
      }
      return dblMin;
    }

    double method2(double[] array){
      double min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min)     min=array[i];
      }
      return min;
    }
}
