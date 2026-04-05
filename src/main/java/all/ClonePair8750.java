package all;

public class ClonePair8750 {

    boolean method1(String actor,String hActor){
      if ((((hActor == null) || (hActor.length() == 0)) && ((actor == null) || (actor.length() == 0))) || ((hActor != null) && (actor != null) && hActor.equalsIgnoreCase(actor))) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(String string1,String string2){
      if (string1 == null) {
        return string2 == null || string2.length() == 0;
      }
      if (string2 == null) {
        return string1.length() == 0;
      }
      return string1.equalsIgnoreCase(string2);
    }
}
