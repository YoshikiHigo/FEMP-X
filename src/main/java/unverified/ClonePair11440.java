package unverified;

public class ClonePair11440 {

    long method1(byte[] rep,int off,int len){
      long l=0;
      for (int i=0; i < len; i++)   l|=((long)(rep[i + off] & 0xFF)) << (8 * i);
      return l;
    }

    long method2(byte[] bytes,int offset,int numberOfBytes){
      int i;
      long value=0x0000000000000000;
      for (i=0; i < numberOfBytes; i++) {
        value|=((((long)bytes[offset + i])) & 0xff) << (i * 8);
      }
      return (value);
    }
}
