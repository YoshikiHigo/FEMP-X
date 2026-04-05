package all;

public class ClonePair7966 {

    int method1(int dividend,int divisor){
      if (divisor == 0) {
        return 0;
      }
      return ((dividend % divisor) == 0) ? (dividend / divisor) : ((dividend / divisor) + 1);
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
