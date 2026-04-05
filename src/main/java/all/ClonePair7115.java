package all;

public class ClonePair7115 {

    int method1(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }

    int method2(byte[] data,int offset){
      int num=0;
      for (int i=offset; i < offset + 4; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
