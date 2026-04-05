package unverified;

public class ClonePair12763 {

    short method1(byte[] buffer,int offset){
      int b1=buffer[offset++];
      int b2=buffer[offset];
      if (b1 < 0) {
        b1+=256;
      }
      return (short)((b2 << 8) | b1);
    }

    short method2(byte[] data,int offset){
      short num=0;
      for (int i=offset + 1; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
