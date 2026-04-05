package unverified;

public class ClonePair12766 {

    short method1(byte[] buffer,int offset){
      int b1=buffer[offset++];
      int b2=buffer[offset];
      if (b1 < 0) {
        b1+=256;
      }
      return (short)((b2 << 8) | b1);
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
