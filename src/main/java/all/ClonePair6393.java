package all;

public class ClonePair6393 {

    long method1(byte[] byteArray,int byteArrayOffset){
      long result=0;
      long tmp;
      for (int i=0; i < 8; i++) {
        tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
        result+=(tmp << 8 * (7 - i));
      }
      return result;
    }

    long method2(byte[] data,int offset){
      long num=0;
      for (int i=offset; i < offset + 8; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
