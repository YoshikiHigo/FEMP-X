package unverified;

public class ClonePair12516 {

    boolean method1(String ref){
      if (ref == null || ref.trim().length() == 0)   return (false);
      char c;
      for (int i=0; i < ref.length(); i++) {
        c=ref.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          return (false);
        }
      }
      return true;
    }

    boolean method2(String s){
      if (s == null || s.length() == 0)   return false;
      boolean foundDot=false;
      for (int i=0; i < s.length(); i++) {
        char c=s.charAt(i);
        if (!Character.isDigit(c)) {
          if (!foundDot && c == '.')       foundDot=true;
     else       return false;
        }
      }
      return true;
    }
}
