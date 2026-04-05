package all;

public class ClonePair10197 {

    int method1(byte[] b,int offset,int size){
      int num=0;
      int sw=8 * (size - 1);
      for (int loop=0; loop < size; loop++) {
        num|=((int)b[offset + loop] & 0x00ff) << sw;
        sw-=8;
      }
      return num;
    }

    int method2(byte[] p,int off,int len){
      int ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }
}
