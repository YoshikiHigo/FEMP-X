package all;

public class ClonePair3691 {

    boolean method1(String s1,String s2){
      if (s1 == null && s2 == null)   return true;
      if ((s1 == null || s2 == null))   return false;
      if (!s1.equals(s2)) {
        return false;
      }
      return true;
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
