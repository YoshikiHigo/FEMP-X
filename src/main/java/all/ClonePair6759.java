package all;

public class ClonePair6759 {

    int method1(int dividend,int divisor){
      int result=0;
      if (divisor != 0) {
        result=((dividend % divisor) == 0) ? (dividend / divisor) : ((dividend / divisor) + 1);
      }
      return result;
    }

    int method2(int dividend,int divisor){
      if (divisor == 0) {
        return 0;
      }
      return ((dividend % divisor) == 0) ? (dividend / divisor) : ((dividend / divisor) + 1);
    }
}
