package all;

public class ClonePair4828 {

    double method1(double[] numbers){
      int minIdx=0;
      for (int i=1; i < numbers.length; i++) {
        if (numbers[i] < numbers[minIdx]) {
          minIdx=i;
        }
      }
      return numbers[minIdx];
    }

    double method2(double[] array){
      double min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min)     min=array[i];
      }
      return min;
    }
}
