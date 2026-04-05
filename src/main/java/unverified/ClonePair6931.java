package unverified;

public class ClonePair6931 {

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

    int method2(byte[] b,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=((int)b[i + offset] & 0xFF) << shift;
      }
      return value;
    }
}
