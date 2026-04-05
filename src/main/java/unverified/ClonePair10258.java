package unverified;

public class ClonePair10258 {

    int method1(byte[] bytes,int offset,int length){
      int sum=0;
      for (int i=0; i < length; i++)   sum^=bytes[offset + i];
      return sum;
    }

    int method2(byte[] mpb,int start,int len){
      int uint=0;
      for (int i=0; i < len; i++) {
        uint+=mpb[i + start];
      }
      return uint;
    }
}
