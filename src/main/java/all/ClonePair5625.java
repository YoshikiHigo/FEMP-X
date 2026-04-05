package all;

public class ClonePair5625 {

    boolean method1(String s,boolean allowOptions){
      final int length;
      if ((s == null) || ((length=s.length()) == 0)) {
        return false;
      }
      final char firstChar=s.charAt(0);
      if (!(((firstChar >= 'a') && (firstChar <= 'z')) || ((firstChar >= 'A') && (firstChar <= 'Z')))) {
        return false;
      }
      boolean lastWasSemiColon=false;
      for (int i=1; i < length; i++) {
        final char c=s.charAt(i);
        if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'))) {
          lastWasSemiColon=false;
        }
     else     if (((c >= '0') && (c <= '9')) || (c == '-')) {
          if (lastWasSemiColon) {
            return false;
          }
          lastWasSemiColon=false;
        }
     else     if (c == ';') {
          if (lastWasSemiColon || (!allowOptions)) {
            return false;
          }
          lastWasSemiColon=true;
        }
     else {
          return false;
        }
      }
      return (!lastWasSemiColon);
    }

    boolean method2(String name,boolean allowSpaces){
      if (name == null || name.trim().length() == 0) {
        return false;
      }
      String value=name.trim();
      for (int i=0; i < value.length(); i++) {
        char c=value.charAt(i);
        if (!Character.isLetterOrDigit(c) && !((c == '_') || (allowSpaces && c == ' '))) {
          return false;
        }
      }
      return true;
    }
}
