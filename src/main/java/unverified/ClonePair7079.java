package unverified;

public class ClonePair7079 {

    int method1(byte[] b,int offset){
      int accum=0;
      for (int shiftBy=0, i=offset; shiftBy < 32; shiftBy+=8, i++) {
        accum|=(b[i] & 0xff) << shiftBy;
      }
      return accum;
    }

    int method2(byte[] bytes,int offset){
      int ret=0;
      for (int i=3; i >= 0; i--) {
        ret<<=8;
        ret|=bytes[offset + i] & 0xFF;
      }
      return ret;
    }
}
