package unverified;

public class ClonePair7195 {

    int method1(byte[] data,int offset){
      int num=0;
      for (int i=offset + 3; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }

    int method2(byte[] array,int index){
      int value=0;
      int shift=0;
      while (shift != 32) {
        value|=(0x000000ff & ((int)array[index])) << shift;
        index++;
        shift+=8;
      }
      return value;
    }
}
