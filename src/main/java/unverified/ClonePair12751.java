package unverified;

public class ClonePair12751 {

    short method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 1); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return (short)(result & 0xFFFF);
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
