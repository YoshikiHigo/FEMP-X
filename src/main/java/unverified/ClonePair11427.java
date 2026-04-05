package unverified;

public class ClonePair11427 {

    long method1(byte[] b,int offset,int size){
      long value=0;
      for (int i=0; i < size; i++) {
        value=(value << 8) | (b[offset + i] & 0xFF);
      }
      return value;
    }

    long method2(byte[] b,int offset,int size){
      long l=0;
      for (int i=0; i < size; ++i)   l|=((long)b[offset + i] & 0xff) << ((size - i - 1) << 3);
      return l;
    }
}
