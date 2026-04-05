package unverified;

public class ClonePair4784 {

    double method1(double[] verteces){
      double l;
      l=verteces[0];
      for (int i=0; i < verteces.length; i++) {
        if (verteces[i] < l) {
          l=verteces[i];
        }
      }
      return l;
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
