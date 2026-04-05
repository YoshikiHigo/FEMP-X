package all;

public class ClonePair4597 {

    double method1(double[] arrFunc){
      double dblMin=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] < dblMin) {
        dblMin=arrFunc[index];
      }
      return dblMin;
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
