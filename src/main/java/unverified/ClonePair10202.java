package unverified;

public class ClonePair10202 {

    int method1(byte[] b,int offset,int size){
      int num=0;
      int sw=8 * (size - 1);
      for (int loop=0; loop < size; loop++) {
        num|=((int)b[offset + loop] & 0x00ff) << sw;
        sw-=8;
      }
      return num;
    }

    int method2(byte[] data,int offset,int length){
      int code=0;
      for (int i=0; i < length; i++) {
        code<<=8;
        code|=(data[offset + i] + 256) % 256;
      }
      return code;
    }
}
