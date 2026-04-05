package unverified;

public class ClonePair12760 {

    short method1(byte[] Bytes,int Start){
      short b1, b2;
      b1=Bytes[Start];
      b2=Bytes[Start + 1];
      if (b1 < 0) {
        b1+=256;
      }
      if (b2 < 0) {
        b2+=256;
      }
      return (short)(b1 | (b2 << 8));
    }

    short method2(byte[] in,int idx){
      short out=0;
      for (int i=0; i < 2; i++)   out|=((short)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
