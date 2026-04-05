package all;

public class ClonePair2267 {

    int method1(byte[] b){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=(b[i] & 0x000000FF) << shift;
      }
      return value;
    }

    int method2(byte[] bytes){
      int i=0;
      int j=24;
      for (int k=0; j >= 0; k++) {
        int l=bytes[k] & 0xff;
        i+=(l << j);
        j-=8;
      }
      return i;
    }
}
