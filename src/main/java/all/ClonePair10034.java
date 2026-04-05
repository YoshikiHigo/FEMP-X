package all;

public class ClonePair10034 {

    int method1(byte[] b,int maxByte,int offset){
      if (b.length <= offset)   return -1;
      if (b.length < maxByte)   return b.length;
      int idx=Math.min(b.length,maxByte + offset);
      for (int i=idx - 1; i > offset; i--) {
        int j=(b[i] < 0 ? 0x100 + b[i] : b[i]);
        if (j < 0x80) {
          return i + 1;
        }
      }
      return -1;
    }

    int method2(byte[] b,int maxByte,int offset){
      if (b.length <= offset)   return -1;
      if (b.length < maxByte)   return b.length;
      int idx=Math.min(b.length,maxByte + offset);
      for (int i=idx - 1; i > offset; i--) {
        int j=(int)(b[i] < 0 ? 0x100 + b[i] : b[i]);
        if (j < 0x80) {
          return i + 1;
        }
      }
      return -1;
    }
}
