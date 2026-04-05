package unverified;

public class ClonePair6396 {

    long method1(byte[] array,int offset){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret<<=8;
        ret|=array[7 - i + offset] & 0xFF;
      }
      return ret;
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
