package unverified;

public class ClonePair6983 {

    int method1(byte[] data,int offset){
      int res=0;
      for (int i=0; i < 4; i++) {
        res=(res << 8) | (data[offset + i] & 0xff);
      }
      return res;
    }

    int method2(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }
}
