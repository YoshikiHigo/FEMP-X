package all;

public class ClonePair6406 {

    long method1(byte[] src,int srcOff){
      long word=0;
      for (int i=0; i <= 7; i++) {
        word=(word << 8) + (src[i + srcOff] & 0xff);
      }
      return word;
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
