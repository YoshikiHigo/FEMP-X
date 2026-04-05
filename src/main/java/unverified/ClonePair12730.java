package unverified;

public class ClonePair12730 {

    short method1(byte[] data,int offset){
      int result=0;
      int multiply=1;
      int value=0;
      for (int i=0; i < 2; i++) {
        value=data[i + offset];
        if (value < 0)     value=value + 256;
        result=result + (value * multiply);
        multiply=multiply * 256;
      }
      return (short)result;
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
