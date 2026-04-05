package all;

public class ClonePair6903 {

    int method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 3); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return result;
    }

    int method2(byte[] byte_array,int offset){
      int value=0;
      for (int i=3; i >= 0; i--) {
        value=(int)(value << 8);
        value=(int)(value | ((int)byte_array[offset + i] & 0xff));
      }
      return value;
    }
}
