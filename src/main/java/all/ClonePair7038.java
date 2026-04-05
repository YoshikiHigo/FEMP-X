package all;

public class ClonePair7038 {

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

    int method2(byte[] bytes,int offset){
      int result=0;
      for (int shift=0; shift < 32; shift+=8) {
        result|=(((int)bytes[offset++]) & 0xff) << shift;
      }
      return result;
    }
}
