package unverified;

public class ClonePair6348 {

    long method1(byte[] byte_array,int offset){
      long value=0;
      for (int i=7; i >= 0; i--) {
        value=(long)(value << 8);
        value=(long)(value | ((long)byte_array[offset + i] & 0xff));
      }
      return value;
    }

    long method2(byte[] data,int offset){
      long num=0;
      for (int i=offset + 7; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
