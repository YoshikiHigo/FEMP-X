package unverified;

public class ClonePair7450 {

    int method1(byte[] array,int index){
      int value=0;
      int shift=0;
      while (shift != 32) {
        value|=(0x000000ff & ((int)array[index])) << shift;
        index++;
        shift+=8;
      }
      return value;
    }

    int method2(byte[] in,int idx){
      int out=0;
      for (int i=0; i < 4; i++)   out|=((int)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
