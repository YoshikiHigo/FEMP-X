package unverified;

public class ClonePair12772 {

    short method1(byte[] buffer,int offset){
      short word;
      int lowByte=buffer[offset];
      if (lowByte < 0)   lowByte+=256;
      int highByte=buffer[offset + 1];
      if (highByte < 0)   highByte+=256;
      word=(short)(lowByte + (highByte << 8));
      return word;
    }

    short method2(byte[] in,int idx){
      short out=0;
      for (int i=0; i < 2; i++)   out|=((short)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
