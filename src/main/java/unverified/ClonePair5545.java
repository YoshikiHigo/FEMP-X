package unverified;

public class ClonePair5545 {

    boolean method1(String a,String b){
      if (a == null && b == null)   return true;
      if (a == null)   return false;
      if (b == null)   return false;
      if (a.compareTo(b) == 0)   return true;
     else   return false;
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
