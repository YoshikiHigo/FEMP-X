package unverified;

public class ClonePair7062 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return (s2 == null || s2.trim().equals("") || s2.equals("\n"));
      if (s2 == null)   return s1.trim().equals("") || s1.equals("\n");
      return s1.trim().equals(s2.trim());
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
