package unverified;

public class ClonePair7160 {

    boolean method1(String s1,String s2){
      if ((s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)) {
        return true;
      }
      return s1 != null && s2 != null && s1.equals(s2);
    }

    boolean method2(String valor1,String valor2){
      boolean igual=false;
      if ((valor1 == null && valor2 == null) || (valor1 == null && valor2 != null && valor2.equals("")) || (valor2 == null && valor1 != null && valor1.equals(""))) {
        igual=true;
      }
      if (valor1 != null && valor2 != null && valor1.equals(valor2)) {
        igual=true;
      }
      return igual;
    }
}
