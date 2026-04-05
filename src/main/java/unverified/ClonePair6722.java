package unverified;

public class ClonePair6722 {

    long method1(byte[] arr){
      long i=0x0000000000000000;
      for (int j=0; j < 8; ++j) {
        i<<=8;
        i+=arr[j] & 0x000000FF;
      }
      return i;
    }

    long method2(byte[] rd){
      long dd=0;
      for (int i=0; i <= 7; i++)   dd=(dd << 8) | ((long)rd[i] & 0xff);
      return dd;
    }
}
