package all;

public class ClonePair7041 {

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

    int method2(byte[] buffer,int offset){
      int word;
      int b0=buffer[offset];
      if (b0 < 0)   b0+=256;
      int b1=buffer[offset + 1];
      if (b1 < 0)   b1+=256;
      int b2=buffer[offset + 2];
      if (b2 < 0)   b2+=256;
      int b3=buffer[offset + 3];
      if (b3 < 0)   b3+=256;
      word=(int)(b0 + (b1 << 8) + (b2 << 16)+ (b3 << 24));
      return word;
    }
}
