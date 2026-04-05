package all;

public class ClonePair9365 {

    int method1(byte[] srcBuffer,int[] destBuffer,int srcLength,int destOffset,int destLength,int mask){
      final int length=Math.min(destLength * 4,(srcLength / 4) * 4);
      for (int i=0; i < length; i+=4) {
        destBuffer[(i / 4) + destOffset]=(srcBuffer[i] & 0xFF | (srcBuffer[i + 1] << 8) & 0xFF00 | (srcBuffer[i + 2] << 16) & 0xFF0000 | (srcBuffer[i + 3] << 24)) & mask;
      }
      return length;
    }

    int method2(byte[] srcBuffer,int[] destBuffer,int srcLength,int destOffset,int destLength,int mask){
      srcLength=Math.min(destLength * 4,(srcLength / 4) * 4);
      for (int i=0; i < srcLength; i+=4) {
        destBuffer[(i / 4) + destOffset]=(srcBuffer[i] & 0xff | (srcBuffer[i + 1] << 8) & 0xff00 | (srcBuffer[i + 2] << 16) & 0xff0000 | (srcBuffer[i + 3] << 24)) & mask;
      }
      return srcLength;
    }
}
