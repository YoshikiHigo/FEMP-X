package unverified;

public class ClonePair10059 {

    int method1(byte[] bArray,int start,int len){
      int result=0;
      for (int i=0; i < len; i++) {
        result<<=8;
        result|=((int)bArray[start + i] & 0xff);
      }
      return result;
    }

    int method2(byte[] b,int offset,int size){
      int num=0;
      int sw=8 * (size - 1);
      for (int loop=0; loop < size; loop++) {
        num|=((int)b[offset + loop] & 0x00ff) << sw;
        sw-=8;
      }
      return num;
    }
}
