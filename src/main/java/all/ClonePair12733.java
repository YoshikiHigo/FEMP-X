package all;

public class ClonePair12733 {

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

    short method2(byte[] buffer,int offset){
      int b1=buffer[offset++];
      int b2=buffer[offset];
      if (b1 < 0) {
        b1+=256;
      }
      return (short)((b2 << 8) | b1);
    }
}
