package unverified;

public class ClonePair6944 {

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

    int method2(byte[] arr,int start){
      int i=0;
      int len=4;
      int cnt=0;
      byte[] tmp=new byte[len];
      for (i=start; i < start + len; i++) {
        tmp[cnt]=arr[i];
        cnt++;
      }
      int accum=0;
      int shiftBy=0;
      for (i=4; i > 0; i--) {
        accum|=((int)(tmp[i - 1] & 0xff)) << shiftBy;
        shiftBy+=8;
      }
      return accum;
    }
}
