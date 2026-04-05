package all;

public class ClonePair6752 {

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
