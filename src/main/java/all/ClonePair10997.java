package all;

public class ClonePair10997 {

    int method1(byte[] src,byte[] dest,int offsetDest){
      int destIndex=offsetDest;
      int srcIndex=0;
      while (srcIndex < src.length) {
        byte n=src[srcIndex];
        if (0 <= n && n <= 127) {
          System.arraycopy(src,++srcIndex,dest,destIndex,n + 1);
          srcIndex+=n + 1;
          destIndex+=n + 1;
        }
     else     if (-127 <= n && n <= -1) {
          byte value=src[++srcIndex];
          for (int j=0; j < -n + 1; j++) {
            dest[destIndex++]=value;
          }
          srcIndex++;
        }
     else {
          srcIndex++;
        }
      }
      return destIndex - offsetDest;
    }

    int method2(byte[] src,byte[] dest,int offsetDest){
      int destIndex=offsetDest;
      int srcIndex=0;
      while (srcIndex < src.length) {
        byte n=src[srcIndex];
        if (n >= 0) {
          System.arraycopy(src,++srcIndex,dest,destIndex,n + 1);
          srcIndex+=n + 1;
          destIndex+=n + 1;
        }
     else     if (n >= -127) {
          byte value=src[++srcIndex];
          for (int j=0; j < -n + 1; j++) {
            dest[destIndex++]=value;
          }
          srcIndex++;
        }
     else {
          srcIndex++;
        }
      }
      return destIndex - offsetDest;
    }
}
