package all;

public class ClonePair7104 {

    int method1(byte[] byteArray,int byteArrayOffset){
      int result=0;
      int tmp;
      for (int i=0; i < 4; i++) {
        tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
        result+=(tmp << 8 * (3 - i));
      }
      return result;
    }

    int method2(byte[] datagram,int pos){
      int ttl=0;
      for (int i=0; i < 4; i++) {
        ttl=(ttl * 256) + (datagram[pos + i] & 0xff);
      }
      return ttl;
    }
}
