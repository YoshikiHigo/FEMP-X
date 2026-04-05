package all;

public class ClonePair10422 {

    int method1(byte[] buff,int off,int len){
      int num=0;
      int shift=0;
      for (int i=off + len - 1; i >= off; i--) {
        num+=(buff[i] & 0xFF) << shift;
        shift+=8;
      }
      return num;
    }

    int method2(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0)   v=(v << 8) | (b[offset++] & 0xff);
      return v;
    }
}
