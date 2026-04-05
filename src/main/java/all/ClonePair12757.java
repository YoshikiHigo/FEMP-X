package all;

public class ClonePair12757 {

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

    short method2(byte[] buffer,int offset){
      int b1=buffer[offset++];
      int b2=buffer[offset];
      if (b1 < 0) {
        b1+=256;
      }
      return (short)((b2 << 8) | b1);
    }
}
