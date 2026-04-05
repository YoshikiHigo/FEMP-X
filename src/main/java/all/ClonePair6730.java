package all;

public class ClonePair6730 {

    long method1(byte[] b){
      long value=0;
      for (int i=0; i < 8; i++) {
        int shift=(7 - i) * 8;
        value+=(long)((long)(b[i] & 0x00000000000000FF) << shift);
      }
      return value;
    }

    long method2(byte[] ba){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret=ret << 8;
        long b=ba[i] & 0xFF;
        ret|=b;
      }
      return ret;
    }
}
