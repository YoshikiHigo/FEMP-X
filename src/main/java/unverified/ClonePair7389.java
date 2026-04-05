package unverified;

public class ClonePair7389 {

    int method1(byte[] datagram,int pos){
      int ttl=0;
      for (int i=0; i < 4; i++) {
        ttl=(ttl * 256) + (datagram[pos + i] & 0xff);
      }
      return ttl;
    }

    int method2(byte[] b,int offset){
      int value=0;
      int shift=0;
      for (int i=0; i < 4; i++) {
        shift=(4 - 1 - i) * 8;
        value+=(b[i + offset] & 0x000000FF) << shift;
      }
      return value;
    }
}
