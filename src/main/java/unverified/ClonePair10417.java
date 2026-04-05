package unverified;

public class ClonePair10417 {

    int method1(byte[] buff,int off,int len){
      int num=0;
      int shift=0;
      for (int i=off + len - 1; i >= off; i--) {
        num+=(buff[i] & 0xFF) << shift;
        shift+=8;
      }
      return num;
    }

    int method2(byte[] data,int offset,int length){
      int code=0;
      for (int i=0; i < length; i++) {
        code<<=8;
        code|=(data[offset + i] + 256) % 256;
      }
      return code;
    }
}
