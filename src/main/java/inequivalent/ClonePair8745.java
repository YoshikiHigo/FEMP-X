package inequivalent;

public class ClonePair8745 {

    boolean method1(String actor, String hActor) {
        return (((hActor == null) || (hActor.length() == 0)) && ((actor == null) || (actor.length() == 0))) || ((hActor != null) && hActor.equalsIgnoreCase(actor));
    }

    boolean method2(String str1, String str2) {
        if (str1 == null || str1.length() == 0) {
            return str2 == null || str2.length() == 0;
        } else {
            if (str2 == null) return false;
            else return str1.equals(str2);
        }
    }
}
