package unverified;

public class ClonePair12759 {

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
      short word;
      int lowByte=buffer[offset];
      if (lowByte < 0)   lowByte+=256;
      int highByte=buffer[offset + 1];
      if (highByte < 0)   highByte+=256;
      word=(short)(lowByte + (highByte << 8));
      return word;
    }
}
