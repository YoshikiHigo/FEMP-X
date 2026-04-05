package all;

public class ClonePair6499 {

    long method1(byte[] bytes,int offset){
      long ret=0;
      for (int i=7; i >= 0; i--) {
        ret<<=8;
        ret|=bytes[offset + i] & 0xFF;
      }
      return ret;
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
