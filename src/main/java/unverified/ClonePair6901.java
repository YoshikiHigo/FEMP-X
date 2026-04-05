package unverified;

public class ClonePair6901 {

    int method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 3); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return result;
    }

    int method2(byte[] array,int index){
      int value=0;
      int shift=0;
      while (shift != 32) {
        value|=(0x000000ff & ((int)array[index])) << shift;
        index++;
        shift+=8;
      }
      return value;
    }
}
