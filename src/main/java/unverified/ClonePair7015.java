package unverified;

public class ClonePair7015 {

    int method1(byte[] b,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=((int)b[i + offset] & 0xFF) << shift;
      }
      return value;
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
