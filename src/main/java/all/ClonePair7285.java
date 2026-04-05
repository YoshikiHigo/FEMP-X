package all;

public class ClonePair7285 {

    int method1(byte[] bytes,int offset){
      int ret=0;
      for (int i=3; i >= 0; i--) {
        ret<<=8;
        ret|=bytes[offset + i] & 0xFF;
      }
      return ret;
    }

    int method2(byte[] in,int idx){
      int out=0;
      for (int i=0; i < 4; i++)   out|=((int)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
