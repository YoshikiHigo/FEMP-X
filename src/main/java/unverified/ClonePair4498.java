package unverified;

public class ClonePair4498 {

    double method1(double[] A){
      double max=A[0];
      for (int i=0; i < A.length; i++) {
        max=(max > A[i] ? max : A[i]);
      }
      return max;
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
