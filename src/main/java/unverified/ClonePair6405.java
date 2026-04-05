package unverified;

public class ClonePair6405 {

    long method1(byte[] src,int srcOff){
      long word=0;
      for (int i=0; i <= 7; i++) {
        word=(word << 8) + (src[i + srcOff] & 0xff);
      }
      return word;
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
