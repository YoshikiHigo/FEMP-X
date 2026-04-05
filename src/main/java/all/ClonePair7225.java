package all;

public class ClonePair7225 {

    int method1(byte[] buffer,int start){
      int value=0;
      for (int i=start; i < start + 4; i++) {
        value=(value << 8) + (buffer[i] & 0xff);
      }
      return value;
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
