package all;

public class ClonePair4819 {

    double method1(double[] A){
      double min=A[0];
      for (int i=0; i < A.length; i++) {
        min=(min < A[i] ? min : A[i]);
      }
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
