package unverified;

public class ClonePair7233 {

    boolean method1(String valor1,String valor2){
      boolean igual=false;
      if ((valor1 == null && valor2 == null) || (valor1 == null && valor2 != null && valor2.equals("")) || (valor2 == null && valor1 != null && valor1.equals(""))) {
        igual=true;
      }
      if (valor1 != null && valor2 != null && valor1.equals(valor2)) {
        igual=true;
      }
      return igual;
    }

    boolean method2(String str1,String str2){
      if (str1 == null || str1.length() == 0) {
        if (str2 == null || str2.length() == 0)     return true;
     else     return false;
      }
     else {
        if (str2 == null)     return false;
     else     return str1.equals(str2);
      }
    }
}
