package unverified;

public class ClonePair6869 {

    int method1(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value+=(array[offset + i] & 0xff) << (8 * i);
      }
      return value;
    }

    int method2(byte[] bytes,int offset){
      int result=0;
      for (int shift=0; shift < 32; shift+=8) {
        result|=(((int)bytes[offset++]) & 0xff) << shift;
      }
      return result;
    }
}
