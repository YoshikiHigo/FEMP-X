package unverified;

public class ClonePair6427 {

    long method1(byte[] buffer,int start){
      long value=0;
      for (int i=start; i < start + 8; i++) {
        value=(value << 8) + (buffer[i] & 0xff);
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
