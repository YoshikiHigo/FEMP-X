package all;

public class ClonePair6410 {

    long method1(byte[] data,int offset){
      long value=0;
      for (int i=offset + 7; i >= offset; i--) {
        value<<=8;
        value|=((long)data[i]) & 0xff;
      }
      return value;
    }

    long method2(byte[] data,int offset){
      long result=0;
      int i=offset;
      for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
        result|=((long)(data[i] & 0xff)) << shiftBy;
        ++i;
      }
      return result;
    }
}
