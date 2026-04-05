package all;

public class ClonePair12488 {

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

    boolean method2(String tok){
      if (tok == null)   return false;
      if (tok.length() == 0)   return false;
      char a;
      for (int i=0; i < tok.length(); i++) {
        a=tok.charAt(i);
        if ((!Character.isDigit(a)) & (a != ',') & (a != '.'))     return false;
      }
      return true;
    }
}
