package all;

public class ClonePair10438 {

    int method1(byte[] data,int offset,int length){
      int code=0;
      for (int i=0; i < length; i++) {
        code<<=8;
        code|=(data[offset + i] + 256) % 256;
      }
      return code;
    }

    int method2(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0)   v=(v << 8) | (b[offset++] & 0xff);
      return v;
    }
}
