package all;

public class ClonePair4723 {

    double method1(double[] v){
      double min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
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
