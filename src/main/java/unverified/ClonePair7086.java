package unverified;

public class ClonePair7086 {

    int method1(byte[] b,int offset){
      int accum=0;
      for (int shiftBy=0, i=offset; shiftBy < 32; shiftBy+=8, i++) {
        accum|=(b[i] & 0xff) << shiftBy;
      }
      return accum;
    }

    int method2(byte[] data,int offset){
      int value=0;
      for (int i=offset + 3; i >= offset; i--) {
        value<<=8;
        value|=((int)data[i]) & 0xff;
      }
      return value;
    }
}
