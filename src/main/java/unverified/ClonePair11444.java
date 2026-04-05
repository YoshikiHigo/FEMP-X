package unverified;

public class ClonePair11444 {

    long method1(byte[] bytes,int offset,int numberOfBytes){
      int i;
      long value=0x0000000000000000;
      for (i=0; i < numberOfBytes; i++) {
        value|=((((long)bytes[offset + i])) & 0xff) << (i * 8);
      }
      return (value);
    }

    long method2(byte[] data,int offset,int size){
      long result=0;
      for (int j=offset + size - 1; j >= offset; j--) {
        result<<=8;
        result|=0xff & data[j];
      }
      return result;
    }
}
