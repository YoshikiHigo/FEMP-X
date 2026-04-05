package all;

public class ClonePair12734 {

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
      short word;
      int lowByte=buffer[offset];
      if (lowByte < 0)   lowByte+=256;
      int highByte=buffer[offset + 1];
      if (highByte < 0)   highByte+=256;
      word=(short)(lowByte + (highByte << 8));
      return word;
    }
}
