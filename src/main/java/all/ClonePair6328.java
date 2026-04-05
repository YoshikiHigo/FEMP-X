package all;

public class ClonePair6328 {

    long method1(byte[] data,int offset){
      long x=0;
      for (int i=7; i >= 0; i--) {
        long y=data[offset + i] & 0xFF;
        x=(x << 8) | y;
      }
      return x;
    }

    long method2(byte[] data,int offset){
      long value=0;
      for (int i=offset + 7; i >= offset; i--) {
        value<<=8;
        value|=((long)data[i]) & 0xff;
      }
      return value;
    }
}
