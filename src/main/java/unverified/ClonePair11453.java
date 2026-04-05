package unverified;

public class ClonePair11453 {

    long method1(byte[] p,int off,int len){
      long ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }

    long method2(byte[] b,int offset,int size){
      long num=0;
      long sw=8L * ((long)size - 1L);
      for (int loop=0; loop < size; loop++) {
        num|=((long)b[offset + loop] & 0x00ff) << sw;
        sw-=8;
      }
      return num;
    }
}
