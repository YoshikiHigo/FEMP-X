package unverified;

public class ClonePair2322 {

    int method1(byte[] bytes){
      int i=0;
      int j=24;
      for (int k=0; j >= 0; k++) {
        int l=bytes[k] & 0xff;
        i+=(l << j);
        j-=8;
      }
      return i;
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
