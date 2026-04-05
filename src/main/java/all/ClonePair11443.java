package all;

public class ClonePair11443 {

    long method1(byte[] bytes,int offset,int numberOfBytes){
      int i;
      long value=0x0000000000000000;
      for (i=0; i < numberOfBytes; i++) {
        value|=((((long)bytes[offset + i])) & 0xff) << (i * 8);
      }
      return (value);
    }

    long method2(byte[] data,int offset,int bytes){
      long ret=0;
      for (int i=0; i < bytes; i++)   ret|=(((long)data[i + offset]) & 0xFF) << (i * 8);
      return ret;
    }
}
