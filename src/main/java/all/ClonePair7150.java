package all;

public class ClonePair7150 {

    int method1(byte[] bytes,int offset){
      int result=0;
      for (int shift=0; shift < 32; shift+=8) {
        result|=(((int)bytes[offset++]) & 0xff) << shift;
      }
      return result;
    }

    int method2(byte[] data,int offset){
      int value=0;
      for (int i=offset + 3; i >= offset; i--) {
        value<<=8;
        value|=((int)data[i]) & 0xff;
      }
      return value;
    }
}
