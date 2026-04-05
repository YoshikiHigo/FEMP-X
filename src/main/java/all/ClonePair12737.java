package all;

public class ClonePair12737 {

    short method1(byte[] buffer,int offset){
      short word;
      int lowByte=buffer[offset + 1];
      if (lowByte < 0)   lowByte+=256;
      int highByte=buffer[offset];
      if (highByte < 0)   highByte+=256;
      word=(short)(lowByte + (highByte << 8));
      return word;
    }

    short method2(byte[] b,int startPos){
      int result=0;
      for (int i=0; i < 2; i++) {
        result<<=8;
        result+=(int)(b[startPos + i] & 0xFF);
      }
      return (short)result;
    }
}
