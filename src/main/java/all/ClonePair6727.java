package all;

public class ClonePair6727 {

    long method1(byte[] bytes){
      long n=0;
      for (int i=0; i < 7; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[7] & 0xff);
    }

    long method2(byte[] rd){
      long dd=0;
      for (int i=0; i <= 7; i++)   dd=(dd << 8) | ((long)rd[i] & 0xff);
      return dd;
    }
}
