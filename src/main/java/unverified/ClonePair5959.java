package unverified;

public class ClonePair5959 {

    boolean method1(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2))   return false;
      return true;
    }

    boolean method2(String pattern,String key){
      if (key.length() < pattern.length())   return false;
      for (int i=0; i < pattern.length(); i++) {
        char format=pattern.charAt(i);
        char ch=key.charAt(i);
        if (!((format == '#' && Character.isDigit(ch)) || (format == ch))) {
          return false;
        }
      }
      return true;
    }
}
