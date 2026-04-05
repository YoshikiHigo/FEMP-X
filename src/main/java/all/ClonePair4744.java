package all;

public class ClonePair4744 {

    double method1(double[] numbers){
      int maxIdx=0;
      for (int i=1; i < numbers.length; i++) {
        if (numbers[i] > numbers[maxIdx]) {
          maxIdx=i;
        }
      }
      return numbers[maxIdx];
    }

    double method2(double[] data){
      double max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }
}
