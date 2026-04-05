package unverified;

public class ClonePair6747 {

    long method1(byte[] bytes){
      long result=0;
      for (int i=0; i < 8; i++) {
        result<<=8;
        result+=(byte)bytes[i];
      }
      return result;
    }

    long method2(byte[] rd){
      long dd=0;
      for (int i=0; i <= 7; i++)   dd=(dd << 8) | ((long)rd[i] & 0xff);
      return dd;
    }
}
