package all;

public class ClonePair12765 {

    short method1(byte[] buffer,int offset){
      int b1=buffer[offset++];
      int b2=buffer[offset];
      if (b1 < 0) {
        b1+=256;
      }
      return (short)((b2 << 8) | b1);
    }

    short method2(byte[] in,int idx){
      short out=0;
      for (int i=0; i < 2; i++)   out|=((short)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
