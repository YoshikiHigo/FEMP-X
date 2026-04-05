package all;

public class ClonePair6753 {

    int method1(int length,int width,int height){
      int result=0;
      for (int i=0; i < length; i++) {
        for (int j=0; j < width; j++) {
          for (int k=0; k < height; k++) {
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
