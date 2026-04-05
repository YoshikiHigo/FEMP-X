package all;

public class ClonePair12514 {

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
      boolean re=true;
      if (s == null) {
        return false;
      }
      if (s.equals("")) {
        return false;
      }
      for (int i=0; i < s.length(); i++) {
        char c=s.charAt(i);
        if (c < 48 || c > 57) {
          re=false;
          break;
        }
      }
      return re;
    }
}
