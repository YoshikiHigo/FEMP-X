package unverified;

public class ClonePair7335 {

    int method1(byte[] value,int offset){
      int ret=0;
      for (int i=0; i < 4; i++)   ret|=(((long)value[i + offset] & 0xFF) << (8 * i));
      return ret;
    }

    int method2(byte[] in,int idx){
      int out=0;
      for (int i=0; i < 4; i++)   out|=((int)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
