package all;

public class ClonePair10027 {

    int method1(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0) {
        v=v << 8 | b[offset++] & 0xff;
      }
      return v;
    }

    int method2(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0)   v=(v << 8) | (b[offset++] & 0xff);
      return v;
    }
}
