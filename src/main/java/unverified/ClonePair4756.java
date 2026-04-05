package unverified;

public class ClonePair4756 {

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
