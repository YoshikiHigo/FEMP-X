package unverified;

public class ClonePair12748 {

    short method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 1); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return (short)(result & 0xFFFF);
    }

    short method2(byte[] Bytes,int Start){
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
}
