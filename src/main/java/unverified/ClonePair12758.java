package unverified;

public class ClonePair12758 {

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

    short method2(byte[] data,int offset){
      short num=0;
      for (int i=offset + 1; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
