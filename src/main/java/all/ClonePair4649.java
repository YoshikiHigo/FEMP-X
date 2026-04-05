package all;

public class ClonePair4649 {

    boolean method1(String string1,String string2){
      if (string1 == null && string2 == null) {
        return true;
      }
      if (string1 == null || string2 == null) {
        return false;
      }
      if ((string1.toLowerCase()).equals(string2.toLowerCase())) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(String l,String r){
      if (l == null && r == null)   return true;
      if (l == null || r == null)   return false;
      try {
        double ll=Double.parseDouble(l);
        double rr=Double.parseDouble(r);
        return (ll == rr);
      }
     catch (  NumberFormatException nfe) {
      }
      return l.equals(r);
    }
}
