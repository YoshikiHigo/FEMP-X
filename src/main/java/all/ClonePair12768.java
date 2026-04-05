package all;

public class ClonePair12768 {

    short method1(byte[] data,int offset){
      short num=0;
      for (int i=offset + 1; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }

    short method2(byte[] in,int idx){
      short out=0;
      for (int i=0; i < 2; i++)   out|=((short)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
