package unverified;

public class ClonePair6356 {

    long method1(byte[] array,int offset){
      long value=0;
      for (int i=0; i < 8; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }

    long method2(byte[] data,int offset){
      long num=0;
      for (int i=offset; i < offset + 8; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
