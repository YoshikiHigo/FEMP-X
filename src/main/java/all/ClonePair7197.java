package all;

public class ClonePair7197 {

    int method1(byte[] data,int offset){
      int num=0;
      for (int i=offset + 3; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
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
