package unverified;

public class ClonePair4635 {

    double method1(double[] v){
      double max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
    }

    double method2(double[] numbers){
      int maxIdx=0;
      for (int i=1; i < numbers.length; i++) {
        if (numbers[i] > numbers[maxIdx]) {
          maxIdx=i;
        }
      }
      return numbers[maxIdx];
    }
}
