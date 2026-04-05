package all;

public class ClonePair6391 {

    long method1(byte[] byteArray,int byteArrayOffset){
      long result=0;
      long tmp;
      for (int i=0; i < 8; i++) {
        tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
        result+=(tmp << 8 * (7 - i));
      }
      return result;
    }

    long method2(byte[] b,int offset){
      long value=0;
      for (int i=0; i < 8; i++) {
        int shift=(8 - 1 - i) * 8;
        value+=((long)(b[i + offset] & 0x00000000000000FF) << shift);
      }
      return value;
    }
}
