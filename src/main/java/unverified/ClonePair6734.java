package unverified;

public class ClonePair6734 {

    long method1(byte[] b){
      long value=0;
      for (int i=0; i < 8; i++) {
        int shift=(7 - i) * 8;
        value+=(long)((long)(b[i] & 0x00000000000000FF) << shift);
      }
      return value;
    }

    long method2(byte[] bytes){
      long result=0;
      for (int i=0; i < 8; i++) {
        result<<=8;
        result+=(byte)bytes[i];
      }
      return result;
    }
}
