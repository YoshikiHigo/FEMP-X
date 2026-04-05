package unverified;

public class ClonePair6352 {

    long method1(byte[] array,int offset){
      long value=0;
      for (int i=0; i < 8; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }

    long method2(byte[] byteArray,int byteArrayOffset){
      long result=0;
      long tmp;
      for (int i=0; i < 8; i++) {
        tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
        result+=(tmp << 8 * (7 - i));
      }
      return result;
    }
}
