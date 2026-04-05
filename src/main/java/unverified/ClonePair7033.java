package unverified;

public class ClonePair7033 {

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

    int method2(int val,int max,int size){
      if (val <= 0 || max <= 0) {
        return 0;
      }
     else   if (val >= max) {
        return size;
      }
     else {
        return (size * val + max / 2) / max;
      }
    }
}
