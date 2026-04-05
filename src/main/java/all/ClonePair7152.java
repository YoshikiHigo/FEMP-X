package all;

public class ClonePair7152 {

    int method1(byte[] bytes,int offset){
      int result=0;
      for (int shift=0; shift < 32; shift+=8) {
        result|=(((int)bytes[offset++]) & 0xff) << shift;
      }
      return result;
    }

    int method2(byte[] in,int idx){
      int out=0;
      for (int i=0; i < 4; i++)   out|=((int)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
