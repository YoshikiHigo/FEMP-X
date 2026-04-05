package all;

public class ClonePair8745 {

    boolean method1(String actor,String hActor){
      if ((((hActor == null) || (hActor.length() == 0)) && ((actor == null) || (actor.length() == 0))) || ((hActor != null) && (actor != null) && hActor.equalsIgnoreCase(actor))) {
        return true;
      }
     else {
        return false;
      }
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
