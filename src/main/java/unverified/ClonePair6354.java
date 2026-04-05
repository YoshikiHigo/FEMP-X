package unverified;

public class ClonePair6354 {

    long method1(byte[] array,int offset){
      long value=0;
      for (int i=0; i < 8; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }

    long method2(byte[] src,int srcOff){
      long word=0;
      for (int i=0; i <= 7; i++) {
        word=(word << 8) + (src[i + srcOff] & 0xff);
      }
      return word;
    }
}
