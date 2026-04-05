package unverified;

public class ClonePair6930 {

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

    int method2(byte[] data,int offset){
      byte[] tmp=new byte[4];
      System.arraycopy(data,offset,tmp,0,4);
      int number;
      number=0;
      for (int i=0; i < 4; ++i) {
        number|=(tmp[3 - i] & 0xff) << (i << 3);
      }
      return number;
    }
}
