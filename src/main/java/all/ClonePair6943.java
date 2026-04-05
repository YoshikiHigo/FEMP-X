package all;

public class ClonePair6943 {

    int method1(byte[] bytes,int indexIni){
      int resultado=0;
      if (bytes[indexIni] < 0) {
        resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,24));
      }
     else {
        resultado+=bytes[indexIni] * ((int)Math.pow(2,24));
      }
      indexIni++;
      if (bytes[indexIni] < 0) {
        resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,16));
      }
     else {
        resultado+=bytes[indexIni] * ((int)Math.pow(2,16));
      }
      indexIni++;
      if (bytes[indexIni] < 0) {
        resultado+=(256 + bytes[indexIni]) * ((int)Math.pow(2,8));
      }
     else {
        resultado+=bytes[indexIni] * ((int)Math.pow(2,8));
      }
      indexIni++;
      if (bytes[indexIni] < 0) {
        resultado+=256 + bytes[indexIni];
      }
     else {
        resultado+=bytes[indexIni];
      }
      return resultado;
    }

    int method2(byte[] datagram,int pos){
      int ttl=0;
      for (int i=0; i < 4; i++) {
        ttl=(ttl * 256) + (datagram[pos + i] & 0xff);
      }
      return ttl;
    }
}
