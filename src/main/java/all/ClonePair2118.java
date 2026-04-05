package all;

public class ClonePair2118 {

    int method1(byte[] b){
      int mask=0xff;
      int temp=0;
      int n=0;
      for (int i=3; i >= 0; i--) {
        n<<=8;
        temp=b[i] & mask;
        n|=temp;
      }
      return n;
    }

    int method2(byte[] b){
      int s=0;
      for (int i=0; i < 3; i++) {
        if (b[3 - i] >= 0) {
          s=s + b[3 - i];
        }
     else {
          s=s + 256 + b[3 - i];
        }
        s=s * 256;
      }
      if (b[0] >= 0) {
        s=s + b[0];
      }
     else {
        s=s + 256 + b[0];
      }
      return s;
    }
}
