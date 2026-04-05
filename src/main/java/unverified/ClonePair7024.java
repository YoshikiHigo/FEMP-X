package unverified;

public class ClonePair7024 {

    int method1(byte[] b,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=((int)b[i + offset] & 0xFF) << shift;
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
