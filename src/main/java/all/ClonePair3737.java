package all;

public class ClonePair3737 {

    boolean method1(String a,String b){
      if (a != null && a.trim().length() == 0)   a=null;
      if (b != null && b.trim().length() == 0)   b=null;
      boolean rt=false;
      if (a == b)   return true;
      if (a != null && b != null) {
        if (a.compareTo(b) == 0) {
          return true;
        }
      }
      return rt;
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
