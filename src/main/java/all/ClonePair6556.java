package all;

public class ClonePair6556 {

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

    boolean method2(String string,String prefix){
      if (string == null || prefix == null) {
        return string == null && prefix == null;
      }
      if (prefix.length() > string.length()) {
        return false;
      }
      return string.regionMatches(true,0,prefix,0,prefix.length());
    }
}
