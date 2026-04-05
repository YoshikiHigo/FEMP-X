package unverified;

public class ClonePair6735 {

    long method1(byte[] b){
      long value=0;
      for (int i=0; i < 8; i++) {
        int shift=(7 - i) * 8;
        value+=(long)((long)(b[i] & 0x00000000000000FF) << shift);
      }
      return value;
    }

    long method2(byte[] rd){
      long dd=0;
      for (int i=0; i <= 7; i++)   dd=(dd << 8) | ((long)rd[i] & 0xff);
      return dd;
    }
}
