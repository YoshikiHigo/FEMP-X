package all;

public class ClonePair6553 {

    boolean method1(String l,String r){
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

    boolean method2(String stringA,String stringB){
      if (stringA == null) {
        if (stringB == null) {
          return true;
        }
     else {
          return false;
        }
      }
      if (stringB == null)   return false;
      if (stringA.compareTo(stringB) == 0) {
        return true;
      }
     else {
        return false;
      }
    }
}
