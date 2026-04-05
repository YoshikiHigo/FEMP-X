package all;

public class ClonePair6717 {

    int method1(int WTType,int direction,int sampleIndex){
      if (WTType == 1) {
        if (direction == -1) {
          return ((sampleIndex % 2) == 0) ? 1 : 2;
        }
     else {
          return ((sampleIndex % 2) == 0) ? 2 : 1;
        }
      }
     else   if (WTType == 2) {
        if (direction == -1) {
          return ((sampleIndex % 2) == 0) ? 3 : 4;
        }
     else {
          return ((sampleIndex % 2) == 0) ? 4 : 3;
        }
      }
     else {
        assert (true);
      }
      return 0;
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
