package all;

public class ClonePair10521 {

    int method1(byte[] key,int off,int len){
      int h=0;
      for (int i=0; i < len; i++) {
        h=31 * h + key[off++];
      }
      return h;
    }

    int method2(byte[] mpb,int start,int len){
      int uint=0;
      for (int i=0; i < len; i++) {
        uint+=mpb[i + start];
      }
      return uint;
    }
}
