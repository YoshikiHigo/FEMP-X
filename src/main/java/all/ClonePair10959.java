package all;

public class ClonePair10959 {

    String method1(String src,int length,String end){
      if (src == null) {
        return null;
      }
      if (src.length() > length) {
        return src.substring(0,length) + end;
      }
     else {
        return src;
      }
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
