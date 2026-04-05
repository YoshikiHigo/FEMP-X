package all;

public class ClonePair4800 {

    double method1(double[] array){
      double min=array[0];
      for (  double d : array)   if (d < min)   min=d;
      return min;
    }

    double method2(double[] array){
      double min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min)     min=array[i];
      }
      return min;
    }
}
