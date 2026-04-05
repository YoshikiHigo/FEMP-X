package unverified;

public class ClonePair3996 {

    boolean method1(String uri1,String uri2){
      if (uri1 == uri2) {
        return true;
      }
      if (uri1 == null) {
        return (uri2.length() == 0);
      }
      if (uri2 == null) {
        return (uri1.length() == 0);
      }
      return uri1.equals(uri2);
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
