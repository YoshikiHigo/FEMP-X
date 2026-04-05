package all;

public class ClonePair6726 {

    int method1(int zSize,int QTypes,int CTType){
      int rateDistortionAdjustments=0;
      for (int z=0; z < zSize; z++) {
        if (QTypes == 0) {
          if (CTType == 0) {
            rateDistortionAdjustments=1;
          }
     else {
            rateDistortionAdjustments=2;
          }
        }
     else {
          rateDistortionAdjustments=0;
        }
      }
      return rateDistortionAdjustments;
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
