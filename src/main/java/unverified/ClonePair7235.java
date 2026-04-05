package unverified;

public class ClonePair7235 {

    int method1(byte[] buff,int startPos){
      int res=0;
      for (int i=0; i < 4; i++)   res|=((buff[startPos + i] & 0xff) << (i * 8));
      return res;
    }

    int method2(byte[] value,int offset){
      int ret=0;
      for (int i=0; i < 4; i++)   ret|=(((long)value[i + offset] & 0xFF) << (8 * i));
      return ret;
    }
}
