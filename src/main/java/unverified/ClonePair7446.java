package unverified;

public class ClonePair7446 {

    int method1(byte[] array,int index){
      int value=0;
      int shift=0;
      while (shift != 32) {
        value|=(0x000000ff & ((int)array[index])) << shift;
        index++;
        shift+=8;
      }
      return value;
    }

    int method2(byte[] byte_array,int offset){
      int value=0;
      for (int i=3; i >= 0; i--) {
        value=(int)(value << 8);
        value=(int)(value | ((int)byte_array[offset + i] & 0xff));
      }
      return value;
    }
}
