package all;

public class ClonePair4595 {

    double method1(double[] arrFunc){
      double dblMin=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] < dblMin) {
        dblMin=arrFunc[index];
      }
      return dblMin;
    }

    double method2(double[] array){
      double min=array[0];
      for (  double d : array)   if (d < min)   min=d;
      return min;
    }
}
