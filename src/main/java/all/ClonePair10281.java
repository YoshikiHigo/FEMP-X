package all;

public class ClonePair10281 {

    int method1(byte[] mpb,int start,int len){
      int uint=0;
      for (int i=0; i < len; i++) {
        uint+=(mpb[i + start] & 0xFF) << ((len - i - 1) * 8);
      }
      return uint;
    }

    int method2(byte[] data,int pos,int size){
      int retVal=0;
      int shifter=0;
      while (size > 0) {
        retVal+=(data[pos] & 0xff) << shifter;
        shifter+=8;
        pos++;
        size--;
      }
      return retVal;
    }
}
