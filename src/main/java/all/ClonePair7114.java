package all;

public class ClonePair7114 {

    int method1(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
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
