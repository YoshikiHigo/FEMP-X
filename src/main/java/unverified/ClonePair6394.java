package unverified;

public class ClonePair6394 {

    long method1(byte[] byteArray,int byteArrayOffset){
      long result=0;
      long tmp;
      for (int i=0; i < 8; i++) {
        tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
        result+=(tmp << 8 * (7 - i));
      }
      return result;
    }

    long method2(byte[] b,int start){
      long l=0;
      for (int i=0; i < 8; i++) {
        l<<=8;
        l|=b[start + i] & 0xff;
      }
      return l;
    }
}
