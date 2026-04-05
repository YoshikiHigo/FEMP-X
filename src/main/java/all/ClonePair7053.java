package all;

public class ClonePair7053 {

    int method1(byte[] data,int offset){
      int result=0;
      int multiply=1;
      int value=0;
      for (int i=0; i < 4; i++) {
        value=data[i + offset];
        if (value < 0)     value=value + 256;
        result=result + (value * multiply);
        multiply=multiply * 256;
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
