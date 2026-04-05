package unverified;

public class ClonePair7073 {

    int method1(byte[] b,int offset){
      int accum=0;
      for (int shiftBy=0, i=offset; shiftBy < 32; shiftBy+=8, i++) {
        accum|=(b[i] & 0xff) << shiftBy;
      }
      return accum;
    }

    int method2(byte[] bytes,int offset){
      int result=0;
      for (int shift=0; shift < 32; shift+=8) {
        result|=(((int)bytes[offset++]) & 0xff) << shift;
      }
      return result;
    }
}
