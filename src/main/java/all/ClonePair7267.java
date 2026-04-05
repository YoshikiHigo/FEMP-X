package all;

public class ClonePair7267 {

    int method1(byte[] data,int offset){
      int num=0;
      for (int i=offset; i < offset + 4; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }

    int method2(byte[] data,int offset){
      int l=0;
      for (int k=0; k < 4; k++) {
        l=(l << 8) | (data[offset++] & 0xFF);
      }
      return l;
    }
}
