package unverified;

public class ClonePair7100 {

    int method1(byte[] byteArray,int byteArrayOffset){
      int result=0;
      int tmp;
      for (int i=0; i < 4; i++) {
        tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
        result+=(tmp << 8 * (3 - i));
      }
      return result;
    }

    int method2(byte[] data,int offset){
      int num=0;
      for (int i=offset; i < offset + 4; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
