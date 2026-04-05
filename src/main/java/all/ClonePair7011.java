package all;

public class ClonePair7011 {

    int method1(byte[] b,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=((int)b[i + offset] & 0xFF) << shift;
      }
      return value;
    }

    int method2(byte[] buffer,int start){
      int value=0;
      for (int i=start; i < start + 4; i++) {
        value=(value << 8) + (buffer[i] & 0xff);
      }
      return value;
    }
}
