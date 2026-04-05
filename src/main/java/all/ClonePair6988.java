package all;

public class ClonePair6988 {

    int method1(byte[] data,int offset){
      int res=0;
      for (int i=0; i < 4; i++) {
        res=(res << 8) | (data[offset + i] & 0xff);
      }
      return res;
    }

    int method2(byte[] data,int offset){
      int num=0;
      for (int i=offset; i < offset + 4; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
