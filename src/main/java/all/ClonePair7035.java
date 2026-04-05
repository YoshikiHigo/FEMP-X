package all;

public class ClonePair7035 {

    int method1(int length,int width,int height){
      int result=0;
      int i=0;
      int j=0;
      int k=0;
      while (i < length) {
        while (j < width) {
          while (k < height) {
            result++;
          }
        }
      }
      return result;
    }

    int method2(int n,int my,int child){
      if (my >= child || n < 0)   return 0;
      if ((my + n) > child)   return child - my;
      return n;
    }
}
