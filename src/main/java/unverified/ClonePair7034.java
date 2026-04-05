package unverified;

public class ClonePair7034 {

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

    int method2(int failedAttempts,int firstFailureDelay,int maxDelay){
      if (failedAttempts <= 0)   return 0;
      if (firstFailureDelay <= 0)   firstFailureDelay=500;
      if (maxDelay < 0)   maxDelay=0;
      if (failedAttempts > 16)   failedAttempts=16;
      int delay=(int)(firstFailureDelay * Math.pow(2,failedAttempts - 1));
      if (delay > maxDelay)   delay=maxDelay;
      return delay;
    }
}
