package all;

public class ClonePair11432 {

    long method1(byte[] ah_byte,int offset,int an_bytes){
      long ln_return=0l;
      for (int ln=offset, ln_1=an_bytes - 1; ln < offset + an_bytes; ln++, ln_1--) {
        ln_return+=((long)ah_byte[ln] & 0xff) << ln_1 * 8;
      }
      return ln_return;
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
