package all;

public class ClonePair4797 {

    double method1(double[] array){
      double min=array[0];
      for (  double d : array)   if (d < min)   min=d;
      return min;
    }

    double method2(double[] numbers){
      int minIdx=0;
      for (int i=1; i < numbers.length; i++) {
        if (numbers[i] < numbers[minIdx]) {
          minIdx=i;
        }
      }
      return numbers[minIdx];
    }
}
