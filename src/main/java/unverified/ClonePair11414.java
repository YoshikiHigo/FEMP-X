package unverified;

public class ClonePair11414 {

    long method1(byte[] ar,int offset,int length){
      long rs=0;
      for (int i=0; i < length; i++) {
        rs+=(long)(ar[offset + i] & 0xFF) << (i * 8);
      }
      return rs;
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
