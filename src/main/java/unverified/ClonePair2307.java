package unverified;

public class ClonePair2307 {

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

    int method2(byte[] bytes){
      int result=0;
      for (int i=0; i < 4; ++i) {
        result<<=8;
        result+=bytes[i] >= 0 ? bytes[i] : (int)256 + bytes[i];
      }
      return result;
    }
}
