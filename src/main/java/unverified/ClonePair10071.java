package unverified;

public class ClonePair10071 {

    int method1(byte[] bytes,int start,int end){
      int sum=0;
      for (int i=start; i < end; i++) {
        byte b=bytes[i];
        sum+=b;
      }
      return sum;
    }

    int method2(byte[] data,int start,int end){
      int x=0;
      while (start < end) {
        x+=data[start++];
      }
      return x;
    }
}
