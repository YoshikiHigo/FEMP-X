package unverified;

public class ClonePair7117 {

    int method1(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }

    int method2(byte[] data,int offset){
      int l=0;
      for (int k=0; k < 4; k++) {
        l=(l << 8) | (data[offset++] & 0xFF);
      }
      return l;
    }
}
