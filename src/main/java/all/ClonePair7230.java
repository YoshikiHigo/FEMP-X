package all;

public class ClonePair7230 {

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

    boolean method2(String x,String y){
      if (x == y)   return true;
      if (x == null && y != null) {
        if (y.length() == 0)     return true;
        return false;
      }
      if (x != null && y == null) {
        if (x.length() == 0)     return true;
        return false;
      }
      return x.equals(y);
    }
}
