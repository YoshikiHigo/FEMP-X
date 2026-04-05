package all;

public class ClonePair10556 {

    int method1(byte[] data,int off,int len){
      if (len <= 0)   return 0;
      int hashCode=0;
      for (int dIndex=off; dIndex < (off + len); dIndex++)   hashCode+=(data[dIndex] & 0x00FF);
      return hashCode;
    }

    int method2(byte[] pcmBuf,int offset,int length){
      int max=0;
      for (int i=0; i < length; i++) {
        int pcm=(0xff & pcmBuf[offset++]) + (pcmBuf[offset++] << 8);
        if (pcm < 0)     pcm=-pcm;
        if (pcm > max)     max=pcm;
      }
      return max;
    }
}
