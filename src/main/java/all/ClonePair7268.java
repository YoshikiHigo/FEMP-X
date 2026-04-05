package all;

public class ClonePair7268 {

    int method1(byte[] data,int offset){
      int num=0;
      for (int i=offset; i < offset + 4; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }

    int method2(byte[] datagram,int pos){
      int ttl=0;
      for (int i=0; i < 4; i++) {
        ttl=(ttl * 256) + (datagram[pos + i] & 0xff);
      }
      return ttl;
    }
}
