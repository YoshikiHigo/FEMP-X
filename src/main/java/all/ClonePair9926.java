package all;

public class ClonePair9926 {

    int method1(byte[] arr,int offset,int bytes){
      int result=0;
      for (int i=0; i < bytes; i++) {
        result<<=8;
        result|=arr[offset++] & 0xFF;
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
