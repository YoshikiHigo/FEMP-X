package unverified;

public class ClonePair11431 {

    long method1(byte[] ah_byte,int offset,int an_bytes){
      long ln_return=0l;
      for (int ln=offset, ln_1=an_bytes - 1; ln < offset + an_bytes; ln++, ln_1--) {
        ln_return+=((long)ah_byte[ln] & 0xff) << ln_1 * 8;
      }
      return ln_return;
    }

    long method2(byte[] p,int off,int len){
      long ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }
}
