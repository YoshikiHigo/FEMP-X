package all;

public class ClonePair7220 {

    int method1(byte[] buffer,int start){
      int value=0;
      for (int i=start; i < start + 4; i++) {
        value=(value << 8) + (buffer[i] & 0xff);
      }
      return value;
    }

    int method2(byte[] datagram,int pos){
      int ttl=0;
      for (int i=0; i < 4; i++) {
        ttl=(ttl * 256) + (datagram[pos + i] & 0xff);
      }
      return ttl;
    }
}
