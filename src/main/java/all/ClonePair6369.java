package all;

public class ClonePair6369 {

    long method1(byte[] data,int offset){
      long ret=data[offset];
      for (int i=1; i < 8; ++i) {
        ret=ret << 8;
        ret=ret | (data[offset + i] & 0xff);
      }
      return ret;
    }

    long method2(byte[] src,int srcOff){
      long word=0;
      for (int i=0; i <= 7; i++) {
        word=(word << 8) + (src[i + srcOff] & 0xff);
      }
      return word;
    }
}
