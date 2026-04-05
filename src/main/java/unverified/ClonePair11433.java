package unverified;

public class ClonePair11433 {

    long method1(byte[] ah_byte,int offset,int an_bytes){
      long ln_return=0l;
      for (int ln=offset, ln_1=an_bytes - 1; ln < offset + an_bytes; ln++, ln_1--) {
        ln_return+=((long)ah_byte[ln] & 0xff) << ln_1 * 8;
      }
      return ln_return;
    }

    long method2(byte[] b,int offset,int size){
      long l=0;
      for (int i=0; i < size; ++i)   l|=((long)b[offset + i] & 0xff) << ((size - i - 1) << 3);
      return l;
    }
}
