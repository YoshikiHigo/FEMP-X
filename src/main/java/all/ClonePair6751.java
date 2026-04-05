package all;

public class ClonePair6751 {

    long method1(byte[] b){
      long result=0;
      long value=0;
      long power=0;
      for (int i=(b.length - 1); i >= 0; i--) {
        value=b[i];
        if (value < 0) {
          value+=256;
        }
        result=result | (value << power);
        power+=8;
      }
      return result;
    }

    long method2(byte[] checksum){
      long crc=0L;
      for (int i=0; i < checksum.length; i++) {
        crc|=(0xffL & (long)checksum[i]) << ((checksum.length - i - 1) * 8);
      }
      return crc;
    }
}
