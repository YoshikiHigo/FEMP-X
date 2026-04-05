package all;

public class ClonePair7023 {

    int method1(byte[] b,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=((int)b[i + offset] & 0xFF) << shift;
      }
      return value;
    }

    int method2(byte[] bytes,int offset){
      int b=0;
      for (int j=0; j < 4; j++)   b=(b << 8) | (bytes[j + offset] & 0xFF);
      return b;
    }
}
