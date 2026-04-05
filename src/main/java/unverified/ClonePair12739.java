package unverified;

public class ClonePair12739 {

    short method1(byte[] buffer,int offset){
      short word;
      int lowByte=buffer[offset + 1];
      if (lowByte < 0)   lowByte+=256;
      int highByte=buffer[offset];
      if (highByte < 0)   highByte+=256;
      word=(short)(lowByte + (highByte << 8));
      return word;
    }

    short method2(byte[] data,int offset){
      short num=0;
      for (int i=offset; i < offset + 2; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
