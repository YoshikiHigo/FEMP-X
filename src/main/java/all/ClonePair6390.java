package all;

public class ClonePair6390 {

    long method1(byte[] byteArray,int byteArrayOffset){
      long result=0;
      long tmp;
      for (int i=0; i < 8; i++) {
        tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
        result+=(tmp << 8 * (7 - i));
      }
      return result;
    }

    long method2(byte[] src,int srcOff){
      long word=0;
      for (int i=0; i <= 7; i++) {
        word=(word << 8) + (src[i + srcOff] & 0xff);
      }
      return word;
    }
}
