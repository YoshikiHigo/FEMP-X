package all;

public class ClonePair7486 {

    int method1(byte[] bytes,int offset){
      int b=0;
      for (int j=0; j < 4; j++)   b=(b << 8) | (bytes[j + offset] & 0xFF);
      return b;
    }

    int method2(byte[] b,int offset){
      int value=0;
      int shift=0;
      for (int i=0; i < 4; i++) {
        shift=(4 - 1 - i) * 8;
        value+=(b[i + offset] & 0x000000FF) << shift;
      }
      return value;
    }
}
