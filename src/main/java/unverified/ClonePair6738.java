package unverified;

public class ClonePair6738 {

    long method1(byte[] ba){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret=ret << 8;
        long b=ba[i] & 0xFF;
        ret|=b;
      }
      return ret;
    }

    long method2(byte[] rd){
      long dd=0;
      for (int i=0; i <= 7; i++)   dd=(dd << 8) | ((long)rd[i] & 0xff);
      return dd;
    }
}
