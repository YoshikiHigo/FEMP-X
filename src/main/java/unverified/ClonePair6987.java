package unverified;

public class ClonePair6987 {

    int method1(byte[] data,int offset){
      int res=0;
      for (int i=0; i < 4; i++) {
        res=(res << 8) | (data[offset + i] & 0xff);
      }
      return res;
    }

    int method2(byte[] buffer,int start){
      int value=0;
      for (int i=start; i < start + 4; i++) {
        value=(value << 8) + (buffer[i] & 0xff);
      }
      return value;
    }
}
