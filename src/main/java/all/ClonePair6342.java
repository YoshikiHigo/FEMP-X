package all;

public class ClonePair6342 {

    long method1(byte[] byte_array,int offset){
      long value=0;
      for (int i=7; i >= 0; i--) {
        value=(long)(value << 8);
        value=(long)(value | ((long)byte_array[offset + i] & 0xff));
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
