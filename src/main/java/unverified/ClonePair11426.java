package unverified;

public class ClonePair11426 {

    long method1(byte[] b,int offset,int size){
      long value=0;
      for (int i=0; i < size; i++) {
        value=(value << 8) | (b[offset + i] & 0xFF);
      }
      return value;
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
