package all;

public class ClonePair4442 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return ((s2 == null) || s2.equals(""));
      if (s2 == null)   return (s1.equals(""));
      return (s1.equalsIgnoreCase(s2));
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
