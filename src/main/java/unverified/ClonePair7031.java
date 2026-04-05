package unverified;

public class ClonePair7031 {

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

    int method2(int start,int end,int value){
      int component=0;
      if (start < end) {
        component=start - ((start - end) * value) / 255;
      }
     else {
        component=start + ((end - start) * value) / 255;
      }
      if (component < 0) {
        component=0;
      }
     else   if (component > 0xFF) {
        component=0xFF;
      }
      return component;
    }
}
