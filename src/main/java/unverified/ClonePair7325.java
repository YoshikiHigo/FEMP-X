package unverified;

public class ClonePair7325 {

    int method1(byte[] value,int offset){
      int ret=0;
      for (int i=0; i < 4; i++)   ret|=(((long)value[i + offset] & 0xFF) << (8 * i));
      return ret;
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
