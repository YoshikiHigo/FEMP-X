package unverified;

public class ClonePair7180 {

    int method1(byte[] buffer,int offset){
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

    int method2(byte[] data,int offset){
      int value=0;
      for (int i=offset + 3; i >= offset; i--) {
        value<<=8;
        value|=((int)data[i]) & 0xff;
      }
      return value;
    }
}
