package all;

public class ClonePair10070 {

    int method1(byte[] bArray,int start,int len){
      int result=0;
      for (int i=0; i < len; i++) {
        result<<=8;
        result|=((int)bArray[start + i] & 0xff);
      }
      return result;
    }

    int method2(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0)   v=(v << 8) | (b[offset++] & 0xff);
      return v;
    }
}
