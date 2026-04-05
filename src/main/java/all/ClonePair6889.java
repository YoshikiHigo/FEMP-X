package all;

public class ClonePair6889 {

    int method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 3); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return result;
    }

    int method2(byte[] b,int offset){
      int accum=0;
      for (int shiftBy=0, i=offset; shiftBy < 32; shiftBy+=8, i++) {
        accum|=(b[i] & 0xff) << shiftBy;
      }
      return accum;
    }
}
