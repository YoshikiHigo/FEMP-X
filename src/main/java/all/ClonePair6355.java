package all;

public class ClonePair6355 {

    long method1(byte[] array,int offset){
      long value=0;
      for (int i=0; i < 8; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }

    long method2(byte[] buffer,int start){
      long value=0;
      for (int i=start; i < start + 8; i++) {
        value=(value << 8) + (buffer[i] & 0xff);
      }
      return value;
    }
}
