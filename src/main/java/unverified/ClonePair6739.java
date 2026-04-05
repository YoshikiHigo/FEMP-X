package unverified;

public class ClonePair6739 {

    long method1(byte[] ba){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret=ret << 8;
        long b=ba[i] & 0xFF;
        ret|=b;
      }
      return ret;
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
