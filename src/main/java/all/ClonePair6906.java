package all;

public class ClonePair6906 {

    int method1(int focus,int fieldLength,int screenLength){
      int origin;
      if (screenLength >= fieldLength) {
        origin=(screenLength - fieldLength) / 2;
      }
     else   if (focus <= screenLength / 2) {
        origin=0;
      }
     else   if (focus >= (fieldLength - screenLength / 2)) {
        origin=screenLength - fieldLength;
      }
     else {
        origin=screenLength / 2 - focus;
      }
      return origin;
    }

    int method2(int length,int width,int height){
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
}
