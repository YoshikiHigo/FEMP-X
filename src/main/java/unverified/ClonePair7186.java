package unverified;

public class ClonePair7186 {

    int method1(byte[] data,int offset){
      int num=0;
      for (int i=offset + 3; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }

    int method2(byte[] buff,int startPos){
      int res=0;
      for (int i=0; i < 4; i++)   res|=((buff[startPos + i] & 0xff) << (i * 8));
      return res;
    }
}
