package all;

public class ClonePair6478 {

    long method1(byte[] in,int idx){
      long out=0;
      for (int i=0; i < 8; i++)   out|=((long)in[idx + i] & 0xff) << i * 8;
      return out;
    }

    long method2(byte[] bytes,int offset){
      long ret=0;
      for (int i=7; i >= 0; i--) {
        ret<<=8;
        ret|=bytes[offset + i] & 0xFF;
      }
      return ret;
    }
}
