package all;

public class ClonePair7192 {

    int method1(byte[] data,int offset){
      int num=0;
      for (int i=offset + 3; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }

    int method2(byte[] value,int offset){
      int ret=0;
      for (int i=0; i < 4; i++)   ret|=(((long)value[i + offset] & 0xFF) << (8 * i));
      return ret;
    }
}
