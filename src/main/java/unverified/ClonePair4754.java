package unverified;

public class ClonePair4754 {

    double method1(double[] numbers){
      int maxIdx=0;
      for (int i=1; i < numbers.length; i++) {
        if (numbers[i] > numbers[maxIdx]) {
          maxIdx=i;
        }
      }
      return numbers[maxIdx];
    }

    double method2(double[] array){
      double max=array[0];
      for (  double d : array)   if (d > max)   max=d;
      return max;
    }
}
