package unverified;

public class ClonePair11428 {

    long method1(byte[] ah_byte,int offset,int an_bytes){
      long ln_return=0l;
      for (int ln=offset, ln_1=an_bytes - 1; ln < offset + an_bytes; ln++, ln_1--) {
        ln_return+=((long)ah_byte[ln] & 0xff) << ln_1 * 8;
      }
      return ln_return;
    }

    long method2(byte[] array,int index,int size){
      long result=0;
      for (int i=0; i < size; i++) {
        result<<=8;
        result|=(array[index + i] & 0xFF);
      }
      return result;
    }
}
