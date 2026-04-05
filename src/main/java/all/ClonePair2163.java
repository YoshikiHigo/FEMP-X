package all;

public class ClonePair2163 {

    int method1(byte[] ba){
      int ret=0;
      for (int i=0; i < 4; i++) {
        ret=ret << 8;
        ret|=ba[i] & 0xFF;
      }
      return ret;
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
