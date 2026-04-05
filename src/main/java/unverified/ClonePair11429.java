package unverified;

public class ClonePair11429 {

    long method1(byte[] ah_byte,int offset,int an_bytes){
      long ln_return=0l;
      for (int ln=offset, ln_1=an_bytes - 1; ln < offset + an_bytes; ln++, ln_1--) {
        ln_return+=((long)ah_byte[ln] & 0xff) << ln_1 * 8;
      }
      return ln_return;
    }

    long method2(byte[] arr,int idx,int bytenum){
      long n=0;
      for (int i=0; i < bytenum; i++) {
        n<<=8;
        n|=(int)(arr[idx + i] & 0xff);
      }
      return n;
    }
}
