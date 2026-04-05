package all;

public class ClonePair7030 {

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

    int method2(int position,int extent,int viewExtent){
      final int upperLimit=extent - viewExtent;
      int clampedPosition;
      if (upperLimit <= 0) {
        clampedPosition=0;
      }
     else   if (upperLimit < position) {
        clampedPosition=upperLimit;
      }
     else   if (position >= 0) {
        clampedPosition=position;
      }
     else {
        clampedPosition=0;
      }
      return clampedPosition;
    }
}
