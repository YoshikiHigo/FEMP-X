package all;

public class ClonePair6760 {

    int method1(int dividend,int divisor){
      int result=0;
      if (divisor != 0) {
        result=((dividend % divisor) == 0) ? (dividend / divisor) : ((dividend / divisor) + 1);
      }
      return result;
    }

    int method2(int totalSize,int rowSize){
      if (rowSize == 0) {
        return 0;
      }
      if (totalSize % rowSize == 0) {
        return totalSize / rowSize;
      }
     else {
        return totalSize / rowSize + 1;
      }
    }
}
