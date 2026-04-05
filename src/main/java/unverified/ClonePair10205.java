package unverified;

public class ClonePair10205 {

    int method1(byte[] b,int offset,int size){
      int num=0;
      int sw=8 * (size - 1);
      for (int loop=0; loop < size; loop++) {
        num|=((int)b[offset + loop] & 0x00ff) << sw;
        sw-=8;
      }
      return num;
    }

    int method2(byte[] content,int index,int size){
      int result=0;
      for (int i=0; i < size; i++) {
        result=(result << 8) + (content[index + i] & 0xff);
      }
      return result;
    }
}
