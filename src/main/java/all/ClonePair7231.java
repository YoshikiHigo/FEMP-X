package all;

public class ClonePair7231 {

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

    boolean method2(String actor,String hActor){
      if ((((hActor == null) || (hActor.length() == 0)) && ((actor == null) || (actor.length() == 0))) || ((hActor != null) && (actor != null) && hActor.equalsIgnoreCase(actor))) {
        return true;
      }
     else {
        return false;
      }
    }
}
