package all;

public class ClonePair9458 {

    int method1(int[] numbers){
      if (numbers == null || numbers.length == 0) {
        return 0;
      }
      int curMax=numbers[0];
      for (int i=1; i < numbers.length; i++) {
        if (numbers[i] > curMax) {
          curMax=numbers[i];
        }
      }
      return curMax;
    }

    int method2(int[] values){
      if (values == null || values.length == 0) {
        return 0;
      }
      int max=values[0];
      for (int i=1; i < values.length; i++) {
        if (max < values[i]) {
          max=values[i];
        }
      }
      return max;
    }
}
