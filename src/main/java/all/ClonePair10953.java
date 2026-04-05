package all;

public class ClonePair10953 {

    String method1(String str,int length,String endStr){
      if (str == null) {
        return null;
      }
      String strReturn=str;
      int len=str.length();
      int asciiLen=0;
      for (int i=0; i < len; i++) {
        if (str.charAt(i) <= 255) {
          asciiLen++;
        }
      }
      if (asciiLen > 0) {
        len=len - asciiLen / 2;
      }
      if (len > length) {
        strReturn=str.substring(0,length) + endStr;
      }
      return strReturn;
    }

    String method2(String cadena,int tamano,String substitucion_recorte){
      if (cadena != null) {
        if (cadena.length() > tamano) {
          cadena=cadena.substring(0,tamano) + substitucion_recorte;
        }
      }
      return cadena;
    }
}
