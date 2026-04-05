package all;

public class ClonePair6409 {

    long method1(byte[] b,int offset){
      long value=0;
      for (int i=0; i < 8; i++) {
        int shift=(8 - 1 - i) * 8;
        value+=((long)(b[i + offset] & 0x00000000000000FF) << shift);
      }
      return value;
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
