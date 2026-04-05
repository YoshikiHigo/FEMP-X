package unverified;

public class ClonePair8748 {

    boolean method1(String actor,String hActor){
      if ((((hActor == null) || (hActor.length() == 0)) && ((actor == null) || (actor.length() == 0))) || ((hActor != null) && (actor != null) && hActor.equalsIgnoreCase(actor))) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(String str1,String str2){
      if ((str1 == null && str2 != null) || (str1 != null && str2 == null)) {
        return false;
      }
      if (str1 == null && str2 == null) {
        return true;
      }
      if (str1.equals(str2)) {
        return true;
      }
      return false;
    }
}
