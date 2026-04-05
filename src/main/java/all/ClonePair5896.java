package all;

public class ClonePair5896 {

    double method1(byte[] b,int offset){
      double value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=(b[i + offset] & 0x000000FF) << shift;
      }
      return value;
    }

    double method2(byte[] ba,int off){
      double ret=0.0;
      for (int n=0; n < 4; n++) {
        ret+=(double)((0xff & ba[off + n]) << ((3 - n) * 8));
      }
      return ret;
    }
}
