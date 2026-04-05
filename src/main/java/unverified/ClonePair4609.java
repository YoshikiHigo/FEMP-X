package unverified;

public class ClonePair4609 {

    double method1(double[] values){
      double min=values[0];
      for (int f=0; f < values.length; f++)   if (values[f] < min)   min=values[f];
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
