package all;

public class ClonePair7240 {

    int method1(byte[] buff,int startPos){
      int res=0;
      for (int i=0; i < 4; i++)   res|=((buff[startPos + i] & 0xff) << (i * 8));
      return res;
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
