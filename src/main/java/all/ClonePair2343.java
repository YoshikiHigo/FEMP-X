package all;

public class ClonePair2343 {

    int method1(byte[] bytes){
      int n=0;
      for (int i=0; i < 3; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[3] & 0xff);
    }

    int method2(byte[] b){
      int mask=0xff;
      int temp=0;
      int n=0;
      for (int i=0; i < 4; i++) {
        n<<=8;
        temp=b[i] & mask;
        n|=temp;
      }
      return n;
    }
}
