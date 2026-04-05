package all;

public class ClonePair6791 {

    int method1(int value,int min,int max){
      if (value > max) {
        return max;
      }
      if (value < min) {
        return min;
      }
      return value;
    }

    int method2(int n,int min,int max){
      if (n <= min)   return min;
      if (n >= max)   return max;
      return n;
    }
}
