package all;

public class ClonePair12735 {

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

    short method2(byte[] in,int idx){
      short out=0;
      for (int i=0; i < 2; i++)   out|=((short)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
